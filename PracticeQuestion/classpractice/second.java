package com.classpractice;
//input-String str = "a3b3c2d2";

//output-"aaabbccdd";

public class second {
	public static void main(String[] args) {
//		String str = "a3b3c2d2";
		String str="a10b11c13";
		for (int i = 0; i < str.length(); i = i + 2) {
			make(str.charAt(i), str.charAt(i + 1));
		}
	}

	static void make(char c1, char c2) {
		int no = (int) (c2 - 48);
		for (int i = 1; i <= no; i++) {
			System.out.print(c1);
		}
	}
}
