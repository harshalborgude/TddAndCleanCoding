package org.hrb.Tdd;

public class LeapYear {

	public static void main(String[] args) {

		System.out.println("Leap Year!");
	}

	public static boolean isLeap(int iYear) {

		// All years divisible by 400 ARE leap years
		if ((iYear % 400) == 0) {
			return true;
		}
		// All years divisible by 100 but not by 400 are NOT leap years ex-1800
		else if (((iYear % 100) == 0) && ((iYear % 400) != 0)) {
			return false;
		}
		// All years divisible by 4 but not by 100 ARE leap years ex -2008
		else if (((iYear % 4) == 0) && ((iYear % 100) != 0)) {
			return true;
		}

//		if (((iYear % 400) == 0) || (((iYear % 4) == 0) && (iYear % 100) != 0)) {
//			return true;
//		}

		return false;
	}

}
