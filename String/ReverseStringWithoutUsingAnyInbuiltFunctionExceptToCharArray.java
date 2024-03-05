package sideshsirprograming;
// reverse a program to reverse a string without using any inbuilt function except (toCharArray)
// in this case we will use (for each method)

public class ReverseStringWithoutUsingAnyInbuiltFunctionExceptToCharArray {
	public static void main(String[] args) {
		String str = "hari";
		char[] ch = str.toCharArray();
		String rev = "";
		for (char c : ch) {
			rev = c + rev;
		}
		System.out.println(rev);

	}
}
