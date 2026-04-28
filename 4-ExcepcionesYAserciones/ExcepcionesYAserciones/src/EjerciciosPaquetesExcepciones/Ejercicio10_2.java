package EjerciciosPaquetesExcepciones;

import java.util.*;
import java.util.Scanner;

public class Ejercicio10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Lee dos cadenas. Haz una función que devuelva el número de veces que la
		 * primera está incluida en la segunda. Devuelve una excepción propia si
		 * cualquiera de las dos está vacía.
		 */
		/*
		 * Logica y codigo necesario Para hacer este ejercicio debemos entender el
		 * siguiente concepto String s; -> La variable no existe todavía (error de
		 * compilación si la usas). (El compilador grita sin boca) String s = null; ->
		 * La variable existe pero apunta al vacío absoluto. (NullPointerException grita
		 * sin boca2) String s = ""; -> Esta es la cadena vacía. Tiene un valor, pero su
		 * contenido es nada. (Esta es la que grita excepcion propia) Ahora lo que
		 * necesitamos hacer es OTRA VEZ LO DEL INDEXOF que no me gusta para devolver la
		 * cantidad de veces que encuentras la primera cadena en la segunda cadena (No
		 * tienen que ser estrictamente mayor o menor) segun el enunciado Necesitamos 2
		 * strings un entero para las veces que se repite y una excepción personalizada
		 * en caso de que .isEmpty sea verdad o length==0)
		 */
		Scanner sc = new Scanner(System.in);
		String c1;
		String c2 = "";
		int contador_ap = 0;
		do {
			System.out.println(
					"Introduce 2 cadenas y te diremos la cantidad de veces que una se encuentra dentro de otra (Introduzca un cero en cualquiera de las 2 si quiere terminar");
			c1 = sc.nextLine();
			if (!c1.equalsIgnoreCase("0"))
				c2 = sc.nextLine();
			if (!c1.equals("0") && !c2.equals("0")) {
				try {
					contador_ap = ContarApariciones(c1,c2);
					if (contador_ap > 0) {
						System.out.println("Se ha encontrado la cadena " + c1 + " un total de " + contador_ap + " veces");
					}
						else {
						System.out.println("No se ha encontrado la cadena");
					}
				} catch (CadenaVaciaException e) {
					System.out.println("Error ninguna cadena puede estar vacía vuelva a intentarlo");
				}
			}
		} while (!c1.equals("0") && !c2.equalsIgnoreCase("0"));
		System.out.println("Gracias por ejecutarme");
	}

	public static int ContarApariciones(String c1, String c2) throws CadenaVaciaException {
		if (c1.isEmpty() || c2.isEmpty()) { // O c1.length == 0 || c2.length == 0
			throw new CadenaVaciaException("Las cadenas no pueden estar vacias");
		}
		c1 = c1.toLowerCase();
		c2 = c2.toLowerCase();
		// Caso contrario
		int pos = 0; // Determina posicion inicial
		int busqueda = c2.indexOf(c1, pos); // Empieza a buscar desde el principio usando la posicion inicial
		int contador = 0;
		while (busqueda != -1) { // Mientras la encuentre se ejecuta
			contador++; // Actualiza el contador
			pos = c2.indexOf(c1, pos) + c1.length(); // Actualiza la posicion ejemplo si lo encuentra en la primera
			// posicion y tiene 3 letras 1 + 3 = 4 posicion 4
			// y en la siguiente vuelta empieza a buscar de alla
			busqueda = c2.indexOf(c1, pos); // Actualiza la busqueda
		}
		return contador; // Devuelve las apariciones
	}
}
