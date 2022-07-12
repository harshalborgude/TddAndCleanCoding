package org.hrb.Tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeapYearTest {

	// All years divisible by 400 ARE leap years ex-2000
	@Test
	void leap_divisible_by_400() {
		int YEAR_TO_TEST=2000;
		boolean isLeap = new LeapYear(YEAR_TO_TEST).isLeap();

		boolean expectTrue=true;
		assertEquals(expectTrue, isLeap, "isLeap method have return false for 2000");
	}

	// All years divisible by 100 but not by 400 are NOT leap years ex-1800
	@Test
	void nonLeap_divisible_by_100_not_by_400() {
		int YEAR_TO_TEST=1800;
		boolean isLeap = new LeapYear(YEAR_TO_TEST).isLeap();

		boolean expectFalse=false;
		assertEquals(expectFalse, isLeap, "isLeap method have return true for 1800");
	}

	// All years divisible by 4 but not by 100 ARE leap years ex -2008
	@Test
	void leap_divisible_by_4_not_by_100() {
		int YEAR_TO_TEST=2008;
		boolean isLeap = new LeapYear(YEAR_TO_TEST).isLeap();

		boolean expectTrue=true;
		assertEquals(expectTrue, isLeap, "isLeap method have return false for 2008");
	}

	// All years not divisible by 4 are NOT leap years ex-2017
	@Test
	void nonLeap_not_divisible_by_4() {
		int YEAR_TO_TEST=2017;
		boolean isLeap = new LeapYear(YEAR_TO_TEST).isLeap();

		boolean expectFalse=false;
		assertEquals(expectFalse, isLeap, "isLeap method have return true for 2017");
	}
}
