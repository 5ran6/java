package hackerhank.algorithms.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 *
 * brunolima on Sep 7, 2021
 * 
 * @see https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 * 
 */

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		birthdayCakeCandles(Arrays.asList(3, 2, 1, 3));

	}

	public static int birthdayCakeCandles(List<Integer> candles) {
		// Write your code here
		
		// The three general-purpose Map implementations are HashMap, TreeMap and
		// LinkedHashMap. If you need SortedMap operations or key-ordered
		// Collection-view iteration, use TreeMap; if you want maximum speed and don't
		// care about iteration order, use HashMap; if you want near-HashMap performance
		// and insertion-order iteration, use LinkedHashMap. In this respect, the
		// situation for Map is analogous to Set. Likewise, everything else in the Set
		// Implementations section also applies to Map implementations.
		// see: https://docs.oracle.com/javase/tutorial/collections/implementations/map.html

		// using LinkedHashMap, the insertion order of elements will be preserved.
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < candles.size(); i++) {
			Integer value = candles.get(i);
			
			if (map.containsKey(value)) {
				Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();

				while (it.hasNext()) {
					Entry<Integer, Integer> next = it.next();

					if (next.getKey().equals(value)) {
						map.put(value, next.getValue() + 1);
						break;
					}
				}
			} else {
				map.put(value, 1);
			}
		}
		
		System.out.println(map);

		LinkedHashMap<Integer, Integer> mapSorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));
		
		Entry<Integer, Integer> next = mapSorted.entrySet().iterator().next();
		
		System.out.println(next);
		
		return next.getValue();
	}

}
