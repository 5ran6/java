package challenges;

public class BinarySearch {
	// Returns index of x if it is present in arr[l..
	// r], else return -1
	public int binarySearch(int arr[], int begin, int sizeArr, int element) {
		if (sizeArr >= begin) {
			int mid = begin + (sizeArr - begin) / 2;

			// If the element is present at the
			// middle itself
			if (arr[mid] == element)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > element)
				return binarySearch(arr, begin, mid - 1, element);

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, sizeArr, element);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

	// Driver method to test above
	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 40;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index: " + result);
	}
}
