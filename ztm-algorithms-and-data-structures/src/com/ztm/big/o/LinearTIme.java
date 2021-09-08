package com.ztm.big.o;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * brunolima on Apr 20, 2021
 * 
 */

public class LinearTIme {

	public static void main(String[] args) {
		// O(n) -> Linear Time
		linearTime();
	}

	private static void linearTime() {
//		List<String> nemo1 = Arrays.asList("nemo");
//
//		List<String> nemo2 = Arrays.asList("dory", "bruce", "marlin", "nemo", "gill", "bloat", "nigel", "squirt",
//				"darla", "hank");

		List<String> nemo3 = new ArrayList<String>();
		for (int i = 0; i < 1000000; i++) {
			nemo3.add("nemo");
		}

		long time1 = System.currentTimeMillis();

		// O(n) -> Linear Time
		for (int i = 0; i < nemo3.size(); i++) {
			if (nemo3.get(i).equals("nemo")) {
//				System.out.println("Found Nemo!");
			}
		}

		long time2 = System.currentTimeMillis();

		long timeFInal = time2 - time1;

		System.out.println("Call to find nemo took: " + timeFInal + " milliseconds.");
	}

}
