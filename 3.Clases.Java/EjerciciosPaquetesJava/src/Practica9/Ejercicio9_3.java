package Practica9;

import java.util.Scanner;
import java.time.*;
import java.time.format.*;

public class Ejercicio9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3. Leer una fecha por teclado (día, mes y año) y calcular la nueva fecha
		 * transcurridos un numero de días anotado por teclado.
		 */
		/*
		 * Lógica Básicamente necesitamos Leer una fecha por teclado y usando el metodo
		 * LocalDate.plus() Poner la nueva fecha Formato Bonito
		 */
		Scanner sc = new Scanner(System.in);
		String inicio;
		LocalDate fecha;
		DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		int numero_dias;
		do {
			System.out.println("Introduce una fecha \"Si quiere acabar el programa introduzca fin\"");
			inicio = sc.nextLine();
			if (!inicio.equalsIgnoreCase("FIN")) {
				fecha = LocalDate.parse(inicio, p);
				System.out.println("Introduce la cantidad de días que quiera para su nueva fecha");
				numero_dias = sc.nextInt();
				LocalDate nuevafecha = fecha.plusDays(numero_dias);
				System.out.println(nuevafecha.format(p));
				sc.nextLine();
			}
		} while (!inicio.equalsIgnoreCase("fin"));
		System.out.println("Gracias por ejecutar");
	}
}
