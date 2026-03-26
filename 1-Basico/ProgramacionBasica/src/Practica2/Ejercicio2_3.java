package Practica2;

import java.util.Scanner;

public class Ejercicio2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. Programa que dado un importe y un descuento (porcentaje), calcula el importe
una vez aplicado el descuento.
 */
	Scanner sc = new Scanner (System.in);
	final double max_porcentaje = 100;
	double importe;
	double porcentaje; //Recomendable que el porcentaje sea un decimal
	double total;
	System.out.println("Introduzca el importe");
	importe = sc.nextDouble();
	System.out.println("Introduzca el porcentaje de descuento");
	porcentaje = sc.nextDouble();
	total = importe - importe * porcentaje / max_porcentaje; //Ej 2 - 2 * 2% / 100 = 2   4 / 100 = 2 - 0.04 = 1.96
	System.out.println("Su importe total es de "+total+" euros");
	/* No se podria hacer por que en el entero no puedes guardar datos que no sean enteros por lo que habria que hacer un casting
	 * Además de que se perdería información
	 * int descuento = importe - (importe * porcentaje); 
	 */
	
	System.out.println("Prueba de enteros y doubles");
	int n1 = 2;
	double n2 = n1;
	System.out.println(n1+" "+n2);
	double n3 = 4.4;
	int n4 = (int)n3;
	System.out.println(n3+" "+n4);
	}
}
