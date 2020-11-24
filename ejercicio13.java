import java.util.*;
import java.util.Scanner;

class Exercise13 

{

	public static void main(String[] args) 
	
	{
		Scanner vInput = new Scanner(System.in);
		System.out.print("Give me a number: ");
		int sqr = 0;
		String vNum1 = vInput.nextLine(); //usando el nuevo objeto tipo scanner capturamos lo que se escriba en teclado
		
		if ((vNum1 == null) || (vNum1.isEmpty()) )
		{
			System.out.println("Please put a valid name. Try Again");
		} 
		
		else {	
			int value1 = Integer.valueOf(vNum1);
		     	sqr = value1 * value1;
			System.out.println(sqr);
			vNum1 = vInput.nextLine();	    
		}
		
		System.out.println(sqr); 
		System.out.println("");

	
}
}
//endLn
