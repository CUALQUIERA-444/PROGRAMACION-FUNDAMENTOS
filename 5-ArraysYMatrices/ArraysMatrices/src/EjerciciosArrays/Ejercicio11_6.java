package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio11_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 6. Leed números de teclado del 0 al 9 hasta que lo desee el usuario. Mostrad al
finalizar cuántos números se han leído de cada uno. Usad un array de frecuencias.
 */
/* Lógica programación y notas 
 * La idea es leer numeros del 0 al 9 hasta que el usuario lo desee 
 * Usando los indices tenemos que contar cuantos numeros hay de cada por ejemplo cada vez que se 
 * introduzca cero se va incrementando el valor de la posicion 0 y viceversa Se acaba cuando el usuario introduzca 
 * -1 Al menos para mi se lo indico en el sysout
 * Usamos un array de frecuencias de longitud 10 Porue el enunciado explicitamente dice números del 0 al 9 y pues son 10 numeros
 * xd sera usado como void para modificar el array sin tener que devolver nada (Por que no es necesario)
 * Una vez se acaba usamos otra función void para mostrar el array con los resultados
 */
	Scanner sc = new Scanner (System.in);
	int numero;
	int lista[] = new int[10];
	do {
		System.out.println("Introduce números del 0 al 9 (Si quiere terminar introduzca -1)");
	    numero = sc.nextInt();
	if (numero != -1 && (numero < 0 || numero > 9)) {
		System.out.println("Lo siento el número no es válido vuelva a intentarlo");
	}
	else if(numero != -1) {
		RellenarArray(numero,lista);
	}
	} while (numero != -1 && (numero >= 0 || numero <= 9));
	MostrarArray(lista);
	}
	public static void RellenarArray(int numero,int lista[]) {
		int acumular = 1; 
		for (int i = 0; i<lista.length; i++) {
			if(numero == i) {
				lista[i] = lista[i] + acumular ;
			}
		}
	}
	public static void MostrarArray(int lista[]) {
		for (int i = 0; i<lista.length; i++) {
			System.out.println("[ NÚMERO "+i+" CONTADOR "+lista[i]+" ]");
		}
	}
}
