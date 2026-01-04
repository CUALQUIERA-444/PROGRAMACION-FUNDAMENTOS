package Excepciones_YO;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excepciones1 {

	static Scanner sc = new Scanner (System.in);
	//EN STATIC SOLO SE PUEDE USAR PARA DECLARAR VARIABLES,FUNCIONES O BLOQUES DE CLASE
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 Haced una función que lee un double, controlando que no anoten letras
		// usando excepciones.
		double numero_leido = 0; //Declarar variable Para pasarla por defecto 0 Este valor cambiara
		numero_leido = Validar_numero(numero_leido);  //Inicializarla con una funcion
		System.out.println("Su numero es "+numero_leido);
	}
   public static double Validar_numero(double n) {
	   boolean validacion = false;
	   sc.useLocale(Locale.ENGLISH);
	   do {
	   try {
	   System.out.println("Introduzca un número decimal");
	   n = sc.nextDouble();
	   validacion = true;
	   }
	   catch (InputMismatchException e) {
		   sc.nextLine();
		System.out.println("Introduzca números no letras o caracteres");
	   }
	   }
	   while (validacion == false);
	   return n;
   }
}
