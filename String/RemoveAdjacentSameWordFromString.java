package com.new1;

public class RemoveAdjacentSameWordFromString {
	public static void main(String[] args) {
		String str = "hi hi how hi are are you you";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length - 1; i++) {
			if (remove(arr[i], arr[i + 1])) {
				System.out.println(arr[i]);
			}
		}
		System.out.println(arr[arr.length - 1]);
	}

	static boolean remove(String str, String str1) {
		if (str.length() != str1.length())
			return true;
		if (str.equals(str1)) {
			return false;
		} else {
			return true;
		}
	}
}