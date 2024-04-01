package com.new1;

public class CheckStringPalindromeWithoutUsingEqualsMethod {
	public static void main(String[] args) {
		String str = "level";
		if (palindrome(str)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}

	static boolean palindrome(String str) {
		char[] arr = str.toCharArray();
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (arr[i] != arr[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
