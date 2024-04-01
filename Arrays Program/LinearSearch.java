package com.twelve;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 1, 3, 2 };
		int search = 4;
		print(arr, search);
	}

	static boolean print(int[] a, int search) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == search) {
				System.out.println("The value is present in the index of " + i);
				return true;
			}
		}
		System.out.println("The value is not Present");
		return false;
	}
	
}