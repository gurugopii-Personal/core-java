package Q3;

public class NoOfWordOnGivenLength {

	public static void main(String[] args) {
		// Number of words are of given length	
		
		int length = Integer.parseInt(args[args.length - 1]);
		System.out.println("Given length is " + length);
		int matchCount = 0;
		for(int i = 0; i < (args.length - 1); i++) {
			System.out.println("Word is " + args[i]);
			if (args[i].chars().count() == length) {
				matchCount++;
			}
		}
		System.out.println("Number of words for given length is " + matchCount);
	}

}
