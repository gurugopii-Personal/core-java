package Q9;

public class CheckLeapYear {

	public static void main(String[] args) {
		// Check given year is leap year or not

		int year = Integer.parseInt(args[0]);
		System.out.println("Year: " + year + " is leap year - " + isLeapYear(year));
	}
	
	public static boolean isLeapYear(int year) {
		if (year % 4 != 0) {
			return false;
		} else if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else {
			return true;
		}
	}
}
