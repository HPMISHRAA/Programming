package com.mockquestion;

public class Fifth {
	public static void main(String[] args) {
		String str = "vijayapura";
		print(str);

	}

	static void print(String str) {
		String st1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				if ((i + 1) <= str.length() - 1) {
					char ch1 = str.charAt(i + 1);
					if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
						System.out.print(str.charAt(i + 1));
					}
				}
			}
		}
	}
}
