import java.util.*;

class Exercise6 

{

	public static void main(String[] args) 
	
	{	
		int vNum1 = Integer.parseInt(args[0]);
		if ((vNum1 == 0))
		{
			System.out.println("Invalid input. Don't use 0. Try Again");
			System.exit(2);
		}

		
		else if ((vNum1 < 0)) 
		{	
			System.out.println("Invalid input. Don't use negative numbers ["+ vNum1 +"]. Try Again");
			System.exit(2);
		}
		else if (vNum1 > 0)
		{	
			System.out.println("Good One [" + vNum1 + "].");
		
		}

		else 
		{
			System.out.println("Damn Bro, check this code, for some reason you have a error that you and I dont know.");
		}
}
}
//endLn
