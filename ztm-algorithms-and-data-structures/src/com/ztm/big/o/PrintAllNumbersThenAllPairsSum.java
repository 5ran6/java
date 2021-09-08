package com.ztm.big.o;

import java.util.Arrays;
import java.util.List;

/**
*
* brunolima on Apr 21, 2021
* 
*/

public class PrintAllNumbersThenAllPairsSum {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		
		System.out.println("These are the numbers:");
		nums.forEach(num -> System.out.println(num));
		
		// O(nˆ2)
		System.out.println("And these are their sums");
		nums.forEach(num1 -> {
			nums.forEach(num2 -> {
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			});
			
			System.out.println("--------------");
		});
		
		
	}
	
}

