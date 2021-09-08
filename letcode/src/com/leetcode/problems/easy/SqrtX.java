package com.leetcode.problems.easy;

/**
*
* brunolima on May 24, 2021
* 
*/

public class SqrtX {

	public static void main(String[] args) {
		SqrtX sqrt = new SqrtX();
		System.out.println("Result : " + sqrt.mySqrt(4));
		System.out.println("Result : " + sqrt.mySqrt(8));
	}
	
	public int mySqrt(int x) {
		return (int) Math.sqrt(x);
    }
	
}

