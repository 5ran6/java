package com.ztm.data.structure.hashtable;

/**
*
* brunolima on May 12, 2021
* 
*/

public class TestMyHashTable {
	
	public static void main(String[] args) {
		MyHashTable mht = new MyHashTable(5);
		System.out.println(mht.toString());
		
		mht.set("" + mht.hash("Bruno"), 17);
		System.out.println(mht);
		
		mht.set("" + mht.hash("Leticia"), 17);
		System.out.println(mht);
		
		mht.set("" + mht.hash("Bianca"), 16);
		System.out.println(mht);
		
		mht.set("" + mht.hash("Matheus"), 16);
		System.out.println(mht);
		
	}

}

