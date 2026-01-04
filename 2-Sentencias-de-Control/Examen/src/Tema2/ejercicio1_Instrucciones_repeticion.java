package Tema2;

import java.util.Scanner;

public class ejercicio1_Instrucciones_repeticion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Lee una letra y después lee letras hasta que tecleen la anotada inicialmente y
	// hay que decir cuantas letras ha leído distintas de la inicil
		
		char letraI, letra;
		int cont = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce letra:");
		letraI = sc.nextLine().charAt(0);
		
		System.out.println("Introduce otra letra:");
		letra = sc.nextLine().charAt(0);
		
		while ( letra!= letraI) {
			cont++;
			System.out.println("Introduce otra letra");
			letra = sc.nextLine().charAt(0);
		}
	}
}

