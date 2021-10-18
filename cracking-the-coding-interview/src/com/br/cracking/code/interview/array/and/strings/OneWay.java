package com.br.cracking.code.interview.array.and.strings;

/**
 *
 * brunolima on Oct 15, 2021
 * 
 * There are three types of edits that can be performed on strings: insert a
 * character, remove a character, or replace a character. Given two strings,
 * write a function to check if they are one edit (or zero edits) away.
 */

public class OneWay {

	public static void main(String[] args) {

		// Test insertion
		String s1 = "apple";
		String s2 = "aple";
		boolean result1 = oneEditAway(s1, s2);
		System.out.println(s1 + ", " + s2 + " result >>> " + result1);

		// Test removal
		String s3 = "aple";
		String s4 = "apple";
		boolean result2 = oneEditAway(s3, s4);
		System.out.println(s3 + ", " + s4 + " result >>> " + result2);

		// Test replacement
		String s5 = "bale";
		String s6 = "pale";
		boolean result3 = oneEditAway(s5, s6);
		System.out.println(s5 + ", " + s6 + " result >>> " + result3);
		
		// Test replacement
		String s7 = "abc";
		String s8 = "abb";
		boolean result4 = oneEditAway(s7, s8);
		System.out.println(s7 + ", " + s8 + " result >>> " + result4);
	}

	private static boolean oneEditAway(String s1, String s2) {
		if (s1.length() == s2.length()) {
			return oneEditReplace(s1, s2);
		} else if (s1.length() + 1 == s2.length()) {
			return oneEditInsert(s1, s2);
		} else if (s1.length() == s2.length() + 1) {
			return oneEditInsert(s2, s1);
		}

		return false;
	}

	private static boolean oneEditInsert(String s1, String s2) {
		int index1 = 0, index2 = 0;

		while (index1 < s1.length() && index2 < s2.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}

				index2++;
			} else {
				index1++;
				index2++;
			}
		}

		return true;
	}

	private static boolean oneEditReplace(String s1, String s2) {
		boolean foundDifference = false;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (foundDifference) {
					return false;
				}

				foundDifference = true;
			}
		}

		return true;
	}

}
