package com.cs.dojo.coding.interview.questions.arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 *
 * brunolima on Sep 29, 2021
 * 
 */

public class MostFrequentlyOccurring {

	public static void main(String[] args) {
		int[] array = { 1, 3, 1, 3, 2, 1 };

		System.out.println("Most frequently is: " + mostFrequentlyV1(array));
		System.out.println("Most frequently is: " + mostFrequentlyV2(array));
	}

	public static int mostFrequentlyV1(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : array) {
			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();

				while (it.hasNext()) {
					Entry<Integer, Integer> next = it.next();

					if (next.getKey() == i) {
						next.setValue(next.getValue() + 1);
					}
				}
			}
		}

		Optional<Entry<Integer, Integer>> max = map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue));

		return max.get().getKey();
	}
	
	public static int mostFrequentlyV2(int[] array) {
		Integer maxCount = -1;
		Integer maxItem = null;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : array) {
			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				Integer value = map.get(i);
				map.put(i, value + 1);
			}
			
			if(map.get(i) > maxCount) {
				maxCount = map.get(i);
				maxItem = i;
			}
		}

		return maxItem;
	}

}
