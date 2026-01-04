package Tema2;

import java.util.Scanner;

public class ejercicio3_examen_instrucciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.println("Anota número:");
		num = sc.nextInt();
		System.out.println("No hay divisores");
		for (int i = 1; i<num; i++) {
		if ( num % i != 0)
			System.out.println(i);
		}
	}
}
