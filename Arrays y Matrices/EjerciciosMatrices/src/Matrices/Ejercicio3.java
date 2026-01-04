package Matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generar una matriz con números aleatorios, mostrarla por pantalla y después
		//mostrar su transpuesta, es decir cambiar las filas por columnas.
	
		// 1 0 0 
		// 0 1 0 
		// 0 0 1
		
		//1 7 4 	   1 5 3
		//5 0 2 -->    7 0 4 
		//3 4 8        4 2 8
		
	//Invertir el orden 
		
	Scanner sc = new Scanner (System.in);
	Random r = new Random();
	int f1;
	int c1;
	//Generar matriz 
	System.out.println("Introduce las dimensiones para las filas"); //Ej filas = 5 Posiciones en las filas 0 1 2 3 4 Para rellenar necesitamos contar cuantas filas queremos es decir la posicion empieza en 0 pero termina en 4
	f1 = sc.nextInt();
	System.out.println("Introduce las dimensiones para las columnas"); //Lo mismo para las columnas
	c1 = sc.nextInt();
	int numeros_eureka[][] = new int [f1][c1]; //Forma sencilla de clonar la matriz?
	for (int f = 0; f < f1; f++ ) {
		for (int c = 0; c <c1; c++) {
			numeros_eureka[f][c] = r.nextInt(10);
		}
	}
	//Mostrar matriz 
	for (int f_1 = 0; f_1 < f1; f_1++ ) {
		for (int c_1 = 0; c_1 <c1; c_1++) {
			System.out.print("\t" +numeros_eureka[f_1][c_1]);
		}
	System.out.println();
	}
	System.out.println();
	//Mostrar Matriz alterada?
	//En vez de recorrer primero las columnas recorremos las filas 
	//Y asi mostramos ambas versiones sin importar el orden 
	for (int c_1 = 0; c_1 < c1; c_1++ ) {
		for (int f_1 = 0; f_1 <f1; f_1++) {
			System.out.print("\t" +numeros_eureka[f_1][c_1]);
		}
	System.out.println();
	}
	}
}

	
