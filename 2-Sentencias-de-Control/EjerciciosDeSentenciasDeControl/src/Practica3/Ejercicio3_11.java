package Practica3;

import java.util.Scanner;

public class Ejercicio3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 11. Una empresa maneja códigos numéricos con las siguientes características:

Cada código consta de cuatro dígitos
El primero representa a una provincia
El segundo el tipo de operación
Los dos últimos el número de la operación

Escriba un programa que lea de teclado un número de cuatro dígitos, y posteriormente
imprima en pantalla la siguiente información:
PROVINCIA &
TIPO DE OPERACIÓN &
NÚMERO DE OPERACIÓN &&

En caso de que el número tenga más de 4 dígitos, en lugar del mensaje anterior, habrá que
imprimir en pantalla el siguiente mensaje de error: ERROR: CÓDIGO NO VÁLIDO. Si tiene
menos de 4 dígitos se suponen 0 los primeros.
*/
		/* Logica
		 * Cada codigo tiene 4 digitos numericos 
		 * Se imprime una parte de cada uno 
		 * Si tiene mas de 4 digitos imprime error 
		 * Si tiene menos los 0 suponen los primeros osea que se rellan en funcion del numero de operacion
		 * 
		 */
		Scanner sc = new Scanner (System.in);
		int codigo_numerico;
		int provincia = 0;
		int tipo_operacion = 0;
		int numero_operacion = 0;
		int numero_operacion2 = 0;
		int validador = 0;
		System.out.println("Introduce el codigo numerico");
		codigo_numerico = sc.nextInt();
		if(codigo_numerico > 9999) {
			System.out.println("Error el codigo numerico tiene mas de 4 digitos");
			validador = 1;
		}
		else if(codigo_numerico >= 100 && codigo_numerico <= 999) {
			tipo_operacion = codigo_numerico / 100;
			numero_operacion = codigo_numerico / 10 % 10 ;
			numero_operacion2 = codigo_numerico % 10;
			}
		else if(codigo_numerico >= 10 && codigo_numerico <= 99) {
			numero_operacion = codigo_numerico / 10;
			numero_operacion2 = codigo_numerico % 10 ;
		}
		else if(codigo_numerico >= 1 && codigo_numerico <= 9) {
			numero_operacion2 = codigo_numerico % 10;
	}
		else {
			provincia = codigo_numerico / 1000;
			tipo_operacion = codigo_numerico / 100 % 10;
			numero_operacion = codigo_numerico / 10 % 10; 
			numero_operacion2 = codigo_numerico % 10;
			}
		System.out.println("PROVINCIA "+provincia);
		System.out.println("TIPO OPERACIÓN "+tipo_operacion);
		System.out.println("NUMERO DE OPERACIÓN "+numero_operacion+""+numero_operacion2);
	//La razon por la que mi metodo anterior no funciono es porque hay numeros que al restar no dan lo que busco por lo 
		//que no es un metodo infalible
	}
	}
