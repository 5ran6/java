package com.br.testrigor;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * brunolima on Jul 9, 2021
 * 
 */

public class FIndCriminal {

	public static void main(String[] args) {

		Map<String, String> criminals = new HashMap<String, String>();
		criminals.put("Paul White", "Roger Night, Peter Llong Jr.");
		criminals.put("Roger Fedexer", "Rob Ford, Pete Lord, Roger McWire");
		criminals.put("Paul White Jr.", null);
		criminals.put("Red Fortress", "Roger Rabbit, Ross Winter");
		criminals.put("Redford Fort", "Red Strong, Red Fort");

		
		System.out.println(findCriminal(criminals, "paul White"));

		System.out.println(findCriminal(criminals, "Roger"));
		
		System.out.println(findCriminal(criminals, "Ross"));
		
		System.out.println(findCriminal(criminals, "white jr."));

	}

	public static String findCriminal(Map<String, String> criminals, String possibleName) {
		if (criminals == null || criminals.isEmpty() || possibleName == null || possibleName.isEmpty() || possibleName.length() == 0) {
			return "No match";
		}
		
//		System.out.println("criminals >>>" + criminals);
//		System.out.println("possibleName >>>" + possibleName);
		
		for (Map.Entry<String, String> entry : criminals.entrySet()) {
//			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
			
			if ((entry.getValue() != null &&  entry.getValue().trim().toLowerCase().equalsIgnoreCase(possibleName.toLowerCase().trim())) 
					|| (entry.getValue() != null && entry.getValue().trim().toLowerCase().contains(possibleName.toLowerCase().trim()))) {
				return String.format("First name: %s. Aliases: %s", entry.getKey(), entry.getValue());
			}
		}
		
	
		for (Map.Entry<String, String> entry : criminals.entrySet()) {
//			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
			
			if (entry.getKey().trim().toLowerCase().equalsIgnoreCase(possibleName.toLowerCase().trim()) 
					|| entry.getKey().trim().toLowerCase().contains(possibleName.toLowerCase().trim())) {
				return String.format("First name: %s. Aliases: %s", entry.getKey(), entry.getValue());
			}
		}
		
		

		return "No match";
	}

}
