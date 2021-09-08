package com.leetcode.problems.easy;

/**
 *
 * brunolima on May 24, 2021
 * 
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * Example 1:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4] 
 * Output: 6 
 * Explanation: [4,-1,2,1] has the largest sum = 6. 
 * 
 * Example 2:
 * Input: nums = [1] 
 * Output: 1 
 * 
 * Example 3:
 * Input: nums = [5,4,-1,7,8] 
 * Output: 23
 * 
 */

public class MaximumSubArray {

	public static void main(String[] args) {
		MaximumSubArray msa = new MaximumSubArray();
		
		int[] nums1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int[] nums2 = { 1 };
		int[] nums3 = { 5, 4, -1, 7, 8 };
		
		System.out.println("Result >>> " +  msa.maxSubArrayV2(nums1));
		System.out.println("Result >>> " +  msa.maxSubArrayV2(nums2));
		System.out.println("Result >>> " +  msa.maxSubArrayV2(nums3));
	}
	
	public int maxSubArray(int[] nums) {
		int sum = 0, maxTotal = Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
//			System.out.println("before sum >>> " + sum);
			sum += nums[i];
//			System.out.println("after sum >>> " + sum + "\n");
			
//			System.out.println("before maxTotal >>> " + maxTotal);
			if (maxTotal < sum) {
				maxTotal = sum;
			}
//			System.out.println("after maxTotal >>> " + maxTotal + "\n");
			
//			System.out.println("before sum >>> " + sum);
			if (sum < 0) {
				sum = 0;
			}
//			System.out.println("after sum >>> " + sum + "\n");
//			System.out.println("=================================");
		}
		
//		System.out.println("maxTotal >>> " + maxTotal);
//		System.out.println("sum >>> " + sum);
		
		return maxTotal;
    }
	
	public int maxSubArrayV2(int[] nums) {
		int sum = 0;
		int total = Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			total = Math.max(total, sum);
			
			if (sum < 0) sum = 0;
		}
		
		return total;
	}
	
}
