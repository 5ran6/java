package com.ztm.algorithms.recursion;

/**
*
* brunolima on Apr 27, 2021
* 
* Given a number N return the index value of the Fibonacci sequence
* , where the sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
* 
*  The pattern of the sequence is that each value is the sum of the 2 previous values
*  , that means that for N=5 -> 2+3
*/

public class Fibonacci {
	
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		
		System.out.println(fibonacci.fibonacciIterative(0));
		System.out.println(fibonacci.fibonacciIterative(1));
		System.out.println(fibonacci.fibonacciIterative(2));
		System.out.println(fibonacci.fibonacciIterative(3));
		System.out.println(fibonacci.fibonacciIterative(4));
		System.out.println(fibonacci.fibonacciIterative(5));
		System.out.println(fibonacci.fibonacciIterative(6));
		System.out.println(fibonacci.fibonacciIterative(7));
		
		System.out.println("-----------------------------");
		
		System.out.println(fibonacci.fibonacciRecursive(0));
		System.out.println(fibonacci.fibonacciRecursive(1));
		System.out.println(fibonacci.fibonacciRecursive(2));
		System.out.println(fibonacci.fibonacciRecursive(3));
		System.out.println(fibonacci.fibonacciRecursive(4));
		System.out.println(fibonacci.fibonacciRecursive(5));
		System.out.println(fibonacci.fibonacciRecursive(6));
		System.out.println(fibonacci.fibonacciRecursive(7));
		
	}
	
	// O(n)
	public int fibonacciIterative(int number) {
		if (number == 0) {
			return 0;
		}
		
		int first = 0;
		int second = 1;
		int sum = first + second;
		
		first = second;
		second = sum;
		
		for (int i = 2; i < number; i++) {
			sum = first + second;
			first = second;
			second = sum;
		}
		
		return sum;
	}
	
	// O(2ˆn)
	public int fibonacciRecursive(int number) {
		if (number < 2) {
			return number;
		}
		
		return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2) ;
	}

}

