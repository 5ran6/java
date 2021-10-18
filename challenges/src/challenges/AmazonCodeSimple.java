package challenges;

/**
*
* brunolima on May 8, 2021
* 
*/

public class AmazonCodeSimple {
	
	public static void main(String[] args) {
		String input = "abcddd";
		
		System.out.println(encode(input));
	}
	
	public static String encode(String input) {
		if (input == null || input.length() == 0) {
			return null;
		}
		
		StringBuilder sb = new StringBuilder();
		char[] inputChars = input.toCharArray();
		char prevChar = inputChars[0];
		int counter = 0;
		
//		for(int i = 0; i < inputChars.length; i++) {
//			if (inputChars[i] == prevChar) {
//				counter++;
//			} else {
//				sb.append(counter).append(prevChar);
//				prevChar = inputChars[i];
//				counter = 1;
//			}
//		}
		
		for(char ch : inputChars) {
			if (ch == prevChar) {
				counter++;
			} else {
				sb.append(counter).append(prevChar);
				prevChar = ch;
				counter = 1;
			}
		}

		sb.append(counter).append(prevChar);
		
		return sb.toString();
	}
	

}

