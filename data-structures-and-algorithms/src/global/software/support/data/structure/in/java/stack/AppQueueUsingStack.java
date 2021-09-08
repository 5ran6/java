package global.software.support.data.structure.in.java.stack;

/**
*
* brunolima on Jun 7, 2021
* 
*/

public class AppQueueUsingStack {
	
	public static void main(String[] args) {
		QueueUsingStack stack = new QueueUsingStack();
		
		stack.enqueue(10);
		stack.enqueue(5);
		stack.enqueue(20);
		
		System.out.println(stack.dequeue());
		
		stack.enqueue(100);
		
		System.out.println(stack.dequeue());
		System.out.println(stack.dequeue());
		System.out.println(stack.dequeue());
	}

}

