package com.mockquestion;

// input---->"money is happiness";
// output---->"yenom si ssenippah";
public class Eighth {
	public static void main(String[] args) {
		String str = "money is happiness";
		String rev = "";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			rev += reverse(arr[i]) + " ";
		}
		System.out.println(rev);
	}

	static String reverse(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}
}
