package Practica2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 4. Programa que dadas 3 notas calcule la media.
 */
	Scanner sc = new Scanner (System.in);
	sc.useLocale(Locale.ENGLISH);
	final int cuenta_notas = 3;
	double nota1,nota2,nota3;
	double media_notas;
	System.out.println("Introduce una nota");
	nota1 = sc.nextDouble();
	System.out.println("Introduzca otra nota");
	nota2 = sc.nextDouble();
	System.out.println("Introduce una última nota");
	nota3 = sc.nextDouble();
	media_notas = (nota1+nota2+nota3) / cuenta_notas;
	System.out.println("La media de las "+cuenta_notas+" es de "+media_notas); //Java intenta ser lo mas preciso posible en sus 
	//Calculos al usar double y que el resultado de la media no sea exacto 
	}
}
