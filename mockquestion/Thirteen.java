package com.mockquestion;
// count space in the definition of encapsulation
public class Thirteen {
	public static void main(String[] args) {
		String str = "declare data member as private restric direct axis outside the class";
		int no = count(str);
		System.out.println(no);
	}

	static int count(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {

			} else {
				count++;
			}
		}
		return count;
	}

}
