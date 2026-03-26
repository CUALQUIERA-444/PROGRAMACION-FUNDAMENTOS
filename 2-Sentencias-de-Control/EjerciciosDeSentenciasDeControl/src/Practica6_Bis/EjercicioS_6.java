package Practica6_Bis;

import java.util.Scanner;

public class EjercicioS_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 6. Programa que nos devuelve los N primeros números primos.
 * 
 */
/*
 * Notas N se refiere al numero del usuario osea los números primos hasta el numero del usuario
 * EL cero se descarta
/*
 * Lógica: Los números primos son aquellos cuyos divisores son 1 y el mismo y solo asi dan resto 0
 * La multiplicacion y la division son chamanes que purifican los signos negativos por lo que los numeros negativos no son primos además 
 * el concepto de numero primos no existe para números negativos.
 * Los decimales tampoco ya que tampoco existen los primos en el contexto de decimales con coma flotante 
 */	
/*
 * Vamos a hacerlo de 2 formas distintas una en la que saque X numeros primos y otra en la que saque números primos hasta llegar al número indicado por el usuario
 * Variables sentencias funciones...
 * El número del usuario (int)
 * Verificar que no sea negativo (Función de validación que devuelve o el número o -1) 
 * Un doble for (Uno para recorrer hasta el número y otro para ir dividiendo internamente ejemplo numero 10 10 / 2 = 5 resto 0 no es primo
 * 																										 11 11 / 2 = 5 resto 1 .. 11 / 10 = 1 Resto 1  es primo
 * 																									     15 15 / 
 * EL 1 no se considera primo por que solo tiene un divisor (El mismo) Y no cuenta el mismo 1 como dos divisores
 */
/** Usamos estas variables
 * 
 */
	int numero_alt1;
	int numero_alt2;
	Scanner sc = new Scanner (System.in);
	System.out.println("Introduce 1 número y te diremos todos los previos a este");
	System.out.println("Introduce 1 número y te diremos la cantidad de primos en función de número introducido");
	do {
	numero_alt1 = sc.nextInt();
	numero_alt2 = sc.nextInt();
	  numero_alt1 = ValidarNumero(numero_alt1);
	  numero_alt2 = ValidarNumero(numero_alt2);
	  if(numero_alt1 == -1 || numero_alt2 == -1) {
		  System.out.println("No puede ser negativo vuelva a intentarlo");
	  }
	  else  if(numero_alt1 == -2 || numero_alt2 == -2) {
		  System.out.println("El 1 no puede ser primo");
	  }
	} while (numero_alt1 == -1 || numero_alt2 == -1 || numero_alt1 == -2 || numero_alt2 == -2);
	NumerosPrimosA(numero_alt1);
	NumerosPrimosB(numero_alt2); //Si se queda atascado lo de abajo nunca se llega a ejecutar
	}
	public static int ValidarNumero(int numero) {
		if(numero < 1)
		return -1;
		else if (numero == 1) {
		return -2;
		}
	return numero;
	}
	public static void NumerosPrimosA (int numero_alt1) {
		/*
		 * 2 / 1 = 2 Resto 0
		 * 2 / 2 = 0 Resto 0
		 * 
		 * 4 / 1 = 4 Resto 0 
		 * 4 / 2 = 2 Resto 0  Si se le pone un if (i / j != 0) Se imprimiria 1 vez 4 
		 * 4 / 3 = 1 Resto 1 
		 * 4 / 4 = 1 Resto 0
		 * 
		 * 11 / 1 = 11 Resto 0 Si da resto 0 desde el 2 hasta el numero anterior no es primo
		 * 11 / 2 = 5 Resto 1
		 * 11 / 3 = 3 Resto 2
		 * 11 / 4 = 2 Resto 3
		 * 11 / 5 = 2 Resto 1
		 * 11 / 6 = 1 Resto 5
		 * 11 / 7 = 1 Resto 4
		 * 11 / 8 = 1 Resto 3
		 * 11 / 9 = 1 Resto 2
		 * 11 / 10 = 1 Resto 1
		 * 11 / 11 = 1 Resto 0
		 * La condición para que un número sea primo es aquel que el numero al dividirse de resto 0 solo si si divide entre 1 y el mismo 
		 */
		int i = 2;
		boolean esprimo = true;
		//int j = 2; Siempre empieza en 2 el bucle interno
	 for (;i<=numero_alt1;i++) {
		 for (int j = 2; j<i;j++) { //2 de limite si es menor que 3 3 / 1 = 3
			if (i % j == 0) { //Busca si encuentra rompe 
				esprimo = false;
				break;
			 }
	}
		 if (esprimo == true) 
				System.out.println("Forma A "+i);
				esprimo = true;
	 }
	}
//La segunda alternativa para los primos es que vaya sacando numeros primos en cantidad es decir que si le digo 10 me saque los 10 primeros numeros primos
//Y no los numeros primos hasta el 10 
	public static void NumerosPrimosB (int numero_alt2) {
		int i = 2;
		int contador_primos = 0;
		//Recorremos numeros desde el 2 hasta ??? mientras el contador_primos sea menor qeu el numero introducido
		while(contador_primos < numero_alt2) {
			boolean esprimo = true;
			for (int j = 2;j<i;j++) { //empieza en 2 2 / 2 No entra pero entra en la otra condición 
				if(i % j == 0) { //Si entra aca es primos
					esprimo = false;
					break;
				}
			}
			if(esprimo == true) {
				contador_primos++;
				System.out.println("Forma B "+i);
			}
			i++;
				//Se reinicia para que no se quede con el divisor
		}
		}
			}



