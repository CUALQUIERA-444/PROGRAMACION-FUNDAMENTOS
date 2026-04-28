package Practica8;

import java.util.Scanner;

public class Ejercicio8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. Programa que lee nombre y primer apellido de personas. Para cada una de ellas
genera un código con la primera letra del nombre y las tres primeras del apellido. Si
dicho apellido tiene una longitud inferior a 3, se le pide el segundo apellido y se cogen
sus tres primeras letras. Si éste, también tiene menos longitud se genera el código con
la primera del nombre y el apellido completo que sea más largo de los dos. El código se
genera en una función.
 */
/* Lógica y código necesario
 * Necesitamos leer el nombre de una persona asi como su apellido en primer lugar 
 * Si el apellido es muy largo (mas de tres letras) entonces se pide el segundo (Todavia no generar)
 * Si el segundo tambien resulta ser muy largo se genera con el apellido mas largo (Todavia no generar)
 * Una vez verificado esto podemos hacer la funcion que se encarga de evaluar
 * Usaremos una funcion de tipo String a la cual se le pasan los mismos parametros pero se evaluaran cosas distintas
 * 3 condiciones 3 string para los apellidos y .length()
 */
	Scanner sc = new Scanner (System.in);
	final int longitud = 3;
	String nombre;
	String apellido1;
	String apellido2 = "";
	String codigo;
	System.out.println("Introduce tu nombre");
	nombre = sc.nextLine();
	System.out.println("Introduce tu apellido");
	apellido1 = sc.nextLine();
	if (apellido1.length() < longitud) {
	System.out.println("Introduce tu segundo apellido");
	apellido2 = sc.nextLine();
	}
	codigo = GenerarCodigo(nombre,apellido1, apellido2,longitud);
	System.out.println("Su codigo es "+codigo);
	}
	public static String GenerarCodigo (String n,String ap1,String ap2,int l) {
		if (ap1.length() >=  l) {
			return n+ap1.substring(0,l);
		}
		else if(ap2.length() >= l) {
			return n+ap2.substring(0,l);
		}
		else {
			if (ap1.length() > ap2.length()) {
				return n+ap1;
			}
			else {
				return n+ap2;
			}
		}			
	}
}
