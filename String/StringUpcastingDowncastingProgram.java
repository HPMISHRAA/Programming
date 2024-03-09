package sideshsirprogramming;
//----------Input "hello"
//----------Output "lipps"
public class StringUpcastingDowncastingProgram {    
public static void main(String[] args) {
	String str="hello";
	for(int i=0;i<str.length();i++) {
		//---------1st way------
		char ch=(str.charAt(i));     
//		System.out.print((char)(ch+4));
		
		//---------2nd way------
		
		typecasting(str.charAt(i));
	}
}

public static void typecasting(char ch1) {
	System.out.print((char)(ch1+4));
}
}


