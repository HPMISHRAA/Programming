package com.classpractice;
// input--->"a10b11c13";
// output--->"aaaaaaaaaabbbbbbbbbbbccccccccccccc";
public class Four {
	public static void main(String[] args) {
		String str = "a10b11c13";
		String s1 = str.replaceAll("[0-9]", "");
		String s2 = str.replaceAll("[a-z]", " ");
		String[] arr = s2.split(" ");
		for (int i = 1; i < arr.length; i++) {
			print(s1.charAt(i - 1), arr[i]);
		}

	}

	static void print(char ch, String st) {
		int no = Integer.parseInt(st);
		for (int i = 0; i < no; i++) {
			System.out.print(ch);
		}
	}
}
