import java.util.Scanner;

public class TwoDimensioinalArray {

	public static void main(String[] args) {
		int a[][]=new int[2][3];
		Scanner sc=new Scanner(System.in);
		//a[0][2]=10;   use floors
		//a[0][3]=20;
			for(int i =0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.println("enter the marks of class:"+i+ "student" +j);
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println(" marks of students are");
			for(int i =0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					//System.out.println(" the marks of student :"+j+"of class" +i+"is"+a[i][j]);
					
				 System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
	}

}
