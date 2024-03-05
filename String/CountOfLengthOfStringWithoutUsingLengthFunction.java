package sideshsirprograming;

public class CountOfLengthOfStringWithoutUsingLengthFunction {
public static void main(String[] args) {
	String str="hello";
	char[]ch=str.toCharArray();
	int count=0;
	for(char c:ch) {
		count++;
	}
	System.out.println(count);
}
}
