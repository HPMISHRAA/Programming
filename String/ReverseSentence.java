package sideshsirprograming;

public class ReverseSentence {
	public static void main(String[] args) {
		String str = "HI how are you";
// (Split Method) will convert String, into (String Array)
		String[] st = str.split(" ");
		for (int i = st.length - 1; i >= 0; i--) {
			System.out.print(st[i] + " ");
		}
	}
}
