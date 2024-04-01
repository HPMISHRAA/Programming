package com.teset2;

import java.util.Arrays;
// input---->{ 1, 2, 0, 5, 0, 4, 0 },{ 7, 6, 3 }
// output--->[1, 2, 3, 4, 5, 6, 7]
public class Third {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 0, 5, 0, 4, 0 };
		int[] a2 = { 7, 6, 3 };
        int j=0;
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] == 0) {
				a1[i] = a2[j];
				j++;
			}

		}
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
	}
}