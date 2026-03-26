package Practica5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2.Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que
se introduzca un 0.
		 */
		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.ENGLISH);
		final int validador = 0;
		double numero_usuario = 1;
		while(numero_usuario != 0 ) {
		System.out.println("Introduce un número \"Y validaremos si es positivo o negativo\"");
		numero_usuario = sc.nextDouble();
		if(numero_usuario < validador) {
			System.out.println("Es negativo");
		}
		else if(numero_usuario > validador){
			System.out.println("Es positivo");
		}
		else {
			System.out.println("Se termino");
		}
		}
	}
}
