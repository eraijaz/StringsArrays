import java.util.Scanner;

public class RightPattern {

	public static void main(String[] args) {
		int row;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of rows");
		row= sc.nextInt();
		if (row<=10)
		
		{
		System.out.println("left pattern upper");
		int i,j;
		for(i=0;i<=row;i++)
			
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" * ");
			}
			
			
			System.out.println();
		}
	
		//System.out.println("left pattern lower");
	
	for(i=row-1;i>=0;i--) 
	{
		for(j=0;j<=i;j++)
		{
			System.out.print(" * "); 
		
		}
		System.out.println();
	}
	

	System.out.println("rightpattern increasing");
	
	
	// ------------------------right pattern---------------------------------


for(i=1;i<=row;i++)
{
	for(j=1;j<=row-i;j++)
	{
		System.out.print(".");
	}
	for(int k=1;k<=i;k++)
	{
		System.out.print(j);
	}
	System.out.println();
}


//System.out.println("Right pattern decreasing");

	for(i=row-1;i>=0;i--)
	{
		for(int k=1;k<=row-i;k++)
		{
			System.out.print(".");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		
		System.out.println();
	}

	}
		else
		{
			System.out.println("enter less than 11");
		}

	
	

	
	}
}





