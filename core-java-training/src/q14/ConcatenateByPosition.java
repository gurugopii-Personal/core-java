package q14;

import java.math.BigInteger;

public class ConcatenateByPosition {

	public static void main(String[] args) {
		// Concatenate the character in a given position
		
		int position = (Integer.parseInt(args[args.length - 1]));
		String concateString = "";
		for(int i = 0; i < args.length - 1; i++) {
			String word = args[i];
			if(word.length() >= position) {
				concateString += word.charAt(position - 1);
			} else {
				concateString += "$";
			}
		}
		System.out.println("Concatenated characters at given position: " + position);
		System.out.println(concateString);
		
	}
	
	void login(String userId) {
		//Login with UserID
		login(userId, null);
	}
	
	void login(BigInteger registeredMobileNumber) {
		//Login with Registered mObile Number
		login(null, registeredMobileNumber);
	}
	
	void login(String id, BigInteger mobileNumber) {
		if(id != null) {
			//Login process with UserID
		} else {
			//Login process with Registered mObile Number
		}
	}
}
