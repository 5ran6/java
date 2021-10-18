package com.leetcode.problems.medium;

/**
 *
 * brunolima on Oct 17, 2021
 * 
 * https://leetcode.com/problems/number-of-islands/
 * 
 * 
 * Input: grid = { {'1','1','1','1','0'}, {'1','1','0','1','0'},
 * {'1','1','0','0','0'}, {'0','0','0','0','0'}} Output: 1
 * 
 * 
 * Input: grid = { {'1','1','0','0','0'}, {'1','1','0','0','0'},
 * {'0','0','1','0','0'}, {'0','0','0','1','1'}} Output: 3
 * 
 * 
 * https://youtu.be/U6-X_QOwPcs
 */

public class NumberOfIslands {

	public static void main(String[] args) {
		char[][] island1 = { 
				{ '1', '1', '1', '1', '0' }, 
				{ '1', '1', '0', '1', '0' }, 
				{ '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' }};

		System.out.println(numIslands(island1));
		
		
		char[][] island2 = {
		        {'1','1','0','0','0'},
		        {'1','1','0','0','0'},
		        {'0','0','1','0','0'},
		        {'0','0','0','1','1'}};
		
		System.out.println(numIslands(island2));
	}

	public static int numIslands(char[][] grid) {
		int count = 0;
		
		for (int row = 0; row < grid.length; row++) {
			for (int column = 0; column < grid[row].length; column++) {
				if (grid[row][column] == '1') {
					count++;
					callBFS(grid, row ,column);
				}
			}
		}

		return count;
	}

	private static void callBFS(char[][] grid, int row, int column) {
		if (row < 0 || row >= grid.length || column < 0 || column >= grid[row].length
				|| grid[row][column] == '0') return;
		
		grid[row][column] = '0';
		
		callBFS(grid, row + 1, column); // checkp up
		callBFS(grid, row - 1, column); // checkp down
		callBFS(grid, row, column - 1); // checkp left
		callBFS(grid, row, column + 1); // checkp right
	}

}
