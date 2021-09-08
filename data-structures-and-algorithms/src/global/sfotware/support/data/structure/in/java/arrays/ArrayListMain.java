package global.sfotware.support.data.structure.in.java.arrays;

import java.util.ArrayList;
import java.util.List;

/**
*
* brunolima on Jun 3, 2021
* 
*/

public class ArrayListMain {
	
	public static void main(String[] args) {
		
		// ArraysLists use standard arrays under the hood
		// capacity(10)
		List<String> names = new ArrayList<>();
		
		names.add("Kevin");
		names.add("Daniel");
		names.add("Adam");
		names.add("Ana");
		names.forEach(System.out::println);
		System.out.println("==========");
		
		// O(1)
		System.out.println(names.get(0));
		System.out.println("==========");
		
		// O(N)
		names.remove(0);
		names.forEach(System.out::println);
	}

}

