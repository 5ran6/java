package com.leetcode.arrays;

import java.util.HashSet;

/**
 *
 * brunolima on Apr 5, 2021
 * 
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * 
 * 
 * Example 1:
 * Input: nums = [1,2,3,1] 
 * Output: true 
 * 
 * Example 2:
 * Input: nums = [1,2,3,4] 
 * Output: false 
 * 
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2] 
 * Output: true
 */

public class _4_ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 1 };
		System.out.println(containsDuplicate(nums1));

		int[] nums2 = { 1, 2, 3, 4 };
		System.out.println(containsDuplicate(nums2));

		int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		System.out.println(containsDuplicate(nums3));
	}

//	O(n)
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> hasInts = new HashSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			hasInts.add(nums[i]);
		}
		
		boolean result = nums.length == hasInts.size();
		
		return !result;
	}
	
//	O(nˆ2)
//	public static boolean containsDuplicate(int[] nums) {
//		boolean result = false;
//		
//		for (int i = 0; i < nums.length; i++) {
//			
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] == nums[j]) {
//					return true;
//				}
//			}
//			
//		}
//		
//		return result;
//	}
	
}
