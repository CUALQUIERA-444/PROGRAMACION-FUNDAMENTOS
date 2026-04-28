package Practica8;

import java.util.Scanner;

public class Ejercicio8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 6. Programa que nos dice si una palabra se lee igual del derecho que del
		 * revés.
		 */
		/*
		 * Logica y codigo necesario La idea es clara si tomas algo como ana y le das la
		 * vuelta se escribe igual pero esto es debido a que las letras (varia
		 * dependiendo de la palabra pero para este ejemplo ponle 2) son las mismas al
		 * derecho que al reves Ejemplos ana -> a reconocer -> reco oso -> o Por lo que
		 * la idea es recorrer un bucle desde la primera letra hasta un poco menos de la
		 * mitad e ir comparando con las ultimas letras Para ver si se escriben igual
		 * usaremos una funcion un for un booleano .charAt y un if Por cierto este tipo
		 * de palabras se denominan palindromos
		 */
		Scanner sc = new Scanner(System.in);
		boolean espalindromo;
		String palabra;
		do {
			System.out.println("Introduce una palabra y te diremos si se escribe igual al derecho que al reves");
			palabra = sc.nextLine().toUpperCase().replace("Á", "A").replace("Ú", "U").replace("É", "E")
					.replace("Í", "I").replace("Ó", "O");
			if (!palabra.equals("FIN")) {
				espalindromo = EsPalindromo(palabra);
				if (espalindromo) {
					System.out.println("Se escribe igual al derecho que al reves");
				} else {
					System.out.println("No se escribe igual al derecho que al reves");
				}
			}
		} while (!palabra.equals("FIN"));
		System.out.println("Gracias por ejecutarme");
	}

	public static boolean EsPalindromo(String palabra) {
		int bajar = 1;
		for (int i = 0; i < (palabra.length()-1) / 2; i++) {
			if (palabra.charAt(i) != palabra.charAt(palabra.length() - bajar))
				return false;
				bajar++;
		}
		return true;
	}
}
