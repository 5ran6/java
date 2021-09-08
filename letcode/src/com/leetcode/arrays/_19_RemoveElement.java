package com.leetcode.arrays;

import java.util.Arrays;

/**
 *
 * brunolima on Mar 24, 2021
 * 
 * Given an array nums and a value val, remove all instances of that value
 * in-place and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length.
 * 
 * Clarification:
 * 
 * Confused why the returned value is an integer but your answer is an array?
 * 
 * Note that the input array is passed in by reference, which means a
 * modification to the input array will be known to the caller as well.
 * 
 * Internally you can think of this:
 * 
 * // nums is passed in by reference. (i.e., without making a copy) int len =
 * removeElement(nums, val);
 * 
 * // any modification to nums in your function would be known by the caller. //
 * using the length returned by your function, it prints the first len elements.
 * for (int i = 0; i < len; i++) { print(nums[i]); }
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [3,2,2,3], val = 3 Output: 2, nums = [2,2]
 * 
 * Explanation: Your function should return length = 2, with the first two
 * elements of nums being 2. It doesn't matter what you leave beyond the
 * returned length. For example if you return 2 with nums = [2,2,3,3] or nums =
 * [2,2,0,0], your answer will be accepted.
 * 
 * Example 2: Input: nums = [0,1,2,2,3,0,4,2], val = 2 Output: 5, nums =
 * [0,1,4,0,3]
 * 
 * Explanation: Your function should return length = 5, with the first five
 * elements of nums containing 0, 1,
 * 
 */

public class _19_RemoveElement {

	public static void main(String[] args) {
		int[] arr1 = { 3, 2, 2, 3 };
		System.out.println(removeElement(arr1, 3));

		int[] arr2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
		System.out.println(removeElement(arr2, 2));

		int[] arr3 = { 1, 2, 6, 2, 3 };
		System.out.println(removeElement(arr3, 2));
	}

	public static int removeElement(int[] nums, int val) {
		int i = 0;
		
		for (int elem : nums) {
			if (elem != val) nums[i++] = elem;
		}

		return i;
	}

//	public static int removeElement(int[] nums, int val) {
//		int i = 0;
//		int n = nums.length;
//		
//		while (i < n) {
//			if (nums[i] == val) {
//				nums[i] = nums[n - 1];
//				n--;
//			} else {
//				i++;
//			}
//		}
//		
//		return n;
//	}

//	public static int removeElement(int[] nums, int val) {
//		int i = 0;
//
//		for (int j = 0; j < nums.length; j++) {
//			if (nums[j] != val) {
//				nums[i] = nums[j];
//				i++;
//			}
//		}
//
//		return i;
//	}
//	

}
