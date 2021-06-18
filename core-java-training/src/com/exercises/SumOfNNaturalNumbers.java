package com.exercises;

public class SumOfNNaturalNumbers {
	// To calculate sum of first N natural numbers
	
	int number;

	SumOfNNaturalNumbers(int number) {
		this.number = number;
	}
	
	public int calculateSum() {
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			if((i % 3 == 0) || (i % 5 == 0)) {
				sum += i;
			}
		}
		return sum;
	}
}
