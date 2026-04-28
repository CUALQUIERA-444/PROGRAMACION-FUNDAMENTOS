package practica3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce primer numero:");
		n1=sc.nextInt();
		System.out.println("Introduce segundo numero:");
		n2=sc.nextInt();
		
		if (n1>0) {
			if (n2>0)
				System.out.println("La suma es:"+ (n1+n2));
		}
		if (n1<0) {
			if (n2<0)
				System.out.println("La resta es:"+ (n1-n2));
		}
		if (n1==0)
			System.out.println("Al menos uno es nulo");
		else
			if (n2==0)
				System.out.println("Al menos uno es nulo");
		
		
	}

}
