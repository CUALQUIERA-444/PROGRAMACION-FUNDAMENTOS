package EjerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Tarjeta char o String 
 * 8. Dado un array de 10 números decid
 * cual es el número que más se repite.
 */
/* Lógica código y anotaciones
 * Esto consiste en hacer un array de longitud 10 y usando un array comodin para ir guardando los contadores
 * Se guardan los resultados pero una vez que un número sea distinto El contador vuelve a cero una vez acabado los 10 numeros
 * Se empiezan a comparar las posiciones.
 * Necesitamos 2 arrays de enteros así como bucles anidadados entre ellos rellenando un array extra que almacene un maximo de 10 contadores
 * SI EL NUMERO SE ENCUENTRA se añade 1 A LA POSICION Y SE ACHICA EL ARRAY POR QUE REDUCE LA CANTIDAD DE NÚMEROS DISTINTOS QUE PUEDEN APARECER EL DE LOS CONTADORES
 * SI NO SE ENCUENTRA AL FINAL DEL BUCLE SE AÑADE EN LA SIGUIENTE POSICION 1 
 */
	Scanner sc = new Scanner(System.in);
	int contador = 0;
	int arrayPrincipal[] = new int [10]; //ARRAY DE NÚMEROS 
	int arrayContadores[] = new int [10]; //ARRAY DE CONTADORES
	int arrayUnicos[] = new int[10];//NUEVO ARRAY PARA GUARDAR LOS NUMEROS ANTERIORES
	int limitador = 0; //Tamaño real del delimitador 
	//Se deja hasta que termine de recorrer todos los numeros una vez recorridos todos los números se usa el limitador para reducir la cantidad de espacios a recorrer
	//En ambos casos 
	//Rellenamos el Array
	for (int i = 0; i<arrayPrincipal.length;i++) {
		System.out.println("Introduce numeros para rellenar el Array");
		arrayPrincipal[i] = sc.nextInt();
	}
	Arrays.sort(arrayPrincipal); //Se ordena para mejor referencia el Array de contadores "todavía no existe por lo que podemos
	//Estar tranquilos ordenando unicamente de esta forma
	//Creamos el Array de Contadores más abajo
	for (int i = 0; i<arrayPrincipal.length;i++) { //Empieza A recorrer un número 
		if(i == 0 || arrayPrincipal[i] != arrayPrincipal[i-1]) { //Si es la primera posicion o es distinto al anterior
			arrayUnicos[limitador] = arrayPrincipal[i]; //Pasamos el numero al array 
			arrayContadores[limitador] = 1 ; //En la posicion le añadimos 1 
			limitador++; //Se pasa a la siguiente posicion del limitador 
		}
		else {
			arrayContadores[limitador-1]++; //Se añade al siguiente uno COMO LIMITADOR VALE SI O SI MAS DE 0 SE SUMA A LIMITADOR 
		}
	//Despues usamos el nuevo array para rellenar un espacio y añadir 1 al limite
	}
	int max = 0;
	int ganador = 0;
	for (int i = 0; i<limitador;i++) {
		System.out.print("["+arrayUnicos[i]+" "+arrayContadores[i]+"]");
		if(arrayContadores[i]> max) {
			max = arrayContadores[i];
			ganador = arrayUnicos[i];
		}
	}
	System.out.println(" ");
	System.out.println("El ganador es "+ganador);
	}
}
