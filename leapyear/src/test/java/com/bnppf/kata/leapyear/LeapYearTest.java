package com.bnppf.kata.leapyear;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest {
	
	@Test
	public void when2016ThenLeapYear() {
		LeapYear leapYear = new LeapYear();
		assertTrue(leapYear.isLeapYear(2016));
	}

}
