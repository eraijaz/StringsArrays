
public class ReverseSentenceWithPosition {

	public static void main(String[] args) {
		String s3="Think Twice";

		String s4="";
		String s5="";
		
		for(int i=s3.length()-1;i>=0;i--)
		{
			s4=s4+s3.charAt(i);
			
			
			
			
		}
		String a[]=s4.split(" ");
		for(int j=a.length-1;j>=0;j--)
		{
			s5=s5+a[j]+ " ";
		
		}
		System.out.println("Reverse of sentence"
				+ " while preserving the postion");
		System.out.println(s3);
		//System.out.println(s4);
		System.out.println(s5);

	}

}
