package com.leetcode.arrays;

import java.util.Arrays;

/**
 *
 * brunolima on Mar 29, 2021
 * 
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * 
 * Example 1: Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]
 * 
 * Example 2: Input: nums = [0] Output: [0]
 * 
 */

public class _22_MoveZeroes {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };

		moveZeroes(nums);

		System.out.println(Arrays.toString(nums));
	}

//	public static void moveZeroes(int[] nums) {
//		if (nums.length == 1)
//			return;
//	
//		int k = 0;
//		
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] != 0) {
//				int temp = nums[k];
//				nums[k] = nums[i];
//				nums[i] = temp;
//				k++;
//			}
//		}
//	}

	public static void moveZeroes(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count++;
			} else {
				nums[i - count] = nums[i];
			}
		}

		for (int i = nums.length - 1; i > nums.length - 1 - count; i--) {
			nums[i] = 0;
		}

	}

}
