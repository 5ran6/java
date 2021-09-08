package com.ztm.algorithms.dynamicprogramming;

import java.util.HashMap;

/**
 *
 * brunolima on Apr 27, 2021
 * 
 */

public class DynamicFibonacci {

	static HashMap<Long, Long> cache = new HashMap<>();
	static int operationsCount = 0;

	public static void main(String[] args) {
		DynamicFibonacci dfb = new DynamicFibonacci();
		System.out.println(dfb.dynamicFibonacci(7));
		System.out.println(operationsCount);
	}

	public long dynamicFibonacci(long n) {
		if (cache.containsKey(n)) {
			return cache.get(n);
		} else {
			if (n < 2) {
				return n;
			} else {
				operationsCount++;
				cache.put(n, dynamicFibonacci(n - 1) + dynamicFibonacci(n - 2));
				return cache.get(n);
			}
		}
	}

}
