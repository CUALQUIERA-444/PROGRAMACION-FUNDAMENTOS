package Practica7;

import java.util.Scanner;

public class Ejercicio7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 7. Programa que lee números (1 a 365) correspondientes al número de orden de
		 * un día y nos dice la fecha Ejemplo: 34 ................. 3 de Febrero
		 * 
		 * Leer tantos números como el usuario quiera, utilizar un método que recibe un
		 * número y escribe la fecha.
		 */
		/*
		 * Logica si cada fecha se haya sumando los dias totales que hacen un mes + al
		 * llegar al mes correspondiente sumar Osease 10/02/20 = 31 + 10 = 41 Para
		 * averiguar el dia correspondiente a 41 se resta 41 - 31 = 10 y el mes 1 + 1 =
		 * 2 dia 87 = 87 - 28 = 60 - 31 = 28 mes = 1 + 1 + 1 + 3 En cada caso el bucle
		 * es disntinto
		 * "Aunque se puede evaluar en cada caso y terminar el bucle dependiendo" Al no
		 * tener el año definido Se toma en cuenta que el año no es bisiesto de todas
		 * formas por que es del dia 1 a 365
		 */
		/*
		 * Variables funciones sentencias ... Una variable que guarde el número
		 * introducido por el usuario Una función que se encarge de evaluar el número en
		 * cuestión si está entre 1 y 365 Una funcion que se encarge de hallar la fecha
		 * Un string que dependiendo las opciones saca un mes u otro
		 */
		Scanner sc = new Scanner(System.in);
		int orden_dia;
		char continuar;
		do {
			do {
				System.out.println("Introduce un número y le diremos el dia con su mes");
				orden_dia = sc.nextInt();
				if (ValidarNumero(orden_dia) == false) {
					System.out.println("El número no es válido");
				}
			} while (ValidarNumero(orden_dia) == false);
			SacarDiaMes(orden_dia);
			sc.nextLine(); // Limpiar buffer
			do {
				System.out.println("Desea continuar (S|N)");
				continuar = sc.nextLine().charAt(0);
				continuar = Character.toUpperCase(continuar);
				if (continuar != 'S' && continuar != 'N') {
					System.out.println("Debe introducir lo que se le pide");
				}
			} while (continuar != 'S' && continuar != 'N');
			if (continuar == 'S') {
				System.out.println("Ok continuamos");
			}
		} while (continuar == 'S');
	}

	public static boolean ValidarNumero(int d) {
		if (d < 1 || d > 365) {
			return false;
		}
		return true;
	}

	public static void SacarDiaMes(int orden_dia) {
		// Reducir mientras los dias no sean mayores que 31 y sacar cada mes que ha
		// pasado se cuenta con un contador hasta que el numero sea menor que 0
		int contadorMes = 1;
			while (orden_dia > HallarMes(contadorMes)) { // Esto es para que se ejecute mientras que tenga dias de sobra en ese mes
				orden_dia = orden_dia - HallarMes(contadorMes);
				contadorMes++;
			}
			System.out.println(orden_dia + " de " + MesBonito(contadorMes));
		}

	public static int HallarMes(int mes) {
		switch (mes) {
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return 28;
		default:
			return 31;
		}
	} // Ctrl+F11 automaticamente reinicia el lucky number

	public static String MesBonito(int MesBonito) {
		switch (MesBonito) {
		case 1:
			return "Enero";
		case 2:
			return "Febrero";
		case 3:
			return "Marzo";
		case 4:
			return "Abril";
		case 5:
			return "Mayo";
		case 6:
			return "Junio";
		case 7:
			return "Julio";
		case 8:
			return "Agosto";
		case 9:
			return "Septiembre";
		case 10:
			return "Octubre";
		case 11:
			return "Noviembre";
		case 12:
			return "Diciembre";
		default:
			return "Error";
		}
	}
}