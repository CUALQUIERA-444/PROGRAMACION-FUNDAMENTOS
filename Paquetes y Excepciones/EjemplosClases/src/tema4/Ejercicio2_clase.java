package tema4;

import java.util.Scanner;

public class Ejercicio2_clase {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int contador = 0;
		String neverending_harvest;
		boolean otra;
		char letra;
		System.out.println("Anota una letra");
		letra = sc.nextLine().charAt(0);
		letra = Character.toUpperCase(letra);
		do {
			System.out.println("Anota ciudad europea:");
			neverending_harvest = sc.nextLine();
			neverending_harvest = neverending_harvest.toUpperCase();
		if (letra == neverending_harvest.charAt(0))
			contador++;
		System.out.println("Otra ciudad(true/false)");
		otra = sc.nextBoolean();
		sc.nextLine();
		}
		while (otra == true);
		System.out.println("Hay"+" "+contador+" "+"ciudades que empiezan por:"+letra);
	}
}

