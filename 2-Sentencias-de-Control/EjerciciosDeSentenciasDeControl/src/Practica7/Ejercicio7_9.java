package Practica7;

import java.util.Scanner;

public class Ejercicio7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 9. Programa que dado un número, en este caso el 5, imprima lo siguiente. La
impresión se realiza en una función
1
22
333
4444
55555
 */
	/*
	 * Lógica la idea es usar 2 bucles for uno que se encarge de recorrer comenzando desde 1 hasta 
	 * el número introducido y otro que una vez que se alcanze dicho numero ese número sea escrito por pantalla las mismas veces que 
	 * el número correspondiente
	 */
	/*
	 * Variables,sentencias, funciones ...
	 * Una variable para guardar el número introducido por el usuario
	 * Un if para validar que no sea negativo
	 * Una función void para imprimir el resultado 
	 * Una mini función para validar el número introducido
	 * 2 for para hacer el proceso lógico
	 */
	Scanner sc = new Scanner (System.in);
	int número_usuario;
	do {
	System.out.println("Introduzca su número (No se permiten ni ceros ni negativos)");
	número_usuario = sc.nextInt();
	} while(ValidarNumero(número_usuario) == false);
	ImprimirNumeros(número_usuario);
	}
	public static boolean ValidarNumero(int n_user) {
		if (n_user <= 0) {
			return false;
		}
		return true;
	}
	public static void ImprimirNumeros(int n_user) {
		for (int i = 1; i<=n_user; i++) { //Da una vuelta y pasa al siguiente for 
			//Se ejecuta 1 vez y baja
								//Salto de línea Cada vez que termina una ejecucion Problema salto gigante
			for (int j = 1; j<=i; j++ ) { //Bucle que imprime segun numero ejemplo 1 imprime una vez 
				System.out.print(i); //Imprime el numero en la misma cantidad que el mismo número
			}
			System.out.println();//SOLO CUANDO UNA LINEA SE TERMINA SE PEGA UN SALTO DE LINEA Y NO AL PRINCIPIO
		}
	}
}
