package Practica5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 12. Programa que lee las notas en programación de esta clase y cuenta el nº
		 * de aprobados
		 */
		/*
		 * Lógica tenemos que leer las notas de programación de mi clase somos 30 pero
		 * como la clase en cuanto a alumnos Suele estár en un estado cuestionable pues
		 * haremos un random que vaya entre 1 y 30 Minimo son 20 maximo 30
		 */
		/*
		 * Variables Contar el número de aprobados consistira en aquellos que superen el
		 * 5 Se imprimira al final el numero de aprobados
		 */
		int alumno = (int) (Math.random() * 11) + 20; // Math.random excluye el ultimo valor //Entre 0 y 10 //+20 =
														// Entre 20 y 30 La suma permite que tambien entre el maximo
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		double nota;
		int contador_aprobados = 0;
		System.out.println("Hoy han venido "+alumno+" a clase");
		for (int i = 1; i <= alumno; i++) {
			System.out.println("Introduce tu nota");
			nota = sc.nextDouble();
			if (nota < 0 || nota > 10) {
				System.out.println("Esa nota no es válida vuelva a introducirlo");
				i--;
			} else if (nota >= 5) {
				contador_aprobados++;
			}
		}
		System.out.println("La cantidad de alumnos que han aprobado es de " + contador_aprobados + " alumnos");
	}
}
