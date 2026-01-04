package práctica7;

import java.util.Scanner;

public class Ejercicio6_Copia_Práctica7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int dia; 
		int año;
		int mes;
		int numero_devuelto;
		System.out.println("Introduce el día (de 1 a 31)");
		dia = sc.nextInt();
		System.out.println("Introduce el año (4 digitos)");
		año = sc.nextInt();
		System.out.println("Introduce el mes (del 1 al 12");
		mes = sc.nextInt();
		numero_devuelto = CalcularNumero(dia,mes);
	}
	public static int CalcularNumero(int d, int m) {
										//Del 1 al 6 por ejemplo serían 5 el valor terminaria siendo 5.
									   // De 03 de febrero pasarian 33 dias teniendo como resultado 34
	}
}
