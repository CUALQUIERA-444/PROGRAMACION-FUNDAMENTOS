package yo_fechas;

import java.time.*;
import java.time.chrono.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Fecha_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4.Programa que lee dos fechas de teclado y nos dice cuántos días hay entre
		// ellas.
		Scanner sc = new Scanner(System.in);
		LocalDate fecha1_cast = null;
		LocalDate fecha2_cast = null;
		long dias;
		String fecha1;
		String fecha2;
		boolean validacion = false;
		DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			System.out.println("Introduce una fecha que quiera comparar (Inicio) (Año-mes-día)"); // Va a hacer esto
																									// mientras
																									// validacion sea
																									// falso
			fecha1 = sc.nextLine(); // Solo le digo que guarde el limpiador en una variable
			try {
				fecha1_cast = LocalDate.parse(fecha1);
				validacion = true;
			} catch (DateTimeParseException a) {
				System.out.println("No se ha podido validar la fecha introduzca datos válidos");
			}
		} while (validacion == false);
		do {
			System.out.println("Introduce una segunda fecha que quiera comparar (Fin) (Año-mes-día)");
			fecha2 = sc.nextLine();
			try {
				validacion = false;
				fecha2_cast = LocalDate.parse(fecha2);
				validacion = true;
			} catch (DateTimeParseException a) {
				System.out.println("No se ha podido validar la fecha introduzca datos válidos");
			}
		} while (validacion == false);
		if (fecha2_cast.isAfter(fecha1_cast))
			dias = ChronoUnit.DAYS.between(fecha1_cast, fecha2_cast); // (fecha_inferior,fecha_superior);
		else
			dias = ChronoUnit.DAYS.between(fecha2_cast, fecha1_cast);
		System.out.println("Su primera fecha " + fecha1_cast.format(p));
		System.out.println("Su segunda fecha " + fecha2_cast.format(p));
		System.out.println("Dias transcurridos entre ambas fechas " + dias);
	}
}
