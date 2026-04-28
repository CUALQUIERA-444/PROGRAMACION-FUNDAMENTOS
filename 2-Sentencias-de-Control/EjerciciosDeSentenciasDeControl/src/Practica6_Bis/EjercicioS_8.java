package Practica6_Bis;

import java.util.Scanner;

public class EjercicioS_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 8. Programa que dado un número, en este caso el 5, imprima lo siguiente
 * 5 5 5 5 5
	4 4 4 4
	  3 3 3
		2 2
		  1
 */
/*
 * Lógica La idea es hacer un programa que imprima un numero la cantidad de veces indicada asi como añadir un espacio para un simulador de escalera
 * Necesitamos 3 for uno que recorra el número otro que imprima el espacio por salto y un último que imprima el número una cierta cantidad de veces 
 * 
 */
/* Variables sentencias de control funciones etc..
 * Un int que guarde el número del usuario 
 * Un for que recorra dicho número de forma inversa
 * Un for que por cada vez que se termine una vuelta imprima un espacio para el siguiente número este número estará determinado por lo siguiente
 * Empezara en 0 por que en un principio no tendría que imprimir un espacio pero posteriormente si y dicho espacio quedara determinado por la resta del 
 * primer numero ha recorrer por ejemplo en este caso 5 - 5 = 0 En este caso por que no tiene que imprimir nada el primer numero es fijo que seria el del usuario
 * - el número en el que se encuentra en este momento el bucle
 */
	Scanner sc = new Scanner (System.in);
	int n_u;
	System.out.println("Introduce un número");
	n_u = sc.nextInt();
	for (int i = n_u; i>=1;i--) { // i = 5 
	for (int j = 0; j<n_u-i;j++) { //j = 0 < 0 No j = 0 < 1 si dibuja un espacio para que funcione tiene que ser doble
		System.out.print("  ");
	}
	for (int k = 0; k<i;k++) {
		System.out.print(i+" ");	
	}
	System.out.println(""); //Al final para que solo se ejecute una vez acabe de escribir los numeros
	}
}
}
