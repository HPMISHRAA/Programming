package com.practice;

public class PrimeNumber {
	public static void main(String[] args) {
		int no = 13;
		int copy = no;
		while (no > 9) {
			no = sum(no);
		}
		if (no == 1 || no == 7) {
			System.out.println(copy + "----> Is a Happy Number");
		} else {
			System.out.println(copy + "----> Is Not a Happy Number");
		}
	}

	static int sum(int no) {
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum += (rem * rem);
			no = no / 10;
		}
		return sum;
	}
}
