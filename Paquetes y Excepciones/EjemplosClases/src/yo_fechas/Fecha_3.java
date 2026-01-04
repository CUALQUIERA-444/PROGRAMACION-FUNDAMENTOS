package yo_fechas;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.*;

public class Fecha_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Leer una fecha por teclado (día, mes y año) y calcular la nueva fecha
		 * transcurridos un numero de días anotado por teclado.
		 */
		Scanner sc = new Scanner(System.in);
		boolean validacion = false;
		int dia = 0;
		int mes = 0;
		int numero_dias = 0;
		int año = 0;
		LocalDate fecha1 = null;
		DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			try {
				System.out.println("Introduce un dia");
				dia = sc.nextInt();
				System.out.println("Introduce un mes");
				mes = sc.nextInt();
				System.out.println("Introduce un año");
				año = sc.nextInt();
				fecha1 = LocalDate.of(año, mes, dia);
				System.out.println("Introduzca un número de dias para devolverte una fecha");
				numero_dias = sc.nextInt();
				validacion = true;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Introduzca datos validos");
			} catch (DateTimeException a) {
				System.out.println("No ha sido posible verificar la fecha vuelva a intentarlo");
			}
		} while (validacion == false);
		System.out.println("Fecha antigüa " + fecha1.format(p));
		fecha1 = fecha1.plusDays(numero_dias);
		System.out.println("Fecha nueva " + fecha1.format(p));
	}
}
