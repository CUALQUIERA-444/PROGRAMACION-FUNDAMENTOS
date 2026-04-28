package ej2_garaje;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, planta;
		double metros, porcentaje,precio;
		int opc;
		Garaje garajes[] = new Garaje[3];

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);

		for (int i = 0; i < garajes.length; i++) {

			garajes[i] = crearGaraje(sc);
		}

		do {
			System.out.println(
					"Anota opcion:\n1.Alquilar\n2.Mostrar precio alquiler\n3.Información libres.\n4.Subir\n5.Beneficios\n6.Salir");
			opc = sc.nextInt();
			switch (opc) {
			case 1:// Alquilar
				System.out.println("Anota número de garaje:");
				numero = sc.nextInt();
				int pos = buscar(garajes, numero);
				if (pos == -1)
					System.out.println("No existe ese garaje");
				else {
					if (garajes[pos].alquilar())
						System.out.println("Garaje alquilado");
					else
						System.out.println("No se ha podido alquilar");
				}
				break;
			case 2:
				System.out.println("Anota número de garaje:");
				numero = sc.nextInt();
				pos = buscar(garajes, numero);
				if (pos == -1)
					System.out.println("No existe ese garaje");
				else {
					System.out.println("El precio es:" + garajes[pos].getPrecio());
				}
				break;
			case 3:
				for (int i = 0; i < garajes.length; i++) {
					if (garajes[i].isAlquilado() == false)
						System.out.println(garajes[i].toString());
				}
				break;
			case 4:
				System.out.println("Anota número de garaje:");
				numero = sc.nextInt();
				do {
					System.out.println("Anota el porcentaje a subir:");
					porcentaje = sc.nextDouble();
				} while (porcentaje < 0 || porcentaje > 100);
				pos = buscar(garajes, numero);
				if (pos==-1)
					System.out.println("No existe");
				else {
					precio=garajes[pos].subirPrecio(porcentaje);
					if (precio==-1)
						System.out.println("No se ha podido subir el precio");
					else
						System.out.println("El nuevo precio es:"+precio);
					}
				break;
			case 5:
				System.out.println("Beneficios:"+ Garaje.getBeneficios());
				

			}
		} while (opc != 6);

	}

	public static Garaje crearGaraje(Scanner sc) {
		int numero, planta;
		double metros;
		Garaje g;
		System.out.println("Anota número:");
		numero = sc.nextInt();
		do {
			System.out.println("Anota planta:");
			planta = sc.nextInt();
		} while (planta < -1 || planta > 2);

		System.out.println("Anota metros:");
		metros = sc.nextDouble();

		g = new Garaje(numero, planta, metros);
		return g;
	}

	public static int buscar(Garaje garajes[], int num) {
		for (int i = 0; i < garajes.length; i++) {
			if (num == garajes[i].getId())
				return i;
		}
		return -1;

	}

}
