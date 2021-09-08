package global.sfotware.support.data.structure.in.java.binary.heaps;

/**
*
* brunolima on Jun 10, 2021
* 
*/

public class AppHeap {
	
	public static void main(String[] args) {
		Heap heap = new Heap();
		
		heap.insert(6);
		System.out.println(heap.getMax());
		
		heap.insert(1);
		System.out.println(heap.getMax());
		
		heap.insert(12);
		System.out.println(heap.getMax());
		
		heap.insert(-2);
		System.out.println(heap.getMax());
		
		heap.insert(3);
		System.out.println(heap.getMax());
		
		heap.insert(88);
		System.out.println(heap.getMax());
		
		heap.insert(-5);
		System.out.println(heap.getMax());
		
		System.out.println("-----------");
		heap.heapSort();
	}

}

