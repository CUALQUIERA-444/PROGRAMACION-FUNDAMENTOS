package Practica5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 10. Programa que lee una secuencia de notas (0 – 10) terminada al introducir
		 * –1 y cuenta el nº de suspensos, aprobados, notables y sobresalientes. Validar
		 * que las notas introducidas sean correctas.
		 */
		/*
		 * Lógica secuencia de notas entre el 0 al 10 que termina al introducir -1
		 * (Incluye decimales) Variables Un contador para los suspensos Un contador para
		 * los aprobados Un contador para los sobresalientes Un condicional que evite
		 * que las notas se salgan del rango
		 */
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		final int acabar = -1;
		int contador_suspensos = 0;
		int contador_aprobados = 0;
		int contador_notables = 0;
		int contador_sobresalientes = 0;
		double nota;
		do {
			System.out.println("Introduce una nota");
			nota = sc.nextDouble();
			if ((nota < 0 || nota > 10)&& nota != acabar) {
				System.out.println("Su nota no se puede evaluar");
			} else if (nota == acabar) { //Recomendable que los resultados al finalizar se muestren abajo pero funciona aca
				System.out.println("Se termino aca los resultados\nSuspensos " + contador_suspensos
						+ " alumnos \nAprobados " + contador_aprobados + " alumnos \nNotables " + contador_notables
						+ " alumnos \nSobresalientes " + contador_sobresalientes + " alumnos ");
			} else if (nota < 5) {
				contador_suspensos = contador_suspensos + 1;
			} else if (nota < 7) {
				contador_aprobados = contador_aprobados + 1;
			} else if (nota < 9) {
				contador_notables = contador_notables + 1;
			} else {
				contador_sobresalientes = contador_sobresalientes + 1;
			}
		} while (nota != acabar);
	}
}
