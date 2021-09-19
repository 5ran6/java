package hackerhank.algorithms.easy;

import java.util.Arrays;

/**
 *
 * brunolima on Sep 18, 2021
 * 
 */

public class CamelCase {

	public static void main(String[] args) {
		String s = "saveChangesInTheEditor";

		System.out.println(camelcaseV1(s));
		System.out.println(camelcaseV2(s));
	}

	public static int camelcaseV1(String s) {
		// Write your code here
		if (s == null || s.length() == 0) {
			return 0;
		}
		
		char[] charsLettersUpCase = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
				'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		int countCamelCase = 1;
		
		for (int i = 1; i < s.length(); i++) {
			char charAt = s.charAt(i);
			
			if (Arrays.binarySearch(charsLettersUpCase, charAt) >= 0) {
				countCamelCase++;
			}
			
		}

		return countCamelCase;
	}
	
	public static int camelcaseV2(String s) {
		// Write your code here
		if (s == null || s.length() == 0) {
			return 0;
		}
		
		int countCamelCase = 1;
		boolean changeSizeLetter = false;
		
		for (int i = 1; i < s.length(); i++) {
			char charAt = s.charAt(i);
			
			if (Character.isUpperCase(charAt) && !changeSizeLetter) {
				countCamelCase++;
				changeSizeLetter = true;
			} else if (Character.isLowerCase(charAt) && changeSizeLetter) {
				changeSizeLetter = false;
			}
		}

		return countCamelCase;
	}

}
