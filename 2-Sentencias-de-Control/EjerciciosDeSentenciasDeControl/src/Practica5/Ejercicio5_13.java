package Practica5;

import java.util.Scanner;

public class Ejercicio5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 13. Programa que lee un número y escribe todos los anteriores a él
		 */
		/*
		 * Lógica Este ejercicio por lo general se suele utilizar un bucle for para
		 * resolverlo Usando la filosifia de que todos los números son infinitos este
		 * ejercicio sería imposible Pero nosostros vamos a poner un límite que se podrá
		 * ir cambiando en función del número mínimo al que se quiera llegar
		 */
		/*
		 * Variables Y Sentencias de control Un bucle for para ir hacia atras Una
		 * variable para que el usuario pueda introducir el numero que desee contar
		 * hacia atras Otra variable que determina el límite al contar hacia atrás
		 */
		Scanner sc = new Scanner(System.in);
		final int limite = 1;
		int numero_usuario;
		System.out.println(
				"Introduce un numero y \"te mostraremos los numeros anteriores a este hasta llegar a " + limite + "\"");
		numero_usuario = sc.nextInt();
		for (int i = numero_usuario-1; i >= limite; i--) { //Para que el numero introducido no salga le restamos i al numero_usuario
			numero_usuario = i; //Valor machacado
			System.out.println("Cuenta atrás " + numero_usuario);
		}
	}
}
