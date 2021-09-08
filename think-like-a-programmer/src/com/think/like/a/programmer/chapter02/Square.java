package com.think.like.a.programmer.chapter02;

/**
*
* brunolima on May 16, 2021
* 
*/

public class Square {

	public static void main(String[] args) {
		Square square = new Square();
		
		int sizeSquare = 5;
		square.createSquare(sizeSquare);
		square.createHalfSquare(sizeSquare);
		square.createHalfSquare2(sizeSquare);
	}
	
	private void createHalfSquare2(int sizeSquare) {
		System.out.println("Half Square 2");
		
		for (int i = 0; i < sizeSquare; i++) {
			for (int j = 1; j < sizeSquare + 1 - i; j++) {
				System.out.print("#");
			}
			
			System.out.println(); // breakLine
		}
		
		System.out.println();
	}
	
	private void createHalfSquare(int sizeSquare) {
		System.out.println("Half Square");
		
		for (int i = 0; i < sizeSquare; i++) {
			for (int j = i; j < sizeSquare; j++) {
				System.out.print("#");
			}
			
			System.out.println(); // breakLine
		}
		
		System.out.println();
	}
	
	private void createSquare(int sizeSquare) {
		System.out.println("Square");
		
		for (int i = 0; i < sizeSquare; i++) {
			for (int j = 0; j < sizeSquare; j++) {
				System.out.print("#");
				
				if (j == sizeSquare - 1) {
					System.out.println();
				}
			}
			
//			System.out.println(); // breakLine
		}
		
		System.out.println();
	}
	
}

