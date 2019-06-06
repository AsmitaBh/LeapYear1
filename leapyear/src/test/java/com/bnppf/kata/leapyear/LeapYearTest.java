package com.bnppf.kata.leapyear;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LeapYearTest {

	private LeapYear leapYear;

	@Before
	public void setUp() throws Exception {
		leapYear = new LeapYear();
	}

	@Test
	public void when2016ThenLeapYear() {
		assertTrue(leapYear.isLeapYear(2016));
	}

	@Test
	public void when2015ThenNonLeapYear() {
		assertFalse(leapYear.isLeapYear(2015));
	}

}
