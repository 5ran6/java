package com.leetcode.problems.easy;

import java.util.ArrayList;

/**
 *
 * brunolima on May 25, 2021
 * 
 * You are climbing a staircase. It takes n steps to reach the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 * 
 * 
 * 
 * Example 1:
 * Input: n = 2 
 * Output: 2 
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step 
 * 2. 2 steps 
 * 
 * Example 2:
 * Input: n = 3 
 * Output: 3 
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step 
 * 2. 1 step + 2 steps 
 * 3. 2 steps + 1 step
 * 
 */

public class ClimbingStairs {

	public static void main(String[] args) {
		ClimbingStairs cs = new ClimbingStairs();
		
		long begin = System.currentTimeMillis();
		System.out.println("Result >>> " + cs.climbStairs(2));
		System.out.println("Result >>> " + cs.climbStairs(3));
		System.out.println("Result >>> " + cs.climbStairs(4));
		System.out.println("Result >>> " + cs.climbStairs(10));
		long end = System.currentTimeMillis();
		System.out.println("Total time: " + (end - begin));
		
		System.out.println("Using memoization >>>>");
		begin = System.currentTimeMillis();
		System.out.println("Result >>> " + cs.climbStairsMemoization(2));
		System.out.println("Result >>> " + cs.climbStairsMemoization(3));
		System.out.println("Result >>> " + cs.climbStairsMemoization(4));
		System.out.println("Result >>> " + cs.climbStairsMemoization(10));
		end = System.currentTimeMillis();
		System.out.println("Total time: " + (end - begin));
		
		System.out.println("Using Dynamic Programming >>>>");
		begin = System.currentTimeMillis();
		System.out.println("Result >>> " + cs.climbStairsDynamicProgramming(2));
		System.out.println("Result >>> " + cs.climbStairsDynamicProgramming(3));
		System.out.println("Result >>> " + cs.climbStairsDynamicProgramming(4));
		System.out.println("Result >>> " + cs.climbStairsDynamicProgramming(10));
		end = System.currentTimeMillis();
		System.out.println("Total time: " + (end - begin));
	}

	// O(2n)
	public int climbStairs(int n) {
		return climbStairs(0, n);
	}

	public int climbStairs(int i, int n) {
		if (i > n) {
			return 0; 
		}
		
		if (i == n) {
			return 1;
		}
		
		return climbStairs(i + 1, n) + climbStairs(i + 2, n);
	}
	
	// O(n)
	public int climbStairsMemoization(int n) {
		int[] memo = new int[n + 1];
		return climbStairsMemoization(0, n, memo);
	}

	public int climbStairsMemoization(int i, int n, int[] memo) {
		if (i > n) {
			return 0; 
		}
		
		if (i == n) {
			return 1;
		}
		
		if (memo[i] > 0) {
			return memo[i];
		}
		
		memo[i] = climbStairsMemoization(i + 1, n, memo) + climbStairsMemoization(i + 2, n, memo);
		
		return memo[i];
	}
	
	public int climbStairsDynamicProgramming(int n) {
		if (n == 1) {
			return 1;
		}
		
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		return dp[n];
	}

}
