package com.teset2;

import java.util.Arrays;
// input--->{ 1, 0, 2, 0, 3, 4, 0 }
// output-->[0, 0, 0, 1, 2, 3, 4]
public class First {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 3, 4, 0 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
