package com.leetcode.arrays;

/**
 *
 * brunolima on Mar 20, 2021
 * 
 * Input: [1,1,0,1,1,1] 
 * Output: 3 
 * Explanation: 
 * The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 * 
 */

public class _12_MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] nums1 = { 1, 1, 0, 1, 1, 1 };
		System.out.println("The find consecutive is: " + findMaxConsecutiveOnes(nums1));

		int[] nums2 = { 1, 0, 1, 1, 0, 1 };
		System.out.println("The find consecutive is: " + findMaxConsecutiveOnes(nums2));

		int[] nums3 = { 0 };
		System.out.println("The find consecutive is: " + findMaxConsecutiveOnes(nums3));
		
		int[] nums4 = { 1 };
		System.out.println("The find consecutive is: " + findMaxConsecutiveOnes(nums4));
	}

//	public static int findMaxConsecutiveOnes(int[] nums) {
//		int count = 0;
//		int countMax = 0;
//		
//		for (int i = 0; i < nums.length; i++) {
//			// If encountering input array to be 0 then re-set the frequency of counting
//			if (nums[i] == 0) {
//				count = Math.max(count, countMax);
//				countMax = 0;
//			} else {
//				countMax++;
//			}
//		}
//
//		return Math.max(count, countMax);
//	}
	
//	public static int findMaxConsecutiveOnes(int[] nums) {
//		int count = 0;
//		int countMax = 0;
//		
//		for (int num : nums) {
//			if (num == 1) {
//				count++;
//				countMax = Math.max(count, countMax);
//			} else {
//				count = 0;
//			}
//		}
//		
//		return countMax;
//	}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int countMax = 0;
		
		for (int num : nums) {
			countMax = Math.max(countMax, count = num == 0 ? 0 : count + 1);
		}
		
		return countMax;
	}
	
	
}
