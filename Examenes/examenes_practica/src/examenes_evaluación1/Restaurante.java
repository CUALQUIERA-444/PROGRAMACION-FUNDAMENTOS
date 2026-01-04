package examenes_evaluación1;

import java.util.Locale;
import java.util.Scanner;

public class Restaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.ENGLISH);
		int total_plazasres = 80;
		char menu;
		int n_comensales;
		int menu_totalcomensales;
		char funcion_menu;
		char menu_letra;
		int copas;
		int barra;
		int menu2;
		String confirmar;
		int acumular_cli = 0;
		int acumulador_copas = 0;
		String carnet;
		boolean cart;
		double precio_condesc;
		double precio_total;
		double acumular = 0;
		int contador_noches = 1;
		int acumular_reservas = 0;
		int acumulador_barras = 0;
		double min = 0;
		int sin_bebida;
		int contador_cons = 1;
		boolean noche;
		do {
		System.out.println("Noche "+contador_noches+"Cliente "+contador_cons+" Se pasa a la siguiente noche si el usuario lo pide si no seguimos con otro");
		System.out.println("Quedan "+total_plazasres+" disponibles");
		System.out.println("Introduce la cantidad de personas para la reserva");
		n_comensales = sc.nextInt();
		sc.nextLine();
		if (n_comensales > 0 && n_comensales < total_plazasres)
		total_plazasres = total_plazasres - n_comensales; // Se guarda
		do {
		System.out.println("Seleccione el menú que desee (A,B o C)");
		menu_letra = sc.nextLine().charAt(0);
		menu_letra = Character.toUpperCase(menu_letra);
		funcion_menu = ValidarMenu(menu_letra);
		if ( funcion_menu == 'V')
		System.out.println("Error vuelva a intentarlo");
		}
		while ( funcion_menu == 'V'); 
		System.out.println("Ha elegido el menú "+funcion_menu);
	do {
	System.out.println("Introduce la cantidad de personas que esten interesadas en bebida");
	copas = sc.nextInt();
	acumulador_copas+=copas; //se guarda
	System.out.println("Introduce la cantidad de personas que deseen barra libre");
	barra = sc.nextInt();
	acumulador_barras+=barra;
	if ( copas + barra > n_comensales) 
		System.out.println("Error vuelva a empezar");
	}
	while ( copas + barra > n_comensales); 
	//Esto se repite mientras la suma sea mayor 
	//Sin embargo si es menor termina sacando cuantos quieren barra o copas 
	//Y cuantos no 
	System.out.println("Tiene Carnet?(true/false)");
	cart = sc.nextBoolean();
	sc.nextLine();
	if ( cart == true) {
	System.out.println("Introduzca su carnet");
	carnet = sc.nextLine();
	char p = carnet.charAt(0);
	p = Character.toUpperCase(p);
	//Convertir la letra a mayuscula y compararla con la letra original 
		if ((carnet.length() == 5 || carnet.length() == 4) && carnet.charAt(0) == p ) {
		//No es posible comparar strings con caracteres
		System.out.println("Se le aplicara descuento");
		precio_total = Calcular_precio(n_comensales,funcion_menu,copas,barra);//Se guarda?
		precio_condesc= precio_total - precio_total*0.20;
		precio_total = precio_condesc;
		}
		else {
			System.out.println("No intente hacerse el chistoso");
			precio_total = Calcular_precio(n_comensales,funcion_menu,copas,barra);
		}
	}
	else {
		System.out.println("Lo siento no tendra descuento");
		precio_total = Calcular_precio(n_comensales,funcion_menu,copas,barra);
	}
	
	do {
		System.out.println("Desea confirmar la reserva?(si/no)");
		confirmar = sc.nextLine();
					if ( confirmar.equalsIgnoreCase("si") == true ) {
					acumular = precio_total+acumular;
					acumular_reservas = acumular_reservas + n_comensales;
					//n_comensales  = 100% 20 por ejemplo
					//barra  =  10 barra  ??%
					barra = barra*100/n_comensales;
					acumular_cli = n_comensales + acumular_cli;
					System.out.println("Gracias por su compra");
					System.out.println("El precio total será "+precio_total+"€");
					}
					else if ( confirmar.equalsIgnoreCase("no") == true ) {
					System.out.println("Ok siguiente!!");
						total_plazasres = total_plazasres + n_comensales;
						acumulador_copas = acumulador_copas - copas;
						acumulador_barras = acumulador_barras - barra;
						System.out.println("El precio se sigue manteniendo "+precio_total);
						}
					else 
					System.out.println("Elija si o no");
		}
		while (confirmar.equalsIgnoreCase("si") == false && confirmar.equalsIgnoreCase("no") == false);
		System.out.println("Resumen del proceso (Por noche) \n ganancias totales "
				+precio_total+"€"+"\n reservas hechas esta noche "
				+n_comensales+"\n porcentaje de barra (Está noche) "+barra+"%");
		System.out.println("Desea hacer más reservas para las siguientes noches? (true/false)");
		noche = sc.nextBoolean();
		if ( noche == true) {
		contador_noches++;
		if ( precio_total < min) {
		min = precio_total;
		sin_bebida = acumular_cli - (acumulador_copas+acumulador_barras);
		}
		}
		else 
		contador_cons++;
		}
		while ( n_comensales != -1 || total_plazasres > 0);
		System.out.println("Registro final \n noche con la menor recaudación"+min+
		"\n Los clientes que no han pedido bebida son"+sin_bebida);
	}
		public static char ValidarMenu(char l){
		switch (l) {
		case 'A': 
			return 'A';
		case 'B':
			return 'B';
		case 'C':
			return 'C';
		default:
			return 'V';
		}
		}
		public static double Calcular_precio(int c,char fm, int co, int b){
			double A = 25;
			double B = 35;
			double C = 50;
			double CUP = 9;
			double BAR = 30;
			if ( fm == 'A') {
			double pt = A*c + CUP*co + BAR * b;
			return pt;
			}
			else if ( fm == 'B') {
				double pt = B*c + CUP*co + BAR * b;
				return pt;
			}
			else {
				double pt = C*c + CUP*co + BAR * b;
				return pt;
				}
		}
}

	

