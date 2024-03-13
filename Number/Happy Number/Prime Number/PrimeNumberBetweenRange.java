package com.prime;

public class PrimeNumberBetweenRange {
	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			int no = i;
			boolean flag = true;
			for (int j = 2; j < no; j++) {
				if (no % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(no + "-----> Is Prime Number");
			}
		}
	}
}
