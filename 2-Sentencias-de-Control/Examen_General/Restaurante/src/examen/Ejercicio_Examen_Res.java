package examen;

import java.util.Scanner;

public class Ejercicio_Examen_Res {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int economico = 25;
		int degustación = 35;
		int estrella = 50;
		int num_comensales; 
		int plazas = 80;
		int precio_seleccion;
		int precio_total;
		int eleccion;
	Scanner sc = new Scanner (System.in);
	System.out.println("Bienvenido al restaurante cuantas personas son:");
	num_comensales = sc.nextInt();
	if (num_comensales == -1 || num_comensales > plazas ) { // La idea es que si es negativo o el numero de comensales es mayor que 80 no continue 
		System.out.println("Lo siento no se puede continuar con su reserva !Siguiente!");
		System.exit(0);
	}
	plazas = plazas - num_comensales;
	System.out.println("Seleccione que tipo de menú quiere usando el número (1 economico) (2 degustación) (3 estrella)");
	precio_seleccion = sc.nextInt();
	eleccion = lista(precio_seleccion);
	if ( eleccion == 1) 
		precio_total = 25;
	else if ( eleccion == 2) 
		precio_total = 35;
	else 
		precio_total = 50;
	}

	public static int lista (int u) {
		int op1 = 1;
		int op2 = 2;
		int op3 = 3;
		Scanner sc = new Scanner (System.in);
		while ( u !=1 &&  u !=2 && u != 3  ) {
			System.out.println("Seleccione BIEN el tipo de menú");
			u = sc.nextInt();
		}
		if ( u == 1)
			return op1;
		if ( u == 2)
			return op2;
		else 
			return op3;
	}
}
//Todo el proceso (aforo = 80 ) Preguntar al usuario si quiere seguir 
//Idea feliz Jugar con la inteligencia 