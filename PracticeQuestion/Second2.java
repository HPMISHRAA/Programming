package practice1;
//input--->{1,2,3,4,5,6}
//output--->6 4 2 
public class Second2 {
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6};
		for(int i=arr.length-1;i>=0;i--)
		{
			if(i%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
