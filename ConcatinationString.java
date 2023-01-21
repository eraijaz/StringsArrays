
public class ConcatinationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "telsuko";
		System.out.println(s1);
		s1.concat("ineuron");
		System.out.println(s1);
		String s2=s1.concat(" ineuron");
		System.out.println(s2);
		
		//-----or-----
		s1=s1.concat("classes");
		System.out.println(s1);
		
		
		String st1="telusko";
		String st2="ineuron";
		String st3="telusko"+"ineuron";
		String st4=st1+s2;
		String st5=s1.concat("ineuron");
		System.out.println(st3==st4);
		
		//differnce concat() and +
		//
	}

}
