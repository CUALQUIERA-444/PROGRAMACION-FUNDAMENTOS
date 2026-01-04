package ejerciciosarrays;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numeros[]=new int[5];
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Introduce número["+i+"]=");
			numeros[i]=sc.nextInt();
		}
		System.out.println("Pares:");
		for(int i=0;i<numeros.length;i++) {
			if (numeros[i]%2==0)
				System.out.println(numeros[i]);
		}
		System.out.println("Impares:");
		for(int i=0;i<numeros.length;i++) {
			if (numeros[i]%2!=0)
				System.out.println(numeros[i]);
		}
	}

}
