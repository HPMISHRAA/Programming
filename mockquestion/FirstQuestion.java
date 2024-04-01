package com.mockquestion;

// input---->"L#$@!an124gua&*ge#%134"

//  output--->"egaugnaL";

public class FirstQuestion {
	public static void main(String[] args) {
		String str = "L#$@!an124gua&*ge#%134";
		str = reverse(str);
		System.out.println(str);
	}

	static String reverse(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				rev = rev + ch;
			}
		}
		return rev;
	}
}
