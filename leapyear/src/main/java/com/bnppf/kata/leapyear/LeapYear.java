package com.bnppf.kata.leapyear;

import static com.bnppf.kata.leapyear.DivisionBase.FOUR;
import static com.bnppf.kata.leapyear.DivisionBase.FOUR_HUNDRED;
import static com.bnppf.kata.leapyear.DivisionBase.HUNDRED;

public class LeapYear {

	public boolean isLeapYear(int year) {
		return isMultipleOf4(year) && (isNotMiltipleOf100(year) ||  (isMiltipleOf400(year) && isNotMiltipleOf4000(year)));
	}

	private boolean isNotMiltipleOf4000(int year) {
		return year % 4000 != 0;
	}

	private boolean isMiltipleOf400(int year) {
		return isMultipleOf(year, FOUR_HUNDRED);
	}

	private boolean isNotMiltipleOf100(int year) {
		return !isMultipleOf(year, HUNDRED);
	}

	private boolean isMultipleOf4(int year) {
		return isMultipleOf(year, FOUR);
	}
	
	private boolean isMultipleOf(int year, DivisionBase base) {
		return year % base.getBase() == 0;
	}

}
