package Ejercicios_Strings_YO;

import java.util.Scanner;

public class Strings7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programa que lee una cadena y un carácter
		String cadena;
		char caracter;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		cadena = sc.nextLine();
		cadena = cadena.toUpperCase();
		System.out.println("Introduce el carácter para contar");
		caracter = sc.nextLine().charAt(0);
		caracter = Character.toUpperCase(caracter);
		for (int i = 0; i <= cadena.length() - 1; i++) {
			if (cadena.charAt(i) == caracter)
				contador++;
		}
		System.out.println("La cantidad de veces que aparece el caracter" + " " + caracter + " " + "son" + " "
				+ contador + " " + "veces");
	}
}
