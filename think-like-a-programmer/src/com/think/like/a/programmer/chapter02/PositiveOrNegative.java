package com.think.like.a.programmer.chapter02;

import java.util.Scanner;

/**
*
* brunolima on May 17, 2021
* 
*/

public class PositiveOrNegative {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter 10 numbers (positive/negatives):");
		
		Scanner sc = new Scanner(System.in);
		
		int totalPositives = 0;
		int totalNegatives = 0;
		
		for (int i = 0; i < 10; i++) {
			int number = sc.nextInt();
			if (number > 0) totalPositives++;
			if (number < 0) totalNegatives++;
		}
		
		System.out.println("Total Positive Numbers: " + totalPositives);
		System.out.println("Total Negative Numbers: " + totalNegatives);
		
		sc.close();
	}

}

