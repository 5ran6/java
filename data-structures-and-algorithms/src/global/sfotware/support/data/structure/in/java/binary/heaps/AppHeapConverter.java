package global.sfotware.support.data.structure.in.java.binary.heaps;

/**
*
* brunolima on Jun 11, 2021
* 
*/

public class AppHeapConverter {

	public static void main(String[] args) {
		int[] maxHeap = {210, 100, 23, 215};
		
		HeapConverter heapConverter = new HeapConverter(maxHeap);
		
		int[] minHeap = heapConverter.transform();
		
		for (int i = 0; i < minHeap.length; i++) {
			System.out.print(minHeap[i] + " ");
		}
	}
}

