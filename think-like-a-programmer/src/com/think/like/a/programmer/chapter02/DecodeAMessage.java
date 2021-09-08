package com.think.like.a.programmer.chapter02;

import java.util.Scanner;

/**
 *
 * brunolima on May 17, 2021
 * 
 */

public class DecodeAMessage {

	enum ModeType {
		UPPERCASE, LOWERCASE, PUNCTUATION
	}

	public static void main(String[] args) {
		char outputCharacter = 0;
		ModeType mode = ModeType.UPPERCASE;
		char digitChar;

		Scanner sc = new Scanner(System.in);

		do {
			digitChar = sc.next().toCharArray()[0];
			int number = (digitChar - '0');

			digitChar = sc.next().toCharArray()[0];

			while ((digitChar != 'E') && (digitChar != ',')) {
				number = number * 10 + (digitChar - '0');
				digitChar = sc.next().toCharArray()[0];
			}

			switch (mode) {
			case UPPERCASE:
				number = number % 27;
				outputCharacter = (char) (number + 'A' - 1);

				if (number == 0) {
					mode = ModeType.LOWERCASE;
					continue;
				}

				break;
			case LOWERCASE:
				number = number % 27;
				outputCharacter = (char) (number + 'a' - 1);
				if (number == 0) {
					mode = ModeType.PUNCTUATION;
					continue;
				}
				break;
			case PUNCTUATION:
				number = number % 9;
				
				switch (number) {
					case 1: outputCharacter = '!'; break; 
					case 2: outputCharacter = '?'; break; 
					case 3: outputCharacter = ','; break; 
					case 4: outputCharacter = '.'; break; 
					case 5: outputCharacter = ' '; break; 
					case 6: outputCharacter = ';'; break; 
					case 7: outputCharacter = '"'; break; 
					case 8: outputCharacter = '\''; break;
				} 
			
				if (number == 0) {
					mode = ModeType.UPPERCASE;
				}
				break;
			}
		} while (digitChar != 'E');
		
		System.out.println("RESULT >>> " + outputCharacter);
		
		sc.close();
	}

}
