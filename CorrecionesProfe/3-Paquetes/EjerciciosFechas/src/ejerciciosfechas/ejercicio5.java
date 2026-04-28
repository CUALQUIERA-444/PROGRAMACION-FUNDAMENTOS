package ejerciciosfechas;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ejercicio5 {

	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime hora1,hora2;

		sc = new Scanner(System.in);
		hora1=leerHora();
		hora2=leerHora();
		long minutos=ChronoUnit.MINUTES.between(hora1, hora2);
		System.out.println("Han trascurrido "+minutos+" minutos");

	}

	public static LocalTime leerHora() {
		int h, m;
		String horaS;
		LocalTime hora=null;
		boolean correcto = false;

		DateTimeFormatter patron = DateTimeFormatter.ofPattern("hh:mm");
		do {
			System.out.println("Introduce una hora en el formato: hh:mm");
			horaS = sc.nextLine();
			try {
				hora = LocalTime.parse(horaS);
				correcto = true;
			} catch (DateTimeParseException e) {
				System.out.println("Hora introducida incorrecta");
			}
		} while (correcto == false);
		return hora;

	}

}
