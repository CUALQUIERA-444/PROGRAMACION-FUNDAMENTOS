package Practica5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se
		 * introduzca un número negativo.
		 */
		/*
		 * Lógica La idea es ir leyendo el número mostrando posteriormente su cuadrado Y
		 * si el usuario introduce algo menor se termina Una variable que guarde el
		 * numero del usuario Y otra para que realice la operacion y la mostramos
		 */
		/*
		 * NOTAS El while por lo general siempre va a ejecutar una vez mas su codigo por
		 * que la comprobacion se hace al principio
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		double numero = 0;
		double operacion;
		// Siempre va a entrar por que el numero es cero y se ejecuta de todos modos si
		// le pones -1 de todas formas no se rompe seguira ejecutando lo que tenga
		// dentro
		// Hasta que vuelva al principio
		while (numero >= 0) {
			System.out.println("Introduce un numero \"Y le diremos su cuadrado\"");
			numero = sc.nextDouble();
			if (numero >= 0) {
				operacion = numero * numero;
				System.out.printf("Su cuadrado es %.2f\n", operacion);
			} else {
				System.out.println("Es negativo se termino");
			}
		}
	}
}
