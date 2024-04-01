package com.mockquestion;

// count consonant in your name
public class FourthQuestion {
	public static void main(String[] args) {
		int no = count("hari");
		System.out.println(no);
	}

	static int count(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

			} else {
				count++;
			}
		}
		return count;
	}
}
