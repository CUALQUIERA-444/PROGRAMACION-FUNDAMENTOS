package Ejercicio15_4;
import java.util.*;

import Ejercicio15_1.Alumno;
public class PrincipalAlumnoMejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*Realiza el ejercicio 1 usando un HashMap , dónde la clave es el nombre (String) y el
		valor de la nota (Double).
		*/
	Scanner sc = new Scanner(System.in);
	HashMap<String,Double> alumnosMejorados = new HashMap<>();
	int opcion;
	double valor_usuario;
	String clave_usuario;
	do {
	//Menú
	System.out.println("Seleccione la opción que más guste");
	System.out.println("1.Dar de alta a un alumno comprobando que no existe previamente en el HashMap");
	System.out.println("2.Modificar la nota de un alumno dado ");
	System.out.println("3.Sustituir un alumno por otro anotado por teclado");
	System.out.println("4.Borrar un alumno dado su nombre");
	System.out.println("5.Nos dice si un alumno esta en el HashMap");
	opcion = sc.nextInt();
	sc.nextLine();
	switch (opcion) {
	//Paso 1 Dar de alta un alumno comprobando si esta en el hashMap.
	case 1:
		System.out.println("Introduzca el nombre del alumno");
		clave_usuario = sc.nextLine();
		if(alumnosMejorados.containsKey(clave_usuario)) {
			System.out.println("El alumno ya existe");
		}
		else {
			System.out.println("Introduzca la nota para el nuevo alumno");
			valor_usuario = sc.nextDouble();
			sc.nextLine();
			alumnosMejorados.put(clave_usuario, valor_usuario);
			//Crecimiento 
			for (String  aux : alumnosMejorados.keySet()) { //ES SOLO UN STRING METES EN AUX EL VALOR DE LA CLAVE 
				System.out.println(aux + "->" + alumnosMejorados.get(aux));
			} //Orden aleatorio 
		}
	break;
	case 2:
		if(!alumnosMejorados.isEmpty()) {
		Double nueva_nota;
		//Paso 2 Modificar la nota de un alumno 
		System.out.println("Introduzca el nombre del alumno");
		clave_usuario = sc.nextLine();
		if(!alumnosMejorados.containsKey(clave_usuario)) {
			System.out.println("No puedes modificar algo que no existe");
		}
		else {
			System.out.println("Introduce la nueva nota del alumno");
			nueva_nota = sc.nextDouble();
			sc.nextLine();
			alumnosMejorados.put(clave_usuario, nueva_nota);
			for (String  aux : alumnosMejorados.keySet()) { //ES SOLO UN STRING METES EN AUX EL VALOR DE LA CLAVE 
				System.out.println(aux + "->" + alumnosMejorados.get(aux));
			} //Orden aleatorio 
		}
		} 
		else {
			System.out.println("No hay nadie");
		}
	break;
	case 3:
		String alumno_viejo;
		if(!alumnosMejorados.isEmpty()) {
		System.out.println("Introduce el nombre dal alumno a sustituir");
		 //replace no es muy distinto solo te deja a null las cosas
		alumno_viejo = sc.nextLine();
			if(!alumnosMejorados.containsKey(alumno_viejo)) {
				System.out.println("No puedes sustituir a alguien que no existe");
			}
			else {
				System.out.println("Introduce el nombre del nuevo");
				clave_usuario = sc.nextLine();
				System.out.println("Introduce una nota de placeholder");
				valor_usuario = sc.nextDouble();
				sc.nextLine();
				if(clave_usuario.equalsIgnoreCase(alumno_viejo)) {
					System.out.println("Tienen el mismo nombre");
				}
				else {
					alumnosMejorados.remove(alumno_viejo);
				}
				alumnosMejorados.put(clave_usuario, valor_usuario);
				for (String  aux : alumnosMejorados.keySet()) { //ES SOLO UN STRING METES EN AUX EL VALOR DE LA CLAVE 
					System.out.println(aux + "->" + alumnosMejorados.get(aux));
				} //Orden aleatorio 
			}
			}
		else {
			System.out.println("No hay nadie");
		}
	break;
	case 4:
		if(!alumnosMejorados.isEmpty()) {
			System.out.println("Introduce el nombre del alumno que desea borrar");
			clave_usuario = sc.nextLine();
			if(!alumnosMejorados.containsKey(clave_usuario)) {
				System.out.println("No puedes borrar algo que no existe ");
			}
			else {
				alumnosMejorados.remove(clave_usuario);
				System.out.println("Alumno borrado correctamente");
				for (String  aux : alumnosMejorados.keySet()) { //ES SOLO UN STRING METES EN AUX EL VALOR DE LA CLAVE 
					System.out.println(aux + "->" + alumnosMejorados.get(aux));
				} //Orden aleatorio 
			}
		}
		else {
			System.out.println("No hay nadie");
		}
	break;
	case 5:
		if(!alumnosMejorados.isEmpty()) {
		System.out.println("Introduce el alumno sobre el que quiera saber si existe");
		clave_usuario = sc.nextLine();
		if(alumnosMejorados.containsKey(clave_usuario)) {
			System.out.println("Se encuentra en la lista");
			System.out.println(clave_usuario+" "+alumnosMejorados.get(clave_usuario));
		}
		else {
			System.out.println("No se encuentra en la lista");
		}
		}
		else {
			System.out.println("No hay nadie");
		}
	break;
	case 6:
	break;
	default:
		System.out.println("Opción inválida volviendo al menú");
	break;
	}
	} while (opcion != 6);
	for (String  aux : alumnosMejorados.keySet()) { //ES SOLO UN STRING METES EN AUX EL VALOR DE LA CLAVE 
		System.out.println(aux + "->" + alumnosMejorados.get(aux));
	} //Orden aleatorio 
	System.out.println("Gracias por ejecutarme ");
	}
}
