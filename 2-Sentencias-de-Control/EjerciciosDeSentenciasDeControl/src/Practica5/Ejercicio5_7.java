package Practica5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 7. Pedir números hasta que se introduzca uno negativo, y calcular la media.
		 */
		/*
		 * Lógica Necesitamos un contador para hallar el divisor Y un acumulador para
		 * que vaya acumulando la suma de todos los numeros
		 */
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		double numero_usuario;
		int contador = 0;
		double acumulador = 0;
		double media;
		do {
			System.out.println("Introduce un numero y una vez introduzca un número negativo hallaremos la media de sus números previos");
			numero_usuario = sc.nextDouble(); // El numero entra y si es mayor de 0 realiza las operaciones sin embargo
												// el problema esta en que al hacer
			// el contador cualquier numero mayor va a poder contribuir al contador
			if (numero_usuario >= 0) {
				acumulador = numero_usuario + acumulador; // Para que eso no pase usamos llaves
				contador++;
			}
		} while (numero_usuario >= 0);
		if (contador == 0) {
			System.out.println("No se introdujo ningun numero por lo que no hay media");
		} else {
			media = acumulador / contador;
			System.out.printf("La media de sus números es de %.2f ", media);
		}
	}
}
