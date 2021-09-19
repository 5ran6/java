package hackerhank.algorithms.easy;

import java.util.HashMap;

/**
 *
 * brunolima on Sep 8, 2021
 * 
 * 
 * @see https://www.hackerrank.com/challenges/time-conversion/problem
 * 
 */

public class TimeConversion {

	public static void main(String[] args) {
		System.out.println("12:01:00PM >>> " + timeConversion("12:01:00PM"));
		System.out.println("12:01:00AM >>> " + timeConversion("12:01:00AM"));
		System.out.println("07:05:45PM >>> " + timeConversion("07:05:45PM"));
		System.out.println("12:40:22AM >>> " + timeConversion("12:40:22AM"));
		System.out.println("06:40:03AM >>> " + timeConversion("06:40:03AM"));
	}

	public static String timeConversion(String time) {
		// Write your code here

		HashMap<String, String> mapTime = new HashMap<String, String>();

		mapTime.put("01", "13");
		mapTime.put("02", "14");
		mapTime.put("03", "15");
		mapTime.put("04", "16");
		mapTime.put("05", "17");
		mapTime.put("06", "18");
		mapTime.put("07", "19");
		mapTime.put("08", "20");
		mapTime.put("09", "21");
		mapTime.put("10", "22");
		mapTime.put("11", "23");
		mapTime.put("12", "00");

		String hourTime = time.substring(0, time.indexOf(":"));

		boolean endsWithAM = time.endsWith("AM");

		if (hourTime.equals("12") && endsWithAM) {
			time = time.replace(hourTime, mapTime.get(hourTime));
		} else if (!hourTime.equals("12") && !endsWithAM) {
			time = time.replace(hourTime, mapTime.get(hourTime));

		}

		return endsWithAM ? time.substring(0, time.indexOf("AM")) : time.substring(0, time.indexOf("PM"));
	}

}
