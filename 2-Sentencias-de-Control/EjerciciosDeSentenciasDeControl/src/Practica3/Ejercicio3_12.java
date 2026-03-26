package Practica3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	12. Programa que lee una nota numérica y escribe la correspondiente calificación
 * 5 .......... SUFICIENTE
 */
		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.ENGLISH);
		double nota;
		System.out.println("Introduce una nota numerica");
		nota = sc.nextDouble();
		if (nota >= 0 && nota <= 10) {
			if(nota < 5)
			System.out.println(nota+" SUSPENSO");
			else if(nota < 7)
			System.out.println(nota+" BIEN");
			else if(nota < 9)
			System.out.println(nota+" NOTABLE");
			else 
			System.out.println(nota+" SOBRESALIENTE");
		}
		else 
			System.out.println("Usted no puede sacar eso");
	}
}
