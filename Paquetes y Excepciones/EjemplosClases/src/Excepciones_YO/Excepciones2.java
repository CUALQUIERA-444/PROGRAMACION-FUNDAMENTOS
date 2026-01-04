package Excepciones_YO;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.*;
import java.util.Scanner;

public class Excepciones2 {
	static Scanner sc;
	static DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yy");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Haced una función que lea una fecha en formato dd/mm/aa mientras sea
		 * incorrecta.
		 */
		LocalDate fecha_pholder;
		sc = new Scanner(System.in);
		fecha_pholder = Validar_fecha();
		System.out.println("Su fecha es " + fecha_pholder.format(p));
	}

	public static LocalDate Validar_fecha() {
		String f_p;
		LocalDate f_p2 = null;
		boolean validacion = false;
		do {
			System.out.println("Introduce la fecha formato (dd/MM/yy)");
			f_p = sc.nextLine();
			try {
				f_p2 = LocalDate.parse(f_p, p);
				validacion = true;
			} catch (DateTimeParseException e) {
				System.out.println("Introduce una fecha válida");
			}
		} while (validacion == false);
		return f_p2;
	}
}
