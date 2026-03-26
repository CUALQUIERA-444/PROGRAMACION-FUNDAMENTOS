package Practica3;

import java.util.Scanner;

public class Ejercicio3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 9. Programa que recibe como datos de entrada una hora expresada en horas,
		 * minutos y segundos y nos devuelve la hora, minutos y segundos que serán
		 * transcurridos un segundo más tarde
		 */
		/*
		 * Plano El usuario pide una hora expresada en el formato de horas minutos y
		 * segundos Y le tenemos que devolver dicha hora despues de 1 segundo que
		 * dependiendo lo que nos pida habra que hacer/comprobar mas o menos cosas
		 * Primero necesitamos comprobar que en si lo que nos introduce sea valido para
		 * operar sobre eso es decir horas entre 0 y 23 minutos entre 0 y 59 y segundos
		 * entre 0 y 59 respectivamente Posteriormente tendremos nuestros datos
		 * validados por lo que hay que ir viendo cada condicion en este caso no voy a
		 * usar variables adicionales para valores escritos a mano Asumiremos primero el
		 * caso más particular que es aquel en el que tanto la hora como los minutos y
		 * los segundos tengan que modificarse La hora ya está lista Ahora los minutos
		 * pueden ser de 0 a 58 y los segundos 59 que habria que modificarse Por ultimo
		 * simplemente los segundos Variables hasta el momento 3 para guardar cada dato
		 * y posteriormente mostrar cada modificación
		 */
		int horas;
		int minutos;
		int segundos;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la hora \"Acuerdese de escribir una hora logica\"");
		horas = sc.nextInt();
		System.out.println("Introduzca los minutos \"Acuerdese de escribir unos minutos logicos\"");
		minutos = sc.nextInt();
		System.out.println("Introduzca los segundos \"Acuerdese de escribir unos segundos logicos\"");
		segundos = sc.nextInt();
		if ((horas < 0 || horas > 23) || (minutos < 0 || minutos > 59) || (segundos < 0 || segundos > 59))
			System.out.println("Lo siento le adverti que escribiese datos válidos");
		else {
			if (segundos == 59 && minutos == 59 && horas == 23) {
				segundos = 0;
				minutos = 0;
				horas = 0;
			} else if (segundos == 59 && minutos == 59) { // No necesariamente hay que poner el horas !=23 es redundante
				segundos = 0;
				minutos = 0;
				horas = horas + 1;
			} else if (segundos == 59) {
				minutos = minutos + 1;
				segundos = 0;
			} else
				segundos = segundos + 1;
			System.out.println("Su hora tras un segundo es " + horas + ":" + minutos + ":" + segundos);
		}
	}
}