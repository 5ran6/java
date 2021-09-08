package hackerhank.stringslab;

/**
 *
 * brunolima on Sep 6, 2021
 * 
 */

public class JavaStringIntroduction {

	public static void main(String[] args) {
		String A = "hello";
		String B = "java";

		int sumLenghts = A.length() + B.length();
		System.out.println(sumLenghts);

		System.out.println(A.compareTo(B) > 1 ? "Yes" : "No");

		String word = A.toUpperCase().charAt(0) + A.substring(1, A.length()) + " " + B.toUpperCase().charAt(0) + B.substring(1, B.length());
		System.out.println(word);
	}

}
