package com.leetcode.linkedlist;

/**
*
* brunolima on Jun 3, 2021
* 
*/

public class SingleLinkedList {
	
	public static void main(String[] args) {
		Node previous = new Node(1);
		System.out.println(previous);
		
		// Initialize a new node current with the given value
		Node current = new Node(2);
		
		// Link the "next" field of current to previous's next node next
		current.next = previous.next;
		
		// Link the "next" field in previous to current.
		previous.next = current;
		System.out.println(previous);
		
		
		Node nodeNew = new Node(3);
		System.out.println("Nodenew: " + nodeNew);
		System.out.println("Previous: " + previous);	
		
		
		while(previous != null) {
			
			if (previous.next == null) {
				previous.next = nodeNew;
			}
			

			previous = previous.next;
		}
		
		System.out.println("Nodenew >>> " + nodeNew);
		System.out.println("Previous >>> " + previous);
		

	}

}

