package com.exercises;

public class DiscountCalculation {
	// Calculate the discount based on the price of two items 
	// and the overall discount percentage
	
	public void getDiscountDetails(float itemOnePrice, float itemTwoPrice, int discount) {
		double totalPrice = (double)(itemOnePrice + itemTwoPrice);
		double discountPercent = (double)(discount/100.0);
		double discountPrice = (discount / 100.0) * totalPrice;
		double priceAfterDiscount = totalPrice - discountPrice;
		
		System.out.println("Price of item 1 : " + itemOnePrice + "\n" +
				"Price of item 2 : " + itemTwoPrice);
		System.out.println("Discount in percentage: " + discount);
		System.out.println("Total amount : $" +  String.format("%.2f", totalPrice));
		System.out.println("Discounted amount : $" + String.format("%.2f", priceAfterDiscount));
		System.out.println("Saved amount : $" + String.format("%.2f", discountPrice));
	}
}
