package Practica5;

import java.util.Scanner;

public class Ejercicio5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se
han introducido.
		 */
		/* NOTAS 
		 * El cero se considera un numero neutro tanto en la matematica como en la programacion
		 */
		Scanner sc = new Scanner (System.in);
		int numero_usuario = 0;
		int contador = 0;
		while(numero_usuario >=0) {
		System.out.println("Introduce un numero y al final le mostraremos cuantos son en total");
		numero_usuario = sc.nextInt(); //Cambia el valor inmediatamente antes de empezar a evaluar
		if(numero_usuario >= 0)
		contador++;
	}
		System.out.println("La cantidad de números en total es de "+contador);
	}
}
