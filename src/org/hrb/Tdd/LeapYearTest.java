package org.hrb.Tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeapYearTest {

	// All years divisible by 400 ARE leap years ex-2000
	@Test
	void test1() {
		boolean result = LeapYear.isLeap(2000);

		// true expected , as 2000 is divisible by 400.
		assertEquals(true, result, "isLeap method have return false for 2000");
	}

	// All years divisible by 100 but not by 400 are NOT leap years ex-1800
	@Test
	void test2() {
		boolean result = LeapYear.isLeap(1800);

		// false expected , as 1800 is divisible by 100 but not by 400.
		assertEquals(false, result, "isLeap method have return true for 1800");
	}

	// All years divisible by 4 but not by 100 ARE leap years ex -2008
	@Test
	void test3() {
		boolean result = LeapYear.isLeap(2008);

		// true expected , as 2008 is divisible by 4 but not by 100.
		assertEquals(true, result, "isLeap method have return false for 2008");
	}

	// All years not divisible by 4 are NOT leap years ex-2017
	@Test
	void test4() {
		boolean result = LeapYear.isLeap(2017);

		// false expected , as 2017 is not divisible by 4.
		assertEquals(false, result, "isLeap method have return true for 2017");
	}
}
