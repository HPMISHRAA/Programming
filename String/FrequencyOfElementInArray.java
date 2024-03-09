package sideshsirprogramming;

public class FrequencyOfElementInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 1, 5, 2, 8 };
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str = str + arr[i];   //converting array element into String
			
		}
		frequency(str);
	}

	static void frequency(String str) {
		int[] arr = new int[123];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[ch]++;

		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.println((char) i + "--->" + arr[i]);
			}
		}
	}
}