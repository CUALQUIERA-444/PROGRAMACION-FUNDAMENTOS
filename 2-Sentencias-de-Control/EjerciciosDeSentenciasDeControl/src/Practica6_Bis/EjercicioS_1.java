package Practica6_Bis;

import java.util.Scanner;

public class EjercicioS_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Programa que lee un número y lo escribe invertido
 */
	/*
	 * NOTAS 
	 * NO FUNCIONA CON CEROS QUE TERMINEN A LA IZQUIERDA Y DERECHA
	 */
	/*
	 * Lógica 
	 * Básicamente invertir el número consiste en el proceso de coger las cifras e imprimirlas
	 * Puede existir el caso que el usuario me introduzca 0009 y el quiere posteriormente 9000
	 * Para controlar este tipo de situaciones hacemos lo siguiente 
	 * Primero con un contador determinanos cuantas cifras tiene el número
	 */
	/* 
	 * Variables funciones sentencias...
	 * Un do-while para primero determinar nuestra condición de escape para la siguiente vuelta
	 */
	Scanner sc = new Scanner(System.in);
	int numero_normal;
	int numero_invertido = 0;
	boolean validar;
	do {
	System.out.println("Introduce un número y se lo mostraremos invertido");
	numero_normal = sc.nextInt(); 
	validar = ValidarNumero(numero_normal);
	if(validar == false) {
		System.out.println("Debe introducir un número mayor que 0");
	}
	} while(validar == false);
	numero_invertido = InvertirNumero(numero_normal,numero_invertido); 
	System.out.println(numero_invertido);
	}
	public static boolean ValidarNumero(int numero_normal) {
		return numero_normal > 0;
	}
	public static int InvertirNumero(int n_b, int n_p) {
		int ultimo_digito = 0;
		do {
			ultimo_digito = n_b % 10;//Sacar el digito 
			n_b = n_b / 10;	//Reducir el número
			n_p = (n_p * 10) + ultimo_digito; //"Escribir el número invertido" Y acumular en n_p los digitos mas los ultimos 0 * 10 = 0 + 3 = 3 * 10 = 30
			//Tambien se podría con un simple bucle pero la idea es entendible
			//ESTO EVITA LA SOBREESCRITURA
		} while (n_b > 0);
		return n_p;
	}
}
