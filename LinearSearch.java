
public class LinearSearch {
	public static void main(String[] args)
	{
		int a[]= {20,30,10,40,50};
		int key=35;
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				System.out.println("key found at index :" +i);
				System.exit(0);
			}
			
			
		}
		System.out.println("key not found");
		
	}

}
