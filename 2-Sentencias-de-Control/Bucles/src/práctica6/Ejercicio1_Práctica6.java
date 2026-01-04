package práctica6;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1_Práctica6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letra;
		char primera_letra;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int contador_primera_letra = 0;
		System.out.println("Introduzca la letra para saber el número de veces que se repite la primera");
		primera_letra = sc.nextLine().charAt(0);
		System.out.println(primera_letra);
		for (int i = 0; i <= 49; i++) {
			letra = (char)(r.nextInt(26)+'a'); // Sumas 97 a las partes de 0 o 25
			System.out.println(letra);
			if (letra == primera_letra)
				contador_primera_letra++;
		}
		System.out.println("La cantidad de veces que se ha escrito la primera letra es de:" + contador_primera_letra);
	}
	}

