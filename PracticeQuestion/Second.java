package com.teset2;

import java.util.Arrays;
//  input----->{ 1, 0, 2, 0, 3, 4, 0 }
//  output---->[1, 2, 3, 4, 0, 0, 0]
public class Second {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 3, 4, 0 };
		int[] a1 = new int[arr.length];
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				a1[j] =arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(a1));
	}
}
