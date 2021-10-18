package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * brunolima on Oct 16, 2021
 * 
 * https://leetcode.com/problems/spiral-matrix/
 * 
 * Example: Input: matrix = [[1,2,3],[4,5,6],[7,8,9]] Output:
 * [1,2,3,6,9,8,7,4,5]
 * 
 * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]] Output:
 * [1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 */

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.deepToString(matrix1));

		List<Integer> spiralMatrix1 = spiralMatrix(matrix1);
		System.out.println(spiralMatrix1);

		System.out.println("============================");

		int[][] matrix2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		System.out.println(Arrays.deepToString(matrix2));

		List<Integer> spiralMatrix2 = spiralMatrix(matrix2);
		System.out.println(spiralMatrix2);

	}

	private static List<Integer> spiralMatrix(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();

		if (matrix.length == 0)
			return result;

		int rowBegin = 0;
		int rowEnd = matrix.length - 1;
		int columnBegin = 0;
		int columnEnd = matrix[0].length - 1;

		while (rowBegin <= rowEnd && columnBegin <= columnEnd) {

			for (int i = columnBegin; i <= columnEnd; i++) {
				result.add(matrix[rowBegin][i]);
			}
			
			System.out.println(result);

			rowBegin++;

			for (int i = rowBegin; i <= rowEnd; i++) {
				result.add(matrix[i][columnEnd]);
			}
			
			System.out.println(result);

			columnEnd--;

			if (rowBegin <= rowEnd) {
				for (int i = columnEnd; i >= columnBegin; i--) {
					result.add(matrix[rowEnd][i]);
				}
			}
			
			System.out.println(result);

			rowEnd--;

			if (columnBegin <= columnEnd) {
				for (int i = rowEnd; i >= rowBegin; i--) {
					result.add(matrix[i][columnBegin]);
				}
			}
			
			System.out.println(result);

			columnBegin++;
		}

		return result;
	}

}
