package Practica6;

import java.util.Scanner;

public class Ejercicio6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Leer números de teclado hasta que la suma de todos ellos sea mayor a 100, y decir si se ha
anotado algún cero.
 */
/*
 * Lógica 
 * Usar un do while para cada uno de los números y e ir verificando en cada iteracion si se ha anotado un cero
 * Una vez la suma de todos los numeros introducidos es mayor a 100 se termina el bucle y se deja de pedir datos
 */	
/*
 * Variables
 * Un acumulador que vaya acumulando la suma de todos los numeros 
 * Un contador para cuando el numero introducido sea 0
 * Una variable para guardar los numeros del usuario
 */
	Scanner sc = new Scanner(System.in);
	int acumulador_suma = 0;
	int contador_cero = 0;
	int numero_usuario;
	do {
	System.out.println("Introduce números enteros");
	numero_usuario = sc.nextInt();
	if(numero_usuario == 0) {
		contador_cero++;
	}
	else {
		acumulador_suma+= numero_usuario;
	}
	} while (acumulador_suma <= 100);
	System.out.println("Resultado "+acumulador_suma);
	System.out.println("Cantidad de ceros introducidos "+contador_cero);
	}
}
