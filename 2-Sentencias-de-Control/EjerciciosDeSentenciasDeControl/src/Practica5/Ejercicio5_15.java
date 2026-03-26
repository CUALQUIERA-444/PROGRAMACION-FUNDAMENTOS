package Practica5;

import java.util.Scanner;

public class Ejercicio5_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 15. Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de
dicho número.
		 */
		/*
		 * Lógica 
		 * La idea es simplemente imprimir en el bucle for de manera ordenada cada numero y mostrar su tabla de multiplicar del 0 al 10 
		 * Asi como validar que ningun numero entre esos 2 entre 
		 */
		/*
		 * Variables 
		 * 1 variable para guardar el numero del usuario 
		 * Otra para el bucle for 
		 * Otra para almacenar los productos 
		 */
		Scanner sc = new Scanner (System.in);
		int numero;
		System.out.println("Introduce un número y te mostraremos su tabla de multiplicar");
		numero = sc.nextInt();
		if(numero < 0 || numero > 10) {
			System.out.println("Lo siento tiene que ser entre 0 y 10");
		}
		else {
			for (int i = 0; i<=10;i++) {
				System.out.println(numero+" * "+i+" = "+(numero*i));
			}
		}
	}
}
