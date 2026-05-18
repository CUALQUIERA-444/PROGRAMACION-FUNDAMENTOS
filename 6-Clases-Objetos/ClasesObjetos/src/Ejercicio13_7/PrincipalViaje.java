package Ejercicio13_7;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalViaje {
/*
 * Codificar un main que realice las siguientes operaciones:
1. Crear dos viajes.
2. Mostrad la información de ambos viajes.
3. Reservad varias plazas de ambos viajes.
4. Modificad el número de plazas del primer viaje.
5. Mostrad de nuevo la información de ambos viajes.
6. Mostrad el total recaudado por la agencia.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		// TODO Auto-generated method stub
		int n_plazas;
		int mod_plazas;
		int edades[];
		Viaje v1 = new Viaje("Australia","Peru",2,14,20);
		Viaje v2 = new Viaje ("Rio","Francia",3,5,10);
		do {
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println("Introduce el número de plazas que quiera reservar para el viaje 1 0 si quiere acabar el programa");
		n_plazas = sc.nextInt();
		if(n_plazas != 0) {
		edades = new int[n_plazas];
		for (int i = 0; i<edades.length; i++) {	
			System.out.println("Introduce la edad del pasajero "+(i+1));
			edades[i] = sc.nextInt();
		}
		double importe = v1.ReservarPlazas(n_plazas, edades);
		if(importe == 0) {
			System.out.println("No se pudo realizar la reserva");
		}
		else {
			System.out.printf("%.3f€",importe);
		}
		}
		System.out.println("Introduce el numero de plazas que quiera reservar para el viaje 2 0 si quiere acabar el programa");
		n_plazas = sc.nextInt();
		if(n_plazas != 0) {
			edades = new int[n_plazas];
			for (int i = 0; i<edades.length; i++) {	
				System.out.println("Introduce la edad del pasajero "+(i+1));
				edades[i] = sc.nextInt();
			}
			double importe = v2.ReservarPlazas(n_plazas, edades);
			if(importe == 0) {
				System.out.println("No se pudo realizar la reserva");
			}
			else {
				System.out.printf("%.3f€",importe);
			}
		System.out.println("¿Cuantas plazas desea poner?");
		mod_plazas = sc.nextInt();
		if (v1.ModificarPlazasViaje(mod_plazas))
			System.out.println("Viaje modificado");
		else {
			System.out.println("No se pudo modificar el viaje");
		}
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println("La agencia tiene un beneficio de"+Viaje.getGananciasAgencia()+"€");
		}
		} while (n_plazas != 0);
		System.out.println("Gracias por ejecutarme");
}
}
