package sideshsirprograming;

public class PalindromeOfString {
	public static void main(String[] args) {
		String str="LEvel";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		//equal method will not compare the uppercase and lowercase string
//		if(str.equals(rev)) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not palindrome");
//		}
//		if we want to ignore uppercase and lowercase comparison,then there is one method(equalsIgnoreCase)
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("its not a palindrome");
		}
	}
	}


