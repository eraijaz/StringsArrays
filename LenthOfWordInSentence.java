import java.util.Scanner;

public class LenthOfWordInSentence {

	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s=sc.nextLine();
		s=s+" ";
		int j=0;
		for (int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			if(c==' ')
			{
				String word=s.substring(j,i);
				System.out.println(word +" --"+word.length());
				j=i++;
			}
		}

	}

}
