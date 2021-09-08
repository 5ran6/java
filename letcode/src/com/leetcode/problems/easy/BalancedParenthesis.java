package com.leetcode.problems.easy;

/**
 *
 * brunolima on Jun 16, 2021
 * 
 */

public class BalancedParenthesis {
	/*
	 * Given the following strings: "(()()())", "(()(()()()", "(()(()())", ")()(()".
	 * Implement a function that would tell us if they are balanced A string is
	 * balanced when each opening bracket "(" there is a closing bracket ")"
	 */
	public static boolean isBalanced(String value) {
		if (value == null || value.isEmpty()) return false;
		
		int countBrackets = 0;

		for (int i = 0; i < value.length(); i++) {
			char charAt = value.charAt(i);

			if (charAt == '(') {
				countBrackets++;
			} else {
				if (countBrackets > 0) {
					countBrackets--;
				}
			}
		}

		return countBrackets == 0 ? true : false;
	}

	public static void main(String[] args) {
		validateResult(isBalanced("(()()())"), true, "(()()())");
		validateResult(isBalanced("(()(()())"), false, "(()(()())");
		validateResult(isBalanced("(()(()()()"), false, "(()(()()()");
		validateResult(isBalanced(")()(()"), false, ")()(()");
		validateResult(isBalanced("())(()"), false, "())(()");
	}

	public static void validateResult(boolean result, boolean expected, String input) {
		String validationResult = result == expected ? "Success" : "Failure";
		System.out.println(String.format("isBalanced(%s): %s ==> Found %s and expected %s", input, result, expected,
				validationResult));
	}

}
