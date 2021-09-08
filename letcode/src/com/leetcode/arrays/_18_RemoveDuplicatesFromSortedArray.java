package com.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * brunolima on Mar 24, 2021
 * 
 */

public class _18_RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 1, 2 };
		int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		
		printAfter(nums1);
		int[] result1 = removeDuplicatesFromArray(nums1);
		printBefore(result1);
		
		System.out.println("=====================");
		System.out.println("=====================");
		
		printAfter(nums2);
		int[] result2 = removeDuplicatesFromArray(nums2);
		printBefore(result2);

		System.out.println("=====================");
		System.out.println(removeDuplicates(nums1));
		System.out.println(removeDuplicates(nums2));
	}
	
	private static void printAfter(int[] array) {
		System.out.print("Printing after: \n");
		for (int i : array) {
			System.out.print(i + ", ");
		}
		
		System.out.print("\n");
	}
	
	private static void printBefore(int[] array) {
		System.out.print("\nPrinting before: \n");
		for (int i : array) {
			System.out.print(i + ", ");
		}
		
		System.out.print("\n");
	}

	public static int[] removeDuplicatesFromArray(int[] array) {
		int totalUniqueElements = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (i == 0 || array[i] != array[i - 1]) {
				totalUniqueElements++;
			}
		}
		
		int[] result = new int[totalUniqueElements];
		int indexResult = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (i == 0 || array[i] != array[i - 1]) {
				result[indexResult] = array[i];
				indexResult++;
			}
		}
		
		return result;
	}

	public static int removeDuplicates(int[] nums) {
		Set<Integer> numSet = new HashSet<>();
		
		int k  = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (numSet.add(nums[i]) != false) {
				nums[k] = nums[i];
				k++;
			}
		}
		
		return numSet.size();
	}
	
}
