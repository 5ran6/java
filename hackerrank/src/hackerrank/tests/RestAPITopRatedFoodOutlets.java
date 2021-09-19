package hackerrank.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.Gson;

/**
 *
 * brunolima on Sep 12, 2021
 * 
 */

public class RestAPITopRatedFoodOutlets {

	private static String URL_CITY = "https://jsonmock.hackerrank.com/api/food_outlets?city=";

	private static URL url = null;
	private static URLConnection connection = null;
	private static BufferedReader reader = null;
	private static String inputLine = "";
	private static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		List<String> result = getTopRatedFoodOutlets("Denver");
		System.out.println(result);

	}

	public static List<String> getTopRatedFoodOutlets(String city) {
		List<City> lsCities = new ArrayList<City>();
		List<String> resultFinal = new ArrayList<String>();
		
		
		sb = getDataInitial(city);

		try {
			Gson gson = new Gson();
			Result result = gson.fromJson(sb.toString(), Result.class);

			if (result.getData() == null && result.getData().isEmpty()) {
				return new ArrayList<String>();
			} else {
				getCities(result, lsCities);

				Integer pageActual = Integer.parseInt(result.getPage());
				Integer total_pages = result.getTotal_pages();

				if (pageActual < total_pages) {
					getDataPaginate(result, city, lsCities, gson, pageActual, total_pages);
				}
			}

			System.out.println("lsCities >>> " + lsCities);
			
			Map<String, Double> map = new LinkedHashMap<String, Double>();
			
			for (City city2 : lsCities) {
				city2.getName();
				city2.getUser_rating().getAverage_rating();
				map.put(city2.getName(), city2.getUser_rating().getAverage_rating());
			}
			
			Double max = Collections.max(map.values());
			
			
			Iterator<Entry<String, Double>> it = map.entrySet().iterator();
			while(it.hasNext()) {
				Entry<String, Double> next = it.next();
				
				if (next.getValue().equals(max)) {
					resultFinal.add(next.getKey());
				}
			}
		} catch (Exception e) {
			System.err.println("Error >>> " + e.getMessage());
		}

		return resultFinal;
	}

	private static void getDataPaginate(Result result, String city, List<City> lsCities, Gson gson, Integer pageActual,
			Integer total_pages) throws IOException {

		for (int page = pageActual + 1; page <= total_pages; page++) {
			sb = new StringBuilder();
			try {
				url = new URL(URL_CITY + city + "&page=" + page);
				connection = url.openConnection();
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

				while ((inputLine = reader.readLine()) != null) {
					sb.append(inputLine);
				}

				result = gson.fromJson(sb.toString(), Result.class);

				getCitiesFromJson(result, lsCities);

				reader.close();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void getCitiesFromJson(Result result, List<City> lsCities) {
		for (City city : result.getData()) {
			lsCities.add(city);
		}
	}

	private static void getCities(Result result, List<City> cities) {
		for (City city : result.getData()) {
			cities.add(city);
		}
	}

	private static StringBuilder getDataInitial(String city) {
		try {
			url = new URL(URL_CITY + city);
			connection = url.openConnection();
			reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			while ((inputLine = reader.readLine()) != null) {
				sb.append(inputLine);
			}

			reader.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return sb;
	}

}

class Result {
	private String page;
	private Integer per_page;
	private Integer total;
	private Integer total_pages;
	private List<City> data;

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public Integer getPer_page() {
		return per_page;
	}

	public void setPer_page(Integer per_page) {
		this.per_page = per_page;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(Integer total_pages) {
		this.total_pages = total_pages;
	}

	public List<City> getData() {
		return data;
	}

	public void setData(List<City> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result [page=" + page + ", per_page=" + per_page + ", total=" + total + ", total_pages=" + total_pages
				+ ", data=" + data + "]";
	}

}

class City implements Comparable<UserRating> {
	private String city;
	private String name;
	private Integer estimated_cost;
	private Integer id;
	private UserRating user_rating;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEstimated_cost() {
		return estimated_cost;
	}

	public void setEstimated_cost(Integer estimated_cost) {
		this.estimated_cost = estimated_cost;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserRating getUser_rating() {
		return user_rating;
	}

	public void setUser_rating(UserRating user_rating) {
		this.user_rating = user_rating;
	}

	@Override
	public String toString() {
		return "City [city=" + city + ", name=" + name + ", estimatedCost=" + estimated_cost + ", id=" + id
				+ ", userRating=" + user_rating + "]";
	}

	@Override
	public int compareTo(UserRating o) {
		return o.getAverage_rating().compareTo(this.getUser_rating().getAverage_rating());
	}

}

class UserRating {
	private Double average_rating;
	private Integer votes;

	public Double getAverage_rating() {
		return average_rating;
	}

	public void setAverage_rating(Double average_rating) {
		this.average_rating = average_rating;
	}

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		return "UserRating [averageRating=" + average_rating + ", votes=" + votes + "]";
	}

}
