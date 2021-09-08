package com.ztm.data.structure.arrays;

import java.util.ArrayList;
import java.util.List;

/**
*
* brunolima on Apr 21, 2021
* 
*/

public class ArraysExample {
	
	public static void main(String[] args) {
		// 8 bits => 1 byte
		// 4 bytes => 32 bits
		
		// 4 bytes * 4 strings = 16 bytes to storage 
		List<String> arrayS = new ArrayList<String>();
		arrayS.add("a");
		arrayS.add("b");
		arrayS.add("c");
		arrayS.add("d");
		
		for (String s : arrayS) {
			System.out.print(s + " ");
		}
		
		System.out.println("\nPrint index 2: " + arrayS.get(2));
		
		// push O(1)
		arrayS.add("e");
		
		for (String s : arrayS) {
			System.out.print(s + " ");
		}
		
		// pop O(1)
		System.out.println();
		arrayS.remove(arrayS.size() - 1);
		arrayS.remove(arrayS.size() - 1);
		
		for (String s : arrayS) {
			System.out.print(s + " ");
		}
		
		// unshift O(n)
		System.out.println();
		arrayS.add(0, "z");
		
		for (String s : arrayS) {
			System.out.print(s + " ");
		}
		
		// splice O(n)
		System.out.println();
		arrayS.add(2, "alien");
		
		for (String s : arrayS) {
			System.out.print(s + " ");
		}
	}

}

