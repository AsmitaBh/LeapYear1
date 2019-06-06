package com.bnppf.kata.leapyear;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LeapYearTest {

	private LeapYear leapYear;

	@BeforeEach
	public void setUp() throws Exception {
		leapYear = new LeapYear();
	}

	@Test
	public void when2016ThenLeapYear() {
		assertTrue(leapYear.isLeapYear(2016));
	}

	@ParameterizedTest
	@ValueSource(ints = { 2015, 2018, 2019 })
    public void whenNotDivisibleBy4ThenNonLeapYear(int year) {
		assertFalse(leapYear.isLeapYear(year));
	}

	@ParameterizedTest
	@ValueSource(ints = { 1700, 1800, 1900, 2100 })
	public void whenDivisibleBy100ButNotBy400ThenNonLeapYear(int year) {
		assertFalse(leapYear.isLeapYear(year));
	}
}
