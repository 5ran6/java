package com.ztm.data.structure.heap;

/**
*
* brunolima on Apr 26, 2021
* 
*/

public class TestMyPriorityQueue {
	
	public static void main(String[] args) {
		MyPriorityQueue queue = new MyPriorityQueue();
		
		System.out.println(queue.printQueue());
		
		queue.enqueue("Bruno", 1);
		System.out.println(queue.printQueue());
		
		queue.enqueue("Leticia", 4);
		queue.enqueue("Bianca", 3);
		queue.enqueue("Matheus", 2);
		System.out.println(queue.printQueue());
		
		System.out.println(queue.getFirstElement());
		System.out.println(queue.getLastElement());
		
		System.out.println(queue.dequeue());
		System.out.println(queue.printQueue());
	}

}

