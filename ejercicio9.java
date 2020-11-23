import java.util.*;

class Exercise9 

{

	public static void main(String[] args) 
	
	{	
		int vNum1;
		Scanner input = new Scanner(System.in);
		System.out.print("Give me a number: ");
		vNum1 = input.nextInt();

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

}
}
//endLn
