package práctica5;
import java.util.Random;
import java.util.Scanner;
public class Ejericicio11_Profe_práctica5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int b = 100;
		int numero = 1; // Es ridiculo intentar almacenar un numero entero dentro de un double 
		for ( i = 0; i<100 ; i++) {
			numero = (int)(Math.random()*b); // La opción Math.random por defecto es double
											 // Los castings son funciones que cuentan como operaciones matematicas
			
			System.out.println(numero);
			if ( numero != 0) {
			 if ( numero % 2 == 0 )
				 System.out.println("Es par");
			 else if ( numero  % 2 != 0)
			 System.out.println("Es impar");
			}
			 else 
				 System.out.println("Nulo");
		}
	}

}
