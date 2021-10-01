package com.cs.dojo.coding.interview.questions.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * brunolima on Sep 29, 2021
 * 
 */

public class CommonElementsInTwoSortedArrays {

	public static void main(String[] args) {
		int[] array1 = { 1, 3, 4, 6, 7, 9 };
		int[] array2 = { 1, 2, 4, 5, 9, 10 };

		System.out.println(commonElementsInTwoSortedArraysV1(array1, array2));
		System.out.println(commonElementsInTwoSortedArraysV2(array1, array2));
	}

	public static List<Integer> commonElementsInTwoSortedArraysV1(int[] array1, int[] array2) {
		HashSet<Integer> set = new HashSet<Integer>();
		List<Integer> commonElements = new ArrayList<Integer>();

		for (int i : array1) {
			set.add(i);
		}

		for (int i : array2) {
			if (!set.contains(i)) {
				set.add(i);
			} else {
				commonElements.add(i);
			}
		}

		return commonElements;
	}

	public static List<Integer> commonElementsInTwoSortedArraysV2(int[] array1, int[] array2) {
		List<Integer> commonElements = new ArrayList<Integer>();
		int p1 = 0;
		int p2 = 0;

		while (p1 < array1.length && p2 < array2.length) {
			if (array1[p1] == array2[p2]) {
				commonElements.add(array1[p1]);
				p1++;
				p2++;
			} else if (array1[p1] > array2[p2]) {
				p2++;
			} else {
				p1++;
			}
		}
		
		return commonElements;
	}

}
