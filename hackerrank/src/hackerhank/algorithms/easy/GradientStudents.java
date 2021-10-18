package hackerhank.algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * brunolima on Oct 17, 2021
 * 
 * https://www.hackerrank.com/challenges/grading/problem
 * 
 */

public class GradientStudents {

	public static void main(String[] args) {
		List<Integer> array = Arrays.asList(73, 67, 38, 33);
		System.out.println(gradingStudents(array));
	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
//		System.out.println(grades);
		
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		
		for (int i = 0; i < grades.size(); i++) {
			int multipleFive = getNextMultipleFive(grades, i);
			
			int result = multipleFive - grades.get(i);
			
			if (result >= 3 || grades.get(i) < 38) {
				newArray.add(grades.get(i));
			} else if (result < 3) {
				newArray.add(multipleFive);
			}
		}
		
		return newArray;
	}

	private static int getNextMultipleFive(List<Integer> grades, int i) {
		Integer value = grades.get(i);
//		System.out.println("value >>> " + value);
		
		int divide = value / 5;
//		System.out.println("divide >>> " + divide);
		
		int result = (int) ((Math.ceil(divide) * 5 )+ 5);
//		System.out.println("result >>> " + (result));
		
		return result;
	}
}
