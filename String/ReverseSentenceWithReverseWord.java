package sideshsirprograming;

public class ReverseSentenceWithReverseWord {
// Input----" Hi how are you"
//	Output---"uoy era woh iH"
	public static void main(String[] args) {
		String str="Hi how are you";
		String [] st=str.split(" ");
		for(int i=st.length-1;i>=0;i--) {
			reverse(st[i]);
		}
	}
	static void reverse(String st1) {
		String rev="";
		for(int i=st1.length()-1;i>=0;i--) {
			rev=rev+st1.charAt(i);
		}
		System.out.print(rev+" ");
	}
}
