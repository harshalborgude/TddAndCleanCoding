package org.hrb.Tdd;

public class LeapYear {

	private int year;

	LeapYear(int year) {
		this.year = year;
	}

	public boolean isLeap() {

		if (isDivisibleByNum(400)) {
			return true;
		}

		else if (isDivisibleByNum(100) && (!isDivisibleByNum(400))) {
			return false;
		}

		else if (isDivisibleByNum(4) && (!isDivisibleByNum(100))) {
			return true;
		}

		return false;
	}

	private boolean isDivisibleByNum(int modNumber) {
		return (this.year % modNumber) == 0;
	}

}
