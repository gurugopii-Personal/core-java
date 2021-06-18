package com.exercises;

public class q16 {

	public static void main(String[] args) {
		// Replace uncommon letters in string with +

		String firstString = "New York";
		String secondString = "New Jersy";
		char replaceCharater = '+';
		
		for(int i = 0; i < firstString.length(); i++) {
			char charToCheck = firstString.toLowerCase().charAt(i);
			if(secondString.toLowerCase().indexOf(charToCheck) < 0 && 
					charToCheck != ' ') {
				firstString = firstString.replace(firstString.charAt(i), replaceCharater);
			}
		}
		
		System.out.println("Output is ==> " + firstString);
	}

}
