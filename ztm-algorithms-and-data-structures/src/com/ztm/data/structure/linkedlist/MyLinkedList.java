package com.ztm.data.structure.linkedlist;

/**
 *
 * brunolima on Apr 24, 2021
 * 
 * Singly linked list allows traversal elements only in one way.
 * 
 * Usage: Singly linked list are generally used for implementation of stacks
 * 
 * Index performance: Singly linked list is preferred when we need to save 
 * memory and searching is not required as pointer of single index is stored.
 * 
 * Memory consumption: As singly linked list store pointer of only one node so consumes lesser memory.
 * 
 */

public class MyLinkedList {

	private Node head;
	private Node tail;
	private int length;

	public MyLinkedList(int value) {
		this.head = new Node(value);
		this.tail = this.head;
		this.length++;
	}
	
	// add value at the beginning of the list
	public MyLinkedList prepend(int value) {
		Node node = new Node(value);
		node.setNext(this.head);
		this.head = node;
		this.length++;
		return this;
	}

	// add value at the end of the list
	public MyLinkedList append(int value) {
		Node node = new Node(value);
		this.tail.setNext(node);
		this.tail = node;
		this.length++;
		return this;
	}
	
	public int[] printValues() {
		int[] arrayValues = new int[this.length];
		
		int i = 0;
		
		Node currentNode = this.head;
		
		while(currentNode != null) {
			arrayValues[i] = currentNode.getValue();
			currentNode = currentNode.getNext();
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
				current = current.getNext();
			}	
			
			Node newNode = new Node(value);
			
			newNode.setNext(current.getNext());
			
			current.setNext(newNode);
			
			this.length++;
		}
	}
	
	public void remove(int index) {
		if (index < 0 || index > length) {
			System.err.println("Index Out of Bounds for length: " + this.length);
		} else if (index == 0) {
			this.head = this.head.getNext();
			this.length--;
		} else {
			Node current = head;
			
			int i;
			
			for (i = 0; i < index - 1; i++) {
				current = current.getNext();
			}
			
			Node nodeToRemoved = current.getNext();
			current.setNext(nodeToRemoved.getNext());
			
//			current.setNext(current.getNext().getNext());
			
			if (i == this.length - 1) {
                this.tail = current;
            }
			
			this.length--;
		}	
	}
	
	public MyLinkedList reverse(MyLinkedList list) {
		if(this.head.getNext() == null) {
			return list;
		}
		
		MyLinkedList newList = new MyLinkedList(list.head.getValue());
		
		Node current = this.head;
		
		while(current.getNext() != null) {
			current = current.getNext();
			Node newNode = new Node(current.getValue());
			newNode.setNext(newList.head);
			newList.head = newNode;
			newList.length++;
		}
		
		return newList;
	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + ", tail=" + tail + ", length=" + length + "]";
	}

}
