package com.twelve;

import java.util.Arrays;
import java.util.TreeSet;

// input { 1, 2, 4, 3 },{ 2, 3, 6, 5 }
// output [1,2,3,4,5,6]
public class MergeTheArraysWithoutDuplicateValue {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 4, 3 };
		int[] a2 = { 2, 3, 6, 5 };
		int[] a3 = new int[a1.length + a2.length];
		int j = 0;
		for (int i = 0; i < a1.length; i++) {
			a3[j] = a1[i];
			j++;
		}
		for (int i = 0; i < a2.length; i++) {
			a3[j] = a2[i];
			j++;
		}
		TreeSet t1 = new TreeSet();
		for (int no : a3) {
			t1.add(no);
		}
		System.out.println(t1);
	}
}
