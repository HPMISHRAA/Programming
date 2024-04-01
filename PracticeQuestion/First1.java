package practice1;
// input--->{1,2,3,4,5}
// output--->5 3 1 
public class First1 {
	public static void main(String[] args) {
		int[]arr={1,2,3,4,5};
		for(int i=arr.length-1;i>=0;i--)
		{
			if(i%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
