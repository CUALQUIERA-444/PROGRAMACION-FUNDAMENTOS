package práctica7;

import java.util.Scanner;
// Lógica
//28/10/2025 28 + 10 + 2025 -> 2063 (FUNCION SUMAR) 2 + 0 + 6 + 3 --> 11 = (FUNCION SUMAR) 1 + 1 = 2
// 2063 % 10 = 3 206 % 10 = 6 20 % 10 = 0 2 % 10 = 2 0 
public class Begoña_Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce tu fecha de nacimiento: ");
		System.out.print("\tDía: ");
		int dia = sc.nextInt();
		System.out.print("\tMes: ");
		int mes = sc.nextInt();
		System.out.print("\tAño: ");
		int año = sc.nextInt();
		int suma = dia+mes+año;
		while ( suma > 9) {
			suma = sumarCifras(suma);
			System.out.println(suma);
		}
		}
	public static int sumarCifras (int numero) {
		int suma = 0;
		while (numero > 0) {
			suma = suma+ (numero%10);
			numero = numero/10;
		}
		return suma;
	}
}
