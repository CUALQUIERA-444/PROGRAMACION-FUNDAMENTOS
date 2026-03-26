package Practica6;

import java.util.Scanner;

public class Ejercicio6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5.En unos multicines se están proyectando dos películas en dos salas
		 * distintas. Cada persona que llega compra varias entradas para la misma
		 * película. Realizar un programa en el que se anota por cada persona que llega
		 * a la taquilla el número de sala y el número de entradas que compra para esa
		 * sala, el programa finaliza al anotar la sala 0. Mostrar el número total de
		 * entradas vendidas y decir para que sala se han vendido más entradas. Decir
		 * además si ha habido alguien que haya comprado más de 10 entradas.
		 */
		/*
		 * Lógica La idea es que hay 2 salas y debemos hacer que por cada persona se
		 * anote la cantidad de entradas que vaya a comprar dicha persona Cada persona
		 * debe tener un numero de sala que será descrito por el propio usuario
		 * 
		 */
		/*
		 * Variables y sentencias de control 1 para guardar el numero de sala del
		 * usuario (int) 1 constante que guarde el maximo de entradas compradas (int) 1
		 * Que tenga el total de las entradas entre una y otra (int) 2 Que tengan el
		 * recuento de las entradas entre la sala 1 y la sala 2 (int) 2 para guardar las
		 * respectivas entradas de cada una 2 constantes para cada respectiva sala tipo
		 * solo la 1 y 2 Ya que se asume que solo hay 2 salas (int) un if para comparar
		 * la cantidades de dichas salas y su else otro if para ir comparando las
		 * personas que han comprado mas de 10 entradas
		 */
		Scanner sc = new Scanner(System.in);
		final int entradas_maximo = 10, salaA = 1, salaB = 2, salir = 0;
		int entradas_totales = 0;
		int entradas_A = 0;
		int entradas_B = 0;
		int entradas_AT = 0;
		int entradas_BT = 0;
		int sala_usuario = 0;
		int contador_usuarios = 0;
		do {
			sala_usuario = 3;
			while (sala_usuario != 1 && sala_usuario != 2 && sala_usuario != 0) {
				System.out.println("Introduce el numero de sala");
				sala_usuario = sc.nextInt();
				if (sala_usuario != salaA && sala_usuario != salaB && sala_usuario != 0) {
					System.out.println("Vuelva a intentarlo solo hay 2 salas posibles");
				}
			}
			// Si el cero entra a esto coge lo que sea de la persona anterior por lo que es
			// necesario que este bloque se ejecute única y exclusivamente
			if (sala_usuario != 0) {
				if (sala_usuario == salaA) {
					System.out.println("Introduce las entradas que quiera comprar");
					entradas_A = sc.nextInt();
					entradas_B = 0; // Se reinicia para evitar colapso en las entradas_AT ya que si no cogería el
									// último valor y haría la operación y no queremos eso
					// osea tipo
					// 1 vuelta = 10 entradas A
					// 2 vueltas = 10 entradas B 20 entradas A NO

					// 1 vuelta = 10 entradas A
					// 2 vueltas = 10 entradas B 10 entradas A SI Algo asi java tiene diversas
					// complicaciones que hay que remediar
				} else if (sala_usuario == salaB) {
					System.out.println("Introduce las entradas que quiera comprar");
					entradas_B = sc.nextInt();
					entradas_A = 0; // Se reinicia para evitar colapso en la entradas_BT ya que si no cogería el
									// último valor y haría la operación
				}
				if (entradas_A > entradas_maximo || entradas_B > entradas_maximo) {
					contador_usuarios++;
				}
				entradas_AT = entradas_A + entradas_AT;
				entradas_BT = entradas_B + entradas_BT;
				entradas_totales = entradas_AT + entradas_BT; // Si es cero puede ser que nunca entre por aquí
			}
		} while (sala_usuario != salir);
		if (entradas_AT > entradas_BT) {
			System.out.println("Se han comprado mas entradas para la sala " + salaA);
		} else if (entradas_AT < entradas_BT) {
			System.out.println("Se han comprado mas entradas para la sala " + salaB);
		}
		System.out.println("Se han comprado un total de " + entradas_totales + " entradas");
		System.out.println("Han comprado mas de 10 entradas un total de " + contador_usuarios + " personas");
	}
}
