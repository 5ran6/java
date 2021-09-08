package com.ztm.algorithms.dynamicprogramming;

import java.util.HashMap;

/**
*
* brunolima on Apr 27, 2021
* 
*/

public class Memoization {
	
	static HashMap<Integer, Integer> cache = new HashMap<>();
	
	public static void main(String[] args) {
		Memoization memoization = new Memoization();
		
		System.out.println("addTo80: " + memoization.addTo80(5));
		System.out.println("addTo80: " + memoization.addTo80(5));
		
		System.out.println("----------------------------------");
		
		System.out.println("memoizeAddTo80: " + memoization.memoizeAddTo80(5));
		System.out.println("memoizeAddTo80: " + memoization.memoizeAddTo80(5));
		System.out.println("memoizeAddTo80: " + memoization.memoizeAddTo80(5));
	}
	
	public int addTo80(int n) {
		System.out.println("long time");
		return n + 80;
	}
	
	public int memoizeAddTo80(int n) {
		// Once cached it won't have to add every time the function is called
		if (!cache.containsKey(n)) {
			System.out.println("long time");
			cache.put(n, n + 80);
		}
		
		return cache.get(n);
	}
	

}

