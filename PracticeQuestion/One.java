package com.teset2;
//input---->"hello java how are you"
//output--->"Hello Java How Are You "
public class One {
	public static void main(String[] args) {
		String str = "hello java how are you";
		String str1[] = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			str1[i] = convert(str1[i]);
			System.out.print(str1[i] + " ");
		}

	}

	static String convert(String str) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {
				str1 += Character.toUpperCase(str.charAt(i));
			} else {
				str1 += str.charAt(i);
			}
		}
		return str1;
	}
}
