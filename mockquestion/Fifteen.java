package com.mockquestion;

public class Fifteen {
	public static void main(String[] args) {
		String str = "aaabbccc";
		str = frequency(str);
		System.out.println(str);
	}

	static String frequency(String str) {
		int[] arr = new int[123];
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[ch]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				rev = rev + (char) i + "" + arr[i];
			}
		}

		return rev;

	}
}
