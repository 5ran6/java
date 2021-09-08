package global.sfotware.support.data.structure.in.java.queue;

/**
*
* brunolima on Jun 7, 2021
* 
*/

public class Queue<T extends Comparable<T>> {
	
	private Node<T> firstNode;
	private Node<T> lastNode;
	private int count;
	
	public boolean isEmpty() {
		return firstNode == null;
	}
	
	public int size() {
		return this.count;
	}
	
	// O(1)
	public void enqueue(T data) {
		this.count++;
		
		Node<T> oldLastNode = this.lastNode;
		this.lastNode = new Node<>(data);
		this.lastNode.setNextNode(null);
		
		if (isEmpty()) {
			this.firstNode = this.lastNode;
		} else {
			oldLastNode.setNextNode(this.lastNode);
		}
	}
	
	// O(1)
	public T dequeue() {
		this.count--;
		
		T dataToDequeue = this.firstNode.getData();
		this.firstNode = this.firstNode.getNextNode();
		
		if (isEmpty()) {
			this.lastNode = null;
		}
		
		return dataToDequeue;
	}

}

