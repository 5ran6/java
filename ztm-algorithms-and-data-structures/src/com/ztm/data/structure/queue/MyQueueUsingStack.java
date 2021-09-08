package com.ztm.data.structure.queue;

import java.util.Stack;

/**
*
* brunolima on Apr 25, 2021
* 
*/

public class MyQueueUsingStack {
	
	// This is the main stack wich we will use as queue
	Stack<Integer> queueStack = new Stack<>();
	
	// Reverse stack
	Stack<Integer> reverseStack = new Stack<>();
	
	public void push(int value) {
		if (this.queueStack.size() == 0) {
			this.queueStack.push(value);
		} else {
			while(this.queueStack.size() != 0) {
				this.reverseStack.push(this.queueStack.pop());
			}
			
			this.reverseStack.push(value);
			
			while(this.reverseStack.size() != 0) {
				this.queueStack.push(this.reverseStack.pop());
			}
		}
	}
	
	/**
     * Removes the element from in front of queue and returns that element.
     */
	public Integer pop() {
		if (this.queueStack.size() > 0) {
			return this.queueStack.pop();
		} else {
			return null;
		}
	}
	
	/**
    * Get the front element.
    */
    public Integer peek() {
    	if (this.queueStack.size() > 0) {
    		return this.queueStack.get(this.queueStack.size() - 1);
    	} else {
    		return null;
    	}
    }

	@Override
	public String toString() {
		return "MyQueueUsingStack [queueStack=" + queueStack + ", reverseStack=" + reverseStack + "]";
	}
    
}

