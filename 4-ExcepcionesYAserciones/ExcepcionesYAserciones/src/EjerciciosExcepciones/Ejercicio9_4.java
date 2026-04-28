package EjerciciosExcepciones;

import java.util.Scanner;

public class Ejercicio9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 4. Modifica la función que valida el DNI para que dé error si los primeros
caracteres no son dígitos usando NumberFormatException.
 */
/* Lógica y código necesario
 * Necesitamos volver a esa función que valida el DNI pero esta hay que asegurarse de que el proceso 
 * que se encarga de convertir los números en dígitos (Integer.parseInt) de correcto y si da un error
 * Salta una excepcion esta vez no usaremos matches solamente usaremos la excepcion y el algoritmo del DNI para 
 * hacer este ejercicio
 * Dentro del main 
 * Necesitamos un booleano que valide el DNI 
 * Un string que guarde el DNI
 * Una función que devuelva true o false en función de lo que el usuario introduzca 
 * Un bucle que vaya preguntando mientras el usuario no introduzca bien el DNI o no Introduzca FIN
 */
	String DNI;
	boolean esValido;
	Scanner sc = new Scanner (System.in);
	do {
	System.out.println("Introduce un DNI y te diremos si es válido o no (Introduzca FIN si quiere terminar el programa)");
	DNI = sc.nextLine();
	if(!DNI.equalsIgnoreCase("FIN")) {
		esValido = ValidarDNI(DNI);
			if(esValido) {
				System.out.println("Su DNI es válido");
			}
			else {
				System.out.println("Su DNI no es válido");
			}
	}
	} while (!DNI.equalsIgnoreCase("FIN"));
	System.out.println("Gracias por ejecutarme");
	}
	public static boolean ValidarDNI(String DNI) {
		DNI = DNI.toUpperCase();
		int conversion;
		int indice_tabla;
		String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
		if(DNI.length() != 9) {
			return false; //Verifica que la cadena primero tenga 9 caracteres al menos 
			//Además evita excepciones como el StringIndexOutOfBounds
			//Una recomendacion si un if termina en return se puede escribir el codigo sin un else
		}
		else {
			try { //Intenta realizar la accion que le da excepción
				conversion = Integer.parseInt(DNI.substring(0,8));
			}
			catch (NumberFormatException e) { //Devuelve falso si la excepcion ocurre en lugar del texto rojo
				return false;
			}
		    indice_tabla = conversion % 23;
			if(tabla.charAt(indice_tabla) != DNI.charAt(DNI.length()-1)) {
				return false;
			}
			return true;
			}
	}
}
