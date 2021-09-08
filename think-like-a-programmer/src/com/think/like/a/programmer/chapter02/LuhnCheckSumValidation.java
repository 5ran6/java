package com.think.like.a.programmer.chapter02;

import java.util.Scanner;

/**
*
* brunolima on May 16, 2021
* 
*/

public class LuhnCheckSumValidation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number [0-9] with an even of digits (digit e/E to exit): ");
		char digit = sc.next().toCharArray()[0];
//		System.out.println("Digit: " + digit);
		
		int checkSum = 0;
		int position = 1;

		while(digit != 'e' && digit != 'E') {
			if (Character.isDigit(digit)) {
				if (position % 2 == 0) {
					checkSum += digit - '0';
				} else {
					checkSum += 2 * (digit - '0');
				}
				position++;
			}
			digit = sc.next().toCharArray()[0];
		}

		System.out.println(checkSum);
		
		if (checkSum % 10 == 0) {
			System.out.println("Checksum is divisible by 10. Valid. \n");
		} else {
			System.out.println("Checksum is no divisible by 10. Invalid. \n");
		}
		
		sc.close();
	}	
}

