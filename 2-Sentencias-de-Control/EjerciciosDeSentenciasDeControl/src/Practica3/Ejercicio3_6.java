package Practica3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*6. En un determinado comercio se realiza un descuento dependiendo del precio de cada
		producto. Si el precio es inferior a 6 euros, no se hace descuento; si es mayor o igual que 6
		euros y menor que 60 euros, se hace un 5% de descuento, y si es mayor o igual que
		60euros, se hace un 10 % de descuento. Programa que lee el precio de un producto y nos
		calcula y escribe su precio final.
*/
	final double precio_fijo = 6, precio_fijo2 = 60, descuento_fijo1 = 5,descuento_fijo2 = 10, porcentaje = 100;
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	double precio_comerciante;
	System.out.println("Introduzca el precio sobre el que quiere hacer sus operaciones");
	precio_comerciante = sc.nextDouble();
	if(precio_comerciante >= precio_fijo && precio_comerciante < 60 )
		precio_comerciante = precio_comerciante - precio_comerciante * descuento_fijo1 / porcentaje;
	else if (precio_comerciante  >=  precio_fijo2)
		precio_comerciante = precio_comerciante - precio_comerciante * descuento_fijo2 / porcentaje;
	else 
		System.out.println("Lo siento no hay descuento");
	System.out.println("El precio final sera de "+precio_comerciante+" euros");
	}
}
