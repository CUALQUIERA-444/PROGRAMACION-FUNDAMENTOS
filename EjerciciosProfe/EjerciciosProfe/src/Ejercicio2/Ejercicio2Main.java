package Ejercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Producto productos[] = new Producto[3];
	String nombre;
	double coste_unidad;
	double precio_venta;
	int unidades;
	Scanner sc = new Scanner (System.in);
	/*
	for (int i = 0; i<productos.length-1;i++) {
		Producto p = new Producto();
		productos[i] = p;
		System.out.println("Introduce el nombre del producto");
		nombre = sc.nextLine();
		productos[i].setNombre(nombre);
		System.out.println("Introduce el coste de la unidad");
		coste_unidad = sc.nextDouble();
		productos[i].setCoste_unidad(coste_unidad);
		System.out.println("Introduce el precio de venta al público");
		precio_venta = sc.nextDouble();
		productos[i].setPrecio_venta(precio_venta);
		System.out.println("Introduce el número de unidades vendidas");
		unidades = sc.nextInt();
		productos[i].setUnidades(unidades);
	}
	*/
	sc.useLocale(Locale.ENGLISH);
	for (int i = 0; i<=productos.length-1;i++) {
		System.out.println("Introduce el nombre del producto");
		nombre = sc.nextLine();
		System.out.println("Introduce el coste de la unidad");
		coste_unidad = sc.nextDouble();
		System.out.println("Introduce el precio de venta al público");
		precio_venta = sc.nextDouble();
		System.out.println("Introduce el número de unidades vendidas");
		unidades = sc.nextInt();
		sc.nextLine();
		Producto p1 = new Producto (nombre,coste_unidad,precio_venta,unidades);
		productos[i] = p1;
}
	for (int i = 0; i<=productos.length-1;i++) {
		System.out.println(productos[i].beneficio());
		System.out.println(productos[i].getNombre());
		System.out.println(productos[i].getCoste_unidad());
		System.out.println(productos[i].getPrecio_venta());
		System.out.println(productos[i].getUnidades());
	}
}
}