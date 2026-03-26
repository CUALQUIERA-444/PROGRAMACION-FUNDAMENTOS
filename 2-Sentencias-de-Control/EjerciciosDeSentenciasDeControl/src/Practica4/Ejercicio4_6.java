package Practica4;

import java.util.Scanner;

public class Ejercicio4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6. Programa que lee una fecha y la valida
		/*
		 * Notas: Para este ejercicio usaremos el formato de dia/mes/año El año del
		 * reloj del ordenador es 1980 Si declaras e inicializas la variable bisiesto
		 * justo en medio de esos dos bloques else if, el código no compilará. En Java
		 * (y en la mayoría de los lenguajes derivados de C), la estructura if - else if
		 * - else debe ser una cadena continua. Si insertas una declaración de variable
		 * o cualquier otra instrucción entre un bloque y otro, rompes la conexión
		 * lógica.
		 */
		final int factor_Opc1 = 4, factor2_Opc1 = 100, factor_Opc2 = 400;
		int dia;
		int mes;
		int año;
		int validador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el dia");
		dia = sc.nextInt();
		System.out.println("Introduce el mes");
		mes = sc.nextInt();
		System.out.println("Introduce el año");
		año = sc.nextInt();
		boolean bisiesto = ((año % factor_Opc1 == 0 && año % factor2_Opc1 != 0) || año % factor_Opc2 == 0);
		if ((dia > 31 || dia ==0) || (mes > 12 || mes == 0) || año < 1980) {
			System.out.println("Valores no permitidos");
			validador = 1;
		} else if (dia == 31 && (mes != 1 && mes != 3 && mes != 5 && mes != 7 && mes != 8 && mes != 10 && mes != 12)) {
			System.out.println("Error ninguno de los meses que ha escogido tiene 31 dias");
			validador = 1;
		} else if ((dia == 30 || dia == 31) && mes == 2) {
			System.out.println("Febrero tiene como maximo 28 dias y en casos muy especificos 29");
			validador = 1;
		} else if (dia == 29 && mes == 2 && bisiesto == false) { // Un bisiesto usa la siguiente formaula 2004 % 4 == 0
																	// && 2004 % 100 !=0 || 2004 % 400 == 0
			System.out.println("Error no es bisiesto");
			validador = 1;
		}
		if (validador == 0) {
			System.out.println("Su fecha es valida");
		}
	}
}