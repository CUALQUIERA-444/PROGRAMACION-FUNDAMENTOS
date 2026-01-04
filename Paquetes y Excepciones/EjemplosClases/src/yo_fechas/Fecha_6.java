package yo_fechas;

import java.time.*;
import java.time.chrono.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Fecha_6 {
	// 6 Programa que lea tu fecha de nacimiento y diga el día de la semana (lunes,
	// martes, miércoles...).
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		boolean validacion = false;
		LocalDate fecha_nac = null;
		DayOfWeek dia_nac;
		String fecha_n;
		do {
			try {
				System.out.println("Introduce tu fecha de nacimiento (Año-mes-dia)");
				fecha_n = sc.nextLine();
				fecha_nac = LocalDate.parse(fecha_n);
				if (fecha_nac.isAfter(LocalDate.now())) {
				System.out.println("No se haga el chistoso");
					validacion = false;
				}
				else 
				validacion = true;
			} catch (DateTimeParseException e) {
				System.out.println("Lo siento vuelva a introducir su fecha de nacimiento");
			}
		} while (validacion == false);
		dia_nac = fecha_nac.getDayOfWeek();
		System.out.println("Su fecha de nacimiento es " + fecha_nac.format(p) + "\n"
				+ "Dia de la semana nacimiento (LETRA) " + dia_nac);
	}

}
