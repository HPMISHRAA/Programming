package sideshsirprograming;

public class PrintPalindromeStringInSentence {
	public static void main(String[] args) {
		String str = "My Mom Said to Learn Malayalam but i am from Katak Place it is Located in Yaday district";
		String[] st = str.split(" ");
//		we can use (for each method also)
		for (int i = 0; i < st.length; i++) {
			if (st[i].length() > 2) {
				palindrome(st[i]);
			}
		}
	}

	static void palindrome(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equalsIgnoreCase(rev)) {
			System.out.println(s);
		}
	}
}
