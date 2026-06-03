package main;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.*;
import bbdd.*;
import clases.Cuenta;
import clases.Tarjeta;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opc = 0;
		int cont = 0;

		BD bd = new BD("mysql-properties.xml");

		do {
			/*MENU*/
			try {
				System.out.println("1.Dar de alta una tarjeta de crédito");
				System.out.println("2.Dar de alta una tarjeta de débito");
				System.out.println("3.Sacar dinero de una tarjeta de débito");
				System.out.println("4.Sacar dinero de una tarjeta de crédito");
				System.out.println("5.Recoger movimientos");
				System.out.println("6.Buscar tarjetas de titular");
				System.out.println("7.Leer fichero");
				opc = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Debes introducir n�mero 1-5");
				opc = 0;
			}
			
			sc.nextLine();
			switch (opc) {
			case 1:
				System.out.println("DNI");
				String dni = sc.nextLine();
				ArrayList<Cuenta> cuentas = new ArrayList<>();
				try {
					cuentas = bd.MostrarInformacion(dni);
					for(Cuenta aux: cuentas) {
						cont++; //97191542M
						System.out.println(cont+" "+aux.toString());
					}
					System.out.println("Que cuenta desea (1/2) ?");
					int opcion = sc.nextInt();
					sc.nextLine();
					opcion--;
					//int numero, int cuenta, String titular, double limite, double clave
					Cuenta c1 = cuentas.get(opcion);
					System.out.println("Introduce el numero de la tarjeta");
					int numero = sc.nextInt();
					sc.nextLine();
					System.out.println("Introduzca su nombre de titular");
					String titular = sc.nextLine();
					System.out.println("Introduzca el limite ");
					double limite = sc.nextDouble();
					sc.nextLine();
					System.out.println("Introduzca su clave ");
					String clave = sc.nextLine();
					Tarjeta t = new Tarjeta(numero,c1.getNumero(),titular,limite,clave);
					int fila = bd.añadir_Tarjeta(t);
					switch(fila) {
					case 1:
						System.out.println("Tarjeta insertada");
					break;
					case 0:
						System.out.println("Error en la inserccion");
					break;
					}
				}
				catch (ErrorBaseDatos e){
					System.out.println("Error "+e.getMessage());
				}
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				System.out.println("Saliendo del programa...");
				break;
			}
		} while (opc != 8);
	}
}
