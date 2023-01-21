
public class JavaString 
{

	public static void main(String[] args)
	{
		String str ="telusko";
		System.out.println(str);
		String str1=new String("telusko");
		System.out.println(str1);
		
		String s1="alian";//meemory allocated in MCP
		String s2="alian";
		String s3= new String("alian");// m.m in heap
		String s4 =new String("Alian");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s2.equalsIgnoreCase(s4));
		System.out.println(s2.compareTo(s4));
		
		
	}

}


/*strings are enclosed within " "
 * two types
 * immutable:cant be changed once it is created
 * 1. String str="alian"
 * String str=new str("alian")
 * char c[]={a,l,i,a,n} ------> string str=new str(c);
 * 
 * mutable: can be changed with the help of classes >stringBuffer and StringBuilder
 *  
 *  string constant pool <:no duplicate values are allowed
 *  heap:duplicate values are allowed
 * == compares the refrence or the address held by object
 * equals()compare the values 
 * equalsIgnorecase() compare the values irrespective of case sensitivity
 * CompareTo() will return 0 +ve -ve   compare character byy character subtracts
 *  ascii value of string
 * 
 *  */


