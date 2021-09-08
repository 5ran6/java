package com.ztm.data.structure.hashtable;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * brunolima on Apr 23, 2021
 * 
 */

public class MyHashTable {

	private ArrayList<KeyValue>[] data;
	private int length;

	@SuppressWarnings("unchecked")
	public MyHashTable(int capacity) {
		this.data = new ArrayList[capacity];
		this.length = 0;
	}

	public int hash(String key) {
		int hash = 0;

		for (int i = 0; i < key.length() - 1; i++) {
			hash = (hash + key.charAt(i) * i) % this.data.length;
		}

		return hash;
	}

	public void set(String key, int value) {
		int address = hash(key);

		if (this.data[address] == null) {
			ArrayList<KeyValue> arrayAtAddress = new ArrayList<>();
			this.data[address] = arrayAtAddress;
			this.length++;
		}

		KeyValue pair = new KeyValue(key, value);
		this.data[address].add(pair);
	}

	public Integer get(String key) {
		int address = hash(key);
		ArrayList<KeyValue> bucket = this.data[address];

		if (bucket != null) {
			for (KeyValue keyValue : bucket) {
				if (keyValue.getKey().equals(key)) {
					return keyValue.getValue();
				}
			}
		}

		return null;
	}

	public String[] keys() {
		String[] keysArray = new String[this.length];

		int count = 0;

		for (ArrayList<KeyValue> keyValues : this.data) {
			if (keyValues != null) {
				keysArray[count] = keyValues.get(0).getKey();
				count++;
			}
		}

		return keysArray;
	}
	
	@Override
	public String toString() {
		return "MyHashTable [data=" + Arrays.toString(data) + ", length=" + length + "]";
	}

	public static void main(String[] args) {
		MyHashTable myHashTAble = new MyHashTable(10);

		myHashTAble.set("grapes", 1000);
		myHashTAble.set("grapess", 1000);
		myHashTAble.set("grapess", 1000);
		myHashTAble.set("grapes", 1000);

		for (ArrayList<KeyValue> item : myHashTAble.data) {
			System.out.println(item);
		}

		System.out.println(myHashTAble.get("grapes"));
		System.out.println(myHashTAble.get("grapesss"));

		System.out.println("List of keys: " + Arrays.toString(myHashTAble.keys()));
	}

}
