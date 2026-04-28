package EjerciciosExcepciones;

import java.util.*;

public class Ejercicio9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1. Haced una función que lee un double, controlando que no anoten letras
		usando excepciones.
*/
/* Lógica y código necesario 
 * Básicamente con un do while para repetir la cantidad de números que el usuario pueda introducir 
 * Y usando una excepcion tipo InputMismatchException del paquete java.util controlar que no se introduzcan
 * letras o cualquier tipo de dato que no se un decimal numerico realmente
 * Tambien ejecutarlo mientras se introduzca mal el tipo de dato.
 * Usamos simplemente la lógica de hacer el bucle dependiendo de lo que el usuario 
 * quiera sin importar si lo introdujo bien o mal
 */
 Scanner sc = new Scanner (System.in);
 String continuar;
 double decimal_usuario;
    do {
  	try {
  	System.out.println("Introduce un número decimal ciñase a que sea decimal");
 	decimal_usuario = sc.nextDouble();
 	sc.nextLine(); //Limpia el buffer en caso de leer exitosamente el double
 	}
 	catch (InputMismatchException e) { //Cazar una excepcion no implica que el código de abajo no se ejecute a menos que ç
 		//Este controlado con un bucle
 		System.out.println("Error dato inválido");
 	sc.nextLine(); //Limpiar buffer para el siguiente número y leer el string
 	}
 	do {
 		System.out.println("Desea continuar (SI|NO)");
 		continuar = sc.nextLine();
 		if(!continuar.equalsIgnoreCase("SI") && !continuar.equalsIgnoreCase("NO")) {
 			System.out.println("Opcion invalida vuelva a intentarlo");
 		}
 	} while (!continuar.equalsIgnoreCase("SI") && !continuar.equalsIgnoreCase("NO"));
    } while (!continuar.equalsIgnoreCase("NO"));
 	System.out.println("Gracias por ejecutarme");
}
}
