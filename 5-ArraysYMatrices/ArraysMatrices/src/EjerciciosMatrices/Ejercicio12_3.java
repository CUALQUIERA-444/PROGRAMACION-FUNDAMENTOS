package EjerciciosMatrices;
import java.util.*;
public class Ejercicio12_3 {
/*
 * 3. Generar una matriz con números aleatorios, mostrarla por pantalla y después
mostrar su transpuesta, es decir cambiar las filas por columnas.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Paso 1 CREAR EL ARRAY Y RELLENARLO CON NUMEROS ALEATORIOS Y MOSTRARLO 
		Random r = new Random();
		int fila = 2;
		int columna = 3;
		int aleatorios[][] = new int[fila][columna]; //Traspuesta las filas seran columnas y las columnas seran filas
		for (int f = 0;f<aleatorios.length;f++) {
			for(int c = 0; c<aleatorios[f].length;c++) {
				aleatorios[f][c] = r.nextInt(10); //10 numeros del 0 al 9
				System.out.print(aleatorios[f][c]+" ");
			}
			System.out.println(" ");
		}
		//Paso 2 crear la traspuesta
		int aux = fila;
		fila = columna; 
		columna = aux;
		//int traspuesta[][] = aleatorios; Pasa una matriz a otra completamente igual los tamaños ya estan definidos
		int traspuesta[][] = new int[fila][columna];
		for (int f = 0;f<traspuesta.length;f++) {
			for(int c = 0; c<traspuesta[f].length;c++) {
				traspuesta[f][c] = aleatorios[c][f]; //10 numeros del 0 al 9
				System.out.print(traspuesta[f][c]+" ");
			}
			System.out.println(" ");
		}
	}
}
