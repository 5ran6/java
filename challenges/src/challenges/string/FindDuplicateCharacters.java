package challenges.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 *
 * brunolima on Oct 16, 2021
 * 
 * For example, if String is "Java" then the program should print "a".
 * 
 */

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		String s1 = "Programming";

		findDuplicateCharacters(s1);
	}

	private static void findDuplicateCharacters(String s1) {
		System.out.println(s1);

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : s1.toCharArray()) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				Integer value = map.get(c);
				map.put(c, value + 1);
			}
		}

//		System.out.println(map);
		
		Iterator<Entry<Character, Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Character, Integer> next = it.next();
			
			if (next.getValue() > 1) {
				System.out.println(String.format("Word: %s, value: %d", next.getKey(), next.getValue()));
			}
		}
	}

}
