package com.think.like.a.programmer.chapter02;

/**
*
* brunolima on May 16, 2021
* 
*/

public class SideWayTriangle {
	
	public static void main(String[] args) {
		SideWayTriangle triangle = new SideWayTriangle();
		
		int size = 4;
		triangle.createTriangle(size);
	}

	private void createTriangle(int sizeT) {
		System.out.println("Triangle");
		
		int loop = (sizeT * 2) - 1;
		
		for (int i = 0; i < loop; i++) {
			int abs = Math.abs(sizeT - 1 - i);
//			System.out.println("abs: " + abs);
			
//			for (int j = abs; j <= loop - sizeT; j++) {
			for (int j = abs; j < loop - sizeT + 1; j++) {
				System.out.print("#");
			}
			
			System.out.println(); // breakLine
		}
		
		System.out.println();
		
	}

}

