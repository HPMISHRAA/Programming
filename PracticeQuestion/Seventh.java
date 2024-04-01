package practice1;

public class Seventh {
	public static void main(String[] args) {
		int no = 3746256;
		print(no);
	}

	static void print(int no) {
		String str = String.valueOf(no);
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length() - 1)+4);
	}
}
