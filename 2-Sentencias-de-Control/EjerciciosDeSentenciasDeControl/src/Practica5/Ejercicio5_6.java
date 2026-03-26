package Practica5;

import java.util.Scanner;

public class Ejercicio5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 6. Programa que va leyendo números desde teclado y calcula la suma de todos ellos.
El programa finaliza cuando el número leído es 0.
		 */
		/* Logica 
		 * La idea es usar un acumulador que se encarge de decirme por cada operacion la suma de cada numero introducido
		 */
		int numero = 1;
		int acumulador = 0;
		Scanner sc = new Scanner(System.in);
		while(numero !=0) {
			System.out.println("Introduce un número y te ire diciendo la suma de cada numero que introduzcas");
			numero = sc.nextInt();
			if(numero != 0) {
				acumulador = numero + acumulador;
				System.out.println("Suma por numero "+acumulador);
			}
		}
		System.out.println("Calculo total "+acumulador);
	}
}
