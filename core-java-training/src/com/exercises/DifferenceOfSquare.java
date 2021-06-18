package com.exercises;

public class DifferenceOfSquare {
	// To find the difference between the sum of the squares and 
	// the square of the sum of the first n natural numbers
	
	int number;

	DifferenceOfSquare(int number) {
		this.number = number;
	}
	
	public int calculateDifference() {
		int sumOfSquares = 0;
		
		for(int i = 0; i <= number; i++) {
			sumOfSquares += i * i;
		}
		System.out.println("Sum of squares of numbers is: " + sumOfSquares);
		
		SumOfNNaturalNumbers sumOfNumbers = new SumOfNNaturalNumbers(number);
		int sumOfNNumbers = sumOfNumbers.calculateSum();
		System.out.println("Sum of numbers is: " + sumOfNNumbers);
		
		return sumOfSquares - (sumOfNNumbers * sumOfNNumbers);
	}
}
