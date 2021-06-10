package Q4;

public class SumOfNumbersInInput {

	public static void main(String[] args) {
		// Sum of the numbers in the given input string array
		
		int total = 0;
		for (int i = 0; i < args.length; i++) {
			char[] word = args[i].toCharArray();
			for (int j = 0; j < word.length; j++) {
				if (Character.isDigit(word[j])) {
					System.out.println("Number found - " + word[j]);
					total += Character.getNumericValue(word[j]);
				}
			}
		}
		System.out.println("Sum of numbers is " + total);
	}

}
