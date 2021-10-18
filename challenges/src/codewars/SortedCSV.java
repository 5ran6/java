package codewars;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * brunolima on Oct 9, 2021
 * 
 */

public class SortedCSV {

	public static void main(String[] args) {
//		String contentCsv = "Beth,Charles,Danielle,Adam,Eric\n" + "17945,10091,10088,3907,10132\n" + "2,12,13,48,11";
//		String contentCsv = "Adam,Beth\n" + "1,2\n";
//		String contentCsv = "Adam\n" + "1\n";
		String contentCsv = "Adam,Beth,Charles\n" + "3,2,1\n";

		System.out.println("RESULT >>> " + sortCsvColumns(contentCsv));
	}

	public static String sortCsvColumns(String contentCsv) {
		String[] rows = contentCsv.split("\n");

		Map<String, ArrayList<String>> map = createMapCSV(contentCsv);

        StringBuilder sb = new StringBuilder();
        sb.append(String.join(",", map.keySet()));
		sb.append("\n");
		
		for (int i = 0; i < rows.length - 1; i++) {
			int index = i;
			
			try {
				map.forEach((k, v) -> {
					sb.append(v.get(index));
					sb.append(",");
				});
			} catch (Exception e) {
				sb.append("");
				sb.append(",");
			}
          
			sb.deleteCharAt(sb.length() - 1);
			sb.append("\n");
		}
   
		sb.deleteCharAt(sb.length() - 1);
   
		return sb.toString();
	}
		

	private static Map<String, ArrayList<String>> createMapCSV(String contentCsv) {
		String[] csvSplitted = contentCsv.split("\n");

		Map<String, ArrayList<String>> map = new TreeMap<String, ArrayList<String>>(String.CASE_INSENSITIVE_ORDER);

		int ct = 0;

		for (int i = 0; i < csvSplitted.length; i++) {
			String[] split = csvSplitted[i].split(",");

			if (i == 0) {
				for (String word : split) {
					map.put(word, new ArrayList<String>());
				}
			} else {
				for (int j = 0; j < split.length; j++) {
					ArrayList<String> arr = map.get(csvSplitted[ct - i].split(",")[j]);

					arr.add(split[j]);

					map.put(csvSplitted[ct - i].split(",")[j], arr);
				}
			}

			ct++;
		}

		return map;
	}

}
