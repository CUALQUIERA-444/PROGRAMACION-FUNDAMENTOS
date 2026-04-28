package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Vehículo vehiculos[] = new Vehículo[2];
	Scanner sc = new Scanner (System.in);
	String marca;
	String modelo;
	double precio;
	String matrícula;
	for (int i = 0; i<vehiculos.length;i++) {
		System.out.println("Introduce la marca");
		marca = sc.nextLine();
		System.out.println("Introduce el modelo");
		modelo = sc.nextLine();
		System.out.println("Introduce la matrícula");
		matrícula = sc.nextLine();
		System.out.println("Introduce el precio del coche");
		precio = sc.nextDouble();
		sc.nextLine();
		Vehículo v1 = new Vehículo(marca,modelo,matrícula,precio);
		vehiculos[i] = v1;
	}
	double precio_minimo = vehiculos[0].getPrecio(); //Va a comparar con todos los elementos del array
	int posicion = 0;
	for (int i = 0; i<vehiculos.length;i++) {
		if(vehiculos[i].getPrecio() < precio_minimo) {
			precio_minimo = vehiculos[i].getPrecio();
			posicion = i; //Guarda la i permitiendome el acceso datos
		}
	}
	System.out.println(vehiculos[posicion].getMarca()+"\n"+vehiculos[posicion].getModelo()+"\n"+vehiculos[posicion].getMatricula()+"\n"+vehiculos[posicion].getPrecio());
	}
}
