package ejemplosfechas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class EjemploFechas1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia,mes,año;
		LocalDate fecha = null,fecha2; //Las fechas son objetos y se inicializan a null
		boolean correcto = false;
		Scanner sc = new Scanner (System.in);
		
		do {
		System.out.println("Anota día");
		dia = sc.nextInt();
		System.out.println("Anota mes");
		mes = sc.nextInt();
		System.out.println("Anota año");
		año = sc.nextInt();
		try {
		fecha = LocalDate.of(año, mes, dia); //Si lo que tiene dentro se cumple ejecuta lo que está abajo.
		correcto = true;
		}
		catch (DateTimeException e) {
			System.out.println("Fecha leída incorrecta");
		}
		}
		while ( correcto == false);
		System.out.println("Fecha introducida correcta");
		fecha2 = fecha.plusDays(5);
		System.out.println("Cinco días después: "+fecha2);
		fecha2 = fecha.minusWeeks(2);
		System.out.println("Dos semanas antes:"+fecha2);
		//Compareto
		//Se compara fechas con IsAfter, isBefore, equals;
		
}
}
