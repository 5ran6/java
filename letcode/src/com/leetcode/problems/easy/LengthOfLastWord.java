package com.leetcode.problems.easy;

/**
 *
 * brunolima on May 24, 2021
 * 
 * Given a string s consists of some words separated by spaces, return the
 * length of the last word in the string. If the last word does not exist,
 * return 0.
 * 
 * A word is a maximal substring consisting of non-space characters only.
 * 
 * Example 1:
 * Input: s = "Hello World" 
 * Output: 5 
 * 
 * Example 2:
 * Input: s = " " 
 * Output: 0
 * 
 */

public class LengthOfLastWord {

	public static void main(String[] args) {
		LengthOfLastWord lolw = new LengthOfLastWord();
		
		String s1 = "Hello World";
		String s2 = " ";
		String s3 = "";
		String s4 = "a ";
		
		System.out.println("Result >>> " + lolw.lengthOfLastWord(s1));
		System.out.println("Result >>> " + lolw.lengthOfLastWord(s2));
		System.out.println("Result >>> " + lolw.lengthOfLastWord(s3));
		System.out.println("Result >>> " + lolw.lengthOfLastWord(s4));
	}

	public int lengthOfLastWord(String s) {
		if (s.isBlank()) return 0;
		
		String[] words = s.split(" ");
		
		return words[words.length - 1].length();
	}

}
