package com.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * brunolima on Apr 7, 2021
 * 
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be
 * validated according to the following rules:
 * 
 * Each row must contain the digits 1-9 without repetition. Each column must
 * contain the digits 1-9 without repetition. Each of the nine 3 x 3 sub-boxes
 * of the grid must contain the digits 1-9 without repetition. Note:
 * 
 * A Sudoku board (partially filled) could be valid but is not necessarily
 * solvable. Only the filled cells need to be validated according to the
 * mentioned rules.
 *
 * Example 1:
 * Input: board = 
 * {{'5','3','.','.','7','.','.','.','.'}
 * ,{'6','.','.','1','9','5','.','.','.'} 
 * ,{'.','9','8','.','.','.','.','6','.'}
 * ,{'8','.','.','.','6','.','.','.','3'} 
 * ,{'4','.','.','8','.','3','.','.','1'}
 * ,{'7','.','.','.','2','.','.','.','6'} 
 * ,{'.','6','.','.','.','.','2','8','.'}
 * ,{'.','.','.','4','1','9','.','.','5'}
 * ,{'.','.','.','.','8','.','.','7','9'}} 
 * Output: true
 *
 * Example 2:
 * Input: board = 
 * {{'8','3','.','.','7','.','.','.','.'}
 * ,{'6','.','.','1','9','5','.','.','.'} 
 * ,{'.','9','8','.','.','.','.','6','.'}
 * ,{'8','.','.','.','6','.','.','.','3'} 
 * ,{'4','.','.','8','.','3','.','.','1'}
 * ,{'7','.','.','.','2','.','.','.','6'} 
 * ,{'.','6','.','.','.','.','2','8','.'}
 * ,{'.','.','.','4','1','9','.','.','5'}
 * ,{'.','.','.','.','8','.','.','7','9'}} 
 * Output: false 
 * 
 * Explanation: Same as Example 1, except with the 5 in 
 * the top left corner being modified to 8. Since there are two 8's in the 
 * top left 3x3 sub-box, it is invalid.
 */

public class _30_ValidSudoku {
	
	public static void main(String[] args) {
		char[][] board1 = { 
				{ '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, 
				{ '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, 
				{ '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, 
				{ '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, 
				{ '.', '.', '.', '.', '8', '.', '.', '7', '9' }};
		
		System.out.println(isValidSudoku(board1));
		
		char[][] board2 = { 
				{ '8', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' },
				{ '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, 
				{ '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, 
				{ '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, 
				{ '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		
		System.out.println(isValidSudoku(board2));
	}
	
	public static boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < 9; ++i) {
			Set<Character> rSet = new HashSet<>(), cSet = new HashSet<>(), bSet = new HashSet<>();
			for (int j = 0; j < 9; ++j) {
				// bug - 1 => if duplicated, add will return false;
				if (board[i][j] != '.' && !rSet.add(board[i][j]))
					return false;
				if (board[j][i] != '.' && !cSet.add(board[j][i]))
					return false;

				int r = i / 3 * 3 + j / 3, c = i % 3 * 3 + j % 3;
				if (board[r][c] != '.' && !bSet.add(board[r][c]))
					return false;
			}
		}
		return true;
	}
	
	
//	public static boolean isValidSudoku(char[][] board) {
////		printBoard(board);
//		
//		boolean[][] horizontal = new boolean[9][9];
//		boolean[][] vertical = new boolean[9][9];
//		boolean[][] box = new boolean[9][9];
//		
//		for (int i = 0; i < board.length; i++) {
//			
//			for (int j = 0; j < board.length; j++) {
//				
//				if (board[i][j] != '.') {
//					
//					// this index represents the number on the board, 
//					// which we subtract 1 from to get the index into the boolean array
//                    int index = board[i][j] - '1';
//                    
//                    if(horizontal[j][index]) return false;
//                    
//                    horizontal[j][index] = true;
//                    
//                    
//                    
//                    if(vertical[i][index]) return false;
//                    
//                    vertical[i][index] = true;
//                    
//                    
//                    
//                    int boxIndex = (j/3) + (3*(i/3));
//                    
//                    if(box[boxIndex][index]) return false;
//                    
//                    box[boxIndex][index] = true;
//				}
//				
//			}
//			
//		}
//		
//		printBoard(horizontal);
//		
//		System.out.println("----------------");
//		
//		printBoard(vertical);
//		
//		System.out.println("----------------");
//		
//		printBoard(box);
//		
//		System.out.println("----------------");
//		
//		return true;
//	}

	private static void printBoard(boolean[][] horizontal) {
		for (int i = 0; i < horizontal.length; i++) {
			for (int j = 0; j < horizontal.length; j++) {
				if (j >= 8) {
					System.out.print("[" + horizontal[i][j] + "]\n");
					break;
				}
				
				System.out.print(" [" + horizontal[i][j] + "] - ");
			}
		}
	}
	
}
