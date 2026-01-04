package práctica7;

import java.util.Scanner;

public class Ejercicio2_Práctica7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programa que determina cuantas cifras tiene un número. Utilixar un método que recibe el númerp y nos retorna la cantidad de cifras que tiene
		int num;
		int delimitador = 10;
		int contador = 0;
		int total_cifras;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número y te leeremos cuantas cifras tiene");
		num = sc.nextInt();
		total_cifras = calcularcifras(num,delimitador,contador);
		System.out.println("Tiene un total de"+" "+total_cifras);
	}
	public static int calcularcifras(int a, int  d, int cont) {
		int ret;
		do {
		a = a / d; // Divide el numero entre 10 y guarda el número hasta que el cociente sea 0
		cont++;
		}
		while (a != 0);
		return cont;
	}
}
