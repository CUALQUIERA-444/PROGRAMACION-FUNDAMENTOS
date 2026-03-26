package Practica5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 17. Repetir el ejemplo del "simulador de calculadora" para poder realizar todas las
operaciones que el usuario quiera.
		 */
		/*
		 * Notas 
		 * Por lo general estas calculadoras las suelen acabar cuando el resultado es 0 pero como hay gente que querra hacer operaciones con el 0 
		 * Entonces lo que hacemos es un booleano 
		 * El ejercicio de la calculadora usaba 2 numeros por lo que seguiremos esa logica aca
		 */
		/* Logica 
		 * Una calculadora que se ejecute en función de lo que el usuario quiera switch-case podria ayudar
		 * Podemos evitar la división por cero que da un error
		 * Al final de cada iteracion se le pregunta al usuario si quiere seguir introduciendo true o false dependiendo de sus deseos
		 */
		/*
		 * Variables y sentencias de control
		 * 5 char para los distintos tipos de operaciones 
		 * 1 char para el usuario almacenar su operacion
		 * 1 booleano para preguntar al usuario
		 * 2 doubles para almacenar los numeros del usuario
		 * un switch case para cada opcion 
		 * 1 double para almacenar el resultado de la operacion
		 * Un do while que se vaya ejecutando si el usuario quiere
		 */
		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.ENGLISH);
		final char suma = '+', resta = '-', multiplicación = '*',división = '/' , módulo = '%';
		char operacion_usuario;
		double numero1;
		double numero2;
		boolean continuar;
		double resultado = 0;
		int entre0;
		do {
			entre0 = 0;
			System.out.println("Introduce un numero para realizar algun calculo \"El que guste\" ");
			numero1 = sc.nextDouble();
			System.out.println("Introduce un numero para el calculo anteriormente mencionado");
			numero2 = sc.nextDouble();
			sc.nextLine(); //Limpiar buffer
			System.out.println("Introduce el tipo de operacion que desea realizar con dichos numeros");
			operacion_usuario = sc.nextLine().charAt(0);
			switch (operacion_usuario) {
			case suma:
				resultado = numero1 + numero2;
			break;
			case resta:
				resultado = numero1 - numero2;
			break;
			case multiplicación:
				resultado = numero1 * numero2;
			break;
			case división: //Evitar el infinito por que sigue bajando aun con un if 
				if(numero2 != 0) {
				resultado = numero1 / numero2;
				}
				else {
					System.out.println("No se puede dividir entre 0");
					entre0 = 1;
				}
			break;
			case módulo:
				resultado = numero1 % numero2;
			break;
			default:
				System.out.println("No se pudo encontrar el tipo de operacion planteada");
				entre0 = 1;
			}
		  if(entre0 == 0) {
			  System.out.println(numero1+" "+operacion_usuario+" "+numero2+" = "+resultado);
		  }
		  System.out.println("Desea continuar? (true/false)");
		  continuar = sc.nextBoolean();
		} while(continuar == true);
	}
}
