package com.ztm.interview;

import java.util.HashMap;
import java.util.Map;

/**
*
* brunolima on Apr 21, 2021
* 
*/

public class ContainsCommonItem {

	public static void main(String[] args) {
		char[] array1 = {'a', 'b', 'c', 'x'};
		char[] array2 = {'z', 'y', 'i'};
		
		char[] array3 = {'a', 'b', 'c', 'x'};
		char[] array4 = {'z', 'y', 'x'};

		System.out.println(containsCommonItem2(array1, array2));
		System.out.println(containsCommonItem2(array3, array4));
		
	}

	private static boolean containsCommonItem1(char[] array1, char[] array2) {
		// O(nˆ2)
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	private static boolean containsCommonItem2(char[] array1, char[] array2) {
		// O(n)
		Map<Character, Boolean> map = new HashMap<>();
		
		for (int i = 0; i < array1.length; i++) {
			if(!map.containsKey(array1[i])) {
				map.put(array1[i], true);
			}
		}
		
//		for (Character c : map.keySet()) {
//			System.out.println(c);
//		}
		
		for (int i = 0; i < array2.length; i++) {
			if (map.containsKey(array2[i])) {
				return true;
			}
		}
		
		return false;
	}
	
	
}

