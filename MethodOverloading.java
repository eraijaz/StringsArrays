import java.util.Scanner;

class calc
{
	public int add(int num1,int num2,int num3)
	{
		int res3=num1+num2+num3;
		return res3;
	}
	public int add(int num1,int num2)//method overloading with different parameters
	{
		int res=num1+num2;
		return res;
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//take input from console
		System.out.println("enter number 1");
		int num1=sc.nextInt();
		System.out.println("enter number 2");
		int num2=sc.nextInt();
		System.out.println("enter number 3");
		int num3=sc.nextInt();
		
		//int num1=2, num2=6, num3=11;
		calc c=new calc();												//int res=add(num1,num2);
		int res=c.add(num1, num2);
		int res3=c.add(num1, num2,num3);
		System.out.println("sum of two numbers : "+res+"sum of 3 numbers:" +res3);/// concept of delegate____someone else to do job
		
		

	}

}
