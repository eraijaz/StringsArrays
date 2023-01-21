import java.util.Arrays;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		String s1="";
	
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first word");
		s1=sc.nextLine();
		s1=s1.replace(" ", "");
		
	 if (s1.length()!=26)
	 {
		System.out.println("not pangram"); 
	 }
	 else
	 {
		 for (char ch='a';ch<='z';ch++)
		 {
			if(s1.indexOf(ch)<0)
			{
				System.out.println("not pangram");
			}
			
		 }
		 System.out.println("pangram");
	 }
	}

}
