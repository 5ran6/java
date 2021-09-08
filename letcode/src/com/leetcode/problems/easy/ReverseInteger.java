package com.leetcode.problems.easy;

/**
 *
 * brunolima on May 12, 2021
 * 
 */

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println("Result >>> " + reverse(123));
		System.out.println("Result >>> " + reverse(-123));
		System.out.println("Result >>> " + reverse(1534236469));
	}

	private static int reverse(int value) {
		System.out.println(value);
		System.out.println(Integer.MAX_VALUE);
		
		
		if (value > Integer.MAX_VALUE) {
			return 0;
		} 
		
		boolean isNegativeNumber = value < 0 ? true : false;
		
		StringBuilder sb = new StringBuilder();
		
		String valueS = String.valueOf(isNegativeNumber ? value * -1 : value);

		char[] charArray = valueS.toCharArray();
		
		for (int i = charArray.length - 1; i >= 0; i--) {
			sb.append(charArray[i]);
		}
		
		try {
			if(isNegativeNumber) {
				return Integer.valueOf(sb.toString()) * -1;
			}
			
			return Integer.valueOf(sb.toString());
		} catch (Exception e) {
			return 0;
		}
	}

}
