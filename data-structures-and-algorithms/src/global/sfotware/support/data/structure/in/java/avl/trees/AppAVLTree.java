package global.sfotware.support.data.structure.in.java.avl.trees;

/**
*
* brunolima on Jun 8, 2021
* 
*/

public class AppAVLTree {
	
	public static void main(String[] args) {
		Tree<Integer> avl = new AVLTree<>();
		
		avl.insert(12);
		avl.insert(4);
		avl.insert(20);
		avl.insert(1);
		avl.insert(5);
		avl.insert(23);
		
		avl.remove(23);
		avl.remove(20);
		
		avl.traverse();
	}

}

