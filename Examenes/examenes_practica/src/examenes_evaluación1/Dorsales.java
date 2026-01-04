package examenes_evaluación1;

import java.util.Scanner;

public class Dorsales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //1 Una función que validar el dorsal Con strings
	Scanner sc = new Scanner (System.in);
	String dorsal; //Validar que tenga una longitud de 6 
	String pais; //Validar que tenga más de 3 letras y en mayusculas
	boolean validar_d;
	System.out.println("Introduzca su dorsal");
	dorsal = sc.nextLine();
	do {
	validar_d = validarDorsal(dorsal);
		if ( validar_d == false)
		System.out.println("Vuelva a introducir ");
	}
	while ( validar_d == false );
	System.out.println("Introduzca su pais;");
	}
	public static boolean validarDorsal ( String dorsal) {
		if ( dorsal.length() !=6 ) 
			return false;
		else {
			String dorsal_m = dorsal.substring(0,3);
			String dorsal_M = dorsal_m.toUpperCase();
			if ( dorsal_m.compareTo(dorsal_M) == false);
				
		}
		}
}
