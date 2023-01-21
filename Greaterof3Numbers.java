import java.util.Scanner;

public class Greaterof3Numbers {

	public static void main(String[] args) {
		 for(int i=0;i<=20;i++)
		 {
			 if (i%2==0)
			 {
			 System.out.println("even numbers:"+i);
			 }
			 if (i%2!=0)
			 {
				 System.out.println("odd numbers:"+i);
			 }
			 
		 }

		//---------------leap year--------------------------
		 
		 
		 
		 int year,rem;
		 Scanner sc=new Scanner(System .in);
		 System.out.println("enter the year ");
		 year=sc.nextInt();
		 if(year%400==0 || year%4==0 && year%100!=0)
		 {
			 System.out.println("this is a leap year"+ year);
		 }
		 else
		 {
			System.out.println("not a leap year"+year); 
	
		}
	
	//-----------------lagest of three numbers___________
		 
		 
		 
	int num1,num2,num3;
	System.out.println("enters the three numbers");
	num1=sc.nextInt();
	num2=sc.nextInt();
	num3=sc.nextInt();
	 if(num1>num2 && num1>num3)
	 {
		 System.out.println( +num1+ "is grEATER");
	 }
	 if(num2>num1 && num2>num3)
	 {
		 System.out.println(+num2+ "is grEATER");
	 }
	 if(num3>num1 && num3>num2)
	 {
		 System.out.println( +num3+ "is grEATER");
	 }
	
	 if(num1==num2&&num2==num3&&num3==num1)
	 {
		 System.out.println("all NUMBER are equal");
	 }
	
	
	}

}
