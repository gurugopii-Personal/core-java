package q13;

public class DecimalToBinary {

	public static void main(String[] args) {
		// Decimal to Binary
		
		int decimalNumber = Integer.parseInt(args[0]);
		System.out.println("Binary representation of: " + decimalNumber);
    	System.out.println(Integer.toBinaryString(decimalNumber));
	}

}
