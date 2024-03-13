package com.practice;

public class SumOfSquareOfEachDigitOfNumberTillGettingSingleDigit {
	public static void main(String[] args) {
		int no = 13;
		while (no > 9) {
			no = sum(no);
		}
		System.out.println(no);
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
