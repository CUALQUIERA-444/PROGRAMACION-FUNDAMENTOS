package EjerciciosMatrices;
import java.util.*;
public class Ejercicio12_1 {
/*
 * 1. Leer una matriz de 5 filas y 4 columnas, mostrarla por pantalla y escribir el
máximo y el mínimo.
Lógica código y anotaciones 
Una matriz es basicamente como un array doble con cordenadas es decir ancho y altura 
Se define de la siguiente forma int numeros[2][4] Generalmente esto no tiene orden y puedes recorrerlo/imprimirlo como quieras 
Siempre y cuando sepas diferenciar la anchura y la altura
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner (System.in);
	int maximo = Integer.MIN_VALUE; //Si es mayor a esto que lo es cualquiera pasa a ser el nuevo maximo
	int minimo = Integer.MAX_VALUE; //Viceversa
	int tabla[][] = new int[5][4]; //El primero representa las filas y el segundo las columnas 
	//Paso 1 rellenar la matriz
	for (int f = 0; f<tabla.length;f++) { //0,1,2,3,4
		for(int c = 0; c<tabla[f].length;c++) {//0,1,2,3 
			System.out.println("Introduce valores para la posicion "+(f+1)+" "+(c+1));
			tabla[f][c] = sc.nextInt();
		}
	}
	//Paso 2 Mostrar la matriz
	for (int f = 0; f<tabla.length;f++) { //0,1,2,3,4
		for(int c = 0; c<tabla[f].length;c++) {//0,1,2,3 
			System.out.print(tabla[f][c]+" ");
		}
		System.out.println();
	}
	//Paso 3 Identificar el maximo y el minimo y mostrarlos 
	for (int f = 0; f<tabla.length;f++) { //0,1,2,3,4
		for(int c = 0; c<tabla[f].length;c++) {//0,1,2,3 
			if(tabla[f][c] > maximo )
				maximo = tabla[f][c];
			if (tabla[f][c] < minimo ) {
				minimo = tabla[f][c];
			}
		}
	}
	System.out.println("El maximo es "+maximo);
	System.out.println("El minimo es "+minimo);
	//Math.round(maximo); Devuelve int
	//Integer m = 3; Funciona como remplazo 
	}
}
