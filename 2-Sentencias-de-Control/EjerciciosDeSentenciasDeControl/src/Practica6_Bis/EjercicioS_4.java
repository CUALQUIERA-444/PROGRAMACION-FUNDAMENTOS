package Practica6_Bis;

import java.util.Scanner;

public class EjercicioS_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4. Haced un programa para aprender el abecedario de la siguiente manera: El
		 * usuario va anotando las letras del abecedario en orden : a, b, c, d ,e ... si
		 * falla una el programa le indica que ha fallado , dándole la respuesta
		 * correcta. Se le permiten dos fallos antes de volver a empezar desde el
		 * principio. En total el usuario tiene tres intentos. Realizad el programa para
		 * que acepte minúsculas y la letra ñ. Modificad el programa para que acepte
		 * tanto mayúsculas como minúsculas.
		 */
		/*
		 * Nota El abecedario tiene 27 letras en total
		 */
		/*
		 * Lógica Básicamente la idea de este ejercicio es hacer un abecedario en la que
		 * el usuario puede fallar hasta tres veces Si falla tres veces se vuelve a
		 * empezar hasta que no complete el abecedario Si se equivoca una o 2 veces o 3
		 * veces se le debe notificar la letra correcta lo ideal seria que si fuera otro
		 * simbolo pues tambien contará como entrada incorrecta
		 */
		/**
		 * Se pide la letra al usuario y se compara con la letras acertadas que
		 * almacenamos Es decir el usuario me introduce una letra y debo comparar en
		 * función de eso decirle si lo que ha escrito esta bien ejemplo A y a Valen B y
		 * b tambien valen C o c tambien valen pero tiene que ser el orden La idea en si
		 * es asociarlo a un contador que en función de la letra devuelva el contador
		 */
		Scanner sc = new Scanner(System.in);
		char letra; // Letra del usuario
		char letra_acertada; // Extraer la letra del abecedario y compararla
		int contador_letras = 0; // Contar las letras para que dependiendo del número saque una letra u otra "El
									// abecedario tiene 27 letraa"
		int contador_fallas = 0; // Cuenta las fallas en caso de que el usuario se equivoque
		int contador_aciertos = 0; // Cuenta los aciertos que el usuario ha tenido y los compara (La idea es que el
									// usuario llegue a introducir todo" Mientras no se equivoce 3 veces
		int total = 27;
		// Si se equivoca una vez se le quita el acierto pero las letras que debe
		// introducir son las mismas a que si acertara todo a que si se equivocase 1 o 2
		// veces
		System.out.println("Introduce las letras del abecedario");
		while (contador_letras < total) {
			letra = sc.nextLine().toUpperCase().charAt(0); // Letra del usuario
			letra_acertada = ExtraerLetraAbecedario(contador_letras); // Busca letra
			if (letra_acertada == letra) { // Compara letra con la respuesta correcta
				System.out.println(letra_acertada);
				System.out.println(letra);
				contador_aciertos = contador_aciertos + 1;
				contador_letras++;
				if (contador_letras < total) { // La razón por la que es muy cabezón es por que la suma se hace despues
												// y al poner Z 26 < 27 Entra aca 
					// La solucion es sumar tanto en el if como en el else
					System.out.println("Bien hecho ¿Cúal es la siguiente letra?");
				} else {
					System.out.println("Felicidades");
				}
			} else {
				contador_fallas++;
				contador_letras++;
				if (contador_fallas <= 3) // Realmente el hecho de que se impriman con condiciones me mata
					System.out.println("Lo siento pero la letra acertada era " + letra_acertada + " ");
			}
			if (contador_fallas == 3) {
				System.out.println("Vuelva a intentarlo desde el principio");
				contador_letras = 0;
				contador_fallas = 0;
				contador_aciertos = 0;
			}
		}
		System.out.println(contador_fallas + " Fallas");
		System.out.println(contador_aciertos + " Aciertos");
	}

	public static char ExtraerLetraAbecedario(int c_l) {
		switch (c_l) {
		case 0:
			return 'A';
		case 1:
			return 'B';
		case 2:
			return 'C';
		case 3:
			return 'D';
		case 4:
			return 'E';
		case 5:
			return 'F';
		case 6:
			return 'G';
		case 7:
			return 'H';
		case 8:
			return 'I';
		case 9:
			return 'J';
		case 10:
			return 'K';
		case 11:
			return 'L';
		case 12:
			return 'M';
		case 13:
			return 'N';
		case 14:
			return 'Ñ';
		case 15:
			return 'O';
		case 16:
			return 'P';
		case 17:
			return 'Q';
		case 18:
			return 'R';
		case 19:
			return 'S';
		case 20:
			return 'T';
		case 21:
			return 'U';
		case 22:
			return 'V';
		case 23:
			return 'W';
		case 24:
			return 'X';
		case 25:
			return 'Y';
		case 26:
			return 'Z';
		default:
			return '1';
		}
	}
}
