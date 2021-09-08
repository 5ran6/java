package com.ztm.data.structure.doublelinkedlist;

import java.util.Arrays;

/**
*
* brunolima on Apr 24, 2021
* 
*/

public class TestMyDoubleLinkedList {
	
	public static void main(String[] args) {
		MyDoubleLinkedList list = new MyDoubleLinkedList(1);
		System.out.println(Arrays.toString(list.printValues()));
		
		list.append(2);
		System.out.println(Arrays.toString(list.printValues()));
		
		list.append(3);
		System.out.println(Arrays.toString(list.printValues()));
		
		list.prepend(0);
		System.out.println(Arrays.toString(list.printValues()));
		
		list.insert(1, -1);
		System.out.println(Arrays.toString(list.printValues()));
		
		list.remove(1);
		System.out.println(Arrays.toString(list.printValues()));
		
		list.remove(0);
		System.out.println(Arrays.toString(list.printValues()));
		
		list.remove(2);
		System.out.println(Arrays.toString(list.printValues()));
		
		list.remove(1);
		System.out.println(Arrays.toString(list.printValues()));
	}

}

