package Practica3;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 5. Diseñar un programa que calcule el precio de un billete de ida y vuelta por avión,
conociendo la distancia a recorrer, el número de días de estancia y sabiendo que si la
distancia es superior a 1.000 Km. y el número de días de estancia es superior a 7, la línea
aérea le hace un descuento del 30 %. (Precio por kilómetro = 0,05€.).
 */
	//Se asume que el billete de ida tiene el mismo precio que el de vuelta
	Scanner sc = new Scanner (System.in);
	sc.useLocale(Locale.ENGLISH);
	final double max_distancia = 1000,precio_km = 0.05,descuento = 30;
	final int max_dias = 7;
	double precio_inicial,distancia,precio_final;	
	int dias_estancia;
	System.out.println("Introduzca la distancia de su viaje");
	distancia = sc.nextDouble();
	System.out.println("Introduzca la cantidad de dias que va a estar");
	dias_estancia = sc.nextInt();
	precio_inicial = precio_km * distancia;
	if(distancia > max_distancia && dias_estancia > max_dias) 
	precio_final = (precio_inicial - precio_inicial * descuento / 100)* 2;
	else 
	precio_final = precio_inicial * 2;
	System.out.println("Sus billetes tanto de ida como de vuelta tendrán el precio de "+precio_final+" euros");
}
}