package com.mockquestion;

//input---->"hello";
//output---->"lipps";
public class Twelve {
	public static void main(String[] args) {
		String str = "hello";
		str = nthOutput(str);
		System.out.println(str);
	}

	static String nthOutput(String str) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			str1 = str1 + ((char) (ch + 4));
		}

		return str1;
	}
}
