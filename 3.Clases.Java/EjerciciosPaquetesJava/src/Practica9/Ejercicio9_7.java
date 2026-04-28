package Practica9;
import java.time.*;
import java.util.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
public class Ejercicio9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 7. Lee la fecha de nacimiento
 *  de una persona y calcula su edad.
 */
/*
 * Lógica y código necesario
 * Necesitamos un string y un LocalDate para guardar la fecha de nacimiento de la respectiva persona 
 * El ejercicio es relativamente similar al anterior solo que al tener que calcular la edad pues tendremos que usar 
 * ChronoUnit
 * 1 String 
 * 1 LocalDate
 * 1 Formatter
 * 1 ChronoUnit con casting
 * 1 int para guardar los años totales y mostrarlos 
 */
	Scanner sc = new Scanner (System.in);
	String cadena_nac = "";
	LocalDate fecha_nac = null;
	int años;
	DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	while (!cadena_nac.equalsIgnoreCase("FIN")){
		System.out.println("Introduce tu fecha de nacimiento y determinaremos tu edad (Escriba fin para terminar el programa) (Formato dd/mm/yyyy)");
		cadena_nac = sc.nextLine();
		if(!cadena_nac.equalsIgnoreCase("FIN")) {
		fecha_nac = LocalDate.parse(cadena_nac, p);
		años = (int)Math.abs(ChronoUnit.YEARS.between(LocalDate.now(),fecha_nac));
		System.out.println("Usted tiene "+años+ " años");
		}
	}
	System.out.println("Gracias por ejecutarme ");
	}
}
