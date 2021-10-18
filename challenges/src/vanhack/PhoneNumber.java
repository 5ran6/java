package vanhack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
*
* brunolima on May 10, 2021
* 
*/

public class PhoneNumber {
	
	public static void main(String[] args) {
		Map<String, ArrayList<Character>> map = new HashMap<String, ArrayList<Character>>();
		populateMap(map);
		System.out.println("Result : "+ permutations("12", map));
	}
	
	public static String permutations(String digits, Map<String, ArrayList<Character>> map) {
		StringBuilder sb = new StringBuilder();
		char[] digitsChars = digits.toCharArray();
		
		ArrayList<Character> lettersFirstDigit = map.get("" + digitsChars[0]);
		ArrayList<Character> lettersSecondDigit = map.get("" + digitsChars[1]);
		
		for (Character lfd : lettersFirstDigit) {
			for (Character lsd : lettersSecondDigit) {
				sb.append(lfd).append(lsd).append(", ");
			}
		}
		
		return sb.toString();
	}

	public static void populateMap(Map<String, ArrayList<Character>> map) {
		char[] alphabet = new char[26];
		int a = 0;
		
		for (int i = 97; i <= 122; i++) {
			alphabet[a++] = (char) i;
		}

		int idxAlphabet = 0;
		
		for (int i = 1; i <= 9; i++) {
			ArrayList<Character> letters = new ArrayList<Character>();
			
			int count = 1;
			
			for (int j = idxAlphabet; j < alphabet.length; j++) {
				if (count > 3) break;
				letters.add(alphabet[j]);
				count++;
				idxAlphabet++;
			}
			
			count = 0;
			
			map.put("" + i, letters);
		}
	}
	
}

