package practice.java;

import java.util.ArrayList;
import java.util.Scanner;

public class _47_JavaInstanceOfKeyword {

	static String count(ArrayList<Object> mylist) {
		int a = 0, b = 0, c = 0;

		for (int i = 0; i < mylist.size(); i++) {
			Object element = mylist.get(i);

			if (element instanceof Ztudent)
				a++;
			if (element instanceof Rockstar)
				b++;
			if (element instanceof Hacker)
				c++;
		}

		String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
		return ret;
	}

	public static void main(String[] args) {
		ArrayList<Object> mylist = new ArrayList<Object>();

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			String s = sc.next();
			if (s.equals("Student"))
				mylist.add(new Ztudent());
			if (s.equals("Rockstar"))
				mylist.add(new Rockstar());
			if (s.equals("Hacker"))
				mylist.add(new Hacker());
		}
		
		System.out.println(count(mylist));
		
		sc.close();
	}

}

class Ztudent {
}

class Rockstar {
}

class Hacker {
}
