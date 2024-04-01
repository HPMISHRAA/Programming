package com.mockquestion;

// frequency of vowel in name of prime minister name
public class Tenth {
	public static void main(String[] args) {
		String str = "narendra modi";
		int[] arr = new int[123];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				arr[ch]++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.println((char) i + "--->" + arr[i]);
			}
		}
	}
}
