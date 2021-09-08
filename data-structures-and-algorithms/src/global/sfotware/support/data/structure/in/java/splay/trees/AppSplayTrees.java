package global.sfotware.support.data.structure.in.java.splay.trees;

/**
*
* brunolima on Jun 9, 2021
* 
*/

public class AppSplayTrees {

	public static void main(String[] args) {
		SplayTrees<Integer> splayTrees = new SplayTrees<>();
		
		splayTrees.insert(1);
		System.out.println(splayTrees.getRoot());
		
		splayTrees.insert(10);
		System.out.println(splayTrees.getRoot());
		
		splayTrees.insert(4);
		System.out.println(splayTrees.getRoot());
		
		splayTrees.insert(5);
		System.out.println(splayTrees.getRoot());
		
		splayTrees.insert(-2);
		System.out.println(splayTrees.getRoot());
		
	}
	
}

