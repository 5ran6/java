package com.loiane.data.structure.vector.labs;

import com.loiane.data.structure.vector.Lista;

public class Exe2 {
	
	public static void main(String[] args) {
		Lista<String> list = new Lista<String>(5);
		list.addElement("A");
		list.addElement("B");
		list.addElement("A");
		System.out.println(list.lastIndexOf("B"));
		System.out.println(list.lastIndexOf("A"));
		System.out.println(list);
	}

}
