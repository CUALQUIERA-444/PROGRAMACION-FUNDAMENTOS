package Practica8;

import java.util.Scanner;

public class Ejercicio8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Programa que lee cadenas hasta anotar “fin” 
 * y las muestra en mayúsculas.
 */
/* 
 * Logica y Variables 
 * Lo que tenemoos que hacer es un bucle que se vaya ejecutando mientras que la palabra introducida no sea fin entonces
 * Por lo que requerimos de un string por parte del usuario un do while que se ejecute y muestre mientras lo que 
 * sea introducido no sea fin y evitar que se muestre fin en caso de ejecutar ademas de .toUpperCase para mostrarla en mayuscula
 * 
 */
	Scanner sc = new Scanner (System.in);
	String cadena;
	do {
	System.out.println("Introduce una cadena \"Y te la mostraremos en mayusculas\"");
	cadena = sc.nextLine().toUpperCase();
	if(!cadena.equals("FIN"))
		System.out.println(cadena);
	} while (!cadena.equals("FIN"));
	System.out.println("Gracias por ejecutarme");
	}
}
