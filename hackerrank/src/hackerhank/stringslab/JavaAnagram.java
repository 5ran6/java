package hackerhank.stringslab;

/**
*
* brunolima on Sep 6, 2021
* 
*/

public class JavaAnagram {
	
	public static void main(String[] args) {
		String a = "hello";
		String b = "hello";
		
		boolean isAnagram = isAnagram(a, b);
		System.out.println(a + " and " + b + ", are anagrams? " + isAnagram);
		
		String c = "anagram";
		String d = "margana";
		
		boolean isAnagram2 = isAnagram(c, d);
		System.out.println(c + " and " + d + ", are anagrams? " + isAnagram2);
		
		String e = "anagramm";
		String f = "marganaa";
		
		boolean isAnagram3 = isAnagram(e, f);
		System.out.println(e + " and " + f + ", are anagrams? " + isAnagram3);
	}

	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		
		int[] alphabet = new int[127];
		
		// comparison not be case sensitive
		a = a.toUpperCase();
		b = b.toUpperCase();
		
		
		for (int i = 0; i < a.length(); i++) {
			char charA = a.charAt(i);
			char charB = b.charAt(i);
			
			alphabet[(int) charA]++;
			alphabet[(int) charB]--;
		}
		
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] != 0) {
				return false;
			}
		}
		
		return true;
	}
}

