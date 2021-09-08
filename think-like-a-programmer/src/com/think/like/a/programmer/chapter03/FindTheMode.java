package com.think.like.a.programmer.chapter03;

/**
*
* brunolima on May 20, 2021
* 
*/

public class FindTheMode {
	
	public static void main(String[] args) {
		FindTheMode ftm = new FindTheMode();

		int[] input1 = {4, 7, 3, 8, 9, 7, 3, 9, 9, 3, 3, 10};
		int[] input2 = {4, 7, 7, 9, 9, 9, 8, 3, 3, 3, 3, 10};
		
		System.out.println("Resultv1: " + ftm.findTheModeV1(input1));
		
//		System.out.println("Resultv2: " +ftm.findTheModeV2(input2));
		
	}
	
	public int findTheModeV2(int[] input) {
		int mostFrequent = 0;
		int highestFrequency = 0;
		int currentFrequency = 0;
		
		for (int i = 0; i < input.length; i++) {
			currentFrequency++;
			
			if (i == input.length - 1 || input[i] != input[i + 1]) {
				if (currentFrequency > highestFrequency) {
					highestFrequency = currentFrequency;
					mostFrequent = input[i];
				}
				
				currentFrequency = 0;
			}
		}
		
		return mostFrequent;
	}
	
	public int findTheModeV1(int[] input) {
		int[] inputAux = new int[10];
		
		for (int i = 0; i < input.length; i++) {
			inputAux[input[i] - 1]++;
		}
		
		int maxValue = 0;
		
		for (int i = 1; i < inputAux.length; i++) {
			if (inputAux[i] > inputAux[maxValue]) {
				maxValue = i;
			}
		}

//		for (int i = 0; i < inputAux.length; i++) {
//			System.out.println("Mode: " + (i + 1) + ", value: " + inputAux[i]);
//		}
		
		return maxValue + 1;
	}
	

}

