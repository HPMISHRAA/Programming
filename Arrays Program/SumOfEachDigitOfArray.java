package practice1;

public class SumOfEachDigitOfArray {
	public static void main(String[] args) {
		int[]arr= {1,25,33,20};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>9) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
		}

}
