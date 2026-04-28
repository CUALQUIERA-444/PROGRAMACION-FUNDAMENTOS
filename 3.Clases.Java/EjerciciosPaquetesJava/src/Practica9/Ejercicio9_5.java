package Practica9;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5. Programa que lee dos horas (horas y minutos) y nos dice los minutos
		 * transcurridos entre ambas.
		 */
		/*
		 * En este caso para ser algo más creativo Usaremos Duration ya que hablamos de
		 * minutos Necesitamos 2 strings y 2 LocalDateTime asi como la función Duration
		 * La idea es similar al ejercicio anterior pero cambiando algunos parametros
		 */
		String c1;
		String c2 = " ";
		DateTimeFormatter p = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime hora1;
		LocalTime hora2;
		int minutos;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce 2 horas y te diremos los minutos  de diferencia que hay entre ellas\n(Introduzca fin en alguno de los 2 si quiere terminar el programa) (Formato HH-mm)");
			c1 = sc.nextLine();
			if (!c1.equalsIgnoreCase("FIN")) {
				c2 = sc.nextLine();
				if (!c1.equalsIgnoreCase("FIN") || !c2.equalsIgnoreCase("FIN")) {
					hora1 = LocalTime.parse(c1,p);
					hora2 = LocalTime.parse(c2,p);
					if (hora1.isBefore(hora2)) {
						Duration d = Duration.between(hora1, hora2);
						minutos = (int)d.toMinutes();
					} else {
						Duration d = Duration.between(hora2, hora1);
						minutos = (int)d.toMinutes();
					}
					System.out.println("La cantidad de minutos entre estas 2 horas es de " + minutos + " minutos");
				}
			}
		} while (!c1.equalsIgnoreCase("FIN") && !c2.equalsIgnoreCase("FIN"));
	System.out.println("Gracias por ejecutarme");
	}
}
