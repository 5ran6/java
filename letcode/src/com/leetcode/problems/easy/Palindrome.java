package com.leetcode.problems.easy;

/**
 *
 * brunolima on Jun 16, 2021
 * 
 */

public class Palindrome {
	/*
	 * Given a string, implement a function that would tell us if it's a palindrome
	 * A palindrome is a word, number, phrase, or other sequence of characters which
	 * reads the same backward as forward
	 *
	 */
	public static boolean isPalindrome(String value) {
		if (value == null || value == "") return false;
		
		char firstChar = value.charAt(0);
		char lastChar = value.charAt(value.length() - 1);
		
		for (int i = 0, j = value.length() - 1; i <= (value.length() / 2)  && j >= (value.length()/2); i++, j--) {
			if (firstChar != lastChar) {
				return false;
			}
			
			firstChar = value.charAt(i + 1);
			lastChar = value.charAt(j - 1);
		}
		
		return true;
	}

	public static void main(String[] args) {
		validateResult(isPalindrome("montreal"), false, "montreal");

		validateResult(isPalindrome("laval"), true, "laval");
	}

	public static void validateResult(boolean result, boolean expected, String input) {
		String validationResult = result == expected ? "Success" : "Failure";
		System.out.println(String.format("isPalindrome(%s): %s ==> Found %s and expected %s", input, result, expected,
				validationResult));
	}
}
