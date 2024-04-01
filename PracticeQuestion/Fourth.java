package practice1;
// input--->"hello mam how are you"
// output--->h--->2
public class Fourth {
	public static void main(String[] args) {
		String str = "hello mam how are you";
		frequency(str);

	}

	static void frequency(String str) {
		int[] arr = new int[123];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'h') {
				arr[ch]++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.println((char) i + "--->" + arr[i]);
			}
		}
	}

}
