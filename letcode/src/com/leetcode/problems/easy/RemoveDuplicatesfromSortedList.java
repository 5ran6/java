package com.leetcode.problems.easy;

/**
 *
 * brunolima on May 27, 2021
 * 
 * Given the head of a sorted linked list, delete all duplicates such that each
 * element appears only once. Return the linked list sorted as well.
 * 
 * Example 1: Input: head = [1,1,2] Output: [1,2]
 * 
 * Example 2: Input: head = [1,1,2,3,3] Output: [1,2,3]
 * 
 */

public class RemoveDuplicatesfromSortedList {

	public static void main(String[] args) {
		RemoveDuplicatesfromSortedList rdsl = new RemoveDuplicatesfromSortedList();

//		ListNode node1 = new ListNode(1);
//		ListNode node2 = new ListNode(1);
//		ListNode node3 = new ListNode(2);
//		
//		node1.next = node2;
//		node2.next = node3;

//		System.out.println(node1);
//		System.out.println(rdsl.deleteDuplicates(node1));

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		System.out.println(node1);
		System.out.println(rdsl.deleteDuplicates(node1));
//		System.out.println(rdsl.deleteDuplicatesRecursion(node1));

	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) return head;

		ListNode actualNode = head;
			
		while(actualNode != null && actualNode.next != null) {
			if (actualNode.val != actualNode.next.val) {
				actualNode = actualNode.next;
			} else {
				actualNode.next = actualNode.next.next;
			}
		}
		
		return head;
	}

	public ListNode deleteDuplicatesRecursion(ListNode head) {
		if (head == null || head.next == null) return head;
		
		if (head.val == head.next.val) {
			head = deleteDuplicatesRecursion(head.next);
		} else {
			head.next = deleteDuplicates(head.next);
		}

		return head;
	}
}
