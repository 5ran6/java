package com.leetcode.problems.easy;

/**
 *
 * brunolima on May 22, 2021
 * 
 * Merge two sorted linked lists and return it as a sorted list. The list should
 * be made by splicing together the nodes of the first two lists.
 * 
 * Example 1 Input: l1 = [1,2,4], l2 = [1,3,4] Output: [1,1,2,3,4,4]
 * 
 * Example 2: Input: l1 = [], l2 = [] Output: []
 * 
 * Example 3: Input: l1 = [], l2 = [0] Output: [0]
 * 
 */

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		MergeTwoSortedLists mtsl = new MergeTwoSortedLists();

		ListNode node1 = new ListNode(1);
		node1.next = new ListNode(2);
		node1.next.next = new ListNode(4);

		ListNode node2 = new ListNode(1);
		node2.next = new ListNode(3);
		node2.next.next = new ListNode(4);

		System.out.println("Return: " + mtsl.mergeTwoLists(node1, node2));
		System.out.println("Return: " + mtsl.mergeTwoListsRecursive(node1, node2));
	}
	
	// Using Pointers
	public ListNode mergeTwoLists(ListNode node1, ListNode node2) {
		if (node1 == null && node2 == null) return null;
		if (node1 == null || node2 == null) return node1 != null ? node1 : node2;
		
		ListNode nodeMerge = new ListNode(0);
		ListNode tail = nodeMerge, nodeP1 = node1, nodeP2 = node2;
		
		while (nodeP1 != null && nodeP2 != null) {
			if (nodeP1.val < nodeP2.val) {
				tail.next = new ListNode(nodeP1.val);
				tail = tail.next;
				nodeP1 = nodeP1.next;
			} else {
				tail.next = new ListNode(nodeP2.val);
				tail = tail.next;
				nodeP2 = nodeP2.next;
			}
		}
		
		tail.next = nodeP1 != null ? nodeP1 : nodeP2;
		
		return nodeMerge.next;
	}
	
	// Using Recursive
	public ListNode mergeTwoListsRecursive(ListNode node1, ListNode node2) {
		if (node1 == null && node2 == null) return null;
		if (node1 == null || node2 == null) return node1 != null ? node1 : node2;
		
		int value = 0;
		
		if (node1.val < node2.val) {
			value = node1.val;
			node1 = node1.next;
		} else {
			value = node2.val;
			node2 = node2.next;
		}
		
		ListNode nodeMerge = new ListNode(value);
		nodeMerge.next = mergeTwoListsRecursive(node1, node2);
		
		return nodeMerge;
	}
	
}

class ListNode {

	int val;
	ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}

	

}