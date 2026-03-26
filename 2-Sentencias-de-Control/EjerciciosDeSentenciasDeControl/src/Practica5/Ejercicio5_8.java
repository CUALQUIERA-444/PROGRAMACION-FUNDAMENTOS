package Practica5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 8. Pedir el salario de 10 empleados. Mostrar cuantos ganan más de 1000€.
		 */
		/*
		 * Lógica la idea es empezar desde el empleado 1 hasta llegar al empleado 10 con
		 * un bucle for Un condicional para indicar cuales ganan mas de 1000€ así como
		 * una variable para lleavar la cuenta de los empleados
		 */
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		int contador = 0;
		double salario;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Introduzca su salario empleado \"Empleado numero " + i + "\""); // Estructura para poner
																								// la variable entre
																								// comillas
			salario = sc.nextDouble();
			if (salario > 1000) {
				contador++;
			}
		}
		System.out.println("La cantidad de trabajadores que ganan más de 1000€ es de " + contador);
	}
}
