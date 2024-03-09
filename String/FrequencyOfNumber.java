package sideshsirprogramming;

public class FrequencyOfNumber {
public static void main(String[] args) {
	int no=12123142;
	String s1=String.valueOf(no);   //converting number into String
	int [] arr=new int[123];
	for(int i=0;i<s1.length();i++) {
		char ch=s1.charAt(i);
		arr[ch]++;
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>0) {
			System.out.println((char)i+"---->"+arr[i]);
		}
	}
}
}
