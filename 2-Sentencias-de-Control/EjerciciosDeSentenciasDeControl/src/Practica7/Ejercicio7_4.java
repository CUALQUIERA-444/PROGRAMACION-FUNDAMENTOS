package Practica7;

import java.util.Scanner;

public class Ejercicio7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 4. Ampliar el ejercicio anterior para calcular el factorial de todos los números que
quiera el usuario.
 */
		/*
		 * Notas ¿Se puede calcular el factorial de estos numeros?
		 * ¿Negativos? No. (Indefinido).
		 * ¿Decimales? Sí, mediante la Función Gamma,
		 *  pero no se llaman "factoriales" en el sentido estricto de la palabra (que es para números naturales). Es muy complejo de hacer
		 */
		/*
		 * Lógica
		 * Es lo mismo que el anterior pero añadiendo una pregunta al usuario de si quiere seguir con el programa o no 
		 */
		/*
		 * Variables sentencias funciones etc...
		 * Un char para preguntar al usuario si quiere seguir o no 
		 * Un entero para guardar el numero del cual se calculará el factorial
		 * Un entero para guardar el factorial y llamar a la función
		 * Un bucle for para calcular el factorial 
		 * Un if en caso de que el numero sea 0 o negativo
		 * Otro if para verificar las letras introducidas
		 */
		Scanner sc = new Scanner (System.in);
		int factorial;
		int numero_usuario;
		char opcion;
		do {
			System.out.println("Introduzca el numero sobre el que quiere sacar el factorial");
			numero_usuario = sc.nextInt();
			if(numero_usuario < 0) {
				System.out.println("Lo siento no puede sacar factoriales de números negativos");
			}
			else {
				factorial = CalcularFactorial(numero_usuario);
				System.out.println("El factorial del numero "+numero_usuario+" es de "+factorial);
			}
			sc.nextLine(); //Limpiar buffer antes de entrar no es necesario hacerlo en bucle
			do {
			System.out.println("Desea continuar? \"S|N|s|n\" ");
			opcion = sc.nextLine().charAt(0);
			if(opcion != 'S' && opcion != 's' && opcion != 'N' && opcion != 'n') {
			System.out.println("Vuelva a intentarlo");	
			}
			} while (opcion != 'S' && opcion != 's' && opcion != 'N' && opcion != 'n');
		if(opcion == 'n' || opcion == 'N') { //Se puede poner al final del bucle 
			System.out.println("Programa finalizado");
	}
		} while (opcion == 'S' || opcion == 's');
}
	public static int CalcularFactorial (int user_num) {
		int acumulador_f = 1;
		for (int i = user_num; i>=1; i--) {
			acumulador_f*=i;
		}
		return acumulador_f;
	}
}
