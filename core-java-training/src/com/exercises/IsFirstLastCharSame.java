package com.exercises;

public class IsFirstLastCharSame {
	
	// Test if first and last characters are same if yes return 1 else -1
	
	public int isSameCharaters(String input) {
		if(input.length() > 1 && input.charAt(0) == input.charAt(input.length() - 1)) {
			return 1;
		} else {
			return -1;
		}
	}
}
