package com.exercises;

public class ArrayPowerSum {
	// Sum of the power of each individual element according to its position index
	
	public int sumOfPowers(int[] intArray) {
		int sumOfPowers = 0;
		
		for(int i = 0; i < intArray.length; i++) {
			sumOfPowers += Math.pow(intArray[i], i);
		}
		
		return sumOfPowers;
	}
}
