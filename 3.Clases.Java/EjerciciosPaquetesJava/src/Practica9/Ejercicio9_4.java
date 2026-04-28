package Practica9;

import java.util.Scanner;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
public class Ejercicio9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 4. Programa que lee dos fechas de teclado
 *  y nos dice cuántos días hay entre ellas.
 */
/* Lógica y código necesario
 * Necesitamos con dos fechas parseadas y puestas bonitas que se nos diga los días exactos que hay entre ellas 
 * Para esto usamos el método ChronoUnit para que nos diga los días que hay exactos entre esas 2 fechas
 * Se requiere de un bucle que vaya preguntando mientras quiera seguir introduciendo el usuario 
 * Así como de ChronoUnit 
 * 2 Strings iniciales
 * 2 LocalDates 
 * 1 casting para el ChronoUnit 
 * 1 entero para guardar los días
 */
	String c1;
	String c2 = " ";
	DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate fecha1;
	LocalDate fecha2;
	int dias;
	Scanner sc = new Scanner (System.in);
	do {
	System.out.println("Introduce 2 fechas y te diremos los días de diferencia que hay entre ellas\n(Introduzca fin en alguno de los 2 si quiere terminar el programa)");
	c1 = sc.nextLine();
	if(!c1.equalsIgnoreCase("FIN")) {
	c2 = sc.nextLine();
	if(!c1.equalsIgnoreCase("FIN")||!c2.equalsIgnoreCase("FIN")) {
		fecha1 = LocalDate.parse(c1,p);
		fecha2 = LocalDate.parse(c2,p);
		if (fecha1.isBefore(fecha2)) {
		dias = (int)ChronoUnit.DAYS.between(fecha1, fecha2);
		}
		else {
		dias = (int)ChronoUnit.DAYS.between(fecha2, fecha1);
		}
		System.out.println("La cantidad de dias entre estas 2 fechas es de "+dias+" dias");
	}
	}
	} while (!c1.equalsIgnoreCase("FIN")&&!c2.equalsIgnoreCase("FIN"));
	}
}
