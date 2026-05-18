package EjerciciosMatrices;

import java.util.Scanner;

public class Ejercicio12_2 {
/*
 * 2. Programa que genera una matriz unidad cuadrada de dimensión dada.
 */
/*
 * Logica notas etc 
 * Matriz Unidad Cuadrada = Matriz completamente llena de ceros excepto la diagonal principañ
 * Dimension dada = Tiene la misma cantidad de filas que de columnas
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Paso 1 Pedir la dimension de la matriz
	int dimension; 
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce la dimension de tu matriz");
	dimension = sc.nextInt();
	while (dimension <= 0) {
		if (dimension <= 0) {
			System.out.println("No se gracioso introduzca una dimension valida");
			dimension = sc.nextInt();
		}
	}
	int unidad[][] = new int [dimension][dimension]; //4 Filas En la ultima posicion pasa algo 
//Paso 2 Rellenar Matriz
	for(int f = 0; f<unidad.length;f++) {
		for(int c = 0;c<unidad[f].length; c++) { //Funciona para ambos lados... SIN IMPORTAR [c] o [f] SIEMPRE BUSCA UNA FILA DE AHI LA EXCEPCION
			if(f == c) {
				unidad[f][c] = 1;
			}
		}
	}
//Paso 3 Mostrar Matriz
	for(int f = 0; f<unidad.length;f++) {
		for(int c = 0;c<unidad[f].length; c++) { 
			System.out.print(unidad[f][c]+" ");
		}
	System.out.println("");
	}
	}
}