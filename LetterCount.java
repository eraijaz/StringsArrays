import java.util.Scanner;

public class LetterCount {

	  public static void main (String[] args)
	    {
	      Scanner s =new Scanner(System.in);
	      System.out.println("Enter The Word");
	      String value= s.next();
	      char a[]=value.toCharArray();
	      int count =1;
	      for (int i =0;i<a.length;i++)
	      {
	    	  if (a[i]!=' ')
	    	  {
	    		  for (int j=i+1;j<a.length;j++)
	    		  {
	    			  if(a[i]==a[j])
	    			  {
	    				  count++;
	    				  a[j]=' ';
	    			  }
	    		  }
	    		  System.out.println(a[i]+"-"+count);
	    		  count=count+1;
	    	  }
	      }
	}


}
