package q15;

public class UniqueCharaters {

	public static void main(String[] args) {
		// Find unique characters
		
		String input = String.join("", args);
		String unique = "";
		for(int i = 0; i < input.length(); i++) {
			char cur = input.charAt(i);
			if(!(unique.indexOf(input.charAt(i)) > 0)) {
				unique += cur;
			}
		}
		System.out.println("Unique Characters are " + unique);
		 
	}

}
