package Ejercicios_Strings_YO;

import java.util.Scanner;

public class Strings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Nota todavia no sabemos validar si son europeas Sin hacer una condición
		 * excesivamente larga asi que cualquier cosa nos sirve MENOS NUMEROS
		 */
		Scanner sc = new Scanner(System.in);
		String ciudad_europea;
		char letra;
		int contador = 0;
		String continuar = "";
		System.out.println("Introduce una letra(Se validará para el siguiente apartado)");
		letra = sc.nextLine().charAt(0);
		char letra_m = Character.toUpperCase(letra);
		while (!continuar.equalsIgnoreCase("No")) // Hacemos esto ya que se va a ejecutar mientras lo que se ponga sea distinto de no
		{
			System.out.println("Introduce una ciudad europea");
			ciudad_europea = sc.nextLine(); // Cogemos la cadena
			ciudad_europea = ciudad_europea.toUpperCase(); // Convertimos la cadena a mayuscula
			char coger = ciudad_europea.charAt(0);
			if (letra_m == coger)
				contador++;
			do {
				System.out.println("Desea continuar Introduzca si o no");
				continuar = sc.nextLine();
			} while (continuar.equalsIgnoreCase("Si") == false && continuar.equalsIgnoreCase("No") == false);
		}
		System.out.println("En total las que empiezan por la letra" + " " + letra + " " + "son" + " " + contador);
	}
}
