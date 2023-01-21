import java.util.Scanner;

public class MinAndMaxArray {

	public static void main(String[] args) {
		//int i=0;
		int arr[]=new int[5];
		int max=arr[0];
	    int pos=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
			
			if(arr[i]>max)
			{
				max=arr[i];
				pos=i;
				
			}
		}
		System.out.println("minimum element is :"+max+ "at position :"+pos);

	}

}
