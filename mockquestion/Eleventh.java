package com.mockquestion;

// frequency of string greater than 5 in definition of method overloading
public class Eleventh {
	public static void main(String[] args) {
		String str = "creating multiple method with the same name but variation in argument";
		int[] arr = new int[123];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[ch]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 5) {
				System.out.println((char) i + "---->" + arr[i]);
			}
		}
	}
}
