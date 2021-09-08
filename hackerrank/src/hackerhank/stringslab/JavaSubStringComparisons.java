package hackerhank.stringslab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
*
* brunolima on Sep 6, 2021
* 
*/

public class JavaSubStringComparisons {
	
	public static void main(String[] args) {
//		String s = "welcometojava";
		String s = "welcomeToJava";
		
		int k = 3;
		
//		String result = getSmallestAndLargestList(s, k);
		String result = getSmallestAndLargestCompareTo(s, k);
		
		System.out.println(result);
		
	}
	
	private static String getSmallestAndLargestCompareTo(String s, int k) {
		String smallest = s.substring(0, k);
		String largest = s.substring(0, k);
		String subString = "";
		
		for (int i = 0; i <= s.length() - k; i++) {
			subString = s.substring(i, k + i);
			
			if (subString.compareTo(smallest) < 0) {
				smallest = subString;
			}
			
			if (subString.compareTo(largest) > 0) {
				largest = subString;
			}
		}
		
		return smallest + "\n" + largest;
	}

	private static String getSmallestAndLargestList(String s, int k) {
		List<String> lsWords = new ArrayList<String>();
		
		for (int i = 0; i < s.length(); i++) {
			String word = s.substring(i, k + i);
			
			lsWords.add(word);
			
			if ((k + i) == s.length()) {
				break;
			}
		}
		
		Collections.sort(lsWords);
		
		return lsWords.get(0) + "\n" + lsWords.get(lsWords.size() - 1);
	}

}

