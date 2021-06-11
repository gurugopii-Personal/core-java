package q12;

public class UnionMinusIntersection {

	public static void main(String[] args) {
		// Union minus intersection

		int[] a = {1,2,3,4}; 
		int[] b = {3,4,5,6};
		int[] currentArray = a;
		String nonRepeated = "";
		int i = 0;
		Boolean isCompleted = false;

		while (!isCompleted) {
			String number = Integer.toString(currentArray[i]);
			if(!nonRepeated.contains(number)) {
				nonRepeated += currentArray[i]; 
			} else {
				nonRepeated = nonRepeated.replaceAll(number, "");
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

		System.out.println("Union minus intersection is " + nonRepeated);
	}

}
