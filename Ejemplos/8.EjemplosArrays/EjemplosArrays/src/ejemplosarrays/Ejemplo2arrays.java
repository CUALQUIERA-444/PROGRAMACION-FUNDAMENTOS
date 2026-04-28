package ejemplosarrays;

import java.util.Scanner;

public class Ejemplo2arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[]=new int[10];
		int nuevo,cont=0;
		
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Introduce número:");
			numeros[i]=sc.nextInt();
		}
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("Introduce un número más:");
		nuevo=sc.nextInt();
		
		for(int i=0; i<numeros.length; i++) {
			if (numeros[i]==nuevo)
				cont++;
		}

		System.out.println("Hay "+ cont+ " números igual que el leido");
		
	}

}
