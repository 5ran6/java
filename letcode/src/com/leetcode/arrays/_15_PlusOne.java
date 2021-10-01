package com.leetcode.arrays;

/**
 *
 * brunolima on Apr 5, 2021
 * 
 * Given a non-empty array of decimal digits representing a non-negative
 * integer, increment one to the integer.
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list, and each element in the array contains a single digit.
 * 
 * You may assume the integer does not contain any leading zero, except the
 * number 0 itself.
 * 
 * 
 * 
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4] 
 * Explanation: The array represents the integer 123.
 * 
 * Example 2:
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2] 
 * Explanation: The array represents the integer 4321. 
 * 
 * Example 3:
 * Input: digits = [0]
 * Output: [1]
 * 
 */

public class _15_PlusOne {

	public static void main(String[] args) {
		int[] digits1 = {1,2,3};
		plusOne(digits1);
		
		int[] digits2 = {4, 3, 2, 1};
		plusOne(digits2);
		
		int[] digits3 = {0};
		plusOne(digits3);
		
		int[] digits4 = {9};
		plusOne(digits4);
		
		printArray(digits1);
		printArray(digits2);
		printArray(digits3);
		printArray(digits4);
	}
	
	private static void printArray(int[] digits1) {
		for (int value : digits1) {
			System.out.print(value);
		}
		
		System.out.println();
	}

	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i] += 1;
				return digits;
			}
			
			digits[i] = 0;
		}
		
//		int[] digitsAux = new int[digits.length + 1];
//		digitsAux[0] = 1;
		
		int[] digitsAux = { 1 };
		
		return digitsAux;
    }
	
//	public static int[] plusOne(int[] digits) {
//		for (int i = digits.length - 1; i >= 0; i--) {
//			
//			if (digits[i] < 9) {
//				digits[i] += 1;
//				return digits;
//			}
//			
//			digits[i] = 0;
//		}
//		
//		int[] digitsAux = new int[digits.length + 1];
//		digitsAux[0] = 1;
//		return digitsAux;
//	}

}