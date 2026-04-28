package Practica8;

import java.util.Scanner;

public class Ejercicio8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 5. Programa que lee tres cadenas y las escribe por orden alfabético, ignorando
mayúsculas y minúsculas.
 */
/* Logica y codigo necesario 
 * Tenemos que usar compareTo para comparar un total de 9 veces diferentes cadenas ya que existen 
 * un total de 6 combinaciones posible entre los 3 strings 
 * Pedimos 3 strings (Objetos de tipo String)
 * Los pasamos a una función void que los imprima dependiendo las diferentes condiciones 
 * El compare to es un metodo de String que se encarga de devolver un entero (int) dependiendo del orden lexicografico de los strings que se pasen 
 * Básicamente
 * String1.compareTo(String2) Si es mayor el String 1 (Se encuentra más adelante en el diccionario) devuelve un positivo)
 * 							 Si es menor el String 1 (Se encuentra más atras en el diccionario que el String 2) devuelve un negativo
 * 							Si son iguales devuelve 0 
 * Por lo que es cuestion de comparar los int resultantes e ir comparando cada uno en función de lo que corresponda
 * Vamos a intentar ser creativos 
 * También es importante tener en cuenta que cosas como espacios o tildes pueden dar resultados distintos puesto que CompareTo usa ASCII para 
 * sus comparacion
 */
	Scanner sc = new Scanner (System.in);
	System.out.println("Introduce 3 cadenas y te las ordenamos en orden alfabético");
	String cadena1 = sc.nextLine();
	String cadena2 = sc.nextLine();
	String cadena3 = sc.nextLine();
	
	Caso1(cadena1,cadena2,cadena3);
	Caso2(cadena2,cadena3,cadena1);
	Caso3(cadena3,cadena2,cadena1);
	}
	public static void Caso1 (String c1, String c2, String c3) {
		String c1_limpio = c1.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
		String c2_limpio = c2.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
		String c3_limpio = c3.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
		if (c1_limpio.compareToIgnoreCase(c2_limpio) < 0 &&  c1_limpio.compareToIgnoreCase(c3_limpio) < 0 &&  c2_limpio.compareToIgnoreCase(c3_limpio) < 0) {
			System.out.println(c1+"\n"+c2+"\n"+c3);
		}
		if (c1_limpio.compareToIgnoreCase(c2_limpio) < 0 &&  c1_limpio.compareToIgnoreCase(c3_limpio) < 0 &&  c3_limpio.compareToIgnoreCase(c2_limpio) < 0) {
			System.out.println(c1+"\n"+c3+"\n"+c2);
		}
	}
	public static void Caso2 (String c1, String c2, String c3) {
		String c1_limpio = c1.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
		String c2_limpio = c2.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
		String c3_limpio = c3.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
		if (c1_limpio.compareToIgnoreCase(c2_limpio) < 0 &&  c1_limpio.compareToIgnoreCase(c3_limpio) < 0 &&  c2_limpio.compareToIgnoreCase(c3_limpio) < 0) {
			System.out.println(c1+"\n"+c2+"\n"+c3);
		}
		if (c1_limpio.compareToIgnoreCase(c2_limpio) < 0 &&  c1_limpio.compareToIgnoreCase(c3_limpio) < 0 &&  c3_limpio.compareToIgnoreCase(c2_limpio) < 0) {
			System.out.println(c1+"\n"+c3+"\n"+c2);
		}
	}
	public static void Caso3 (String c1, String c2, String c3) {
		String c1_limpio = c1.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
		String c2_limpio = c2.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
		String c3_limpio = c3.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
		if (c1_limpio.compareToIgnoreCase(c2_limpio) < 0 &&  c1_limpio.compareToIgnoreCase(c3_limpio) < 0 &&  c2_limpio.compareToIgnoreCase(c3_limpio) < 0) {
			System.out.println(c1+"\n"+c2+"\n"+c3);
		}
		if (c1_limpio.compareToIgnoreCase(c2_limpio) < 0 &&  c1_limpio.compareToIgnoreCase(c3_limpio) < 0 &&  c3_limpio.compareToIgnoreCase(c2_limpio) < 0) {
			System.out.println(c1+"\n"+c3+"\n"+c2);
		}
	//La solucion tambien funciona en caso de hacer una verificacion en el main
	}
}
