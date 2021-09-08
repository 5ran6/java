package hackerhank.stringslab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * brunolima on Sep 6, 2021
 * 
 */

public class JavaRegex2 {

	public static void main(String[] args) {
		String regex = "(\\b\\w+\\b)(\\s+\\1\\b)+";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

//		Scanner in = new Scanner(System.in);
//		int numSentences = Integer.parseInt(in.nextLine());

//		while (numSentences-- > 0) {
//			String input = in.nextLine();
			String input = "Goodbye bye bye world world world";
			System.out.println("input >>> " + input);		

			Matcher m = p.matcher(input);
			System.out.println("m >>> " + m);
			
			// Check for subsequences of input that match the compiled pattern
			while (m.find()) {
				System.out.println("m.group() >>> " + m.group());
				System.out.println("m.group(1) >>> " + m.group(1));
				input = input.replaceAll(m.group(), m.group(1));
			}

			// Prints the modified sentence.
			System.out.println(input);
//		}

//		in.close();
	}

}
