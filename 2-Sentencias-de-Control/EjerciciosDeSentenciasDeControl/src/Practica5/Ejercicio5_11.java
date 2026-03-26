package Practica5;

import java.util.Scanner;

public class Ejercicio5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 11. Programa que lee 100 números y cuenta cuantos han sido pares, cuantos impares
y cuantos nulos
		 */
		/*
		 * Lógica 
		 * Para este ejercicio usaremos solo hasta 5 numeros siendo que si funciona con 5 funcionara con 100
		 * 
		 */
		/*
		 * Variables 
		 * Contadores para los 3 casos
		 * 2 enteros para armar las condiciones
		 */
		/*
		 * Sentencias de control 
		 * Un for y unos cuantos ifs
		 */
		/*
		 * Notas 
		 * Cuando hablamos de numeros nulos en este tipo de enunciados se suele hablar del 0 en sí
		 * No se toman en cuenta a los negativos como nulos
		 * Los negativos pueden ser pares o impares pero los decimales no
		 */
		Scanner sc = new Scanner(System.in);
		final int divisor = 2, cociente = 0, limite = 100;
		int numero_usuario;
		int contador_nulos = 0;
		int contador_pares = 0;
		int contador_impares = 0;
		for (int i=1;i<=limite;i++) {
			System.out.println("Introduce un numero y evaluaremos si es \"Si es par|impar o nulo\"");
			numero_usuario = sc.nextInt();
			if (numero_usuario == cociente) {
				contador_nulos++;
			}
			else if (numero_usuario % divisor == cociente) {
				contador_pares++;
			}
			else {
				contador_impares++;
			}
		}
		System.out.println("Recuento\n"+contador_nulos+" cantidad de nulos\n"+contador_pares+" cantidad de pares\n"+contador_impares+" cantidad de impares\n");
	}
}
