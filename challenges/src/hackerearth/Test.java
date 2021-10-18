package hackerearth;

/**
 *
 * brunolima on Oct 12, 2021
 * 
 */

public class Test {

	public static void main(String[] args) {
		possibilities(3);
	}
	
	private static void possibilities(int n) {
		int a = 1, b =1 ;
		
		for (int i = 2; i < n; i++) {
			b = a + b;
			a = b - a;
			
//			a = a - b;
//			b = b + a;
		}
		
		System.out.println(b);
	}
	
	
}
