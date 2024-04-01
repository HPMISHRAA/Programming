package com.thirty;

public class First {
	public static void main(String[] args) {
		int no = 5;
		for (int row = 1; row <= no; row++) {
			for (int col = 1; col <= no; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
