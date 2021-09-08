package com.ztm.big.o;

import java.util.Arrays;
import java.util.List;

/**
 *
 * brunolima on Apr 20, 2021
 * 
 */

public class ConstantTime {

	public static void main(String[] args) {
		// O(1) -> Constant Time
		constantTime();

	}

	private static void constantTime() {
		List<Integer> boxes = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(boxes.get(0));
		System.out.println(boxes.get(1));
	}

}
