package com.leetcode.arrays;

import java.util.Arrays;

/**
*
* brunolima on Apr 1, 2021
* 
* Given an array, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/

public class _23_RotateArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 4, 5, 6, 7 };
		rotate(nums1, 3);

		for (int i : nums1) {
			System.out.print(i + ", ");
		}

		System.out.println("--------");

		int[] nums2 = { -1, -100, 3, 99 };
		rotate(nums2, 2);

		for (int i : nums2) {
			System.out.print(i + ", ");
		}
		
		System.out.println("--------");

		int[] nums3 = { 1, 2 };
		rotate(nums3, 3);

		for (int i : nums3) {
			System.out.print(i + ", ");
		}
	}
	
//	public static void rotate(int[] nums, int k) {
//		int count = 0;
//		
//		while (count < k) {
//			
//			for (int i = 0; i < nums.length - 1; i++) {
//				int tmp = nums[nums.length - 1];
//				nums[nums.length - 1] = nums[i];
//				nums[i] = tmp;
//			}
//			
//			count++;
//		}
//    }
	
	
	public static void rotate(int[] nums, int k) {
		if (nums.length < 2) {
	            return;
	    }
		
		int[] numsAux = Arrays.copyOf(nums, nums.length);
		int limitIndex = nums.length - 1;
		
		for (int i = 0; i < nums.length; i++) {
			int newIndex = (i + k) % nums.length;
			
			if (newIndex > limitIndex) {
				newIndex = newIndex - limitIndex - 1;
	
				nums[newIndex] = numsAux[i];
			} else {
				nums[newIndex] = numsAux[i];
			}
		}
    }
	
	// Approach 1 - Speed up the rotation
//	public static void rotate(int[] nums, int k) {
//		k %=  nums.length;
//		int kk = 0;
//		kk = k % nums.length;
//		
//		int temp, previous;
//		
//		for (int i = 0; i < kk; i++) {
//			previous = nums[nums.length - 1];
//			
//			for (int j = 0; j < nums.length; j++) {
//				temp = nums[j];
//				nums[j] = previous;
//				previous = temp;
//			}
//		}
//	}
	
	// Approach 2 - Using extra array
//	public static void rotate(int[] nums, int k) {
//		int[] a = new int[nums.length];
//		
//		for (int i = 0; i < nums.length; i++) {
//			a[(i + k) % nums.length] = nums[i];
//		}
//		
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = a[i];
//		}
//	}
	
	// Approach 3 - Usin Cyclic Replacements
//	public static void rotate(int[] nums, int k) {
//		k = k % nums.length;
//		
//		int count = 0;
//		
//		for (int start = 0; count < nums.length; start++) {
//			int current = start;
//			int prev = nums[start];
//			
//			do {
//				int next = (current + k) % nums.length;
//				
//				int temp = nums[next];
//				nums[next] = prev;
//				prev = temp;
//				
//				current = next;
//				count++;
//			} while (start != current);
//		}
//		
//	}
	
}

