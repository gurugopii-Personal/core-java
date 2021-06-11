package Q8;

public class SquareRoot {

	public static void main(String[] args) {
		// Find the square root

		double x1 = Double.parseDouble(args[0]);
		double x2 = Double.parseDouble(args[1]);
		double y1 = Double.parseDouble(args[2]);
		double y2 = Double.parseDouble(args[3]);
		
		double number = ((x1+x2) * (x1+x2)) + ((y1+y2) * (y1+y2));
		int squareRoot = (int) (Math.sqrt(number));
		
		System.out.println("Square root of " + number + " is " + squareRoot);
		
	}

}
