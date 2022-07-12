package org.hrb.Tdd;

public class LeapYear {

	public static void main(String[] args) {

		System.out.println("Leap Year!");
	}

	public static boolean isLeap(int iYear) {

		if (isDivisibleBy400(iYear)) {
			return true;
		}

		else if (isDivisibleBy100(iYear) && (!isDivisibleBy400(iYear))) {
			return false;
		}

		else if (isDivisibleBy4(iYear) && (!isDivisibleBy100(iYear))) {
			return true;
		}

//		if (isDivisibleBy400(iYear) || (isDivisibleBy4(iYear) && (!isDivisibleBy100(iYear)) ) ) {
//			return true;
//		}

		return false;
	}

	private static boolean isDivisibleBy4(int iYear) {
		return (iYear % 4) == 0;
	}

	private static boolean isDivisibleBy100(int iYear) {
		return (iYear % 100) == 0;
	}

	private static boolean isDivisibleBy400(int iYear) {
		return (iYear % 400) == 0;
	}

}
