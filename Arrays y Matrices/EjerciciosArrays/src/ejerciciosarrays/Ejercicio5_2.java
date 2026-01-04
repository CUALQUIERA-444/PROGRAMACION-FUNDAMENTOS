package ejerciciosarrays;

import java.util.Scanner;

public class Ejercicio5_2 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5.Queremos llevar las ventas de 6 comerciales. Primero anota el nombre de los
comerciales. Después, mientras lo desee el usuario lee el nombre de comercial y
las unidades vendidas por éste y acumúlalas. Al finalizar muestra por cada
comercial el número de ventas realizadas.
		 */
			//Recorre Array y lo rellena 
			String comercial [] = new String [6];
			int unidades [] = new int [6];
			String usuario_comercial;
			int extras;
			String continuar = "si";
			for (int i = 0; i<comercial.length;i++) {
			System.out.println("Introduce un nombre de comercial "+(i+1));
			comercial[i] = sc.nextLine();
			}
			for (int a = 0; a<unidades.length;a++) {
			System.out.println("Introduce las unidades iniciales a asignar al comercial "+(a+1));
			unidades[a] = sc.nextInt();
			}
			
			//Corroborar que el array esta bien viendo si podemos imprimir ambos arrays UN FOR
			for (int b = 0; b<comercial.length;b++) {
				System.out.println("Nombre del comercial "+(b+1)+" "+comercial[b]);
				System.out.println("Cantidad inicial de ventas del comercial "+(b+1)+" "+unidades[b]);
			}
			sc.nextLine();
		//HACER UN BUCLE DONDE MIENTRAS QUE LA PERSONA QUIERA PIDA EL NOMBRE DEL COMERCIAL Y AÑADA MÁS PRODUCTOS
			do {
				System.out.println("Introduzca el nombre del comercial");
				usuario_comercial = sc.nextLine();
				for (int i = 0; i<comercial.length;i++) {
				if ( usuario_comercial.equalsIgnoreCase(comercial[i])) {
					System.out.println("Unidades acumuladas en las ventas "+unidades[i]);
					System.out.println("Introduzca las unidades extras a añadir");
					extras = sc.nextInt();
					extras = extras + unidades[i];
					unidades[i] = extras;
				}
			}
				sc.nextLine();
				System.out.println("Desea continuar? (SI/NO)");
				continuar = sc.nextLine();
				if(continuar.equalsIgnoreCase("NO"))
					break;
			}
			while (continuar.equalsIgnoreCase("SI"));
			//MOSTRAR EL ARRAY CON LAS UNIDADES ACUMULADAS Y EL NOMBRE
			for (int b = 0; b<comercial.length;b++) {
				System.out.println("NOMBRE "+comercial[b]+" UNIDADES "+unidades[b]);
			}
	}
}
