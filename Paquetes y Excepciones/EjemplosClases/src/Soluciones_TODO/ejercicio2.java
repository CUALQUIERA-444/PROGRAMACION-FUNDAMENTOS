package Soluciones_TODO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fecha1 = null, fecha2 = null;
		boolean correcto = false;
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/LL/yy");

		do {
			System.out.println("Anota fecha en formato dd/mm/aa:");
			String fecha1S = sc.nextLine();
			try {
				fecha1 = LocalDate.parse(fecha1S, patron);
				correcto = true;
			} catch (DateTimeParseException e) {
				System.out.println("Fecha incorrecta, vuelve a anotarla");
			}
		} while (!correcto);

		correcto = false;

		// Aplicar lo anterior a esta segunda fecha
		do {
			System.out.println("Anota fecha en formato dd/mm/aa:");
			String fecha2S = sc.nextLine();
			try {
				fecha2 = LocalDate.parse(fecha2S, patron);
				correcto=true;
			} catch (DateTimeParseException e) {
				System.out.println("Segunda fecha incorrecta");
			}
		} while (!correcto);

		if (fecha1.isBefore(fecha2))
			System.out.println(patron.format(fecha1) + "   " + patron.format(fecha2));
		else if (fecha2.isBefore(fecha1))
			System.out.println(patron.format(fecha2) + "   " + patron.format(fecha1));
		else
			System.out.println("Son iguales");

	}

}
