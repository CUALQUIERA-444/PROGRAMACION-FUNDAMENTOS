package Practica5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par
		 * o impar.
		 */
		/*
		 * Lógica usar los módulos % 2 Par resto = 0 Impar resto != 0
		 *  Los numeros decimales no son impares ni pares
		 *  Los numeros negativos siguen la misma logica que los numeros enteros 
		 */
		Scanner sc = new Scanner(System.in);
		final int divisor = 2;
		int numero = 1;
		while (numero != 0) {
			System.out.println("Introduce un numero \"Y le diremos si es par o impar\"");
			numero = sc.nextInt();
			if (numero % divisor == 0 && numero != 0) { // Evitar que el cero entre
				System.out.println("Es Par");
			} else if (numero % divisor != 0) {
				System.out.println("Es Impar");
			} else {
				System.out.println("Es 0 se termino");
			}
		}
	}
}
