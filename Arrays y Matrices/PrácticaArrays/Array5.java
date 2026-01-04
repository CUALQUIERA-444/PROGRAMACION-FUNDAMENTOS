package PrácticaArrays;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5.Queremos llevar las ventas de 6 comerciales. Primero anota el nombre de los
comerciales. Después, mientras lo desee el usuario lee el nombre de comercial y
las unidades vendidas por éste y acumúlalas. Al finalizar muestra por cada
comercial el número de ventas realizadas.
		 */
		
		//Declarar y rellenar Array
		Scanner sc = new Scanner (System.in);
		String []personas = new String [6];
		for (int i = 0; i < personas.length; i++) {
		System.out.println("Introduce el nombre de un comercial (Maximo 6)");
		personas[i] = sc.nextLine();
		}
		for (int i = 0; i < personas.length; i++) {
		System.out.println("Sus comerciales son " +personas[i]);
		}
	}
}
