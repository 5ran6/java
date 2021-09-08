package com.leetcode.arrays;

import java.util.Arrays;

/**
 *
 * brunolima on Mar 20, 2021
 * 
 * Given an integer array nums sorted in non-decreasing order, return an array
 * of the squares of each number sorted in non-decreasing order.
 * 
 * Example 1:
 * 
 * Input: nums = [-4,-1,0,3,10] Output: [0,1,9,16,100] Explanation: After
 * squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes
 * [0,1,9,16,100].
 * 
 * Example 2: Input: nums = [-7,-3,2,3,11] Output: [4,9,9,49,121]
 * 
 */

public class _28_SquaresOfASortedArray {

	public static void main(String[] args) {
		int[] nums1 = { -4, -1, 0, 3, 10 };
		int[] nums2 = { -7, -3, 2, 3, 11 };
		
		int[] resultNums1 = sortedSquares(nums1);
		for (int i : resultNums1) {
			System.out.println(i);
		}
		
		int[] resultNums2 = sortedSquares(nums2);
		for (int i : resultNums2) {
			System.out.println(i);
		}
	}

	public static int[] sortedSquares(int[] nums) {
		int[] arraySquares = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			arraySquares[i] = nums[i] * nums[i];
		}
		
		Arrays.sort(arraySquares);

		return arraySquares;
	}

}
