package PrácticaArrays;

import java.util.Scanner;

public class Ejemplo_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String cadenas[] = new String[3];
		for (int i = 0; i < cadenas.length;i++) {
		System.out.println("Introduce una cadena para rellenar");
		cadenas[i] = sc.nextLine();
		}
	}

}
