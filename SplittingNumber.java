import java.util.Scanner;

public class SplittingNumber {

	public static void main(String[] args) {
		int n;
		int d;
		Scanner sc = new Scanner( System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		
		while(n!=0)
		{
		d=n%10;
		n=n/10;
	//	System.out.println("ater division by 10:"+n);
		System.out.println("After mod operation :"+d);
		}
		
	}

}
