package Practica4;

import java.util.Scanner;

public class Ejercicio4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Dado un número entero positivo de tres cifras (leído como tal), escríbase un
programa que escriba en pantalla sus cifras en orden inverso.
/Lógica 
 * Usar las divisiones y los modulos para realizar este trabajo
 */
	//1 OPCION 
	int numero;
	int unidad;
	int decena;
	int centena;
	Scanner sc = new Scanner (System.in);
	System.out.println("Introduce un número para darle la vuelta");
	numero = sc.nextInt();
	unidad = numero % 10;
	decena = numero / 10 % 10;
	centena = numero / 100;
	System.out.println(unidad+""+decena+""+centena);
	//2 OPCION sin siquiera variables la idea es entrenar la agilidad mental pero en cuanto a limpieza de codigo esto no es lo mas recomendable
	//Basicamente por que ahorrar codigo implica que este tambien sea legible
	System.out.println((numero % 10)+""+(numero/10 % 10)+""+(numero/100));
	}
}
