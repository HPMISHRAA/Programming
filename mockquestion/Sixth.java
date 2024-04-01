package com.mockquestion;
// replace vowel with '$' in your village name;
public class Sixth {
public static void main(String[] args) {
	String str="pator";
	str=replace(str);
	System.out.println(str);
}
static String replace(String str) {
	String st1="";
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			st1+='$';
		}
		else {
			st1+=ch;
		}
	}
	return st1;
}
}
