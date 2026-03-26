package Practica6;

import java.util.Scanner;

public class Ejercicio6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Programa que lee una secuencia de 50 letras y escribe el número de veces que se repite la
primera de ellas.
 */
		/*
		 * Notas lógica de si funciona con 5 10 ... entonces funciona con 50
		 */
/*
 * Lógica 
 * Hay que guardar la primera letra e ir comparandola con las demás que salen y con contador mostrar la cantidad de veces que se repite esta letra
 */
		/*
		 * Variables 
		 * letra_usuario (char)
		 * Contador para ir acumulando las veces que se repite la primera letra
		 * Un char para guardar la primera letra escrita 
		 * Aca vamos a comprobar si Java y sus algoritmos/herramientas por default es case sensitive
		 */
	Scanner sc = new Scanner (System.in);
	final int limite = 5;
	char letra_usuario;
	char primera_letra = 'a';
	int contador = 0;
		for (int i = 1; i<=limite; i++) {
			System.out.println("Introduce la letra numero "+i);
			letra_usuario = sc.nextLine().charAt(0); //Es case Sensitive sabe diferenciar entre mayus y minus por este ejercicio lo trataremos como entidades distintas
			if( i == 1) {
				primera_letra = letra_usuario;
			}
			if (letra_usuario == primera_letra) {
				contador++;
			}
		}
		System.out.println("La cantidad de veces que se repite la primera letra es de "+contador);
	}
}
