package com.br.cracking.code.interview.array.and.strings;

import java.util.Arrays;

/**
 *
 * brunolima on Oct 14, 2021
 * 
 * Given two strings, write a method to decide if one is a permutation of the
 * other.
 * 
 */

public class CheckPermutation {

	public static void main(String[] args) {
		String s1 = "dogdog";
		String s2 = "goddog";

		System.out.println(s1 + " is permutation of " + s2 + " ? " + checkPermutation(s1, s2));
		
		System.out.println(s1 + " is permutation of " + s2 + " ? " + checkPermutationCountCharacters(s1, s2));
	}

	private static boolean checkPermutation(String s1, String s2) {
		// You can check if case sensitive / spaces needs to be consider

		// Check if they same size
		if (s1.length() != s2.length()) {
			return false;
		}

		return sortString(s1).equals(sortString(s2));
	}
	
	private static boolean checkPermutationCountCharacters(String s1, String s2) {
		// You can check if case sensitive / spaces needs to be consider

		// Check if they same size
		if (s1.length() != s2.length()) {
			return false;
		}
		
		int[] letters = new int[128]; 
		
		for (int i = 0; i < s1.length(); i++) {
			letters[s1.charAt(i)]++;
		}
		
		System.out.println(Arrays.toString(letters));
		
		for (int i = 0; i < s2.length(); i++) {
			letters[s2.charAt(i)]--;
			
			if (letters[s2.charAt(i)] < 0) {
				return false;
			}	
		}
		
		System.out.println(Arrays.toString(letters));
		
		return true;
	}
	
	private static String sortString(String s1) {
		char[] charArray = s1.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}

}
