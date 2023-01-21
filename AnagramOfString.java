import java.util.Arrays;
import java.util.Scanner;

public class AnagramOfString {

	public static void main(String[] args) {
		String s1="";
		 String s2="";
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first word");
		s1=sc.nextLine();
		System.out.println("enter 2nd word");
		s2=sc.nextLine();
		
		
	 
	 char a[]=s1.toCharArray();
	 char b[]=s2.toCharArray();
	 Arrays.sort(a);
	 Arrays.sort(b);
	 Boolean res=Arrays.equals(a,b);
	 if(res==true)
	 {
		 System.out.println("Strings "+s1+ " and"+" " +s2+" " +"are Anagram");
	 }
	 else
	 {
		 System.out.println("Strings are Anagram");
	 }
	} 
}


