package vowelsQ1;

public class FindVowelsCount {

	public static void main(String[] args) {
		// Find number of vowels in given input
		
		String input = "";
		for (int j = 0; j < args.length; j++) {
			input += args[j];
		}
		System.out.println("Input is " + input);
		String[] vowels = {"a", "e", "i", "o", "u"};
		int vowelsCount = 0;
		for (int i = 0; i < vowels.length; i++) {
			if (input.indexOf(vowels[i]) > 0) {
				vowelsCount++;
			}
		}
		
		System.out.println("Number of vowels is " + vowelsCount);
	}

}
