package com.ztm.data.structure.queue;

/**
*
* brunolima on Apr 25, 2021
* 
*/

public class TestMyQueueUsingStack {
	
	public static void main(String[] args) {
		MyQueueUsingStack stack = new MyQueueUsingStack();
		
		stack.push(17);
		System.out.println(stack);
		stack.push(11);
		System.out.println(stack);
		stack.push(81);
		System.out.println(stack);
		
		System.out.println(stack.peek());
		stack.pop();
		
	}

}

