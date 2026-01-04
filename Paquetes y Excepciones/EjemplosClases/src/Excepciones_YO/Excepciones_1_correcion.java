package Excepciones_YO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones_1_correcion {
	static Scanner sc; //Declarar scanner para todas las funciones 
	//EXCLUSIVO DE EXCEPCIONES

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				double numero;
				sc = new Scanner(System.in);
				numero = leerDouble();
				System.out.println("El número leído es:" + numero);
			}

			public static double leerDouble() {
				double nu = 0;
				boolean correcto = false;
				do {
					System.out.println("Introduce un número decimal");
					try {
						nu = sc.nextDouble();
						correcto = true;
					} catch (InputMismatchException e) {
						sc.nextLine();
						System.out.println("Formato double incorrecto");
					}
				} while (correcto==false); 
				return nu;
			}
	}

