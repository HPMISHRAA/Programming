package com.teset2;

import java.util.Arrays;
// input----->"HA@N!U$MA#N"
//output----->"NA@M!U$NA#H"
public class Five {
	public static void main(String[] args) {
		String str = "HA@N!U$MA#N";
		String s1 = str.replaceAll("[^A-Z]", "");
		char[] ch = str.toCharArray();
		int j = s1.length() - 1;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'z') {
				ch[i] = s1.charAt(j--);
				
			}
		}
		System.out.println(ch);
	}
}
