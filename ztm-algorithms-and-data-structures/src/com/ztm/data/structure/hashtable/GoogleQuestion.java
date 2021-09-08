package com.ztm.data.structure.hashtable;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/**
 *
 * brunolima on Apr 23, 2021
 * 
 * Given an array = [2, 5, 1 ,2 , 3, 5, 1, 2, 4]; 
 * It should return 2
 * 
 * Given an array = [2, 1, 1 ,2 , 3, 5, 1, 2, 4]; 
 * It should return 1
 * 
 * Given an array = [2, 3, 4, 5];
 * It should return null
 * 
 * Given an array = [2,5,5,2,3,5,1,2,4]: 
 * It should return 5 because the pairs are before 2,2
 * 
 */

public class GoogleQuestion {

	public static void main(String[] args) {
		int[] array1 = { 2, 5, 1, 2, 3, 5, 1, 2, 4 };
//		int result1 = getFirstValueDuplicate(array1);
		int result1 = getFirstValueDuplicate2(array1);
		System.out.println(result1);
		
		int[] array2 = {2, 1, 1 ,2 , 3, 5, 1, 2, 4};
//		int result2 = getFirstValueDuplicate(array2);
		int result2 = getFirstValueDuplicate2(array2);
		System.out.println(result2);
		
		int[] array3 = {2,5,5,2,3,5,1,2,4};
//		int result2 = getFirstValueDuplicate(array2);
		int result3 = getFirstValueDuplicate2(array3);
		System.out.println(result3);
		
		
		Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
		
	}

	// O(nˆ2)
	private static int getFirstValueDuplicate(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					return array[i];
				}
			}
		}
		
		return -1;
	}
	
	// O(n)
	private static int getFirstValueDuplicate2(int[] array) {
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < array.length; i++) {
			if (!set.contains(array[i])) {
				set.add(array[i]);
			} else {
				return array[i];
			}
		}
		
		return -1;
	} 

}
