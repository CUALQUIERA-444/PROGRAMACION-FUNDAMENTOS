package ejerciciosarrays;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String args[]) {
		int numeros[];
		int tam,cont=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Anota tamaño del array:");
		tam=sc.nextInt();
		
		assert tam > 0:"El número tiene que ser positivo"; 
		
		numeros=new int[tam];
		
		for(int i=0;i<tam;i++) {
			System.out.println("Introduce número:");
			numeros[i]=sc.nextInt();
		}
		
		System.out.println("El último número es:"+numeros[tam-1]);
		
		for(int i=0;i<tam;i++) {
			if (numeros[i]==numeros[tam-1])
				cont++;
		}
		
		System.out.println("Se repite:"+cont+" veces");
		
		

	}

}
