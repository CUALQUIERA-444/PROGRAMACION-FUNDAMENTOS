package Ejercicio14_2;

import java.util.Scanner;

public class PrincipalGaraje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner (System.in);
//Paso 1 Crear los arrays de Garajes (5 de tamaño) 
	Garaje garajes[] = new Garaje[5];
	int id_num;
	double m2;
	int planta;
	int buscar_num;
	Garaje buscadorNum;
	boolean coincidencias;
	double porcentaje;
	int opc;
//Paso 2 Rellenar el Array en función de las condiciones 
	for (int i = 0; i<garajes.length;i++) {
		System.out.println("Introduce el identificador del garaje (Numero)");
		id_num = sc.nextInt();
		coincidencias = BuscarCoincidencias(id_num,garajes);
		while (coincidencias) {
		if(coincidencias) {
			System.out.println("No pueden tener el mismo numero vuelva a intentarlo");
			id_num = sc.nextInt();
			coincidencias = BuscarCoincidencias(id_num,garajes);
		}
		}
		System.out.println("Introduce el espacio del garaje (En m2)");
		m2 = sc.nextDouble();
		while (m2 <= 0) {
		if(m2 <= 0) {
			System.out.println("No sea gracioso no puede ocupar menos 45 de espacio vuelva a intentarlo");
			m2 = sc.nextDouble();
		}
		}
		System.out.println("Introduce la planta en la que se encuentra dicho garaje");
		planta = sc.nextInt();
		garajes[i] = new Garaje(id_num,m2,planta);
	}
	do {
	System.out.println("Seleccione la opcion que desee \n1.Alquilar un garaje\n2.Mostrar el precio de alquiler de un garaje\n3.Mostrar la información de los garajes que están libres \n4.Subir el precio de un garaje\n5.Mostrar los beneficios de la empres\n6.Salir");
	//int opc = sc.nextInt(); //Si se declara aca se destruye
	opc = sc.nextInt();
	switch (opc) {
	case 1:
		System.out.println("Introduzca el numero identificador del vehiculo");
		buscar_num = sc.nextInt();
		buscadorNum = BuscarElID(buscar_num,garajes);
		if(buscadorNum == null) {
			System.out.println("El vehiculo no fue encontrado o ya esta en alquiler");
		}
		else {
			buscadorNum.AlquilarGaraje();
		}
	break;
	case 2:
		System.out.println("Introduzca el numero identificador del vehiculo");
		buscar_num = sc.nextInt();
		buscadorNum = BuscarElID2(buscar_num,garajes);
		if(buscadorNum == null) {
			System.out.println("El vehiculo no fue encontrado");
		}
		else {
			System.out.printf("El importe es de %.3f€ \n",buscadorNum.getImporte_total());
		}
	break;
	case 3:
		for (Garaje aux: garajes) {
			if(aux.Libre()) {
				System.out.println(aux.toString());
			}
		}
	break;
	case 4:
		System.out.println("Introduzca el numero identificador del vehiculo");
		buscar_num = sc.nextInt();
		buscadorNum = BuscarElID(buscar_num,garajes);
		if(buscadorNum == null) {
			System.out.println("El vehiculo no fue encontrado o ya esta en alquiler");
		}
		else {
			System.out.println("Introduzca el porcentaje de subida"); 
			porcentaje = sc.nextDouble();
			while (porcentaje <= 0) {
			if(porcentaje <= 0) {
				System.out.println("ERROR USTED ELIGIO SUBIR EL PRECIO VUELVA A INTRODUCIR EL PORCENTAJE");
				porcentaje = sc.nextDouble();
			}
			}
			buscadorNum.SubirTarifa(porcentaje);
		}
	break;
	case 5:
		System.out.printf("%.3f €\n",Garaje.getGananciasempresa());
	break;
	case 6:
	break;
	default:
	System.out.println("Esa opcion no es válida");
	break;
	}
	}  while (opc != 6);
}
	public static boolean BuscarCoincidencias(int num, Garaje g[]) {
		for (Garaje aux : g ) { //Se pueden hacer comparaciones en un for each
			if(aux != null) { //Si el espacio actual es distinto a null Se lo recorre todo igual pero es mas automatico
			if(aux.getId_num() == num) {
				return true;
			}
		}
		}
		return false;
		//Los for each pueden verificar e imprimir pero no puedo modificar
	}
	public static Garaje BuscarElID(int numT, Garaje g[]) {
		for (Garaje aux: g) {
			if(aux.getId_num() == numT) {
				if(aux.Libre()) {
					return aux;
				}
			}
		}
		return null;
	}
	public static Garaje BuscarElID2(int numT, Garaje g[]) {
		for (Garaje aux: g) {
			if(aux.getId_num() == numT) {
					return aux;
			}
		}
		return null;
	}
}
