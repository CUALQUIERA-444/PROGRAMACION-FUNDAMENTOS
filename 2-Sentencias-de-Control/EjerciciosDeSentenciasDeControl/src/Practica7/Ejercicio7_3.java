package Practica7;

import java.util.Scanner;

public class Ejercicio7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. Programa que calcula el factorial de un número, éste no debe ser negativo
4!= 4*3*2*1 = 24 Empieza a multiplicar desde el más grande
El factorial de 0 aparentemente es 1 por que un factorial representa las "formas" en las que vos podees entregar un resultado y si bien lo logico es pensar 
NO HAY OBJETO = NO HAY FORMAS lo cierto es que en "MATEMATICAS PROGRAMACION" Tienes una forma que es entregar todo vacio
 */
		/*
		 * Lógica 
		 * El factorial de un numero se calcula con la multiplicacion de todos los anteriores 
		 * Para ello se necesita un for inverso que vaya desde el numero original hasta llegar al uno y usar un acumulador para ir guardando la multiplicacion entre los numeros anteriores
		 *
		 */
		/*
		 * Variables funciones etc..
		 * Necesitamos una variable que recoja el numero sobre el cual se hace el factorial 
		 * Otro que almacene el resultado 
		 * Un bucle for dentro de la función sobre la cual se va a calcular el factorial
		 * Un acumulador que lleve la multiplicacion de todo
		 */
		Scanner sc = new Scanner(System.in);
		int numero_usuario; 
		int factorial;
		System.out.println("Introduce el numero \"Y calcularemos su factorial\"");
		numero_usuario = sc.nextInt();
		if(numero_usuario < 0 ) {
			System.out.println("Lo siento no se permiten numeros negativos");
		}
		else {
		factorial = CalcularFactorial(numero_usuario);
		System.out.println("El factorial del "+numero_usuario+" es "+factorial);
		}
	}
	public static int CalcularFactorial(int user_number) {
		int acumulador_f = 1; //Si se usa cero todo lo posterior va a ser 0 por lo que usamos 1 para que el numero se mantenga
		for (int i = user_number; i>=1 ; i--) {
			acumulador_f *= i;
		}
		return acumulador_f;
	}
}
