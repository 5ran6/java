package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * brunolima on Mar 30, 2021
 * 
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in
 * nums.
 * 
 * 
 * Example 1:
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6] 
 * 
 * Example 2:
 * Input: nums = [1,1]
 * Output: [2]
 */

public class _7_FindAllNumbersDisappearedInAnArray {
	
	public static void main(String[] args) {
		int[] nums1 = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDisappearedNumbers(nums1));
		
		int[] nums2 = { 1, 1 };
		System.out.println(findDisappearedNumbers(nums2));

	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 1; i <= nums.length; i++) {
			al.add(i);
		}
		
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			hs.add(nums[i]);
		}
		
		al.removeAll(hs);
		
		
		return al;
	}
	

}
