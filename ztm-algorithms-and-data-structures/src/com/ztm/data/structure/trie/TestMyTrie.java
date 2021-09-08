package com.ztm.data.structure.trie;

/**
*
* brunolima on Apr 26, 2021
* 
*/

public class TestMyTrie {
	
	public static void main(String[] args) {
		MyTrie trie = new MyTrie();
		
		System.out.println(trie);
		
		trie.insert("Bruno");
		System.out.println(trie);
		
		trie.insert("Bianca");
		System.out.println(trie);
		
		trie.insert("Leticia");
		System.out.println(trie);
		
		trie.insert("Matheus");
		System.out.println(trie);
		
		boolean findWord = trie.findWord("Bruno");
		System.out.println("Find Bru: " + findWord);
		
		trie.delete("Bruno");
		
		boolean findWord1 = trie.findWord("Bruno");
		System.out.println("Find Bru: " + findWord1);
		
	}

}

