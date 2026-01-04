package Matrices;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final int FILAS = 5, COLUM = 4;
	int max = Integer.MIN_VALUE;	
	int min = Integer.MAX_VALUE;
	Scanner sc = new Scanner (System.in);
	int max_min [][] = new int[FILAS][COLUM]; //20 numeros
	//Rellenar el array 
	for (int f = 0; f < FILAS; f++) {
		for (int c = 0; c < COLUM; c++) {
		System.out.println("Introduce en la posicion"+"[" +f+"]" + "[" +c+ "]");
		max_min[f][c] = sc.nextInt();
	}
		
	}
		for (int f1 = 0; f1 < FILAS; f1++) {
			for (int c2 = 0; c2 < COLUM; c2++) {
				System.out.print("\t" + max_min[f1][c2]);
				if (max_min[f1][c2] > max )
					max = max_min[f1][c2];
				if (max_min[f1][c2] < min)
					min = max_min[f1][c2];
			}
			System.out.println();
		}
		System.out.println("Maximo " +max);
		System.out.println("Minimo " +min);
	}
	//Poner bonito la matriz 
}
