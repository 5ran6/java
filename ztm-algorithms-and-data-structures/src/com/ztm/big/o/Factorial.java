package com.ztm.big.o;

/**
 *
 * brunolima on Apr 21, 2021
 * 
 */

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Factorial 0: " + recursiveFactorial(0));
		System.out.println("Factorial 1: " + recursiveFactorial(1));
		System.out.println("Factorial 2: " + recursiveFactorial(2));
		System.out.println("Factorial 3: " + recursiveFactorial(3));
		System.out.println("Factorial 4: " + recursiveFactorial(4));
		System.out.println("Factorial 5: " + recursiveFactorial(5));
		System.out.println("Factorial 6: " + recursiveFactorial(6));
		System.out.println("Factorial 7: " + recursiveFactorial(7));
	}

	// 1! => 1 * 0! => 1
	// 2! => 2 * 1 * 0! => 2 * 1!
	// 3! => 3 * 2 * 1 * 0! => 3 * 2!
	// 4! => 4 * 3 * 2 * 1 * 0! => 4 * 3!
	public static int recursiveFactorial(int num) {
		if (num == 0) {
			return 1;
		}

		return num * recursiveFactorial(num - 1);
	}

}
