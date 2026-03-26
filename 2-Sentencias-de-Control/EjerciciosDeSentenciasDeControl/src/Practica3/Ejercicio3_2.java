package Practica3;

import java.util.Scanner;

public class Ejercicio3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Programa que lee dos números (distintos) y nos dice cual es el mayor
 */
	Scanner sc = new Scanner (System.in);
	int n1,n2;
	System.out.println("Introduce un numero");
	n1 = sc.nextInt();
	System.out.println("Introduce un segundo numero");
	n2 = sc.nextInt();
	if (n1 < n2)
		System.out.println("El mayor es "+n2);
	else if (n1 > n2) 
		System.out.println("El mayor es "+n1);
	else  //El else se suele aplicar cuando ya no hay opcion posible
		System.out.println("Error son iguales");
	}
}
