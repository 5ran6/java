package challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
*
* brunolima on May 11, 2021
* 
*/

public class DataStructureTest {
	
	public static void main(String[] args) {
		System.out.println("=========== ArrayList ===========");
		List<Integer> array = new ArrayList<>();
		
		System.out.println(array);
		array.add(1);
		System.out.println(array);
		
		array.add(2);
		System.out.println(array);
		
		array.add(3);
		System.out.println(array);
		
		System.out.println("\n=========== HashMap ===========");
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		System.out.println(map);
		map.put(1, "hello");
		System.out.println(map);
		
		map.put(2, "hello");
		System.out.println(map);
		
		map.put(1, "hellos");
		System.out.println(map);
		
		System.out.println("\n=========== Hashtable ===========");
		Hashtable<Integer, String> hash = new Hashtable<>();
		
		System.out.println(hash);
		hash.put(1, "hello");
		System.out.println(hash);
		
		hash.put(2, "hello");
		System.out.println(hash);
		
		hash.put(1, "hellos");
		System.out.println(hash);
		
		hash.put(3, "hello");
		System.out.println(hash);
		
		System.out.println("\n=========== HashSet ===========");
		HashSet<Integer> set = new HashSet<>();
		
		System.out.println(set);
		set.add(1);
		System.out.println(set);
		
		set.add(2);
		System.out.println(set);
		
		set.add(1);
		System.out.println(set);
		
		set.add(3);
		System.out.println(set);
		
	}

}

