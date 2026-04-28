package ejemplosarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TAM = 20;
		int numeros[] = new int[TAM];
		int cont = 0;
		boolean seguir = false;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce un número:");
			numeros[cont] = sc.nextInt();
			cont++;
			if (cont < TAM) {
				System.out.println("Quieres añadir otro número?(true/false)");
				seguir = sc.nextBoolean();
			}
			/*
			 * if (!seguir) break;
			 */
		} while (cont < TAM && seguir == true);
		
		for(int i=0;i<cont;i++)
			System.out.println(numeros[i]);
		System.out.println("Anota número a buscar:");
		int numero=sc.nextInt();
		int pos=buscar(numeros,numero,cont);
		if (pos==-1)
			System.out.println("No encontrado");
		else
			System.out.println("Encontrado en la posición :"+pos);
		
		// Meto en un array nuevo los números anotados en el
		// primer array
		/*
		int resultado[]=new int[cont];
		for(int i=0;i<cont;i++)
			resultado[i]=numeros[i];
		
		System.out.println("Array después de ordenarlo:");
		Arrays.sort(resultado);
		*/
		Arrays.sort(numeros,0,cont);
		for(int i=0;i<cont;i++)
			System.out.println(numeros[i]);

	}
	
	public static int buscar(int numeros[],int num,int cont) {
		for(int i=0;i<cont;i++)
			if (numeros[i]==num)
				return i;
		
		return -1;
	}

}
