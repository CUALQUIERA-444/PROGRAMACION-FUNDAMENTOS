package Practica5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 18. Programa que lee una secuencia 5 números y escribe cual ha sido el mayor.
		 */
		/* Lógica
		 * Se necesita una variable que vaya guardando el mayor y este inicialmente valdra 0 para que asi cualquier otro numero pueda tomar su posicion
		 * Un bucle for para leer precisamente 5 numeros partiendo desde el 1 
		 * Una variable para almacenar lo del usuario
		 */
		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.ENGLISH);
		double numero_usuario;
		double max = 0; //Se ìede extender para que sirva para numeros negativos
		for (int i = 1; i<=5; i++) {
			System.out.println("Introduce el numero "+i);
			numero_usuario = sc.nextDouble();
			if (i == 1) {
				max = numero_usuario;
			}
			else if(numero_usuario > max) { //Si es igual hay que evitar que pierda el tiempo operando
				max = numero_usuario;
			}
		}
		System.out.println("El mayor numero fue el "+max);
	}
}
