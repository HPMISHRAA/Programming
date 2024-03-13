package com.practice;

public class SumOfSquareOfEachDigitOfNumber {
public static void main(String[] args) {
	int no=6499;
	no=sum(no);
	System.out.println(no);
}
static int sum(int no) {
	int sum=0;
	while(no!=0) {
		int rem=no%10;
		sum+=rem*rem;
		no=no/10;
	}
	return sum;
}
}
