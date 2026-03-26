package Practica3;

import java.util.Scanner;

public class Ejercicio3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*4. Programa que lee tres números distintos y nos dice cuál de ellos es el mayor
 */
	Scanner sc = new Scanner (System.in);
	int n1,n2,n3;
	System.out.println("Introduce un número");
	n1 = sc.nextInt();
	System.out.println("Introduce un segundo número");
	n2 = sc.nextInt();
	System.out.println("Introduce un último número");
	n3 = sc.nextInt();
	if (n2 == n1 || n2 == n3 || n1 == n3)
		System.out.println("Error alguno de estos es igual");
	else if(n1 > n2 && n1 > n3)
		System.out.println(n1+" Es el mayor");
	else if(n2 > n1 && n2 > n3)
		System.out.println(n2+" Es el mayor");
	else 
		System.out.println(n3+" Es el mayor");
	}
}
