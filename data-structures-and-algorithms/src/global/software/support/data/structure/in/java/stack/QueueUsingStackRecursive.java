package global.software.support.data.structure.in.java.stack;

import java.util.Stack;

/**
*
* brunolima on Jun 7, 2021
* 
*/

public class QueueUsingStackRecursive {
	
	// use one stack for enqueue operation
	private Stack<Integer> stack;
	
	public QueueUsingStackRecursive() {
		this.stack = new Stack<>();
	}
	
	// adding an item to the queue is O(1) operation
	public void enqueue(int item) {
		this.stack.push(item);
	}
	
	// NOTE: we use 2 stacks again but instead of explicity define the second stack we
	// use the call-stack of program (stack memory or execution stack)
	public int dequeue() {
		
		// base case for the recursive method calls the first item
		// is what we are after (this is what we need for queue's deque operation)
		if (stack.size() == 1) {
			return stack.pop();
		}
		
		// we keep popping the items until we find  the last one
		int item = stack.pop();
		
		// we call the method recursively
		int lastDequeueItem = dequeue();
		
		// after we find the item we dequeue we have to reinsert the items one by one
		enqueue(item);
		
		// this sis the item we are looking for (this is what have been popped off in the
		// stack.size == 1 section
		return lastDequeueItem;
	}
	
}

