package com.ztm.data.structure.queue;

/**
 *
 * brunolima on Apr 25, 2021
 * 
 */

public class MyQueue {

	private Node first;
	private Node last;
	private int length;

	public MyQueue() {
		this.first = null;
		this.last = null;
		this.length = 0;
	}

	public Node peek() {
		if (this.length > 0) {
			return this.first;
		}

		return null;
	}

	// add in the Queue
	public void enqueue(String value) {
		Node newNode = new Node(value);

		if (this.length == 0) {
			this.first = newNode;
			this.last = newNode;
		} else {
			this.last.next = newNode;
			this.last = newNode;
		}

		length++;
	}

	// remove in the Queue
	public MyQueue dequeue() {
		if (this.first == null) {
			return null;
		}

		if (this.first == this.last) {
			this.last = null;
		}

		this.first = this.first.next;
		this.length--;
		return this;
	}

	@Override
	public String toString() {
		return "MyQueue [first=" + first + ", last=" + last + ", length=" + length + "]";
	}

}
