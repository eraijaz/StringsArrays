import java.util.Scanner;

public class InputArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("ENTER 10 DIGIT NUMBER :");
         for(int i=0;i<5;i++)
         {
        	 a[i]=sc.nextInt();
         }
         
	//TODO operations
         
         //output
         System.out.println("array elements are");
         
         for (int i=0;i<5;i++)
         {
        	 System.out.print(a[i]+",");
         }
	}

}
