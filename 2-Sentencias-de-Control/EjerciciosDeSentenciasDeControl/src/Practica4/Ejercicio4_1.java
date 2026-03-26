package Practica4;

import java.util.Scanner;

public class Ejercicio4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1. Programa que lee como datos de entrada una fecha expresada en día (del 1 al
		31), mes (del 1 al 12) y año (en número) y nos dice la fecha que será al día
	siguiente.
	*/
	/*
	 * Logica
	 * Lo primero es tener en cuenta el mes y el año por lo general siempre que pasa un dia hasta llegar al 31 
	 * Posteriormente debemos tener en cuenta el hecho de que si pasa el dia 31 el mes cambia 
	 * y si el mes es 12 todos los datos cambian
	 * NOTA la mayoria de los ordenadores tienen como minimo el año 1980 o 2000 registrado
	 */
	int dia = 0;
	int mes = 0;
	int año = 0; 
	int validador = 1;
	Scanner sc = new Scanner (System.in);
	System.out.println("Introduce el dia de hoy");
	dia = sc.nextInt();
	System.out.println("Introduce el mes actual");
	mes = sc.nextInt();
	System.out.println("Introduce el año actual");
	año = sc.nextInt();
	if((dia ==0 || dia > 31) || (mes ==0 || mes > 12) || (año < 1980 )) {
			validador = 0;
			System.out.println("Lo siento no se puede registrar esta fecha ");
	}
	else if(dia == 31 && mes == 12) {
		dia = 1;
		mes = 1;
		año++;
	}
	else if (dia == 31) {
		dia = 1;
		mes++;
	}
	else
		dia++;
	if(validador == 1) {
		System.out.println("Esta será su fecha al\"Al dia siguiente\""+" "+dia+":"+mes+":"+año);
	}
	}
}
