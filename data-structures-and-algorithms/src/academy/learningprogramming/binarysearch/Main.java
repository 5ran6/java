package academy.learningprogramming.binarysearch;

/**
 *
 * brunolima on Feb 11, 2021
 * 
 * Binary Search
 * 
 * - Data must be sorted!
 * 
 * - Chooses the element in the middle of the array and compares it against the search value
 * 
 * - If element is equal to the value, we're done
 * 
 * - If element is greater than the value, search the left half of the array
 * 
 * - If the element is less than the value, search the right half of the array
 * 
 */

public class Main {

	public static void main(String[] args) {
		int[] input = { -22, -15, 1, 7, 20, 35, 55 };

		System.out.println(binarySearch(input, -15));
		System.out.println(binarySearch(input, 35));
		System.out.println(binarySearch(input, 888));
		System.out.println(binarySearch(input, 1));
		
		System.out.println("-------------------------");
		System.out.println(binarySearchRecursive(input, -15));
		System.out.println(binarySearchRecursive(input, 35));
		System.out.println(binarySearchRecursive(input, 888));
		System.out.println(binarySearchRecursive(input, 1));
		
	}

	public static int binarySearch(int[] input, int value) {
		int left = 0;
		int right = input.length;

		while (left < right) {
			int mid = (left + right) / 2;
			System.out.println("midPoint = " + mid);

			if (input[mid] == value) {
				return mid;
			} else if (input[mid] < value) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}

		return -1;
	}

	public static int binarySearchRecursive(int[] input, int value) {
		return binarySearchRecursive(input, 0, input.length, value);
	}

	private static int binarySearchRecursive(int[] input, int left, int right, int value) {
		if (left >= right) {
			return -1;
		}
		
		int mid = (left + right) / 2;
		System.out.println("midPoint = " + mid);
		
		if (input[mid] == value) {
			return mid;
		} else if (input[mid] < value) {
			return binarySearchRecursive(input, mid + 1, right, value);
		} else {
			return binarySearchRecursive(input, left, mid, value);
		}
	}

}
