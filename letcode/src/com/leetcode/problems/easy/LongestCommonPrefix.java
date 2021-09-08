package com.leetcode.problems.easy;

import java.util.Arrays;

/**
 *
 * brunolima on May 15, 2021
 * 
 */

public class LongestCommonPrefix {

	public static void main(String[] args) {
		LongestCommonPrefix lcp = new LongestCommonPrefix();

		String[] strs1 = { "flower", "flower", "flight" };
		String[] strs2 = { "dog", "racecar", "car" };
		String[] strs3 = { "ab", "a"};
		
//		System.out.println("Result: " + lcp.longestCommonPrefix(strs1));
//		System.out.println("Result: " + lcp.longestCommonPrefix(strs2));
//		System.out.println("Result: " + lcp.longestCommonPrefix(strs3));
		
		System.out.println("Result: " + lcp.longestCommonPrefixV2(strs1));
		System.out.println("Result: " + lcp.longestCommonPrefixV2(strs2));
		System.out.println("Result: " + lcp.longestCommonPrefixV2(strs3));
	}

	public String longestCommonPrefixV2(String[] strs) {
		if (strs == null || strs.length == 0) return "";
		if (strs.length == 1) return strs[0];
		
		String str = strs[0];
		
		for (int i = 1; i < strs.length; i++) {
			
			System.out.println("Word : " + strs[i]);
			
			while(strs[i].indexOf(str) != 0) {
				System.out.println(">>> : " + strs[i].indexOf(str));
				System.out.println(">>> " + str.substring(0, str.length() - 1));
				str = str.substring(0, str.length() - 1);
			}
		}
		
		return str;
	}
	
	
	public String longestCommonPrefix(String[] strs) {
//		System.out.println("Before: " + Arrays.toString(strs));
		
		// Sort and compare, because the longest posssible prefix will
		// be at the end and the shorest possible prefix will be in the begining
		Arrays.sort(strs);
		
//		System.out.println("Before: " + Arrays.toString(strs));
		
		StringBuilder sb = new StringBuilder();
		
		char[] first = strs[0].toCharArray();
		char[] last = strs[strs.length - 1].toCharArray();
		
		for (int i = 0; i < first.length && i < last.length; i++) {
			if (first[i] == last[i]) {
				sb.append(first[i]);
			} else {
				return sb.toString();
			}
		}
		
		return sb.toString();
	}

}
