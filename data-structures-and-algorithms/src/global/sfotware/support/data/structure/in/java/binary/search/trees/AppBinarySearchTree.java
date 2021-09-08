package global.sfotware.support.data.structure.in.java.binary.search.trees;

/**
*
* brunolima on Jun 8, 2021
* 
*/

public class AppBinarySearchTree {
	
	public static void main(String[] args) {
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		
		bst.insert(12);
		bst.insert(4);
		bst.insert(20);
		bst.insert(1);
		bst.insert(8);
		bst.insert(16);
		bst.insert(27);
		
//		System.out.println(bst.getMin());
//		System.out.println(bst.getMax());
//		bst.traversal();
//		System.out.println();
		
//		bst.remove(16);
//		bst.remove(20);
//		bst.remove(12);
//		bst.traversal();
		
		Tree<Integer> bst1 = new BinarySearchTree<>();
		bst1.insert(2);
		bst1.insert(55);
		bst1.insert(67);
		bst1.insert(12);
		bst1.insert(11);
		
		Tree<Integer> bst2 = new BinarySearchTree<>();
		bst2.insert(2);
		bst2.insert(55);
		bst2.insert(67);
		bst2.insert(12);
		bst2.insert(11);
		
		TreeCompareHelper<Integer> helper = new TreeCompareHelper<>();
		System.out.println(helper.compareTrees(bst1.getRoot(), bst2.getRoot()));
		
		System.out.println(bst1.getKSmallest(bst1.getRoot(), 4));
		
		BinarySearchTree<Person> people = new BinarySearchTree<>();
		people.insert(new Person("Adam", 47));
		people.insert(new Person("Kevin", 21));
		people.insert(new Person("Joe", 55));
		people.insert(new Person("Arnold", 20));
		people.insert(new Person("Noel", 34));
		people.insert(new Person("Marko", 68));
		people.insert(new Person("Susan", 23));
		people.insert(new Person("Roe", 38));
		
		System.out.println(people.getAgesSum());
		
	}

}

