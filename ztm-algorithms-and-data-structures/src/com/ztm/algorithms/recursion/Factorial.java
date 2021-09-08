package com.ztm.algorithms.recursion;

/**
 *
 * brunolima on Apr 26, 2021
 * 
 */

public class Factorial {
	
	static int operationsCount = 0;

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
//		System.out.println(factorial.findFactorialIterative(1));
//		System.out.println(factorial.findFactorialIterative(2));
//		System.out.println(factorial.findFactorialIterative(3));
//		System.out.println(factorial.findFactorialIterative(4));
//		System.out.println(factorial.findFactorialIterative(5));

		System.out.println("---------------------------------");

//		System.out.println(factorial.findFactorialRecursive(1));
//		System.out.println(factorial.findFactorialRecursive(2));
//		System.out.println(factorial.findFactorialRecursive(3));
//		System.out.println(factorial.findFactorialRecursive(4));
		System.out.println(factorial.findFactorialRecursive(5));
//		System.out.println(factorial.findFactorialRecursive(20));
		System.out.println(Factorial.operationsCount);

	}

	// Recursinb => 5! = 5 * 4 * 3 * 2 * 1
	public long findFactorialRecursive(int number) {
		if (number == 0)
			return 1;
		
		Factorial.operationsCount++;

		return number * findFactorialRecursive(number - 1);
	}

	public long findFactorialIterative(int number) {
		long result = 1;

		for (int i = 2; i <= number; i++) {
			result = result * i;
		}

		return result;
	}

}
