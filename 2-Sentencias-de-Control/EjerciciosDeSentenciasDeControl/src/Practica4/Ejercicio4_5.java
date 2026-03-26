package Practica4;

import java.util.Scanner;

public class Ejercicio4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5. Programa que lee como dato de entrada un año y nos dice si se trata de un
		 * año bisiesto o no. Se sabe que son bisiestos todos los años múltiplos de 4,
		 * excepto los que sean múltiplos de 100 sin ser múltiplos de 400.
		 */
		/*
		 * NOTAS La idea de estas practicas es concentrarse en aplicar los conceptos no
		 * la robustez del programa Los multiplos son los resultados de multiplicar un
		 * numero entero * por otro numero entero sin ser decimales
		 */
		/*
		 * Logica Cualquier numero multiplicado por 4 entra por defecto a menos que este
		 * tambien sea multiplo de 100 tambien y que este no sea multiplo de 400 por
		 * ejemplo yo introduzco el año 800 Por ejemplo 800 entraria 
		 * 800 / 4 = 200 
		 * 800 / 100 = 8 
		 * 800 / 400 = 2 
		 * Para saber si un numero entraria se lo divide y si da
		 * resto 0 entonces este seria multiplo Ahora es cuestion de conectar cosas como
		 * La condicion en cuestion
		 * 
		 * 2024 / 4 = 506 Entra 
		 * 2024 / 100 = 20,24 Falla esta ruta 
		 * 2024 / 400 = 24 Vuelve a los bisiestos por que de todas forma entra 
		 * Este tambien entraria ya
		 * que si bien no es multiplo de 100 es multiplo de 400 lo cual tampoco es muy
		 * importante pero es algo 
		 * 
		 * EN CONCLUSION UN AÑO ES BISIESTO SI ES MULTIPLO DE 4 SIN SER MULTIPLO DE 100 O ES MULTIPLO DE 400 esto debido a razones de estadistica
		 * y por que los años terminan en 00 tienen propiedades especiales que les hace esperar 8 años para el siguiente bisiesto
		 */
		Scanner sc = new Scanner(System.in);
		final int factor1 = 4, factor2 = 100, factor3 = 400;
		int año;
		System.out.println("Introduce un año y le diremos si es bisiesto");
		año = sc.nextInt();
		if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
			System.out.println("Es bisiesto");
		} else {
			System.out.println("No es bisiesto");
		}
	}
}
