package Matrices;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa que genera una matriz unidad cuadrada de dimensión dada.
		//Matriz unidad 
		//Cuadrada 
		//No necesariamente tiene que ser cuadrada 
		//La matriz unidad se tiene que rellenar con 1 en la diagonal principal y el resto con ceros
		// 1 0 0 0 
		// 0 1 0 0 
		// 0 0 1 0 
		// 0 0 0 1
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca las dimensiones (Filas)");
		int f = sc.nextInt();
		System.out.println("Introduce las dimensiones (Columnas)");
		
		//Generar  Array
		int c = sc.nextInt();
		int matriz_unidad[][] = new int [f][c];
		for (int f1 = 0; f1<f;f1++ ) {
			for (int c1 = 0; c1<c;c1++) {
				if (f1 == c1)
				matriz_unidad[f1][c1] = 1;
				else 
				matriz_unidad[f1][c1] = 0;
			}
		}
		//Mostrar Matriz
		
		for (int f1 = 0; f1<f;f1++ ) {
			for (int c1 = 0; c1<c;c1++) {
				System.out.print("\t"+matriz_unidad[f1][c1]);
			}
		System.out.println();
		}
	}

}
