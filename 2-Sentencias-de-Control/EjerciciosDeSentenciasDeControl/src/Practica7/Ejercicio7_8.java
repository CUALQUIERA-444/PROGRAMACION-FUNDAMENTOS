package Practica7;

import java.util.Scanner;

public class Ejercicio7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 8. Variar el ejercicio del lucky number para que el programa solicite tantas
		 * fechas de nacimiento como quiera el usuario. Utilizar una función para
		 * calcularlo
		 */
		/*
		 * Notas El lucky number se calcula asi 19/07/2000 = 19+7+2000 = 2026 2+0+2+6 =
		 * 10 = 1+0 = 1
		 * 10 es mayor que 9 por lo que debería seguir ejecutandose en ese caso
		 * Primero se divide el primer numero modulo se comprueba primeramente si el primer número es mayor que 9 ya que si no ya se trataria del número de la suerte
		 * En caso de ser mayor entra al segundo while el segundo while dicta que si el numero tiene todavia digitos sin contar que el numero entre aca 
		 * y sea despedazado  
		 */
		// Lógica
		/*
		 * Es similar al ejercicio a aquel que hicimos hace un tiempo Basicamente es
		 * usar el modulo y la división de forma adecuada Las fechas de por si deben ser
		 * verificadas se va evaluando cada una viendo que esten correctas
		 */
		Scanner sc = new Scanner(System.in);
		char continuar;
		int dia_nacimiento = 0;
		int mes_nacimiento = 0;
		int año_nacimiento = 0;
		int lucky_number;
		boolean validador;
		do {
			validador = false;
			while (validador == false) {
				System.out.println("Introduce el día de tu nacimiento");
				dia_nacimiento = sc.nextInt();
				validador = ValidarDia(dia_nacimiento);
				if (validador == false) {
					System.out.println("Lo siento es posible que el día introducido no sea válido vuelva a intentarlo");
				}
			}
			validador = false;
			while (validador == false) {
				System.out.println("Introduce el mes de tu nacimiento");
				mes_nacimiento = sc.nextInt();
				validador = ValidarMes(dia_nacimiento, mes_nacimiento); // Posible falta de inicialización
				if (validador == false) {
					System.out.println(
							"Lo siento es posible que el mes introducido no sea válido o no coincida con los parametros regulares vuelva a intentarlo");
				}
			}
			validador = false;
			while (validador == false) {
				System.out.println("Introduce el año de tu nacimiento");
				año_nacimiento = sc.nextInt();
				validador = ValidarAño(dia_nacimiento, mes_nacimiento, año_nacimiento); // Posible falta de
																						// inicialización
				if (validador == false) {
					System.out.println("Lo siento es posible que el día introducido no sea válido vuelva a intentarlo");
				}
			}
			lucky_number = HallarSuerte(dia_nacimiento, mes_nacimiento, año_nacimiento);
			System.out.println("Su número de la suerte es " + lucky_number);
			sc.nextLine(); // Limpiar buffer
			do {
				System.out.println("Desea continuar? \"S|N\"");
				continuar = sc.nextLine().charAt(0);
				if (continuar != 'S' && continuar != 'N') {
					System.out.println("Ciñase a nuestras reglas");
				}
			} while (continuar != 'S' && continuar != 'N');
		} while (continuar == 'S');
	}

	public static boolean ValidarDia(int dia_nac) {
		if (dia_nac < 1 || dia_nac > 31) {
			return false;
		}
		return true;
	}

	public static boolean ValidarMes(int dia_nac, int mes_nac) {
		if (mes_nac < 1 || mes_nac > 12) {
			return false;
		}
		if ((dia_nac == 31) && (mes_nac == 2 || mes_nac == 4 || mes_nac == 6 || mes_nac == 9 || mes_nac == 11)) { //Un mes no puede ser varias cosas a la vez
			return false;
		}
		if (dia_nac == 30 && mes_nac == 2) {
			return false;
		} else {
			return true;
		}
	}
	public static boolean ValidarAño(int dia_nac, int mes_nac, int año_nac) {
		boolean bisiesto = (año_nac % 4 == 0 && año_nac % 100 != 0 || año_nac % 400 == 0);
		if (año_nac < 1900) {
			return false;
		}
		if (dia_nac == 29 && mes_nac == 2 && bisiesto == false) {
			return false;
		}
		return true;
	}

	public static int HallarSuerte(int dia_nac, int mes_nac, int año_nac) {
		//EL número de la suerte SIEMPRE DEBE SER DE UN DÍGITO
		int suerte = dia_nac + mes_nac + año_nac;
		int apoyo; //Este es la victima
		int acumulador_SumaCifras;
		while (suerte > 9) { //Si el numero de la suma da mas que un numero de un digito entra aca
			apoyo = suerte; //Guardamos este numero en una variable auxiliar que sera salvajemente decuartizado
			acumulador_SumaCifras = 0; //Cada vez que se requiera almacenar una nueva suma se inicializa esto a 0 por que si no se queda con el valor anterior
			while (apoyo > 0) {
				acumulador_SumaCifras = acumulador_SumaCifras + apoyo % 10; //GUarda y realiza la suma de todas las cifras 
				apoyo /= 10; //Descuartiza la variable auxiliar
				suerte = acumulador_SumaCifras; //La variable usada para "Seguir cortando y sumando" toma el valor de la suma de las cifras
			}
		}
		//La acumulacion final de la suma de cifras se asigna a suerte
		/*while (primera_suma > 9) {
			cifras = primera_suma % 10; //Primero sacamos la cifra luego reducimos
			primera_suma = primera_suma / 10;
			segunda_suma = cifras + segunda_suma;
		}
		cifras = 0;
		//29
		segunda_suma = segunda_suma + primera_suma;
		while (segunda_suma > 9) { // 29  2 
			cifras = segunda_suma % 10; // 9
			segunda_suma = segunda_suma / 10; //2 
			suerte = cifras + suerte;  //9+0 = 9 
		}
		suerte = segunda_suma + suerte; //Si no entra ejecuta esto que es basicamente si fuera 9 pues 9 + 0
		*/
		return suerte;
		}
}
