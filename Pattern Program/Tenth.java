package com.thirty;

public class Tenth {
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

			for (int col = no; col >= 1; col--) {
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
