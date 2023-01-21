
public class VariablesJvm {
	int age;   //instance variable
	
	void show()
	{ 
		int id=0;
		
		System.out.println(age);
		System.out.println(id);
	}
	
	
	

	public static void main(String[] args) {
		VariablesJvm v=new VariablesJvm();
		v.show();

	}

}
