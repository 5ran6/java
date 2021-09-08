package com.leetcode.arrays;

import java.util.Arrays;

/**
 *
 * brunolima on Mar 23, 2021
 * 
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as
 * one sorted array.
 * 
 * The number of elements initialized in nums1 and nums2 are m and n
 * respectively. You may assume that nums1 has a size equal to m + n such that
 * it has enough space to hold additional elements from nums2.
 * 
 * 
 * Example 1: Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * 
 * Example 2: Input: nums1 = [1], m = 1, nums2 = [], n = 0 Output: [1]
 * 
 */

public class _14_MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		merge(nums1, 3, nums2, 3);
		System.out.println(Arrays.toString(nums1));
		
		int[] nums3 = { 2, 0 };
		int[] nums4 = { 1 };
		merge(nums3, 1, nums4, 1);
		System.out.println(Arrays.toString(nums3));
		
		
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] arr = new int[m + n];
		int k = 0;

		for (int i = 0; i < nums1.length; i++) {
			if (nums1[i] != 0) {
				arr[k] = nums1[i];
				k++;
			}
		}

		for (int i = 0; i < nums2.length; i++) {
			if (nums2[i] != 0) {
				arr[k] = nums2[i];
				k++;
			}
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			nums1[i] = arr[i];
		}
	}

}
