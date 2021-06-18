package com.training.arrays;

public class ArrayDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product[] products = { new Product(1, "pen", 10),
								new Product(2, "pencil", 12),
								new Product(3, "eraser", 5) };
		for(Product temp : products) {
			System.out.println("ID : " + temp.getId() + " " +
								"Name: " + temp.getName() + " " +
								"Cost: " + temp.getCost() + "\n");
		}
	}


}
