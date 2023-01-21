
public class ForEachLoop {

	public static void main(String[] args) {
		int arr[][]= {{10,20,30,40},{40,5,60,90}};
		for(int n[]:arr)
		{
		
			for(int y:n) 
			{
			System.out.print(+y+"-");
			}
		}

	}

}
