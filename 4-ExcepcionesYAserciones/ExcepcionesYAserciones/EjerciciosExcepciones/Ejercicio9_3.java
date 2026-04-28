package EjerciciosExcepciones;
import java.util.*;
public class Ejercicio9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 3. Programa que lee números de teclado hasta anotar un 0 y calcula su media.
Usa excepciones para que si el usuario se equivoca al introducir un número se
muestre un error y se vuelva a pedir, también usa una excepción para controlar
la división por cero.
 */
/* Lógica y código necesario
 * La idea es ir leyendo números que mientras no se introduzca un 0 el programa vaya pidiendo 
 * números Usando la excepcion InputMismatchException controlamos que el usuario introduzca SOLO NÚMEROS
 * Una vez hecho todo esto teniendo la acumulación de todos los números 
 * Fuera del bucle hacemos el calculo de la media el cual se evita la división entre 0 ArithmethicException
 * Que solo puede suceder si no se introdujo un número previamente
 * Necesitamos 
 * 1 double para guardar los números del usuario  
 * 1 acumulador de tipo double para almacenar la suma de los números
 * 1 int para contar los números introducidos Divisor 
 * 1 int para almacenar el resultado de la media Considerando que con double la excepcion no funciona y la operacion 
 * por defecto siempre va a sacar int
 */
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	int media = 0;
	int divisor = 0;
	double acumulador = 0;
	double n_u = 1;
	do {
	System.out.println("Introduce números (Para terminar el programa y saber la media introduzca 0)");
	try {
	n_u = sc.nextDouble();
	if(n_u != 0) {
	divisor = divisor + 1;
	acumulador = acumulador + n_u;
	} 
	}
	catch (InputMismatchException e) {
		System.out.println("Error no es un número vuelva a intentarlo");
		sc.nextLine(); //Limpia el buffer para el siguiente número 
	}
	} while (n_u != 0);
		try {
			media = (int)acumulador / divisor; //Al usar double dividir entre 0 no reconoce la excepcion de dividir 
			//Si no que da infinito 
			System.out.println(media);
		}
		catch (ArithmeticException e) {
			System.out.println("Usted no introdujo ningun número por lo que no se puede calcular la media");
		}
		System.out.println("Gracias por ejecutarme");
	}
}
