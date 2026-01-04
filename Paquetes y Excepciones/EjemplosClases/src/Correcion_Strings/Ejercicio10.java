package Correcion_Strings;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		int opc;
		Scanner sc = new Scanner (System.in);
		System.out.println("Anota cadena a procesar");
		cadena = sc.nextLine();
		System.out.println("Introduce opcion 1.Matrícula,2.nif,3.Código postal, 4 telefono,5 usuario");
		opc = sc.nextInt();
		switch(opc) {
		case 1: 
		//Cadena.matches busca todo el patrón
		if (cadena.matches("^[0-9]{4}[a-zA-Z]{3}$")) 
			//Como quitar vocales?
			
			System.out.println("Matricula correcta");
		else 
			System.out.println("Matrícuka inocrrecta");
		break;
		case 2: 
		break;
		case 3:
			if (cadena.matches("28[0-9]{3}"))
				System.out.println("Código postal correcto");
			else 
				System.out.println("Código postal incorrecto");
		break;
		case 4: 
			if(cadena.matches("^(6|7|9)[0-9]{8}$"))
			System.out.println("Teléfono correcto");
			else 
				System.out.println("Teléfono incorrecto");
			break;
		case 5:
			if (cadena.matches("^[A-Za-Z] [0-9a-zA-Z]{4,9}$"))
				System.out.println("Código correcto");
			else 
				System.out.println("Código incorrecto");
				}
	}
}
