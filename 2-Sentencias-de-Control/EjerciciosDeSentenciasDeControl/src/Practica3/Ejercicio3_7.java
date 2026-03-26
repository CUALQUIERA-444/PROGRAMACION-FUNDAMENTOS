package Practica3;

import java.util.Scanner;

public class Ejercicio3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 7. Con objeto de fomentar el ahorro energético, el recibo de la electricidad
		 * se elabora de forma que el precio de cada Kw/h consumido es más caro cuanto
		 * más se consume: 
		 *  2€ de gastos fijos 
		 *  0,50€/Kwh para los primeros 100 Kwh 
		 * 0,70€/Khw para los siguientes 150 Kwh 
		 *  1€/Kwh para el resto Elabora un
		 * programa que lee de teclado los dos últimos valores del contador (lo que
		 * marca actualmente y lo que marcaba en la última lectura), y calcula e imprime
		 * en pantalla el importe total a pagar.
		 */
		/*
		 * Nota Lectura anterior: Lo que marcaba el contador la última vez que te
		 * cobraron (ej. 5000 kWh). Lectura actual: Lo que marca ahora (ej. 5300 kWh).
		 * La lectura anterior SIEMPRE tiene que ser más pequeña que la actual Consumo:
		 * La resta de ambos (5300 - 5000 = 300 kWh).
		 * Los primeros 100 kwh que cueste 0.50 se refiere a que cada unidad de energia cuesta eso
		 */
				/* Plano Idea
				 * 1 kwh = 0.50 
				 * 2 kwh = 0.50 * 3
				 * 3 kwh = 0.50 * 3
				 * 100 kwh = 0.50 * 100
				 * 101 kwh = 0.50 * 100 + (consumo - 100) * 0.70 
				 * 102 kwh = 0.50 * 100 + (consumo - 100) * 0.70
				 * 103 kwh = 0.50 * 100 + (consumo - 100) * 0.70
				 * 250 kwh = 0.50 * 100 + (consumo - 100) * 0.70 
				 * 251 kwh  = 0.50 * 100 + 150 * 0.70 + (consumo - 250) * 1
				 */
		Scanner sc = new Scanner(System.in);
		final double gastos_fijos = 2, primeros_kwh = 100, precio_primeroskhw = 0.50, siguientes_kwh = 150,
				precio_siguienteskhw = 0.70, resto = 1;
		double lectura_anterior;
		double lectura_actual;
		double importe_total;
		double consumo;
		double resto_kwh;
		System.out.println("Introduce los kwh de la lectura anterior");
		lectura_anterior = sc.nextDouble();
		System.out.println("Introduce los kwh de la lectura actual");
		lectura_actual = sc.nextDouble();
		if (lectura_anterior > lectura_actual)
			System.out.println("Lo siento es imposible que el consumo actual sea menor al anterior");
		else { //Para que el programa se detenga por ahora en caso de que valla al if
		resto_kwh = primeros_kwh + siguientes_kwh;
		consumo = lectura_actual - lectura_anterior;
			if (consumo <= 100) 
				importe_total = consumo*precio_primeroskhw+gastos_fijos; //Aca la resta no funciona
			else if(consumo > 100 && consumo <= resto_kwh)  //Los primeros 100 se tienen que quedar con 
				importe_total  = primeros_kwh * precio_primeroskhw + (consumo-primeros_kwh)*precio_siguienteskhw+gastos_fijos;
					// 101  primeros_kwh = 100 * 0.50 + 101 - 100 = 1 * 0.70 + 2 
			else 
				importe_total  = primeros_kwh * precio_primeroskhw + siguientes_kwh*precio_siguienteskhw + (consumo-resto_kwh)*resto+gastos_fijos;
		System.out.println("El importe total de será de "+importe_total+" euros"); //Aca por que si no el if lo puede ver ademas 
		//de que fuera del else no esta inicializado como tal
		}
	}
}
