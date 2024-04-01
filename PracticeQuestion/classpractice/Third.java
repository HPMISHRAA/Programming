package com.classpractice;
// input--->"i am going to my native place on coming sunday";

//output---> ---->9
//          a---->4
//          g---->3
//          i---->4
//          m---->3
//          n---->5
//          o---->4

public class Third {
	public static void main(String[] args) {
		String str = "i am going to my native place on coming sunday";
		int[] arr = new int[123];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[ch]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 2) {
				System.out.println((char) i + "---->" + arr[i]);
			}
		}
	}
}
