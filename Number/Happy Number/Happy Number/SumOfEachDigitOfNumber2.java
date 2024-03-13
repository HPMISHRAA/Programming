package com.practice;
// Method with parameter with return type
public class SumOfEachDigitOfNumber2 {
	public static void main(String[] args) {
		int no = 12345;
		no = sum(no);
		System.out.println(no);
	}

	static int sum(int no) {
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum += rem;
			no = no / 10;
		}
		return sum;
	}
}
