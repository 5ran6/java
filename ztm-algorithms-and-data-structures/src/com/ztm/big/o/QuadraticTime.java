package com.ztm.big.o;

import java.util.Arrays;
import java.util.List;

/**
 *
 * brunolima on Apr 20, 2021
 * 
 */

public class QuadraticTime {

	public static void main(String[] args) {
		List<Integer> boxes = Arrays.asList(1, 2, 3, 4, 5);

		// O(nˆ2)
		quadraticTime(boxes);
	}

	private static void quadraticTime(List<Integer> boxes) {
		for (int i = 1; i <= boxes.size(); i++) {
			for (int j = 1; j <= boxes.size(); j++) {
				System.out.println("[" + i + "], [" + j + "]");
			}
		}
	}

}
