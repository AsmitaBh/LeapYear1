package com.bnppf.kata.leapyear;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest {
	
	@Test
	public void when2016ThenLeapYear() {
		LeapYear leapYear = new LeapYear();
		assertTrue(leapYear.isLeapYear(2016));
	}
	
	@Test
	public void when2015ThenNonLeapYear() {
		LeapYear leapYear = new LeapYear();
		assertFalse(leapYear.isLeapYear(2015));
	}

}
