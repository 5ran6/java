 package com.ztm.algorithms.mergesort;

import java.util.Arrays;

/**
*
* brunolima on Apr 27, 2021
* 
*/

public class MergeSort {
	
	public static void main(String[] args) {
		int[] input = { 99, 44, 6, 2, 1, 5, 63, 87, 289, 4, 0 };
//		int[] input = { 99, 44, 6};
		mergeSort(input, 0, input.length, true);
		
		System.out.println(Arrays.toString(input));
	}

	private static void mergeSort(int[] input, int left, int right, boolean asc) {
		if (right - left < 2) {
			return;
		}
		
		System.out.println(Arrays.toString(input));
		
		int mid = (left + right) / 2;
		System.out.println("mid: " + mid + ", input[mid]: " + input[mid - 1] + "\n");
		
		mergeSort(input, left, mid, asc);
		
		mergeSort(input, mid, right, asc);
		
		if (asc) {
			mergeAsc(input, left, mid, right);
		} else {
			//TODO mergeDesc
		}
		
	}

	private static void mergeAsc(int[] input, int left, int mid, int right) {
		if (input[mid - 1] <= input[mid]) {
			return;
		}
		
		int l = left;
		int m = mid;
		int i = 0;
		
		int[] temp = new int[right - left];
		
		while(l < mid && m < right) {
			temp[i++] = input[l] <= input[m] ? input[l++] : input[m++];
		}

		System.arraycopy(input, l, input, left + i, mid - l);
		
 		System.arraycopy(temp, 0, input,  left, i);
	}
	
}

