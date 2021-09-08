package hackerhank.stringslab;

import java.util.Scanner;

/**
 *
 * brunolima on Sep 6, 2021
 * 
 */

public class JavaRegex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
		
		in.close();
	}

}


class MyRegex {
	
	String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            		  "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            		  "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            		  "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

}