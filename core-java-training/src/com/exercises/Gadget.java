package com.exercises;

public class Gadget {
	
	String name;
	double buyingPrice;
	double sellingPrice;
	int quantity;
	
	public String getName() {
		return name;
	}
	
	public Gadget(double buyingPrice, double sellingPrice) {
		this.buyingPrice = buyingPrice;
		this.sellingPrice = sellingPrice;
		
		System.out.println("Buying price is " + buyingPrice + 
				" Selling price is " + sellingPrice);
	}
	
	public Gadget(String name) {
		this.name = name;
	}
	
	public double getProfitPercentage(int dozens, double pricePerDozen, double sellingPrice) {
		this.sellingPrice = sellingPrice;
		this.buyingPrice = pricePerDozen / 12;
		this.quantity = dozens * 12;
		
		double profit = this.sellingPrice - this.buyingPrice;
				
		return (profit / this.buyingPrice) * 100;
	}
}
