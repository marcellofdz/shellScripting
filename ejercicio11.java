import java.util.*;

class Exercise11 
{
	public static void main(String[] args)
	{
		int vNum1 = Integer.parseInt(args[0]);
		
		 if ((vNum1 == 0) || (vNum1 < 0))
		{
		     System.out.println("Invalid input. Don't use "+ vNum1+ ". Try Again");
		     System.exit(2);
		}

		

		else if (vNum1 > 0) 
		{

	             System.out.println("");
	             for(int i = 1; i < (vNum1+1); i++)
		  
		  {  

		       System.out.println(i);

		  }   

                System.out.println("");

                } 
		
		else {
	                    System.out.println("\nInvalid input [" + vNum1 + "].\n");
	             }		    
			
	
	}





}
