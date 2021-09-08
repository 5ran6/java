package global.software.support.data.structure.in.java.stack;

/**
*
* brunolima on Jun 6, 2021
* 
*/

public class AppStack {
	
	public static void main(String[] args) {
		Stack<String> names = new Stack<>();
		
		names.push("Adam");
		names.push("Ana");
		names.push("Kevin");
		names.push("Michael");
		
		System.out.println(names.peek());
		
		System.out.println(names.pop());
		
		System.out.println(names.peek());
		
		while(!names.isEmpty()) {
			System.out.println(names.pop());
		}
	}

}

