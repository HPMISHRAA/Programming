package com.mockquestion;

 //input--->"L!@ev432e#$8L$#";
//output--->"LeveL is palindrome"


public class SecondQuestion {
	public static void main(String[] args) {
		String str = "L!@ev432e#$8L$#";
		String str1 = remove(str);
		String str2 = palindrome(str1);
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println(str1 + " is palindrome");
		}
	}

	static String remove(String str) {
		String s1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				s1 = s1 + ch;
			}
		}
		return s1;
	}

	static String palindrome(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}
}
