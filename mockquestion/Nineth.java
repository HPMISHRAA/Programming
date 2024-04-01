package com.mockquestion;

// write a program for reverse a string without using any inbuilt method except toCharArray 
public class Nineth {
	public static void main(String[] args) {
		String str = "hari";
		str = reverse(str);
		System.out.println(str);
	}

	static String reverse(String str) {
		String rev = "";
		char[] arr = str.toCharArray();
		for (char ch : arr) {
			rev = ch + rev;
		}
		return rev;
	}
}
