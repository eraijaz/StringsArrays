
public class StringBuilderStringBuffer {

	public static void main(String[] args) {
			//mutable
	  StringBuffer s1=new StringBuffer("sachin");
	  s1.append("tendullar");
	  System.out.println(s1);
	  //vs immutable
	  String s2=new String("aijaz");
	  s2.concat("reshi");
	  System.out.println(s2);
	  
	  String s3=new String("aijaz");
	  String s4=new String("aijaz");
	  System.out.println(s3.equals(s4));
	  System.out.println(s3==s4);
	  System.out.println(s3.compareTo(s4));
	  System.out.println("****** StringBUFFER********");
	  
	  StringBuffer sb1=new StringBuffer("aijaz");
	  StringBuffer sb2=new StringBuffer("aijaz");
	  System.out.println(sb1.equals(sb2));/*equals method is not available
										   in sb class, it is a part of  object
										    class so the implementation is coming 
										    from object class which compares the refrences not the data
										   */
	  
	  System.out.println(sb1==sb2);
	  
	}

}
/*


*/