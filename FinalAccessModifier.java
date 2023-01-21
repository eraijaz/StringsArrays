
public class FinalAccessModifier {

	public static void main(String[] args) {
		final int a=10;
		int b=20;
		b++;
		//a++;
		System.out.println(a);
		System.out.println(b);
		final StringBuffer sb1=new StringBuffer("aijaz");
		sb1.append("ahmad");
		System.out.println(sb1);
		//sb1=new StringBuffer("aq");
		StringBuilder sb3=new StringBuilder();
		StringBuffer sb2=new StringBuffer();
		
		sb2.append("cdccfafafafd");
		System.out.println(sb2.capacity());
		sb3.append("zfafcsdvasfaf");
	
		System.out.println(sb3.capacity());//16 locations
	}

}



/*final can be applied at 3 levels
 * 	variable
 * 	class
 * 	 method level
 * 
 * 
 * if the variable is made final then the value for these variables cant be changed ,
 * if we try to change it would result in compileTime error
 * final variables woulld be resloved at the compile time only by the compiler.
 * 
 * **********final vs immutability*********
 * if the variable is refrence type and it is of mutable nature then as per
 *  its mutability nature
 * the object data can be changed , it would not result in CE
 * 
 * */
