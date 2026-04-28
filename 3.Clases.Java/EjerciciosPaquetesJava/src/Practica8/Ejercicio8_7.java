package Practica8;

import java.util.Scanner;

public class Ejercicio8_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 7. Programa que lee una cadena y un carácter y cuenta el número de veces que
		 * aparece dicho carácter en la cadena.
		 */
		/*
		 * Lógica y Código La idea es que primero introducimos una cadena junto a un
		 * caracter para ver cuantas veces aparece dicho caracter tratando de omitir
		 * mayusuculas y minusculas y tildes esto lo haremos con un for que recorrera
		 * las posiciones de cada caracter y si la letra extraida es igual a la anterior
		 * entonces se suma a una variable llamada contador de letras que inicialmente
		 * vale 0. Evidentemente tambien necesitamos un char y un string para guardar el
		 * dato del usuario
		 */
		Scanner sc = new Scanner(System.in);
		String cadena;
		char caracter;
		int contador_letras = 0;
		System.out.println("Introduce una cadena");
		cadena = sc.nextLine();
		System.out.println("Introduce un caracter");
		caracter = sc.nextLine().charAt(0);
		String cadena_limpia = cadena.toUpperCase();
		for (int i = 0; i < cadena_limpia.length(); i++) {
			if (Character.toUpperCase(caracter) == cadena_limpia.replace("Á", "A").replace("É", "E").replace("Í", "I")
					.replace("Ó", "O").replace("Ú", "U").charAt(i)) {
				contador_letras++;
			}
		}
		System.out.println("En total se ha encontrado la letra " + caracter + " un total de " + contador_letras + " veces");
	}
}
