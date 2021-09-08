package global.sfotware.support.data.structure.in.java.linkedlist;

/**
*
* brunolima on Jun 4, 2021
* 
*/

public class AppLinkedList {
	
	public static void main(String[] args) {
//		LinkedList<String> names = new LinkedList<>();
//		
//		names.insert("Adam");
//		names.insert("Daniel");
//		names.insert("Ana");
//		names.traverse();
//		
//		names.insertEnd("Bruno");
//		names.traverse();
		
		LinkedList<Person> people = new LinkedList<>();
		
		Person bruno = new Person(39, "Bruno");
		
		people.insert(bruno);
		people.insert(new Person(36, "Leticia"));
		people.insert(new Person(9, "Bianca"));
		people.insert(new Person(6, "Matheus"));
		
		people.traverse();
		
//		people.remove(bruno);
		
		people.traverse();
		
		System.out.println("MiddleNode: "+ people.getMiddleNode() + "\n");
		
		people.reverse();
		people.traverse();
	}

}

