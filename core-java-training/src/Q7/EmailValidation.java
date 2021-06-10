package Q7;

public class EmailValidation {

	public static void main(String[] args) {
		// Email Validation

		String email = args[0];
		int validationCount = 0;
		System.out.println("Given email is " + email);
		
		if (email.endsWith(".com")) {
			System.out.println("1. Ends with .com");
			validationCount++;
		}
		if (symbolValidation("@", email) && symbolValidation(".", email)) {
			System.out.println("2. Contains @ and .  with occurance of 1 time");
			validationCount++;
		}
		String[] frontCharacters = email.split("@");
		if (frontCharacters[0].length() >= 3) {
			System.out.println("3. Has atleast 3 characters before @");
			validationCount++;
		}
		String betweenCharacters = frontCharacters[1].split("\\.")[0];
		if (betweenCharacters.length() == 4) {
			System.out.println("4. There are 4 character between @ and .");
			validationCount++;
		}
		
		String isValid = validationCount == 4 ? "true" : "false";
		System.out.println("\nIs valid email : " + isValid);
	}
	
	public static Boolean symbolValidation(String symbol, String inEmail) {
		int replace = inEmail.length() - inEmail.replace(symbol, "").length();
		return replace == 1;
	}

}
