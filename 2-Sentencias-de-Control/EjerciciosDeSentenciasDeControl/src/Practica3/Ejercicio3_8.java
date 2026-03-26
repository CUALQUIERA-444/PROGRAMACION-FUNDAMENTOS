package Practica3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*8. Programa que lee un número y nos dice si es par o impar
 */
		/*
		 * Logica 
		 * Un numero par dividido entre 
		 * 4 / 2 = 2  Resto0 
		 * 8/ 2 = 4  Resto0 
		 * 16 / 2 = 8 Resto0 
		 * Siempre da resto 0
		 * (Nota en las divisiones regulares si se encuentra una coma la puedes poner en el cociente al llegar a está)
		 * Aunque en los decimales no existe el concepto de par o impar
		 * Un numero impar dividido entre 2 no dará nunca como resto 0 
		 * 3 / 2 = 1 Resto1 
		 * 5 / 2 = 2 Resto1 
		 * Por lo que la solución debería ser simple
		 */
		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.ENGLISH);
		final int divisor = 2;
		int numero;
		System.out.println("Introduce un número");
		numero = sc.nextInt();
		if(numero % divisor == 0 && numero != 0)
			System.out.println("El numero "+numero+" es par");
		else if (numero % divisor !=0)
			System.out.println("El numero "+numero+" es impar");
		else 
			System.out.println("El numero "+numero+" es cero");
	}
}
