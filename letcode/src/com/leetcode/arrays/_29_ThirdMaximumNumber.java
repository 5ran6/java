package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * brunolima on Mar 30, 2021
 * 
 * Given integer array nums, return the third maximum number in this array. If
 * the third maximum does not exist, return the maximum number.
 * 
 * Example 1:
 * Input: nums = [3,2,1] 
 * Output: 1 
 * Explanation: The third maximum is 1. 
 * 
 * Example 2:
 * Input: nums = [1,2]
 * Output: 2 
 * Explanation: The third maximum does not exist, so the maximum (2) is returned instead. 
 * 
 * Example 3:
 * Input: nums = [2,2,3,1] 
 * Output: 1 
 * Explanation: Note that the third maximum here means the third maximum distinct number. 
 * Both numbers with value 2 are both considered as second maximum.
 * 
 */

public class _29_ThirdMaximumNumber {
	
	public static void main(String[] args) {
		int[] nums1 = { 3, 2, 1 };
		System.out.println(thirdMax(nums1));

		int[] nums2 = { 1, 2 };
		System.out.println(thirdMax(nums2));

		int[] nums3 = { 2, 2, 3, 1 };
		System.out.println(thirdMax(nums3));
	}
	
	public static int thirdMax(int[] nums) {
		Set<Integer> set = new TreeSet<>();

		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		
		ArrayList<Integer> al = new ArrayList<>();
		al.addAll(set);
		
		int size = al.size();
		
		if (size < 3) {
			return al.get(size - 1);
		} else {
			return al.get(size - 3);
		}
    }

}
