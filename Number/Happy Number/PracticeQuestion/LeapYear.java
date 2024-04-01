package com.new1;

public class LeapYear {
	public static void main(String[] args) {
		int yr = 2002;
		if (check(yr)) {
			System.out.println("It's a leap year");
		} else {
			System.out.println("It's not a leap year");
		}
	}

	static boolean check(int no) {
		return (no % 4 == 0 && no % 100 != 0) || (no % 400 == 0);
	}
}
