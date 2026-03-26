package Practica6;

import java.util.Scanner;

public class Ejercicio6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 8. Se desea conocer el luckynumber de cualquier persona. El número de la
		 * suerte se consigue reduciendo la fecha de nacimiento a un número de un solo
		 * dígito. 16/08/1973->16+8+1973=1997->1+9+9+7=26->2+6=8
		 */
		/*
		 * Lógica Primero debemos verificar si la fecha introducida es valida
		 * considerando varios aspectos Que el dia no sea mayor que 31 ni 0 Que el mes
		 * no sea mayor que 12 ni 0 Que el año no sea menor que 1990 Posteriormente
		 * hallaremos el numero de la suerte
		 * 
		 */
		/*
		 * Variables 3 enteros uno para el año otro para el dia y uno para el mes 1
		 * entero para guardar el lucky number
		 * Para los else if es necesario recordar que si la condición es verdadera todo lo demás no se evalua de ahi que no lo usemos demasiado acá
		 */
		Scanner sc = new Scanner(System.in);
		int año_usuario = 0;
		int mes_usuario = 0;
		int dia_usuario; 
		boolean bisiesto;
		boolean validador;
		do {
			validador = true;
			System.out.println("Intoduce tu dia de nacimiento");
			dia_usuario = sc.nextInt();
			if (dia_usuario > 31 || dia_usuario < 1 ) {
				System.out.println("Error el día introducido no está en el rango permitido");
				validador = false;
			}
			else {
				System.out.println("Introduce tu mes de nacimiento");
				mes_usuario = sc.nextInt();
				if(mes_usuario > 12 || mes_usuario < 1) {
					System.out.println("Error el mes introducido no existe");
					validador = false;
				}
				else {
					System.out.println("Introduce tu año de nacimiento");
					año_usuario = sc.nextInt();
					if (año_usuario < 1950) {
						System.out.println("El año introducido no está permitido");
						validador = false;
					}
					else {
						bisiesto = ((año_usuario % 4 == 0 && año_usuario % 100 != 0) || año_usuario % 400 == 0);
						if(dia_usuario == 31 && mes_usuario !=1 && mes_usuario !=3 && mes_usuario !=5 && mes_usuario !=7 && mes_usuario !=8 && mes_usuario!=10 && mes_usuario!=12) {
						System.out.println("Lo siento ninguno de esos meses tiene 31 dias");
						validador = false;
						}
						else {
							if(dia_usuario == 30 && mes_usuario == 2) {
								System.out.println("Lo siento es imposible que febrero tenga 30 días");
								validador = false;
							}
							else {
								if(dia_usuario == 29 && mes_usuario == 2 && bisiesto == false) {
								System.out.println("Lo siento su año no es bisiesto");	
								validador = false;
								}
							}
						}
					}
				}
			}
		} while (validador == false);
		//Para hallar el lucky number necesitamos partir el número e ir sumando hasta que el número quede como solo un dígito
		//Para ello necesitamos lo siguiente 
		//Una variable para comparar la suma mientras el resultado sea mayor a un dígito (Este tambien será el número de la suerte)
		//Una variable para almacenar la suma de las cifras constantemente 
		//Una variable auxiliar que sera despedazada mientras sea mayor que 0 || tenga un digito sumable 
		int suerte = (dia_usuario + mes_usuario + año_usuario);
		int acumulador_cifras = 0;
		int apoyo;
		while (suerte > 9) {
			acumulador_cifras = 0; //Se reinicia oara una nueva suma
			apoyo = suerte;
			while(apoyo > 0) {
				acumulador_cifras = acumulador_cifras + apoyo % 10;
				apoyo /= 10;
				suerte = acumulador_cifras;
			}
	}
		System.out.println("Su número de la suerte es "+suerte);
}
}