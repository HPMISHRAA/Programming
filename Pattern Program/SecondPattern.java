package com.thirty;

public class SecondPattern {
	public static void main(String[] args) {
		int no = 5;
		for (int row = 1; row <= no; row++) {
			for (int col = 1; col <= no; col++) {
				if (row >= col) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}