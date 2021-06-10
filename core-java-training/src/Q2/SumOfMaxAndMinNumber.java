package Q2;

public class SumOfMaxAndMinNumber {

	public static void main(String[] args) {
		// Sum of maximum and minimum number from a given input array
		
		int maximumNumber = Integer.parseInt(args[0]);
		int minimumNumber = Integer.parseInt(args[0]);
		
		for (int i = 1; i < args.length; i++) {
			int number =  Integer.parseInt(args[i]);
			maximumNumber = maximumNumber > number ? maximumNumber : number;
			minimumNumber = minimumNumber < number ? minimumNumber : number;
		}
		System.out.println("Maximum number is " + maximumNumber);
		System.out.println("Minimum number is " + minimumNumber);
		System.out.println("Sum of max and min number is " + (maximumNumber + minimumNumber));
	}

}
