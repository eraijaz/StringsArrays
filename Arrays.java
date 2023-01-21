import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
		System.out.println("enter the marks of student " +i);
		a[i]=sc.nextInt();
		
      	}
		System.out.println("marks of students is as follows");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ,");
		}
	}

}
