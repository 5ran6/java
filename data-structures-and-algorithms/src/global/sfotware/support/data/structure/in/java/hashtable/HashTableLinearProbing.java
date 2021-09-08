package global.sfotware.support.data.structure.in.java.hashtable;

/**
 *
 * brunolima on Jun 11, 2021
 * 
 */

public class HashTableLinearProbing {

	private HashItem[] hashTable;

	public HashTableLinearProbing() {
		hashTable = new HashItem[Constants.TABLE_SIZE];
	}

	public int get(int key) {
		int hashIndex = hash(key);

		while (hashTable[hashIndex] != null && hashTable[hashIndex].getKey() != key) {
			hashIndex = (hashIndex + 1) % Constants.TABLE_SIZE;
			System.out.println("Hopping to the next index: " + hashIndex);
		}

		if (hashTable[hashIndex] == null) {
			return -1;
		} else {
			return hashTable[hashIndex].getValue();
		}
	}

	public void put(int key, int value) {
		int hashIndex = hash(key);
		System.out.println("put() method called with value: " + value + " - hashIndex: " + hashIndex);

		while (hashTable[hashIndex] != null) {
			hashIndex = (hashIndex + 1) % Constants.TABLE_SIZE;
			System.out.println("Collision -> hashIndex: " + hashIndex);
		}

		
		System.out.println("Inserted finally with index: " + hashIndex);
		hashTable[hashIndex] = new HashItem(key, value);
	}

	private int hash(int key) {
//		return key % Constants.TABLE_SIZE;
		return 1;
	}

}
