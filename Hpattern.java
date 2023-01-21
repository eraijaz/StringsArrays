
public class Hpattern {

	public static void main(String[] args) {
		System.out.println("------A pattern---------");
		
		int n=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0&&j!=0&&j!=n-1||
						j==0&&i!=0 ||
						i==(n-1)/2	||
						j==n-1&& i!=0
						
						)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}

		//------------------ Hpattern--------------------
		System.out.println("------H pattern---------\n");
		
		//System.out.println();
		
		for (int i=0;i<n;i++)
			
		{
			{
				for(int j=0;j<n;j++)
				{
					if(j==0||j==n-1||i==(n-1)/2)
					{
					System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					
					}
					
				}
			}
			System.out.println();
		}
		
		System.out.println("------ X pattern---------\n");
		int x=20;
		for (int i=0;i<x;i++)
		{	
			
			for(int j=0;j<x;j++)
			{
				if(i==0||i==x-1||j==0||j==x-1||i==j||i+j==x-1||
					i+j==(x-1)/2||i-j==(x-1)/2||j-i==(x-1)/2||i+j==x+(x-1)/2
						
						)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------ X pattern---------\n");
		
		for (int i=0;i<x;i++)
		{	
			
			for(int j=0;j<x;j++)
			{
				if( i+j<=(x-1)/2||i-j>=(x-1)/2||j-i>=(x-1)/2||i+j>=x+(x-1)/2
						
						
						)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}

