package Practica5;

import java.util.Scanner;

public class Ejercicio5_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 19.Programa que lea dos números enteros y muestre por pantalla todos los números
comprendidos entre esos dos, ambos incluidos. El programa no debe suponer que
el primero será menor que el segundo ni viceversa, pero sí deberá tenerlo en
cuenta para mostrar los números en orden creciente o decreciente según
corresponda
		 */
		/* Notas
		 * Los negativos se consideran enteros
		 * A lo que se refiere la frase de que el programa no supondra que el primero no será menor que el segundo y viceversa se refiere a que yo soy
		 * consciente de que el usuario me puede introducir los números en el orden que quiera así sin importar que el primero sea menor o mayor
		 */
		/*Lógica 
		 * Basicamente el usuario puede introducir el numero en cualquier orden pero hay que mostrarlos en formato decreciente o creciente dependido lo que haya que mostrar
		 */
		/*
		 * Variables y sentencias de control
		 * 2 numeros enteros (int) 
		 * 2 condicionales y su else y 2 bucles
		 */
		Scanner sc = new Scanner(System.in);
		int numero1;
		int numero2;
		System.out.println("Introduce un número");
		numero1 = sc.nextInt();
		System.out.println("Introduce un segundo número");
		numero2 = sc.nextInt();
		if(numero1 < numero2) {
			for (int i = numero1; i<=numero2;i++) {
				System.out.print(i+" ");
			}
		}
		else  {
			for (int j = numero1; j>=numero2;j--) {
				System.out.print(j+" ");
			}
			}
		}
		}

