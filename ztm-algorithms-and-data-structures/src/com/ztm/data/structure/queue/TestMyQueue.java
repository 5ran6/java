package com.ztm.data.structure.queue;

/**
*
* brunolima on Apr 25, 2021
* 
*/

public class TestMyQueue {
	
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		System.out.println(queue.peek());
		
		queue.enqueue("Bruno");
		System.out.println(queue.peek());
		
		queue.enqueue("Leticia");
		System.out.println(queue.peek());

		queue.enqueue("Bianca");
		System.out.println(queue.peek());
		
		queue.enqueue("Matheus");
		System.out.println(queue.peek());
		
		queue.dequeue();
		System.out.println(queue.peek());
	}

}

