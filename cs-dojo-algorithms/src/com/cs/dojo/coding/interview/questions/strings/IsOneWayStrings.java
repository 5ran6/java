package com.cs.dojo.coding.interview.questions.strings;

/**
 *
 * brunolima on Sep 29, 2021
 * 
 */

public class IsOneWayStrings {

	public static void main(String[] args) {
		System.out.println("Result >>> " + isOneAway("abcde", "abcd")); // should return true
		System.out.println("Result >>> " + isOneAway("abde", "abcde")); // should return true
		System.out.println("Result >>> " + isOneAway("a", "a")); // should return true
		System.out.println("Result >>> " + isOneAway("abcdef", "abqdef")); // should return true
		System.out.println("Result >>> " + isOneAway("abcdef", "abccef")); // should return true
		System.out.println("Result >>> " + isOneAway("abcdef", "abcde")); // should return true
		System.out.println("Result >>> " + isOneAway("aaa", "abc")); // should return false
		System.out.println("Result >>> " + isOneAway("abcde", "abc")); // should return false
		System.out.println("Result >>> " + isOneAway("abc", "abcde")); // should return false
		System.out.println("Result >>> " + isOneAway("abc", "bcc")); // should return false
	}

	private static boolean isOneAway(String w1, String w2) {
		if ((w1.length() - w2.length() > 1) || (w2.length() - w1.length() > 1)) {
			return false;
		} else if (w1.length() == w2.length()) {
			return isOneWaySameLength(w1, w2);
		} else if (w1.length() > w2.length()) {
			return isOneWayDiffLength(w1, w2);
		} else {
			return isOneWayDiffLength(w2, w1);
		}
	}

	private static boolean isOneWayDiffLength(String w1, String w2) {
		int i = 0;
		int countDifferences = 0;

		while (i < w2.length()) {
			if (w1.charAt(i + countDifferences) == w2.charAt(i)) {
				i++;
			} else {
				countDifferences++;
				if (countDifferences > 1)
					return false;
			}
		}

		return true;
	}

	private static boolean isOneWaySameLength(String w1, String w2) {
		int countDifferences = 0;

		for (int i = 0; i < w1.length(); i++) {
			if (w1.charAt(i) != w2.charAt(i)) {
				countDifferences++;

				if (countDifferences > 1)
					return false;
			}
		}

		return true;
	}

}
