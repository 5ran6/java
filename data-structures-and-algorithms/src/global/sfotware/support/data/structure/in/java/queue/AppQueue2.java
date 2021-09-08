package global.sfotware.support.data.structure.in.java.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
*
* brunolima on Jun 7, 2021
* 
*/

public class AppQueue2 {
	
	public static void main(String[] args) {
		
		// we process the items in a first come first served manner
		Queue<Integer> queue  = new LinkedList<>();
		
		// add() method inserts a new item into the queue O(1)
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		// element() we can return without removing the first item
		System.out.println(queue.element());
		System.out.println(queue.size());
		
		// remove() method is a dequeue() method O(1)
		while(!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
		
		System.out.println("=================");
		
		Queue<Task> tasks  = new LinkedList<>();
		tasks.add(new Task(1));
		tasks.add(new Task(10));
		tasks.add(new Task(100));
		
		while(!tasks.isEmpty()) {
			Task task = tasks.remove();
			task.execute();
		}
		
	}

}

