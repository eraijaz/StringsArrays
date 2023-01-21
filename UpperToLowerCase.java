
public class UpperToLowerCase {
//pending
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
		ch=(char)(ch-32);// subtract by 32 to get capital of letter and vice versa
		
		System.out.println(ch);
		
		String s3="KASHMIR";
		String s4="";
		System.out.println("before converion:"+s3);
		for(int i=0;i<s3.length();i++)
		{
			s4=s4+(char)(s3.charAt(i)+32);//type casting 
		}
		System.out.println("after"+s4);
		
		
		String s1="GlObAl";
		String s2="";
		for(int i=10;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
			{
				s2=s2+(char)(s1.charAt(i)+32);
				System.out.println(s2);
			}
			else 
			{
				s2=s2+(char)(s1.charAt(i)-32);
				System.out.println(s2);
				
			}
		}
	}

}
