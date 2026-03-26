package Practica6_Bis;

import java.util.Scanner;

public class EjercicioS_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 7. Programa que nos dice si un número es perfecto ( son perfectos aquellos números
tales que la suma de sus divisores exceptuando el propio número da como
resultado dicho número)
 */ 
/*
 * Experimento
 * 6 / 1 = 1  6 / 2 = 3  1 + 6 / 3 = 2  3 + 2 + 1 = 6
 * 2 / 1 = 2  1 NO ES PERFECTO
 */
/* 
 * Lógica un número perfecto se halla de forma que los divisores empezando por uno y den resto 0 se 
 */	
/*
 * Logica Variables funciones...
 * La idea es un bucle que vaya pidiendo numeros en si mientras el usuario quiera y le diga si son perfectos o no 
 * Un entero para guardar el numero del usuario
 * Una funcion para validar el numero
 * Una funcion que compruebe si es perfecto
 * Una funcion que permite si continuar o no introduciendo numeros
 * booleano siesperfecto
 * char para ver si quiere continuar
 */
	int numero_usuario;
	boolean esperfecto;
	char continuar_usuario;
	char confirmar_continuacion;
	Scanner sc = new Scanner(System.in);
	do {
		do {
		System.out.println("Introduce un número y le diremos si es perfecto");
		numero_usuario = sc.nextInt();
		numero_usuario = ValidarNumero(numero_usuario);
		if(numero_usuario == -1) 
			System.out.println("Número no válido");
		} while(numero_usuario == -1 );
	esperfecto =  Esperfecto(numero_usuario);
	if(esperfecto) {
		System.out.println("Es perfecto");
	}
	else {
		System.out.println("No es perfecto");
	}
	sc.nextLine();
	do {
	System.out.println("Desea Continuar");
	continuar_usuario = sc.nextLine().toUpperCase().charAt(0);
	confirmar_continuacion = ConfirmarContinuacion(continuar_usuario);
	if(confirmar_continuacion == 'E')
		System.out.println("Lo siento ciñase a lo escrito");
	} while ("")
	else if(confirmar_continuacion == 'N') {
		System.out.println("Ok terminamos");
		break;
	}
	} while (continuar_usuario == 'S');
	}
	public static int ValidarNumero(int n_u) {
		if(n_u <= 0) 
			return -1;
		return n_u;
	}
	public static boolean Esperfecto(int n_u) {
		int factor;
		int suma_factores = 0;
		for (int i = 1; i<n_u;i++) {
			if(n_u % i == 0) {
				factor = i;
				suma_factores = suma_factores + factor;
			}
		}
		if(suma_factores == n_u)
			return true;
		return false;
	}
	public static char ConfirmarContinuacion(char c_u) {
		if(c_u != 'S' && c_u != 'N') {
			return 'E';
		}
		return c_u;
	}
}
