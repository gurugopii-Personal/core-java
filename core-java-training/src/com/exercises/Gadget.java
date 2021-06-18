package com.exercises;

public class Gadget {
	double buyingPrice;
	double sellingPrice;
	
	public Gadget(double buyingPrice, double sellingPrice) {
		this.buyingPrice = buyingPrice;
		this.sellingPrice = sellingPrice;
		
		System.out.println("Buying price is " + buyingPrice + 
				" Selling price is " + sellingPrice);
	}
	
	
	
}
