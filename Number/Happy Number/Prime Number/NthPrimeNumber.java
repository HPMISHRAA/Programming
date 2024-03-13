package com.prime;

public class NthPrimeNumber {
	public static void main(String[] args) {
		int input = 11;
		int count = 1;
		for (int i = 2; i <= Integer.MAX_VALUE; i++) {
			int no = i;
			boolean flag = true;
			for (int j = 2; j < no; j++) {
				if (no % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				if (input == count) {
					System.out.println(no + "-----> Is The nth Prime Number");
					break;
				} else {
					count++;
				}
			}
		}
	}
}
