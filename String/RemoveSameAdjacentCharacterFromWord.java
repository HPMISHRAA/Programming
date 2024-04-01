package com.new1;

public class RemoveSameAdjacentCharacterFromWord {
	public static void main(String[] args) {
		String str = "hello";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length - 1; i++) {
			if (remove(ch[i], ch[i + 1])) {
				System.out.println(ch[i]);
			}
		}
		System.out.println(ch[ch.length - 1]);
	}

	static boolean remove(char c1, char c2) {
		if (c1 == c2) {
			return false;
		}
		return true;

	}
}