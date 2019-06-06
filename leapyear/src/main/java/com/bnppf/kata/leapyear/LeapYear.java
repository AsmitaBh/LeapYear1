package com.bnppf.kata.leapyear;

public class LeapYear {

	public boolean isLeapYear(int year) {
		return year%4 == 0 && year%100 != 0;
	}

}
