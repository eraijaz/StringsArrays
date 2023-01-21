import java.util.Scanner;

public class StringsFirstChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the text");
		String s=sc.nextLine();
		s=s.trim();                                     // remove extra spaces
		String f="";                                       //final string
		s=" "+s;                                   // intialize the string with a space
		for(int i=0;i<s.length();i++)
		{
			if (s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				f=f+Character.toUpperCase(s.charAt(++i)) +".";
			}
		}
		System.out.println(f);
		
	}

}
