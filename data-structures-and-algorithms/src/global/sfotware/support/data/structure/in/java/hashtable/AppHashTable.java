package global.sfotware.support.data.structure.in.java.hashtable;

/**
*
* brunolima on Jun 11, 2021
* 
*/

public class AppHashTable {
	
	public static void main(String[] args) {
		HashTable hashTable = new HashTable();
		
		hashTable.put(1,  10);
		System.out.println();
		
		hashTable.put(2, 100);
		System.out.println();
		
		hashTable.put(3,  1000);
		System.out.println();
		
		hashTable.put(4,  10000);
		System.out.println();
		
		hashTable.put(5,  100000);
		System.out.println();
		
		System.out.println(hashTable.get(1));
		System.out.println(hashTable.get(2));
		System.out.println(hashTable.get(3));
		System.out.println(hashTable.get(4));
		System.out.println(hashTable.get(5));
	}

}

