package com.ztm.data.structure.trie;

/**
 *
 * brunolima on Apr 26, 2021
 * 
 */

public class MyTrie {

	private final Node root = new Node();

	public void insert(String word) {
		Node currentNode = this.root;

		/*
		 * For each character in the word check if that character exists in hashmap, if
		 * not then add the character as a key in the map and a new node as its value.
		 * Do this until all characters are traversed.
		 */
		for (char ch: word.toCharArray()) {
			currentNode.children.putIfAbsent(ch, new Node());
			currentNode = currentNode.children.get(ch);
		}

		currentNode.isWord = true;
	}
	
	public boolean findWord(String word) {
		Node currentNode = this.root;
		
		for (char ch: word.toCharArray()) {
			if (currentNode.children.containsKey(ch)) {
				currentNode = currentNode.children.get(ch);
			} else {
				return false;
			}
		}
		
		return currentNode.isWord;
	}
	
	public boolean delete (String word) {
		Node currentNode = this.root;
		Node deleteAfter = this.root;
		char ch1 = word.charAt(0); // char '\0' = NULL
		
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			
			if (currentNode.children.containsKey(ch)) {
				currentNode = currentNode.children.get(ch);
				
				if (currentNode.children.size() > 1) {
					deleteAfter = currentNode;
					ch1 = word.charAt(i + 1);
				}
			} else {
				return false;
			}
		}
		
		if (currentNode.children.isEmpty()) {
			deleteAfter.children.remove(ch1);
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "MyTrie {root=" + root + "}";
	}
	
}
