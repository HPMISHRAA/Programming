package sideshsirprogramming;

public class StringUpcastingDowncastingConcept {
	public static void main(String[] args) {
		//----First scenario
		int no = 65,no1=97;   //output will be(A,a)
		char ch = (char) no1;
		char ch1 = (char) no;
		System.out.println(ch1);
		System.out.println(ch);
		
		int no2=97;     //output will be(e);
		char ch2=(char)(no2+4);
		System.out.println(ch2);
		
		//------Second scenario
	
		char ch5='A',ch6='a';    //output will be(65,101)
		int no5=(int)ch5;
		int no6=(int)(ch6+4);
		System.out.println(no5);
		System.out.println(no6);
		
		
		char ch7='a';
		System.out.println((char)(ch7+4));
	}
}
