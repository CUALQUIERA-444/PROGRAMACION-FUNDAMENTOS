package ejerciciosarrays;

import java.util.Scanner;

public class Ejercicio5_1 {
    static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* 5.Queremos llevar las ventas de 6 comerciales. Primero anota el nombre de los
		comerciales. Después, mientras lo desee el usuario lee el nombre de comercial y
		las unidades vendidas por éste y acumúlalas. Al finalizar muestra por cada
		comercial el número de ventas realizadas.
	*/
		
	//PASO 1 LLEVAR LAS VENTAS DE 6 COMERCIALES 
		String comerciales[] = new String[6];
		int unidades[] = new int [6];
		String respuesta;
		String nombre;
		int acumulador = 0;
		for (int i = 0; i < comerciales.length; i++) {
			System.out.println("Introduce el nombre del comercial "+(i+1));
			comerciales[i] = sc.nextLine();
		}
		for (int b = 0; b < unidades.length;b++) {
			System.out.println("Introduce el número de ventas "+(b+1));
			unidades[b] = sc.nextInt();
		}
		for (int a = 0 ; a < comerciales.length; a++) {
			System.out.println("Comercial "+(a+1)+" "+comerciales[a]);
			System.out.println("Venta "+(a+1)+" "+unidades[a]);		
		}
		sc.nextLine();
		System.out.println("Desea agregar información");
		respuesta = sc.nextLine();
		
		while (respuesta.equalsIgnoreCase("SI")) {
			System.out.println("Introduzca nombre de comercial");
			nombre = sc.nextLine();
		for(int a = 0; a < comerciales.length; a++)	{
			if(nombre.equalsIgnoreCase(comerciales[a])) {
				System.out.println(unidades[a]);	
				System.out.println("Introduce unidades a añadir");
				acumulador = sc.nextInt();		
				acumulador = acumulador+unidades[a];
				unidades[a] = acumulador;
				System.out.println(acumulador);
			}
		}
			sc.nextLine();
			System.out.println("Desea agregar información");
			respuesta = sc.nextLine();
		}
	}
}
