package Practica5;

import java.util.Scanner;

public class Ejercicio5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 14. Programa que lee un número y escribe todos los pares anteriores a él
		 */
		/*
		 * Lógica 
		 * Es lo mismo que el 13 pero añadiendo una condicional para verificar la condición de los pares con i % 2 == 0
		 * Por ende las variables sería añadir solo una mas para almacenar el divisor y quizas el resto pero esto es OPCIONAL
		 */
		Scanner sc = new Scanner(System.in);
		int numero_usuario;
		final int limite = -10, resto = 0, divisor = 2;
		System.out.println("Introduce un numero \"Y le diremos todos los pares anteriores a este hasta llegar a "+limite+"\"");
		numero_usuario = sc.nextInt();
		for (int i = numero_usuario-1; i>=limite; i--) {
			if(i % divisor == resto && i!=resto) {
				System.out.println("Pares anteriores "+i);
			}
		}
	}
}
