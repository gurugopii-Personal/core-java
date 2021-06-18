package com.exercises;

public class ExerciseMain {

	public static void main(String[] args) {
		// To execute exercise problems
		
		// Sum of N natural numbers
		SumOfNNaturalNumbers sumOfNumbers = new SumOfNNaturalNumbers(5);
		System.out.println("Sum of first N natural numbers is : " + sumOfNumbers.calculateSum());
		System.out.println("\n");
		
		// Difference of  sum of the squares and 
		// the square of the sum of numbers
		DifferenceOfSquare differenceOfSquare = new DifferenceOfSquare(3);
		System.out.println("Difference of  sum is : " + differenceOfSquare.calculateDifference());
		System.out.println("\n");
		
		// Mirror image of String
		MirrorImageOfString mirrorString = new MirrorImageOfString();
		System.out.println("Mirror image is : " + mirrorString.getImage("EARTH"));
		System.out.println("\n");
		
		// Sum of powers with index position
		ArrayPowerSum powerSum = new ArrayPowerSum();
		int[] intArray = {3, 6, 2, 1};
		System.out.println("Sum of powers is : " + powerSum.sumOfPowers(intArray));
		System.out.println("\n");
		
		// Test if first and last characters are same
		IsFirstLastCharSame charCheck = new IsFirstLastCharSame();
		System.out.println("Is first and last character same: " + 
		charCheck.isSameCharaters("the picture was great"));
		System.out.println("\n");
		
		// Buying and selling price
		new Gadget(20.54, 30.50);
		System.out.println("\n");
		
		// Profit percentage for Toys
		Gadget toyGadget = new Gadget("Toys");
		double profitPercentage = toyGadget.getProfitPercentage(20, 375, 33);
		String roundedPercentage = String.format("%.2f", profitPercentage);
		System.out.println("Profit percentage for " + toyGadget.getName() + " is : " +
				roundedPercentage + " percent");
		System.out.println("\n");
		
		// Discount Calculation
		DiscountCalculation discount = new DiscountCalculation();
		discount.getDiscountDetails(20.50f, 45.40f, 10);
		System.out.println("\n");
	}

}
