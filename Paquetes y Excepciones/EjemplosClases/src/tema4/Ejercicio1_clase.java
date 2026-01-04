package tema4;

import java.util.Scanner;

public class Ejercicio1_clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String seguir;
		String ejemplo;
		do {
		System.out.println("Introduzca una cadena");
		ejemplo = sc.nextLine();
		ejemplo.toUpperCase();
		System.out.println("Tu cadena en mayusculas es:"+ejemplo.toUpperCase());
		System.out.println("Desea continuar");
		seguir = sc.nextLine();
		} //while ( seguir !="fin");
		  while (seguir.equalsIgnoreCase("fin")== false);
		/*  while (!seguir.equalsIgnoreCase("fin"));
		  while ("fin".equalsIgnoreCase(seguir)== false);
		  while (seguir.equalsIgnoreCase("fin")!=true);
		*/
	System.out.println("Fin del programa");
	}
}
