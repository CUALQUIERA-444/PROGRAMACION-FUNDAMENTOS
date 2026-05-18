package Ejercicio13_8;

public class PrincipalTarjeta {
/*
 * 1. Crear dos Tarjetas, pasando al constructor los datos necesarios, sin leerlos de
teclado.
2. Realiza pagos, recargas y operaciones de bloqueo desbloqueo sobre ambas
tarjetas.
3. Mostrar la información de ambas tarjetas
4. Comparar ambas tarjetas .
5. Mostrar el número total de operaciones realizadas usando un método.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Tarjeta t1 = new Tarjeta ("333-666","Antonio","4444",200);
	Tarjeta t2 = new Tarjeta ("333-999","Jaimito","4040",350);
	t1.Pagar("4444", 11, 2020,100);
	t1.RecargarTarjeta(200);
	t1.Bloquear();
	t1.Pagar("2000", 12, 2040,10);
	t2.Pagar("", 11, 2020,100);
	t2.RecargarTarjeta(200);
	t2.Bloquear();
	t2.Pagar("2000", 12, 2040,10);
	System.out.println(t1.toString());
	System.out.println(t2.toString());
	boolean iguales = t1.mismaTarjeta(t2);
	if(iguales) {
		System.out.println("Las tarjetas son iguales");
	}
	else {
		System.out.println("Las tarjetas no son iguales");
	}
	System.out.println("Numero de recargas "+Tarjeta.getContador_recargas());
	System.out.println("Numero de operaciones "+Tarjeta.getContador_pagos());
	}
}
