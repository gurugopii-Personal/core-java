package com.exercises;

public class q17 {

	public static void main(String[] args) {
		// Encrypt with next letter in alphabet with given position
		// in odd position only
		
		StringBuilder encryptString = new StringBuilder("curiosity");
		
		for(int i = 0; i < encryptString.length(); i++) {
			if(i % 2 == 0) {
				char charToEncrypt = encryptString.charAt(i);
				char replaceChar = charToEncrypt == 'z' ? 'a' : ++charToEncrypt;
				encryptString.setCharAt(i, replaceChar);
			}
		}
		
		System.out.println("Encrypted string is ==> " + encryptString);
	}

}
