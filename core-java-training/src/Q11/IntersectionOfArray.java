package Q11;

public class IntersectionOfArray {

	public static void main(String[] args) {
		// Intersection of Array
		
		int[] a = {1,2,3,4}; 
		int[] b = {3,4,5,6};
		int[] currentArray = a;
		String union = "";
		String intersection = "";
		int i = 0;
		Boolean isCompleted = false;

		while (!isCompleted) {
			String number = Integer.toString(currentArray[i]);
			if(union.contains(number)) {
				intersection += currentArray[i]; 
			} else {
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

		System.out.println("Intersection is " + intersection);
	}
}
