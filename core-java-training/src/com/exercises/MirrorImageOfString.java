package com.exercises;

public class MirrorImageOfString {

	public String getImage(String forString) {
		
		String mirrorString = forString + "|";
		for(int i = forString.length() - 1; i >= 0; i--) {
			mirrorString += forString.charAt(i);
		}
		
		return mirrorString;
	}
}
