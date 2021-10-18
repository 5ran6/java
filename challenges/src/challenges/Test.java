package challenges;

/**
*
* brunolima on Oct 16, 2021
* 
*/

public class Test {
	
	public static void main(String[] args) {
		try {
			String copy = new String("Hello copy");
			System.out.println(copy);
			
			throw new Exception();
			
		} catch (Exception e) {
			System.err.println("Error");
		} finally {
			System.out.println("Finally");
		}
	}

}

