package com.teset2;
// input---->"I LOVE CODING"
//output---->"G NIDO CEVOLI"
public class Four {
	public static void main(String[] args) {
		String str = "I LOVE CODING";
		String str1 = str.replaceAll(" ", "");

		int j = str1.length() - 1;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				ch[i] = str1.charAt(j);
				j--;
			}
		}
		System.out.println(ch);
	}
}
