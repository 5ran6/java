package hackerhank.stringslab;

/**
 *
 * brunolima on Sep 6, 2021
 * 
 */

public class JavaStringTokens {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//      String s = scan.nextLine();

		String s = "He is a very very good boy, isn't he?";

		// Write your code here.
		// See: https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html

		if (s.length() == 0) {
			System.out.println(0);
		} else {
			// Strip out non-word characters and replace with whitespace, trim
			// leading/trailing whitespace
			s = s.replaceAll("[^\\p{Alpha}]+", " ").trim();

			if (s.isEmpty()) {
				// String contains no valid tokens
				System.out.println(0);
			} else {
				// Split the string into valid tokens
				String[] strings = s.split("\\p{Space}+");

				// Print number of tokens
				System.out.println(strings.length);

				// Print each token
				for (String str : strings) {
					System.out.println(str);
				}
			}
		}

//        scan.close();
	}

}
