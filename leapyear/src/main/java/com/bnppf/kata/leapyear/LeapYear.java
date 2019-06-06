package com.bnppf.kata.leapyear;

public class LeapYear {

	public boolean isLeapYear(int year) {
		return isMultipleOf4(year) && (isNotMiltipleOf100(year) ||  isMiltipleOf400(year));
	}

	private boolean isMiltipleOf400(int year) {
		return year%400 == 0;
	}

	private boolean isNotMiltipleOf100(int year) {
		return year%100 != 0;
	}

	private boolean isMultipleOf4(int year) {
		return year%4 == 0;
	}

}
