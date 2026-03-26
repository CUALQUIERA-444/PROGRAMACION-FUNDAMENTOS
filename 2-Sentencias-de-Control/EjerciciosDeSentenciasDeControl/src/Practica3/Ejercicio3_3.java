package Practica3;

import java.util.Scanner;

public class Ejercicio3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. Programa que lee dos números (no necesariamente distintos) y los escribe ordenados
 */
	Scanner sc = new Scanner (System.in);
	int n1,n2;
	System.out.println("Introduce un numero");
	n1 = sc.nextInt();
	System.out.println("Introduce un segundo numero");
	n2 = sc.nextInt();
	if (n1 <= n2) // Si es menor pone bien el orden y de paso si es igual pues ponelo asi tambien total
		System.out.println(n1+","+n2);
	else 
		System.out.println(n2+","+n1);
	System.out.println("Caso de concatenacion");
	System.out.println(+n1+n2);
	System.out.println("Sin caso de concatenacion");
	System.out.println(+n1+","+n2);
	}
}
