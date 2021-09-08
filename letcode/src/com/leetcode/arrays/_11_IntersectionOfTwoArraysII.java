package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * brunolima on Apr 6, 2021
 * 
 * 
 * Given two integer arrays nums1 and nums2, return an array of their
 * intersection. Each element in the result must appear as many times as it
 * shows in both arrays and you may return the result in any order.
 * 
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2] 
 * 
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] 
 * Output: [4,9] 
 * Explanation: [9,4] is also accepted.
 */

public class _11_IntersectionOfTwoArraysII {

	public static void main(String[] args) {
		
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		int[] result1 = intersect(nums1, nums2);
		printArray(result1);

		int[] nums3 = { 4, 9, 5 };
		int[] nums4 = { 9, 4, 9, 8, 4 };
		int[] result2 = intersect(nums3, nums4);
		printArray(result2);
		
		int[] nums5 = { 1, 2, 2, 1 };
		int[] nums6 = { 2, 2 };
		int[] result3 = intersect(nums5, nums6);
		printArray(result3);
		
		int[] nums7 = { 1, 2, 2, 1 };
		int[] nums8 = { 2 };
		int[] result4 = intersect(nums7, nums8);
		printArray(result4);
		
		int[] nums9 = { 2, 1 };
		int[] nums10 = { 1, 2 };
		int[] result5 = intersect(nums9, nums10);
		printArray(result5);		
	}
	
	private static void printArray(int[] digits1) {
		for (int value : digits1) {
			System.out.print(value + " ");
		}
		
		System.out.println();
	}

//	public static int[] intersect(int[] nums1, int[] nums2) {
//		ArrayList<Integer> arrayInteger = new ArrayList<>();
//		
//		for (int i = 0; i < nums1.length; i++) {
//			
//			for (int j = 0; j < nums2.length; j++) {
//				if (nums1[i] == nums2[j]) {
//					nums2[j] = -1;
//					arrayInteger.add(nums1[i]);
//					break;
//				}
//			}
//			
//		}
//		
//		int[] numsAux = new int[arrayInteger.size()];
//		int l = 0;
//		
//		for (int value : arrayInteger) {
//			numsAux[l] = value;
//			l++;
//		}
//		
//		return numsAux;
//	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int i = 0 , j = 0;
		
		while(i < nums1.length && j <nums2.length) {
			if (nums1[i] == nums2[j]) {
				list.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}
		}
		
		int[] arrayAux = new int[list.size()];
		int k = 0;
		for (Integer value : list) {
			arrayAux[k++] = value;
		}
		
		return arrayAux;
	}
}
