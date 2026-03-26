package Practica2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 6.Programa que lee el precio de tarifa de un producto y el precio final pagado por
el mismo y nos calcula el descuento (%) realizado
NOTA EL PRECIO DE TARIFA DE UN PRODUCTO ES EL PRECIO QUE UN VENDEDOR LE PONE ORIGINALMENTE A SU PORDUCTO
ANTES DE CUALQUIER DESCUENTO O INCREMENTO
 */
	Scanner sc = new Scanner (System.in);
	sc.useLocale(Locale.ENGLISH);
	final double porcentaje_total = 100;
	double precio_tarifa;
	double precio_final;
	double descuento;
	System.out.println("Introduzca el precio de tarifa del producto");
	precio_tarifa = sc.nextDouble();
	System.out.println("Introduzca el precio final del producto \"Asegurese de que sea menor al precio tarifa\"");
	precio_final = sc.nextDouble();
	descuento = porcentaje_total - porcentaje_total * precio_final / precio_tarifa; //Formula para sacar el descuento
	System.out.println("Su descuento es de "+descuento+"%");
	//Precios	        Porcentajes
		//4              100%
	    //2               ? 
	    
	}
}
