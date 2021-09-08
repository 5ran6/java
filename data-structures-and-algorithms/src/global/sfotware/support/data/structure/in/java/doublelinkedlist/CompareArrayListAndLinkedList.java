package global.sfotware.support.data.structure.in.java.doublelinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

/**
*
* brunolima on Jun 4, 2021
* 
*/

public class CompareArrayListAndLinkedList {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		
		long now = System.currentTimeMillis();
		
		for (int i = 0; i < 500000; i++) {
//			array.add(0, i);
			array.add(i);
		}
		
		System.out.println("Time takenb for ArrayList: " + (System.currentTimeMillis() - now));
		
		LinkedList<Object> linked = new LinkedList<>();
		
		now = System.currentTimeMillis();
		
		for (int i = 0; i < 500000; i++) {
			linked.addFirst(i);
		}
		
		System.out.println("Time takenb for LinkedList: " + (System.currentTimeMillis() - now));
	}
	
}

