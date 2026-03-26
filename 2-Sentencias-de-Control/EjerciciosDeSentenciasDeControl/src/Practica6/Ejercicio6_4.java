package Practica6;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *En un museo se tienen las siguientes tarifas:

        Normal Reducida
Adultos 3 euros 2 euros
Niños 2 euros 1,2 euros

Hacer un programa en el que se simula la compra de entradas en el museo de la siguiente
forma:
Por cada grupo que llega se anota el número de adultos y el número de niños y si se aplica
tarifa reducida o no. Con esta información se calcula el importe total de las entradas de
cada grupo y se muestra por pantalla. El programa termina cuando se hayan recaudado
más de 100 euros.
Mostrar al final el número de entradas del grupo que más entradas ha comprado.
 */
	/*
	 * Lógica 
	 * Cada grupo puede tener adultos y niños 
	 * Dependiendo de eso hay que ir s 
	 * Al no tener una condicion para reducir la inventaremos nosotros (En nuestro caso será preguntandole al usuario (Es un error lo se pero mas no se me ocurre que no involucre strings)
	 * Hay que calcular el importe total de cada grupo y guardar cuantas entradas por grupo se compran
	 * 
	 */
	/*
	 * Variables y sentencias de control
	 * 1 para guardar el numero de adultos del grupo (int)
	 * 1 para guardar el numero de niños del grupo (int)
	 * 1 para guardar el numero de adultos del grupo que recibiran tarifa reducida (int)
	 * 1 para guardar el numero de niños del grupo que recibiran tarifa reducida (int)
	 * 1 (int) para llevar la cuenta de las entradas compradas
	 * un if para asignar al valor en caso de que se empieze a hacer comparaciones
	 * 1 (double) acumulador que lleve el precio de todo (suma) de la recauddacion por grupo.
	 * 1 (double) que lleve el importe de cada grupo
	 * 4 final double para llevar los precios fijos
	 * Un do while para llevar la iteracción
	 * un int para poner la condicional de asignar el maximo a la primera entrada
	 */
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	final double normalA = 3, reducidaA = 2, normalN = 2, reducidaN = 1.2, recaudacion_max = 100;
	int entradas;
	int entradas_max = 0; //Inicializar por que puede ser que no tenga valor posteriormente
	int niños_n;
	int adultos_n;
	int niños_r;
	int adultos_r;
	int niños_t;
	int adultos_t;
	int primera_vuelta = 0;
	int imprimir_bonito = 0;
	double total = 0;
	double total_grupo;
	do {
		System.out.println("Introduce cuantos niños y adultos hay en su grupo");
		niños_t = sc.nextInt();
		adultos_t = sc.nextInt();
		entradas = niños_t + adultos_t;
		do {
		System.out.println("Introduce cuantos niños y adultos se les va a aplicar tarifa reducida");
		niños_r = sc.nextInt();
		adultos_r = sc.nextInt();
		if(niños_t < niños_r || adultos_t < adultos_r) {
			System.out.println("Lo siento pero debe introducir datos coherentes");
		}
		}
		while(niños_t <niños_r || adultos_t < adultos_r);
		if(primera_vuelta == 0) {
			entradas_max = entradas;
			primera_vuelta = 1;
		}
		else if (entradas > entradas_max){
			entradas_max = entradas;
		}
		adultos_n = adultos_t - adultos_r;
		niños_n = niños_t - niños_r;
		total_grupo = niños_n * normalN + niños_r * reducidaN + adultos_n * normalA + adultos_r * reducidaA;
		total = total_grupo + total;
		imprimir_bonito++;
		System.out.println("El total de dinero del grupo "+imprimir_bonito+" es de "+total_grupo+ " euros");
	} while(total <= recaudacion_max);
	System.out.println("Se recaudo un total de "+total+" euros");
	System.out.println("El grupo que más entradas compró compro un total de "+entradas_max);
	}
}
