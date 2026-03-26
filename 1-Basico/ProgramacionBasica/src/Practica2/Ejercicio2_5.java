package Practica2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5. Programa que calcula el área de un triángulo.
		 * Área de un triangulo = base * altura / 2
		 * Usaremos m²
		 */ 
		final double factor_fijo = 2;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		double base,altura,area;
		System.out.println("Introduce la base del triángulo");
		base = sc.nextDouble();
		System.out.println("Introduce la altura del triángulo");
		altura = sc.nextDouble();
		area = base * altura / factor_fijo;
		System.out.println("El área de su triángulo es de "+area+" metros cuadrados");
	}
}
