package Practica5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5. Realizar un juego para adivinar un número. Para ello pedir un número N, y
		 * luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor
		 * con respecto a N. El proceso termina cuando el usuario acierta.
		 */
		/*
		 * Notas llamamos a la clase random creando un objeto de este mismo y usando el
		 * objeto Para almacenar el número aleatorio
		 */
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int a = r.nextInt(11); // Numero entre 0 y 10 para no complicarme mucho
		int numero_usuario;
		do {
			System.out.println("Adivina el número");
			System.out.println("Introduce un numero (Pista está entre 0 y 10)");
			numero_usuario = sc.nextInt();
			if (numero_usuario > a) {
				System.out.println("Es menor");
			} else if (numero_usuario < a) {
				System.out.println("Es mayor");
			} else {
				System.out.println("Correcto");
			}
		} while (numero_usuario != a);
	}
}
