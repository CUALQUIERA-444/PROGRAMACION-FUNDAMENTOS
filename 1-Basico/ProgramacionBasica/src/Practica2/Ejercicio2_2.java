package Practica2;

import java.util.Scanner;

public class Ejercicio2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Programa que lee dos números, calculando y escribiendo el valor de la suma, la
resta, el producto, y su módulo.
		 */
	Scanner sc = new Scanner (System.in);
	double num1;
	double num2;
	double suma;
	double resta;
	double producto;
	double modulo;
	System.out.println("Introduce un numero \"Decimal\"");
	num1 = sc.nextDouble();
	System.out.println("Introduce un segundo numero \"Decimal\"");
	num2 = sc.nextDouble();
	suma = num1 + num2;
	resta = num1 - num2;
	producto = num1 * num2;
	modulo = num1 % num2;
	System.out.println("Suma "+suma+"\n"+"Resta "+resta+"\n"+"Producto "+producto+"\n"+"Módulo "+modulo+"\n");
	}
}
