package Q10;

public class UnionOfTwoArray {

	public static void main(String[] args) {
		// Union of 2 Array

		int[] a = {1,2,3,4}; 
		int[] b = {3,4,5,6};
		int[] currentArray = a;
		String union = "";
		int i = 0;
		Boolean isCompleted = false;

		while (!isCompleted) {
			String number = Integer.toString(currentArray[i]);
			if(!union.contains(number)) {
				union += currentArray[i]; 
			}
			i++;

			if(i == (currentArray.length)) {
				if (currentArray.equals(b)) {
					isCompleted = true;
				} else {
					currentArray = b;
					i = 0;
				}
			} 
		}

		System.out.println("Union is " + union);
	}
}
