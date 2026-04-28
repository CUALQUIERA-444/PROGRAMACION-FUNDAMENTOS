package EjerciciosExcepciones;
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.util.Scanner;

public class Ejercicio9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 2. Haced una función que lea una fecha en formato dd/mm/aa mientras sea
incorrecta.
*/
/* Lógica y código necesario
 * Básicamente usando un objeto de tipo LocalDate tenemos que validar que la fecha introducida sea correcta
 * Para esto lo que hacemos es usar un sc.nextLine(); Que lea el string y usar la excepcion
 * DateTimeParseException y si está mal se vuelve a ejecutar. 
 */
	Scanner sc = new Scanner(System.in);
	String cadena;
	DateTimeFormatter p  = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate fecha;
	boolean validar;
	do {
		System.out.println("Introduce una fecha (Formato dd/mm/aa)");
	try  {
		cadena = sc.nextLine();
		fecha = LocalDate.parse(cadena,p);
		validar = true;
		System.out.println(fecha.format(p));
	}
	catch (DateTimeParseException e){
		System.out.println("Error formato no valido vuelva a intentarlo");
		validar = false; //No es necesario limpiar el buffer si lo que se intenta validar implica leer una cadena
	}
	} while (validar == false);
	System.out.println("Gracias por ejecutarme");
	}
}