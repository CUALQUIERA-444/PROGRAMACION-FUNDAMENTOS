package Practica8;

import java.util.Scanner;

public class Ejercicio8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Programa que lee nombres de ciudades europeas y cuenta cuantas empiezan
por una letra introducida por teclado
 */
/* Logica y codigo necesario
 * La idea es un bucle que mientras quiera el usuario vaya leyendo nombres de ciudades europeas
 * Validaremos Estas Madrid,Roma,Atenas,Londres basicamente lo que hay que hacer es limitar al usuario 
 * a solo introducir estas para que asi el programa valore en base a eso lo siguiente
 * Despues de validar el nombre de la ciudad le preguntaremos al usuario por un caracter dicho
 * caracter dara completamente igual usar tildes o mayusculas pero de todas formas validaremos usando replace para limpiar
 * ya lo veran un switch case tambien permite facilmente validar 
 */
	Scanner sc = new Scanner (System.in);
	String ciudad_europea;
	boolean aceptar;
	char caracter = ' ';
	int contador_letras = 0;
	System.out.println("Introduce un caracter");
	caracter = sc.nextLine().replace("Á", "A").replace(" ", "").replace("É", "E").replace("Í", "I").replace("Ó", "O").replace("Ú", "U").toUpperCase().charAt(0);
	do {
	System.out.println("Introduce una ciudad europea (Escriba fin si quiere terminar asegurese escoger entre 1 de estos Madrid|Roma|Atenas|Londres)");
	ciudad_europea = sc.nextLine().toUpperCase().replace("Á", "A").replace(" ", "").replace("É", "E").replace("Í", "I").replace("Ó", "O").replace("Ú", "U");
	if (!ciudad_europea.equals("FIN")) {
	aceptar = ValidarCiudad(ciudad_europea);
	if(!aceptar) {
		System.out.println("Vuelva a intentarlo");
	}
	else {
		if(caracter == ciudad_europea.charAt(0)) {
			contador_letras++;
		}
	}
	}
	} while (!ciudad_europea.equals("FIN"));
	if(caracter != ' ') {
	System.out.println("En total la cantidad de ciudades europeas que empiezan por la letra "+caracter+" es de "+contador_letras+" ciudades");
	}
	else {
		System.out.println("NADA");
	}
	}
	public static boolean ValidarCiudad(String c_u) {
		if (c_u == null) { //No importa lo que devuelva el metodo ahi que ser cauteloso
			return false;
		}
		else {
		switch (c_u) {
		case "MADRID":
		case "ROMA":
		case "ATENAS":
		case "LONDRES":
		return true;
		default: 
		return false;
		}
		}
//Se puede hacer al reves pero se requiere de arrays
}
}