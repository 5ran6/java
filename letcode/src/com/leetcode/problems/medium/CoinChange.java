package com.leetcode.problems.medium;

import java.util.Arrays;

/**
 *
 * brunolima on Oct 16, 2021
 * 
 * https://leetcode.com/problems/coin-change/
 * 
 * Input: coins = [1,2,5], amount = 11 Output: 3 Explanation: 11 = 5 + 5 + 1
 * 
 * Input: coins = [2], amount = 3 Output: -1
 * 
 * Input: coins = [1], amount = 0 Output: 0
 * 
 * Explantion using DP (Dynamic Programming)
 * https://www.youtube.com/watch?v=jgiZlGzXMBw
 * https://www.youtube.com/watch?v=1R0_7HqNaW0
 * 
 */

public class CoinChange {

	public static void main(String[] args) {
		int [] coins1 = {1, 2, 5 };
		int amount1 = 11;
		System.out.println(coinChange(coins1, amount1));
		
		int [] coins2 = {2};
		int amount2 = 3;
		System.out.println(coinChange(coins2, amount2));
		
		int [] coins3 = {1};
		int amount3 = 0;
		System.out.println(coinChange(coins3, amount3));

	}

	public static int coinChange(int[] coins, int amount) {
		if (coins.length == 1 && coins[0] < amount) {
			return -1;
		} else if (coins.length == 1 && coins[0] == 0) {
			return 0;
		}
		
		Arrays.sort(coins);
		
		int [] dp = new int[amount + 1];
		
//		System.out.println(Arrays.toString(dp));
		Arrays.fill(dp, amount + 1);
//		System.out.println(Arrays.toString(dp));
		
		dp[0] = 0;
		
		for (int i = 0; i <= amount; i++) {
			for (int j = 0; j < coins.length; j++) {
				if (coins[j] <= i) {
					dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
				} else {
					break;
				}
			}
		}

		return dp[amount] > amount ? -1 : dp[amount];
	}

}
