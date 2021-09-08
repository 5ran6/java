package hackerhank.stringslab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * brunolima on Sep 6, 2021
 * 
 */

public class JavaTagContentExtractor {

	// To see: https://www.hackerrank.com/challenges/tag-content-extractor/problem
	
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
		
		String regex = "<([^>]+)>([^<>]+)</\\1>";
        Pattern p = Pattern.compile(regex);
		
//		int testCases = Integer.parseInt(in.nextLine());
		
//		while (testCases > 0) {
//			String line = in.nextLine();
//			String line = "<h1>Nayeem loves counseling</h1>";
			String line = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>";
//			String line = "<Amee>safat codes like a ninja</amee>";
					
			
			// Write your code here
			boolean findMatch = false;
			
			Matcher m = p.matcher(line);
			
			while(m.find()) {
				System.out.println("m.group() >>> " + m.group());
				System.out.println("m.group(1) >>> " + m.group(1));
				System.out.println("m.group(2) >>> " + m.group(2));
				System.out.println(m.group(2));
				findMatch = true;
			}
			
			if (!findMatch) {
				System.out.println("None");
			}
			
//			testCases--;
//		}
	}

}
