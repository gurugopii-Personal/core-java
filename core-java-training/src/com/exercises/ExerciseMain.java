package com.exercises;

public class ExerciseMain {

	public static void main(String[] args) {
		// To execute exercise problems
		
		// Sum of N natural numbers
		SumOfNNaturalNumbers sumOfNumbers = new SumOfNNaturalNumbers(5);
		System.out.println("Sum of first N natural numbers is : " + sumOfNumbers.calculateSum());
		
		// Difference of  sum of the squares and 
		// the square of the sum of numbers
		
		DifferenceOfSquare differenceOfSquare = new DifferenceOfSquare(3);
		System.out.println("Difference of  sum is : " + differenceOfSquare.calculateDifference());
		
		// Mirror image of String
		
		MirrorImageOfString mirrorString = new MirrorImageOfString();
		System.out.println("Mirror image is : " + mirrorString.getImage("EARTH"));
		
		// Sum of powers with index position
		
		ArrayPowerSum powerSum = new ArrayPowerSum();
		int[] intArray = {3, 6, 2, 1};
		System.out.println("Sum of powers is : " + powerSum.sumOfPowers(intArray));
		
		// Test if first and last characters are same
		
		IsFirstLastCharSame charCheck = new IsFirstLastCharSame();
		System.out.println("Is first and last character same: " + 
		charCheck.isSameCharaters("the picture was great"));
		
		// Buying and selling price
		
		Gadget gadget = new Gadget(20.54, 30.50);
	}

}
