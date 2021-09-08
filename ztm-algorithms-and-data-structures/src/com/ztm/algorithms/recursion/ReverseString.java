package com.ztm.algorithms.recursion;

/**
 *
 * brunolima on Apr 27, 2021
 * 
 */

public class ReverseString {

	public static void main(String[] args) {
		String s1 = "yoyo mastery";

		System.out.println(reverseStringInteractive(s1));
		System.out.println(reverseStringRecursion(s1));
	}

	private static String reverseStringRecursion(String s1) {
		if (s1.equals("")) {
			return "";
		}

		System.out.println("s1: " + s1);
		System.out.println("s1.substring(1): " + s1.substring(1));
		System.out.println("s1.charAt(0): " + s1.charAt(0) + "\n");
		
		return reverseStringRecursion(s1.substring(1)) + s1.charAt(0);
	}

	private static String reverseStringInteractive(String s1) {
		StringBuilder sb = new StringBuilder();

		char[] charArray = s1.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			sb.append(charArray[i]);
		}

		return sb.toString();
	}

}
