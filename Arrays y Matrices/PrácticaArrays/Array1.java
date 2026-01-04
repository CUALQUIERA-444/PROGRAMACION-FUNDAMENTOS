package PrácticaArrays;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Leed 10 números en un array. Una vez leídos todos recorred el array y mostrad los
		que son pares, recorredlo de nuevo para mostrar los impares.
		*/
		Scanner sc = new Scanner (System.in);
		int numeros[] = new int[10];
		//Mostrar todo el array condicionado
		
		//1 Esto es para rellenar los datos en el array
		for  ( int i = 0; i <numeros.length; i++) {
		System.out.println("Introduce el número para rellenar los array");
		numeros[i] = sc.nextInt();
		}
		//2 Este otro es para mostrar los arrays
		for ( int a = 0; a <numeros.length;a++) {
		if ( numeros[a] % 2 == 0)
		System.out.println("pares "+numeros[a]);
		}
		
		//3 Rellenar el array de impares 
		for ( int b = 0; b<numeros.length; b++) {
		if ( numeros[b] % 2 != 0)
		System.out.println("impares "+numeros[b]);
		}
		
	}
}
