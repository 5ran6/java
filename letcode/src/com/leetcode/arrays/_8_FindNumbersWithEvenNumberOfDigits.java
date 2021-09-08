package com.leetcode.arrays;

/**
 *
 * brunolima on Mar 20, 2021
 * 
 * Given an array nums of integers, return how many of them contain an even
 * number of digits.
 * 
 * Example 1: Input: nums = [12,345,2,6,7896] Output: 2
 * 
 * Explanation: 12 contains 2 digits (even number of digits). 345 contains 3
 * digits (odd number of digits). 2 contains 1 digit (odd number of digits). 6
 * contains 1 digit (odd number of digits). 7896 contains 4 digits (even number
 * of digits). Therefore only 12 and 7896 contain an even number of digits.
 * 
 * Example 2: Input: nums = [555,901,482,1771] Output: 1 Explanation: Only 1771
 * contains an even number of digits.
 * 
 */

public class _8_FindNumbersWithEvenNumberOfDigits {

	public static void main(String[] args) {
		int[] nums1 = { 12, 345, 2, 6, 7896 };
		int[] nums2 = { 555, 901, 482, 1771 };

		System.out.println(findNumbers(nums1));
		System.out.println(findNumbers(nums2));
	}

//	public static int findNumbers(int[] nums) {
//		int totalEvenNumbersOfDigits = 0;
//		
//		for (int i = 0; i < nums.length; i++) {
//			String numString = Integer.toString(nums[i]);
//			
////			if(numString.length() >= 2) {
//			if(numString.length() > 1) {
//				int countDivide = 0;
//				int numToDivide = nums[i];
//
//				while (numToDivide > 0) {
//					int result = numToDivide / 10;
//					numToDivide = result;
//					countDivide++;
//				}
//				
//				if (countDivide % 2 == 0) totalEvenNumbersOfDigits++;
//			}
//			
//		}
//		
//		return totalEvenNumbersOfDigits;
//	}

	/*
	 * Given an array of int. Transform array in an object of Strings. Read all
	 * elements in this object and find them which length % 2 == 0 and sum to
	 * result.
	 */
//	public static int findNumbers(int[] nums) {
//		return (int) Arrays.stream(nums).mapToObj(String::valueOf).filter(item -> item.length() % 2 == 0).count();
//	}

	/**
	 * The method below uses logarithmic to discover a num that contains even
	 * numbers of digits1
	 * @see https://brasilescola.uol.com.br/matematica/logaritmo.htm
	 */
//	public static int findNumbers(int[] nums) {
//		var sum = 0;
//
//		for (int num : nums) {
//			if (((int) Math.log10(num) + 1) % 2 == 0) {
////				System.out.println("num0 => " + num);
////				System.out.println("Math.log10(num) => " + Math.log10(num));
////				System.out.println("Math.log10(num) + 1) => " + Math.log10(num) + 1);
//				sum++;
//			}
//		}
//
//		return sum;
//	}
	
	public static int findNumbers(int[] nums) {
		int sum = 0;
		
		for (int num : nums) {
			if (String.valueOf(num).length() % 2 == 0) {
				sum++;
			}
		}
		
		return sum;
	}

}
