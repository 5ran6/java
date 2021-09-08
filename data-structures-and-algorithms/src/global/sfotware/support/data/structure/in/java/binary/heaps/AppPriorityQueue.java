package global.sfotware.support.data.structure.in.java.binary.heaps;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
*
* brunolima on Jun 10, 2021
* 
*/

public class AppPriorityQueue {

	public static void main(String[] args) {
		
		// by default the heap is MIN HEAP
//		Queue<Integer> heap = new PriorityQueue<>();
		
		// by default the heap is MAX HEAP
		Queue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
		
		// O(logN)
		heap.add(12);
		heap.add(5);
		heap.add(7);
		heap.add(0);
		heap.add(-2);
		
		// O(N)
		System.out.println(heap.contains(0));
		
		// when we consider all N item in O(logN) = O(logN)
		while(!heap.isEmpty()) {
			// O(logN)
			System.out.println(heap.poll());
		}
		
		Queue<Person> personHeap = new PriorityQueue<>();
		
		personHeap.add(new Person("Bruno", 39));
		personHeap.add(new Person("Leticia", 36));
		personHeap.add(new Person("Bianca", 9));
		personHeap.add(new Person("Matheus", 6));
		
		while(!personHeap.isEmpty()) {
			System.out.println(personHeap.poll());
		}
	}
}

