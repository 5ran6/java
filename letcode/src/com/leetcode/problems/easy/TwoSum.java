package com.leetcode.problems.easy;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

/**
 *
 * brunolima on Mar 16, 2021
 * 
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * 
 * 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9 
 * Output: [0,1] 
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1]. 
 * 
 * Example 2: 
 * Input: nums = [3,2,4], target = 6 
 * Output: [1,2] 
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6 
 * Output: [0,1]
 * 
 */

public class TwoSum {
	
	public static void main(String[] args) {
		int[] arr1 = { 2, 7, 11, 15 };
		int[] arr1Expected = { 0, 1 };
		Assert.assertArrayEquals(arr1Expected, twoSum(arr1, 9));

		int[] arr2 = { 3, 2, 4 };
		int[] arr2Expected = { 1, 2 };
		Assert.assertArrayEquals(arr2Expected, twoSum(arr2, 6));

		int[] arr3 = { 3, 3 };
		int[] arr3Expected = { 0, 1 };
		Assert.assertArrayEquals(arr3Expected, twoSum(arr3, 6));
		
		int[] arr4 = { 2, 5, 5, 11 };
		int[] arr4Expected = { 1, 2 };
		Assert.assertArrayEquals(arr4Expected, twoSum(arr4, 10));
		
		System.out.println("Success!");
	}

	public static int[] twoSum(int[] nums, int target) {
		List<Integer> result = new ArrayList<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int sum = nums[i] + nums[j];
				
				if (sum == target) {
					result.add(i);
					result.add(j);
					return result.stream().mapToInt(n -> n).toArray();
				}
			}
		}
		
		return null;
	}

}
