//Java Personal shell Hello
//Libreria que nos permite usar objetos scanner. Los objetos scanner nos permiten igresar datos por teclado
import java.util.*;

class HelloWorld 

{

	public static void main(String[] args) 
	
	{
		String nombre;
		
		//Invocamos un objeto scanner para ingresar datos desde el teclado
		Scanner vInput = new Scanner(System.in);

		System.out.print("Give me your name: ");

		nombre = vInput.nextLine(); //usando el nuevo objeto tipo scanner capturamos lo que se escriba en teclado
		
		//Comprobar que la variable nombre no este vacia o nula
		if ((nombre == null) || (nombre.isEmpty()) )
		{
			System.out.println("Please put a valid name. Try Again");
		} 
		
		else {	
			System.out.println("Hi " + nombre + "!");
		}
	
}
}
//endLn
