package global.sfotware.support.data.structure.in.java.lru;

/**
*
* brunolima on Jun 12, 2021
* 
*/

public class AppLRUCache {

	public static void main(String[] args) {
		LRUCache cache = new LRUCache();
		
		cache.put(0, "A");
		cache.put(1, "B");
		cache.put(2, "C");
		cache.put(3, "D");
		cache.put(4, "E");
		
		cache.show();
		System.out.println(cache.get(1));
		cache.show();
		System.out.println();
		
		System.out.println(cache.get(3));
		cache.show();
		System.out.println();
		
		System.out.println(cache.get(4));
		cache.show();
		System.out.println();
		
	}
	
}

