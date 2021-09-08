package com.ztm.big.o;

/**
 *
 * brunolima on Apr 21, 2021
 * 
 */

public class SpaceComplexity {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		booo(array); // O(1)
		
		String[] boooOfNTimesS = boooOfNTimes(array.length); // O(n)
		
		for (String value : boooOfNTimesS) {
			System.out.println(value);
		}
	}

	public static void booo(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("booo!");
		}
	}

	public static String[] boooOfNTimes(int size) {
		String[] array = new String[size];

		for (int i = 0; i < size; i++) {
			array[i] = "boooOfNTimes";
		}

		return array;
	}
	
}
