package Practica8;

import java.util.Scanner;

public class Ejercicio8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 4. Programa que valida un DNI introducido por teclado. Utilizar una función para
validarlo
 */
/*
 * Logica y codigo necesario 
 * Usamos regex para validar el DNI empezando por que tenga los numeros
 * Despues usamos un algoritmo raro que consiste en coger la cadena y convertirlo a numero excepto el caracter
 * despues hacer modulo de 23 con ese numero el 23 es primo y por razones externas a la programacion asi se determina el caracter final del dni	
 * Se te devolvera un número entre 0 y 22 que usaremos como indice para buscarlo en la siguiente cadena 
 * TRWAGMYFPDXBNJZSQVHLCKE Si lo encuentra es que el dni es valido y si no pues no es valido
 * Usaremos un string y un booleano para el main un regex para la funcion asi como Integer para convertir y como la 
 * tabla para buscar la letra
 */
	Scanner sc = new Scanner (System.in);
	String DNI;
	do {
	System.out.println("Introduce un DNI y lo válidaremos o introduzca fin si quiere terminar");
	DNI = sc.nextLine();
	if (!DNI.equalsIgnoreCase("FIN")) { 
	if (esValido(DNI.toUpperCase())) { //Asegura mayusuculas y minusculas
		System.out.println("Su DNI es válido");
	}
	else {
		System.out.println("Su DNI no es válido reviselo y vuelva a intentarlo");
	}
	}
	} while (!DNI.equalsIgnoreCase("FIN"));
	System.out.println("Gracias por ejecutarme");
	}
	public static boolean esValido(String DNI) {
		String regex = "^\\d{8}[A-Z]$";
		int indice_buscar;
		String tabla = "TRWAGMYFPDXBNJZSQVHLCKE"; //Tabla para buscar posteriormente
		if (!DNI.matches(regex)) {
			return false;
		}
		int conversion = Integer.parseInt(DNI.substring(0,8));
		indice_buscar = conversion % 23;
			if (tabla.charAt(indice_buscar) == DNI.charAt(DNI.length()-1)) {
				return true;
				}
			return false;
	}
}
