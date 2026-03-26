package Practica7;

import java.util.Scanner;

public class Ejercicio7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 10. Programa que dado un número de tres cifras, averigüe si es un número de
Armstrong: la suma de cada uno de los números que lo componen elevado al
número de dígitos de dicho número da como resultado el propio número.
153= 1 + 125 + 27 = 153
 */
/* Notas Aunque viendolo desde la perspectiva de operar se vería posible 
//NO SE PUEDE SACAR EL ARMSTRONG DE UN Número negativo debido a inconsistencias con los pares entre otras cosas.
/Armstrong se define como número de amor propio en el que la suma de todos sus digitos elevada a la cantidad exacta de digitos que posee da como resultado ese número
 */
 /*
  * Lógica Se necesia validar en una función que el número no se negativo ni tenga mas de 3 cifras:
  * Despues se requiere sacar el número de armstrong guardaremos el número original en una variable 
  */
	Scanner sc = new Scanner(System.in);
	int numero_usuario;
	do {
	System.out.println("Introduzca su número y le diremos si se trata de un número de armstrong o no");
	numero_usuario = sc.nextInt();
	if(!EsPositivo(numero_usuario))  { //Si es falso imprime el mensaje y se vuelve a ejecutar
		System.out.println("Lo siento el número debe ser positivo");
	} 
	if(!Tiene3Cifras(numero_usuario) && EsPositivo(numero_usuario)) { //Si lo primero es verdad y lo segundo falso muestra este mensaje y se vuelve a ejecutar
		System.out.println("Lo siento debe tener 3 cifras estrictamente");
	}
	}
	while(!Tiene3Cifras(numero_usuario) || !EsPositivo(numero_usuario)); //Ambos deben ser true si uno es false se sigue ejecutando hasta que no lo sea
	numero_usuario = Armstrong(numero_usuario);
	if(numero_usuario == -1) 
		System.out.println("Su número no es un número de Armstrong "+numero_usuario);
	else {
		System.out.println("Su número es número de Armstrong "+numero_usuario);
	}
	}
	public static boolean EsPositivo(int n_u) {
		if(n_u < 0) {
			return false;
		}
		return true;
	}
	public static boolean Tiene3Cifras (int n_u) {
		if(n_u < 100 || n_u > 999) {
			return false;
		}
		return true;
	}
	public static int Armstrong (int numero_us) {
	final int cubo = 3;
	int cifra1 = numero_us / 100;
	int cifra2 = numero_us / 10 % 10;
	int cifra3 = numero_us % 10;
	if((int)Math.pow(cifra1, cubo) + (int)Math.pow(cifra2, cubo) + (int)Math.pow(cifra3, cubo) == numero_us) 
		return numero_us;
	else 
		return -1; 
	}
}
