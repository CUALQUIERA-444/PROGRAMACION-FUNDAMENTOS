package Ejercicios_Strings_YO;

import java.util.Scanner;

public class Strings5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  //Paso 1 declaramos y leemos 3 cadenas
		String cadena1;
		String cadena2;
		String cadena3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la primera cadena");
		cadena1 = sc.nextLine();
		System.out.println("Introduce la segunda cadena");
		cadena2 = sc.nextLine();
		System.out.println("Introduce la tercera cadena");
		cadena3 = sc.nextLine();
		/*Orden 
		 * cadena1 
		 * cadena2 
		 * cadena3
		 */
		if(cadena1.compareToIgnoreCase(cadena2) < 0 && cadena1.compareToIgnoreCase(cadena3) <0 && cadena2.compareToIgnoreCase(cadena3) < 0) {
			System.out.println(cadena1);
			System.out.println(cadena2);
			System.out.println(cadena3);
		}
		/*
		 *  cadena1
		 *  cadena3
		 *  cadena2
		 */
		else if(cadena1.compareToIgnoreCase(cadena2) < 0 && cadena1.compareToIgnoreCase(cadena3) <0 && cadena3.compareToIgnoreCase(cadena2)<0){
				System.out.println(cadena1);
				System.out.println(cadena3);
				System.out.println(cadena2);
			}
		//
		/* Orden 
		 * cadena2
		 * cadena3
		 * cadena1
		 */
		else if (cadena2.compareToIgnoreCase(cadena3) < 0 && cadena2.compareToIgnoreCase(cadena1) < 0 && cadena3.compareToIgnoreCase(cadena1) < 0) {
			System.out.println(cadena2);
			System.out.println(cadena3);
			System.out.println(cadena1);
			}
		/*Orden
		 * cadena2 
		 * cadena1 
		 * cadena3
		*/
		else if(cadena2.compareToIgnoreCase(cadena3)<0 && cadena2.compareToIgnoreCase(cadena1) < 0 && cadena1.compareToIgnoreCase(cadena3)<0) {
			System.out.println(cadena2);
			System.out.println(cadena1);
			System.out.println(cadena3);
	}
		/*Orden 
		 * cadena3
		 * cadena2
		 * cadena1
		 */
		else if(cadena3.compareToIgnoreCase(cadena2)<0 && cadena3.compareToIgnoreCase(cadena1) < 0 && cadena2.compareToIgnoreCase(cadena1)<0) {
			System.out.println(cadena3);
			System.out.println(cadena2);
			System.out.println(cadena1);
	}
		/*Orden 
		 * cadena3
		 * cadena1
		 * cadena2
		 */
		else if(cadena3.compareToIgnoreCase(cadena1)<0 && cadena3.compareToIgnoreCase(cadena2) < 0 && cadena1.compareToIgnoreCase(cadena2)<0) {
			System.out.println(cadena3);
			System.out.println(cadena1);
			System.out.println(cadena2);
	}
		else 
			System.out.println("Son iguales");
	}
}
