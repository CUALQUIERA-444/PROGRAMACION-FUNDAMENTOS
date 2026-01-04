package Excepciones_YO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3. Programa que lee números de teclado hasta anotar un 0 y calcula su media.
		 * Usa excepciones para que si el usuario se equivoca al introducir un número se
		 * muestre un error y se vuelva a pedir, también usa una excepción para
		 * controlar la división por cero.
		 */
		// Leemos numeros hasta anotar un 0 y calcular su media
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int acumulador = 0;
		int divisor = 0;
		int media = 0;
		boolean validacion = false;
		do {
			do {
				try {
					System.out.println("Introduce números hasta anotar 0");
					numero = sc.nextInt();
					if(numero !=0) {
					divisor++;
					}
					acumulador = acumulador + numero;
					validacion = true;
				} catch (InputMismatchException e) {
					sc.nextLine();
					System.out.println("Error vuelve a introducir un número");
				}
			} while (validacion == false);
		} while (numero !=0);
		try {
			media = acumulador / divisor;
			System.out.println("La media es " + media);
		} catch (ArithmeticException a) {
			System.out.println("Lo siento no puede dividir por cero");
		}
	}
}
