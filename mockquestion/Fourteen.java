package com.mockquestion;

//input----> count "one" in the given String
//output--->(5)
public class Fourteen {
	public static void main(String[] args) {
		String str = "One-one was a race horse. Two-two was one too. One-one won one race. Two-two one too";
		int no = count(str);
		System.out.println("one repeated " + no + " times");
	}

	static int count(String str) {
		String st1 = "one";
		int count = 0;
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String st = arr[i];
			if (st.equalsIgnoreCase(st1)) {
				count++;
			} else {
				if (st.contains(st1)) {
					count++;
				}
			}
		}
		return count;
	}
}
