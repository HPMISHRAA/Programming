package com.prime;

public class SumOfMinAndMaxPrimeNumberBetweenRange {
	public static void main(String[] args) {
		int a = minPrime(6, 30);
		int b = maxPrime(6, 30);
		System.out.println(a+b);
	}
	static int minPrime(int a, int b) {
		for (int i = a; i <= b; i++) {
			int no = i;
			boolean flag = true;
			for (int j = 2; j < no; j++) {
				if (no % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				return no;
			}
		}
		return 0;
	}
	static int maxPrime(int a, int b) {
		for (int i = b; i >= a; i--) {
			int no = i;
			boolean flag = true;
			for (int j = 2; j < no; j++) {
				if (no % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				return no;
			}
		}
		return 0;
	}
}
