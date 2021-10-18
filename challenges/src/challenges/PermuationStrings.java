package challenges;

/**
*
* brunolima on Sep 5, 2021
* 
*/

public class PermuationStrings {
	
	public static void main(String[] args) {
		
		System.out.println(countPermutation("abba", 0));
		
	}

	private static int countPermutation(String word, int total) {
		int count = total;
		
		if (word.length() == 0) {
			return count;
		}
		
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			
			String value = word.substring(0, i) + word.substring(i + 1);
			 
			System.out.println("value >>> "+ value);
			
			count++;
			
			countPermutation(value, count);
			
		}
		
		return 0;
	}

}

