package global.sfotware.support.data.structure.in.java.doublelinkedlist;

/**
*
* brunolima on Jun 4, 2021
* 
*/

public class AppDoubleLinkedList {
	
	public static void main(String[] args) {
		DoubleLinkedList<String> names = new DoubleLinkedList<>();
		
		names.insert("Adam");
		names.insert("Kevin");
		names.insert("Ana");
		names.insert("Daniel");
		
		names.traverseForward();
		System.out.println("----------------");
		names.traverseBackward();
	}
	
}

