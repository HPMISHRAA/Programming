package number;

public class PrimeNumber {
	public static void main(String[] args) {
		int no = 5;
		boolean flag = true;
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(no + " is prime number");
		} else {
			System.out.println(no + " is not a prime number");
		}
	}
}
