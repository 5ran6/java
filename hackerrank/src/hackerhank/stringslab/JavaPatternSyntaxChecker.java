package hackerhank.stringslab;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * brunolima on Sep 6, 2021
 * 
 */

public class JavaPatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCases = Integer.parseInt(sc.nextLine());

		while (testCases > 0) {
			String pattern = sc.nextLine();
			
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (Exception e) {
				System.out.println("Invalid");
			}

			testCases--;
		}

		sc.close();

	}

}
