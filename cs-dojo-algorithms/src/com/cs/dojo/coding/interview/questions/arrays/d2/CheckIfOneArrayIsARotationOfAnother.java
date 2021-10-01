package com.cs.dojo.coding.interview.questions.arrays.d2;

/**
 *
 * brunolima on Sep 29, 2021
 * 
 */

public class CheckIfOneArrayIsARotationOfAnother {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] array2 = { 4, 5, 6, 7, 1, 2, 3 };
		
		System.out.println(checkIfOneArrayIsARotationOfAnother(array1, array2));
	}

	public static boolean checkIfOneArrayIsARotationOfAnother(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			return false;
		}

		int key = array1[0];
		int key_i = -1;

		for (int i = 0; i < array2.length; i++) {
			if (array2[i] == key) {
				key_i = i;
				break;
			}
		}

		if (key_i == -1) return false;

		for (int i = 0; i < array1.length; i++) {
			int j = (key_i + i) % array1.length;

			if (array1[i] != array2[j]) {
				return false;
			}
		}

		return true;
	}
}
