package Practica7;

import java.util.Scanner;

public class Ejercicio7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Programa que determina cuantas cifras tiene un número. Utilizar un método
que recibe el número y nos retorna la cantidad de cifras que tiene
 */
		/*
		 * Notas Por ahora nos abstenemos de numeros negativos o decimales
		 */
	/*
	 * Lógica 
	 * Similar a ejercicios pasados la idea para hallar la cantidad de cifras de un numero es ir dividiendolo entre 10 
	 * hasta que sea menor que 0 donde no se puede reducir mas por cada vez que se reduzca se tiene que contar dicha reduccion con un contador
	 */
		/*
		 * Variables sentencias funciones...
		 * Un contador para contar las cifras (Veces que se reduce)
		 * Una variable entera para guardar el numero 
		 * Una funcion que se encarge de reducir el numero y llevar el contador 
		 * La funcion solamente recibe el numero 
		 * El main se encarga de recoger el numero
		 */
		Scanner sc = new Scanner (System.in);
		final int reductor = 10; //Esta constante del main solo existe en este main "necesaario pasarlo"
		int numero_usuario;
		int cifras;
		System.out.println("Introduce el número al que se le contarán las cifras");
		numero_usuario = sc.nextInt();
		cifras = CalcularCifras(numero_usuario,reductor);
		System.out.println("La cantidad de cifras que tiene su numero es de "+cifras);
	}
	public static int CalcularCifras(int numero, int red) {
		int contador_operaciones = 0;
		//Nota si el usuario pone algo como 023 a menos que se trate de DNI codigos postales ... Lo ideal es que cuente 2 cifras
		if (numero == 0) {
			return contador_operaciones+1;
		}
		else {
		do {
			if (numero > 0) { //El cero por si solo no funciona con esta logica ya que nunca entra aca por lo que la solucion es el if de arriba
			numero = numero / red;
			contador_operaciones++;
			}
		} while (numero > 0);
		}
		return contador_operaciones;
	}
}
