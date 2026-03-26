package Practica5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 9. Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura
		 * media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos
		 * que miden más de 1.75.
		 */
		/*
		 * Lógica Al tener 5 alumnos podemos usar un bucle que vaya desde el alumno 1
		 * hasta el alumno 5 Tenemos varias variables Una que almacene la edad del
		 * alumno Otra que almacena el valor de 1.75 (Estatura maxima Para comparar)
		 * Otra que almacena el valor de 18 (Edad maxima Para comparar) Otra que
		 * almacena la estatura del alumno Un validador que me permite que el alumno no
		 * introduzca valores negativos parando el for Un contador para contar aquellos
		 * que miden mas de 1.75 Otro contador para aquellos que tengan mas de 18 años
		 * Un acumulador para ir acumulando la suma de la estatura de cada alumno Otro
		 * acumulador para ir acumulando la suma de la edad de cada alumno Un double
		 * para ir almacenando la media de la estatura Y otro double para ir almacenando
		 * la media de la edad
		 */
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		int edad_alumno; // Las variables no pueden tener espacios en la sintaxis del nombre
		double estatura_alumno;
		boolean validador = true;
		final int edad_maxima = 18;
		final double altura_maxima = 1.75;
		int contador_EstaturaEdad = 0;
		double media_estatura;
		double media_edad;
		int contador_edad18 = 0;
		int contador_estatura1_75 = 0;
		int acumulador_edad = 0;
		double acumulador_estatura = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Introduzca su edad \"Alumno " + i + "\"");
			edad_alumno = sc.nextInt();
			System.out.println("Introduzca su estatura \"Alumno " + i + "\"");
			estatura_alumno = sc.nextDouble();
			if (edad_alumno <= 0 || estatura_alumno <= 0) {
				validador = false; // Si entra pasa a ser true
			}
			if (validador == false) {
				System.out.println("No puede introducir números negativos como edad o como estatura vuelva a intentarlo");
				i--;
			} else {
				contador_EstaturaEdad++;
				acumulador_edad = acumulador_edad + edad_alumno;
				acumulador_estatura = acumulador_estatura + estatura_alumno;
				if (edad_alumno > edad_maxima) {
					contador_edad18 = contador_edad18 + 1;
				}
				if (estatura_alumno > altura_maxima) {
					contador_estatura1_75 = contador_estatura1_75 + 1;
				}
			}
			validador = true; // Lo devolvemos al default antes de hacer la siguiente vuelta
		}

		if (validador == true) {
			media_estatura = acumulador_estatura / contador_EstaturaEdad;
			/*
			 * Regla de Java: Siempre que operas un double con un int, Java promociona
			 * automáticamente el int a double para no perder precisión.
			 */
			media_edad = (double) acumulador_edad / contador_EstaturaEdad; // Casting para que se convierta el
																			// acumulador_edad en double
			System.out.println("Media de la edad " + media_edad + " de media");
			System.out.println("Media de la estatura " + media_estatura + " de media");
			System.out.println("Cantidad de alumnos con más de 18 años " + contador_edad18 + " alumnos");
			System.out.println("Cantidad de alumnos que miden más de 1.75 metros " + contador_estatura1_75 + " alumnos");
		}
	}
}
