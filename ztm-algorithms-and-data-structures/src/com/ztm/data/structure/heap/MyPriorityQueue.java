package com.ztm.data.structure.heap;

import java.util.ArrayList;
import java.util.Arrays;

/**
*
* brunolima on Apr 26, 2021
* 
*/

public class MyPriorityQueue {

	private final ArrayList<Node> queueArray = new ArrayList<Node>();
	
	// Note the smaller number means the higher priority
	public void enqueue(String value, int priority) {
		Node newNode = new Node(value, priority);
		boolean contains = false;
		
		for (int i = 0; i < this.queueArray.size(); i++) {
			if (this.queueArray.get(i).priority > newNode.priority) {
				this.queueArray.add(i, newNode);
				contains = true;
				break;
			}
		}
		
		if(!contains) {
			this.queueArray.add(newNode);
		}
	}
	
	public String dequeue() {
		if (this.queueArray.isEmpty()) {
			return "empty array";
		}
		
		Node nodeToRemoved = this.queueArray.get(0);
		this.queueArray.remove(0);
		return nodeToRemoved.value;
	}
	
	public Node getFirstElement() {
		if (!this.queueArray.isEmpty()) {
			return this.queueArray.get(0);
		}
		
		return null;
	}
	
	public Node getLastElement() {
		if (!this.queueArray.isEmpty()) {
			return this.queueArray.get(queueArray.size() - 1);
		}
		
		return null;
	}
	
	public boolean isEmpty() {
		return this.queueArray.isEmpty();
	}
	
	public String printQueue() {
		String[] array =new String[queueArray.size()];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = this.queueArray.get(i).value + "=" + this.queueArray.get(i).priority;
		}
		
		return Arrays.toString(array);
	}
}

