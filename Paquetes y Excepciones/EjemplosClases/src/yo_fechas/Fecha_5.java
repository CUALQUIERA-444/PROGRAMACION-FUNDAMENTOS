package yo_fechas;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fecha_5 {
	// 5Programa que lee dos horas (horas y minutos) y nos dice los minutos
	// transcurridos entre ambas.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int horas;
		int horas2;
		int minutos;
		int minutos2;
		long minutos_transcurridos;
		LocalTime fecha1 = null;
		LocalTime fecha2 = null;
		boolean validacion = false;
		DateTimeFormatter p = DateTimeFormatter.ofPattern("HH/mm");
		do {
			try {
				System.out.println("Introduce una hora (Inicio)");
				horas = sc.nextInt();
				System.out.println("Introduce los minutos (Inicio)");
				minutos = sc.nextInt();
				fecha1 = LocalTime.of(horas, minutos);
				validacion = true;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Lo siento introduzca un dato númerico");
			} catch (DateTimeException a) {
				System.out.println("Lo siento no se pudo hacer la fecha vuelva a intentar con otros datos");
			}
		} while (validacion == false);
		validacion = false;
		do {
			try {
				System.out.println("Introduce una segunda hora (Fin)");
				horas2 = sc.nextInt();
				System.out.println("Introduce los minutos (Fin)");
				minutos2 = sc.nextInt();
				fecha2 = LocalTime.of(horas2, minutos2);
				validacion = true;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Lo siento introduzca un dato númerico");
			} catch (DateTimeException a) {
				System.out.println("Lo siento no se pudo hacer la fecha vuelva a intentar con otros datos");
			}
		} while (validacion == false);
		if (fecha1.isBefore(fecha2))
			minutos_transcurridos = ChronoUnit.MINUTES.between(fecha1, fecha2);
		else
			minutos_transcurridos = ChronoUnit.MINUTES.between(fecha2, fecha1);
		System.out.println("Primera fecha " + fecha1.format(p));
		System.out.println("Segunda fecha " + fecha2.format(p));
		System.out.println("Minutos transcurridos " + minutos_transcurridos);
	}
}
