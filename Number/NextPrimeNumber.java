package number;

public class NextPrimeNumber {
public static void main(String[] args) {
	int no=6;
	for(int i=no+1;i<100;i++) {
		int no1=i;
		boolean flag=true;
		for(int j=2;j<no1;j++) {
			if(no1%j==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println(no1);
			break;
		}
	}
}
}
