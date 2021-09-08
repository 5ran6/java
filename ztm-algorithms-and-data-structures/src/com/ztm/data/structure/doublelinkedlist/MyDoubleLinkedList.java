package com.ztm.data.structure.doublelinkedlist;

/**
 *
 * brunolima on Apr 24, 2021
 * 
 * Doubly linked list allows element two way traversal.
 * 
 * Usage: On other hand doubly linked list can be used to implement 
 * stacks as well as heaps and binary trees.
 * 
 * Index performance: If we need better performance while searching and memory 
 * is not a limitation in this case doubly linked list is more preferred.
 * 
 * Memory consumption: On other hand Doubly linked list uses more memory per node(two pointers).
 * 
 */

public class MyDoubleLinkedList {

	private Node head;
	private Node tail;
	private int length;

	public MyDoubleLinkedList(int value) {
		this.head = new Node(value);
		this.tail = this.head;
		this.length++;
	}
	
	// add value at the end of the list
	public MyDoubleLinkedList append(int value) {
		Node newNode = new Node(value);
		newNode.previous = this.tail;
		this.tail.next = newNode;
		this.tail = newNode;
		this.length++;
		return this;
	}

	// add value at the beginning of the list
	public MyDoubleLinkedList prepend(int value) {
		Node newNode = new Node(value);
		this.head.previous = newNode;
		newNode.next  = this.head;
		this.head = newNode;
		this.length++;
		return this;
	}
	
	public int[] printValues() {
		int[] arrayValues = new int[this.length];
		
		int i = 0;
		
		Node currentNode = this.head;
		
		while(currentNode != null) {
			arrayValues[i] = currentNode.value;
			currentNode = currentNode.next;
			i++;
		}
		
		return arrayValues;
	}
	
	public void insert(int index, int value) {
		if (index < 0 || index > length) {
			System.err.println("Index Out of Bounds for length: " + this.length);
		}
		
		if (index == 0) {
			prepend(value);
		} else if (index == this.length) {
			append(value);
		} else {
			Node current = this.head;
			
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}	
			
			Node newNode = new Node(value);
			
			newNode.next = current.next;
			
			current.next = newNode;
			
			newNode.previous = current;
			
			newNode.next.previous = newNode;
			
			this.length++;
		}
	}
	
	public void remove(int index) {
		if (index < 0 || index > length) {
			System.err.println("Index Out of Bounds for length: " + this.length);
		} else if (index == 0) {
			this.head = this.head.next;
			this.head.previous = null;
			this.length--;
		} else {
			Node current = head;
			
			int i;
			
			for (i = 0; i < index - 1; i++) {
				current = current.next;
			}
			
//			Node nodeToRemoved = current.getNext();
//			current.setNext(nodeToRemoved.getNext());
			
			current.next = current.next.next;
			this.length--;
			
			if (i == this.length - 1) {
                this.tail = current;
            } else {
            	current.next.previous = current;
            }
		}	
	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + ", tail=" + tail + ", length=" + length + "]";
	}

}
