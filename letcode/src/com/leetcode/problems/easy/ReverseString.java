package com.leetcode.problems.easy;

/**
 *
 * brunolima on Jun 16, 2021
 * 
 */

public class ReverseString {
	/*
	 * Given a string, implement a function that would reverse the order of its
	 * characters example reverse('montreal') --> laertnom
	 *
	 */
	public static String reverse(String value) {
		if (value == null || value == "")
			return "";

		StringBuilder sb = new StringBuilder();

		for (int i = value.length() - 1; i >= 0; i--) {
			sb.append(value.charAt(i));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		validateResult(reverse("montreal"), "laertnom", "montreal");

		validateResult(reverse("laval"), "laval", "laval");
	}

	public static void validateResult(String result, String expected, String input) {
		String validationResult = result.equals(expected) ? "Success" : "Failure";
		System.out.println(String.format("reverse(%s): Found %s and expected %s ==> %s ", input, expected, result,
				validationResult));
	}
}
