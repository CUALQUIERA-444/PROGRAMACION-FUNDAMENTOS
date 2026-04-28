package Practica6_Bis;

import java.util.Scanner;

public class EjercicioS_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*7. Programa que nos dice si un número es perfecto ( son perfectos aquellos números
				tales que la suma de sus divisores exceptuando el propio número da como
				resultado dicho número)
		*/
		/* Logica 
		 * Un número perfecto para entenderlo es necesario saber que basicamente es aquel que la suma de todos sus divisores 
		 * Excluyendose asi mismo da el mismo numero por ejemplo toma el 6 = 1 + 2 + 3 = 6
		 * Entonces lo que tenemos que hacer un bucle que recorra numeros hasta llegar al objetivo y mientras tanto usar ese numero 
		 * y si es divisor ir sumando finalmente comparando si ambos numeros son iguales y por tanto averiguando si es perfecto
		 */
		/* Variables sentencias de control funciones etc...
		 * Una variable que guarde el número del usuario (int)
		 * Una variable booleana que al final diga si el número es perfecto (boolean)
		 * Una función que se encarge de devolver el veredicto final despues del recorrido
		 * Un acumulador que acumule la suma de todos los numeros siempre y cuanto sean divisibles (int = 0)
		 * Un if que interroge si el número es divisor del número correspondiente
		 */
		Scanner sc = new Scanner (System.in);
		int numero_usuario;
		boolean esperfecto;
		System.out.println("Introduce un número \"Y te diremos si es perfecto\" ");
		numero_usuario = sc.nextInt();
		esperfecto = EsPerfecto(numero_usuario);
		if (esperfecto == true) {
			System.out.println("El numero "+numero_usuario+" es perfecto");
		}
		else {
			System.out.println("El numero "+numero_usuario+" no es perfecto");
		}
	}
	public static boolean EsPerfecto(int n_u) {
		int acumulador_divisores = 0;
		for (int i = 1; i<n_u;i++) {
			if(n_u % i == 0) {
				acumulador_divisores += i;
			}
		}
		if (acumulador_divisores == n_u)
			return true;
		return false;
	}
}
