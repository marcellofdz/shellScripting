import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

class Exercise8 

{

	public static void main(String[] args) throws FileNotFoundException 
	
	{	
		int vNum1 = Integer.parseInt(args[0]);
		if ((vNum1 == 0))
		{	
			File file = new File("err.txt");
			FileOutputStream fos = new FileOutputStream(file);
			PrintStream ps = new PrintStream(fos);
			System.setOut(ps);
			System.setOut(ps);
			System.out.println("Invalid input. Don't use 0. Try Again");
			System.exit(2);
		}

		
		else if (vNum1 < 0) 
		{	
			//System.out.println("Invalid input. Don't use negative numbers ["+ vNum1 +"]. Try Again");
	                File file = new File("err.txt");
	                FileOutputStream fos = new FileOutputStream(file);
	                PrintStream ps = new PrintStream(fos);
	                System.setOut(ps);
			System.setOut(ps);
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
