
public class RepeatedlyOccuringCharacters {

	public static void main(String[] args) {
		String s1="hello boys";
		s1=s1.replace(" ","");
		String s[]=s1.
		int j=0;
		int count=0;
		for(char i='a';i<='z';i++)
		{
			if (i==s1.charAt(i))
			{
				j=i;
				count++;
			}
		}
		System.out.println("occurance of "+j+":"+count);
		

	}

}
