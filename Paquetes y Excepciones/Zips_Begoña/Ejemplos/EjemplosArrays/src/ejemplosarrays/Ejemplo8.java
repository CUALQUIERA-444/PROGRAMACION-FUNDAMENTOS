package ejemplosarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int usuario = 0;
		int numero;
		boolean seguir = false;
		int numeros[] = new int[20];
		int TAM = 20;
		int pos;
		// Crear y rellenar array hasta que el usuario quiera
		do {
				System.out.println("Introduce un número");
				numeros[cont] = sc.nextInt();
				cont ++;
				if (cont < TAM) {
					System.out.println("Quieres añadir otro número? (true/false)");
					seguir = sc.nextBoolean();
				}
		} while (cont < TAM && seguir == true);

		for (int i= 0; i <cont;i++)
			System.out.println(numeros[i]);
	System.out.println("Anota número a buscar:");
	numero = sc.nextInt();
	pos = buscar(numeros,numero,cont);
	if (pos == -1)
		System.out.println("No encontrado");
	else 
		System.out.println("Encontrado en la posición :"+pos);
	//Meto en un array nuevo los números anotados 
	//en el primer array
	int resultado []= new int [cont];
	for (int i = 0;i<cont;i++) {
		resultado[i] = numeros[i];
	}
	System.out.println("Array después de ordenarlo:");
	Arrays.sort(resultado);
	//Arrays.sort(resultado,0,cont); OTRA OPCIÓN
	for (int i = 0; i < cont; i++) {
		System.out.println(resultado[i]);
	}
	}
	public static int buscar (int numeros[],int num, int cont) {
		for (int i = 0; i < cont; i++) {
			if (numeros[i] == num)
				return i;
		}
		return -1;
	}
}
