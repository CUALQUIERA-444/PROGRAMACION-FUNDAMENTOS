package Practica6;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6_7 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
/*
 * 7. Programa que determina cuantas cifras tiene un número
 */
	/*
	 * Logica 
	 * La idea es que cada vez que divides entre 10 vas contando por cada vez que divides hasta que el numero sea menor que 10 ya que a partir de ahi pues no hay mas cifras
	 * Usamos un do while para realizar esta tarea (Simulador de for)
	 * En si no se si funcionara con decimales 
	 * 
	 */
		/*
		 * Notas
		 * Las cifras de los numeros decimales tanto atrás como delante de la coma cuentan como cifras
		 * No todos los números decimales son menores que sus versiones enteras realmente depende del tipo
		 * Los ceros a la derecha no suelen contar como cifras decimales ya que Java se encarga de aproximar dichos valores ejemplo 2,000 = 2 1 cifra
		 */
		/*
		 * Lógica 
		 * Para los decimales la idea es que si es el numero decimal es 0.algo ir multiplicando asi mismo contando las cifras por las que se recorre ya que 
		 */
		/* 
		 * Variables (el número xd) (empezare con int) (ahora podemos seguir con double);
		 * un contador que vaya contando por cada vuelta la "cifra";
		 * PD: Por ahora me restringuiere a enteros positivos
		 */
	Scanner sc = new Scanner (System.in);
	int numero_usuario;
	int numero_original;
	int contador_cifras = 0;
	System.out.println("Introduce un número");
	numero_usuario = sc.nextInt();
	numero_original = numero_usuario;
	do {
		numero_usuario = numero_usuario / 10;
		contador_cifras++;
	}
	while(numero_usuario > 0);
	System.out.println("El numero "+numero_original+" tiene "+contador_cifras+" cifras");
	}
}


