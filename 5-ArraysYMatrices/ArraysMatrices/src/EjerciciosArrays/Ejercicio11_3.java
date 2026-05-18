package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. El usuario dice cuántos números va a leer, a continuación leemos la cantidad de
números indicada y los guardamos en un array. Decid cuántas veces se repite el
último número.
 */
/* Lógica Notas y código 
 * Este ejercicio consiste en usar un entero para determinar la longitud del array 
 * Y posteriormente rellenamos el array 
 * Despues recorremos nuevamente el Array para decir cuantas veces se repite el último número
 * Necesitamos un (int) Que guarde el número del usuario 
 * Una (función que devuelva un INT) que es el contador del último número
 * Una (Un array de numeros enteros)
 */
	Scanner sc = new Scanner(System.in);
	int longitud;
	int contador = 0;
	System.out.println("Introduce un número para determinar la longitud de la cadena");
	do  {
	longitud = sc.nextInt();
	if(longitud <= 0) {
		System.out.println("Lo siento pero debe ser un número positivo vuelva a intentarlo");
	}
	} while (longitud <= 0);
	int numeros[] = new int[longitud];
	int i; //Se mantiene Para No se efectos visuales
	//Anota 
	for (i=0;i<numeros.length;i++) {
		System.out.println("Introduce números");
		numeros[i] = sc.nextInt();
	}
	//Rellena
	i = 0;
	System.out.print("[");
	for(;i<numeros.length;i++) {
		if(numeros[i] == numeros[longitud-1]) {
			contador++;
		}
		System.out.print(numeros[i]+" ");
	}
	System.out.print("]");
	System.out.println("El ultimo número que es "+numeros[longitud-1]+" ha aparecido un total de "+contador);
	} 
}
