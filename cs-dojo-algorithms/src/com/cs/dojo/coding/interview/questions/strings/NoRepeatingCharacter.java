package com.cs.dojo.coding.interview.questions.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 *
 * brunolima on Sep 29, 2021
 * 
 */

public class NoRepeatingCharacter {

	public static void main(String[] args) {
		System.out.println("Result >>> " + nonRepeating("abcab")); // should return 'c'
		System.out.println("Result >>> " + nonRepeating("abab")); // should return null
		System.out.println("Result >>> " + nonRepeating("aabbbc")); // should return 'c'
		System.out.println("Result >>> " + nonRepeating("aabbdbc")); // should return 'd'
	}

	private static Character nonRepeating(String word) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < word.length(); i++) {
			char charAt = word.charAt(i);

			if (map.containsKey(charAt)) {
				Integer count = map.get(charAt);
				map.put(charAt, count + 1);
			} else {
				map.put(charAt, 1);
			}
		}
		
		Iterator<Entry<Character, Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Character, Integer> next = it.next();
			
			if (next.getValue() == 1) {
				return next.getKey().charValue();
			}
		}

//		System.out.println(map);
		
		return null;
	}

}
