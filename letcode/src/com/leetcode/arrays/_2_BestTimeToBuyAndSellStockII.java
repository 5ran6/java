package com.leetcode.arrays;

/**
 *
 * brunolima on Mar 31, 2021
 * 
 * Find the maximum profit you can achieve. You may complete as many
 * transactions as you like (i.e., buy one and sell one share of the stock
 * multiple times).
 * 
 * Note: You may not engage in multiple transactions simultaneously (i.e., you
 * must sell the stock before you buy again).
 * 
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 7 
 * Explanation: 
 * Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4. 
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3. 
 * 
 * Example 2:
 * Input: prices = [1,2,3,4,5]
 * Output: 4 
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4. 
 * Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are engaging multiple
 * transactions at the same time. You must sell before buying again. 
 * 
 * Example 3:
 * Input: prices = [7,6,4,3,1]
 * Output: 0 
 * Explanation: In this case, no transaction is done, i.e., max profit = 0.
 * 
 */

public class _2_BestTimeToBuyAndSellStockII {

	public static void main(String[] args) {
		int[] prices1 = { 7, 1, 5, 3, 6, 4 };
		System.out.println("Result01: " + maxProfit(prices1));

		int[] prices2 = { 1, 2, 3, 4, 5 };
		System.out.println("Result02: " + maxProfit(prices2));

		int[] prices3 = { 7, 6, 4, 3, 1 };
		System.out.println("Result03: " + maxProfit(prices3));

		int[] prices4 = { 6, 1, 3, 2, 4, 7 };
		System.out.println("Result04: " + maxProfit(prices4));

		int[] prices5 = { 2, 1, 4 };
		System.out.println("Result05: " + maxProfit(prices5));
		
		int[] prices6 = { 3, 3, 5, 0, 0, 3, 1, 4 };
		System.out.println("Result06: " + maxProfit(prices6));
	}
	
	public static int maxProfit(int[] prices) {
		
		if (checkIfScrumbled(prices)) {
			int profit = 0;
			
			for (int i = 0; i < prices.length - 1; i++) {
				if (prices[i] > prices[i + 1] || prices[i] == prices[i + 1]) {
					continue;
				} else if (prices[i] < prices[i + 1]) {
					profit += prices[i + 1] - prices[i];
				}
			}
			
			return profit;
		} else {
			return calculateProfit(prices);
		}
    }

	private static boolean checkIfScrumbled(int[] prices) {
		boolean isDesc = false;
		boolean isAsc = false;
		
		
		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i] > prices[i + 1]) {
				isDesc = true;
			} else if (prices[i] < prices[i + 1]) {
				isAsc = true;
			}
		}
		
		return isAsc && isDesc;
	}

	private static int calculateProfit(int[] prices) {
		boolean arrayOrdered = false;
		
		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i] < prices[i + 1]) {
				arrayOrdered = true;
				continue;
			} else {
				arrayOrdered = false;
				continue;
			}
		}
		
		int profit = 0;
		
		if (arrayOrdered) {
			profit = prices[prices.length - 1] - prices[0];
		} else {
			return profit;
		}
		
		return profit;
	}

}
