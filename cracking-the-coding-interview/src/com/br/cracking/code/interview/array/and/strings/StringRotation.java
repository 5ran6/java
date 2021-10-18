package com.br.cracking.code.interview.array.and.strings;

/**
 *
 * brunolima on Oct 15, 2021
 * 
 * Assume you have a method isSubstring which checks if one word is a substring of another.
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1
 * using only one call to isSubstring (e.g., "waterbottle" is a rotation of"
 * erbottlewat").
 * 
 */

public class StringRotation {

	public static void main(String[] args) {
		String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
		
		for(String[] pair: pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean is_rotation = isRotation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + is_rotation);
		}
	}

	private static boolean isRotation(String word1, String word2) {
		// check that word1 and word2 are equal length and not empty
		if (word1.length() == word2.length() && word1.length() > 0) {
			
			// concatenate word1 and word1 within new buffer
//			String word1Word1 = word1 + word1;
//			return word1Word1.indexOf(word2) >= 0 ? true : false;
			
			StringBuilder sb = new StringBuilder();
			sb.append(word1).append(word1);
			return sb.indexOf(word2) >= 0 ? true : false;
		}
		
		return false;
	}

}
