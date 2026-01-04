package yo_fechas;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Fecha_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Metodo leer por separado
		int año = 0;
		int mes = 0;
		int dia = 0; // SIN VALORES
		int dia2 = 0;
		int mes2 = 0;
		int año2 = 0;
		DateTimeFormatter patron; // Declarar pat
		LocalDate fecha1 = null;
		LocalDate fecha2 = null;
		boolean validacion = false;
		Scanner sc = new Scanner(System.in);
		patron = DateTimeFormatter.ofPattern("d/MM/yyyy"); //
		do { // Hacer esto mientras validacion sea falso
			try {
				// Asigna valores a dia,mes y año si entra en el try
				System.out.println("Introduzca un año");
				año = sc.nextInt();
				System.out.println("Introduzca un mes");
				mes = sc.nextInt();
				System.out.println("Introduzca un día");
				dia = sc.nextInt();
				fecha1 = LocalDate.of(año, mes, dia);
				validacion = true;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Numero incorrecto");

			} catch (DateTimeException e) {
				System.out.println("Fecha incorrecta");

			}
		} while (validacion == false); // Necesario inicializar para comparar
		System.out.println("Fecha leida:" + patron.format(fecha1));
		do { // Hacer esto mientras validacion sea falso
			try {
				// Asigna valores a dia,mes y año si entra en el try
				System.out.println("Introduzca un segundo año");
				año2 = sc.nextInt();
				System.out.println("Introduzca un segundo mes");
				mes2 = sc.nextInt();
				System.out.println("Introduzca un segundo día");
				dia2 = sc.nextInt();
				fecha2 = LocalDate.of(año2, mes2, dia2);
				validacion = true;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Numero incorrecto");

			} catch (DateTimeException e) {
				System.out.println("Fecha incorrecta");
			}
		} while (validacion == false); // Necesario inicializar para comparar
		System.out.println("Fecha leida:" + patron.format(fecha2));
		if (fecha1.isBefore(fecha2)) {
			System.out.println("La primera fecha es " + patron.format(fecha1));
			System.out.println("La segunda fecha es " + patron.format(fecha2));
		} else {
			System.out.println("La primera fecha es " + patron.format(fecha2));
			System.out.println("La segunda fecha es " + patron.format(fecha1));
		}
	}
}
