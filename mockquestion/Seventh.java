package com.mockquestion;

// input--->"nothing is impossible";
// output--->"impossible is nothing";

public class Seventh {
	public static void main(String[] args) {
		String str = "nothing is impossible";
		str = reverse(str);
		System.out.println(str);
	}

	static String reverse(String str) {
		String rev = "";
		String[] arr = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			rev = rev + arr[i]+" ";
		}
		return rev;
	}
}
