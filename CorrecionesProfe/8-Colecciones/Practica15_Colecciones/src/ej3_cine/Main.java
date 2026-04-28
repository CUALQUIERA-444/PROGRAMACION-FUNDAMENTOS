package ej3_cine;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantas entradas hay a la venta?");
		int entradasT = sc.nextInt();
		Cine cine=new Cine(entradasT);

		do {
			System.out.println(
					"1.Llega persona\n2.Primero de la cola saca entradas\n3.Se va un usuario\n4.Mostrar\n5.Salir");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				sc.nextLine();
				System.out.println("Introduce nombre:");
				String nombre = sc.nextLine();
				System.out.println("Introduce entradas:");
				int entradas = sc.nextInt();
				
				cine.llegarCola(nombre, entradas);
				
				break;
			case 2:
				try {
				cine.comprarEntradas();
				}catch(AforoCompletoException e) {
					System.out.println(e.getMessage());
					opc=5;
				}
				break;
			case 3:
				cine.dejarCola();
				break;
			case 4:
				System.out.println(cine);

			}

		} while (opc != 5);

	}

}
