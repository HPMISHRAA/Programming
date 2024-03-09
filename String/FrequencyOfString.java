package sideshsirprogramming;

public class FrequencyOfString {
	public static void main(String[] args) {
		String str = "aabbccdd";
		int[] arr = new int[123]; // it will create integer array of length (123)
		for (int i = 0; i < str.length(); i++) { // fetching each character of String
			char ch = str.charAt(i); // Storing character in variable
			arr[ch]++; // generally we are writing arr[i], so instead of (i) we are passing (ch)
						// variable that will implicitly convert into integer value that will be the asci value of respective character
		} // and there will be increase by 1
			
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 1) {
				System.out.println((char) i + "--> " + arr[i]);
			}
		}
	}
}
