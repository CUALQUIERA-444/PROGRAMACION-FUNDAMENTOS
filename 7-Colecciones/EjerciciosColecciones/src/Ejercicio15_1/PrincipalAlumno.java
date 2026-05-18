package Ejercicio15_1;
import java.util.*;
public class PrincipalAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
1. Programa que lleve en un ArrayList la información de una serie de alumnos,
por cada alumno se guarda su nombre y su nota. Se pide hacer un menú que permita:
1. Dar de alta a un alumno, comprobando que no existe previamente en el
ArrayList. //Quedarse con ArrayList
2. Modificar la nota de un alumno dado.
3. Sustituir un alumno por otro anotado por teclado. //ArrayList puede manejar esto
4. Borrar un alumno dado su nombre.
5. Nos dice si un alumno está en el ArrayList.
//Teoricamente todas las cosas que me piden se pueden verificar en el ArrayList
		*/
//Ejercicio de iniciazion hacia el ArrayList
		
//Paso 1 Crear el ArrayList y rellenarlo Se siente raro
ArrayList<Alumno> alumnos = new ArrayList<Alumno>(); //Primer arrayList
alumnos.add(new Alumno(10,"Antonio"));
alumnos.add(new Alumno(9,"Cualquiera"));
alumnos.add(new Alumno(8,"Berenjena"));
//Paso 2 Escribir El titulo del menu y sus opciones
Scanner sc = new Scanner(System.in);
int opcion;
do {
System.out.println("Seleccione la opción que mas guste"); 
System.out.println("1.Dar de alta un alumno");
System.out.println("2.Modificar la nota de un alumno dado");
System.out.println("3.Sustituir un alumno por otro");
System.out.println("4.Borrar un alumno dado el nombre");
System.out.println("5.Verifcacion de la existencia de un alumno");
opcion = sc.nextInt();
sc.nextLine(); //Limpiar buffer
switch(opcion) {
//Paso 3 Primer caso buscar con el nombre y los metodos de arrayList
case 1:
	String nombre;
	Alumno nuevo;
	int indice;
	System.out.println("Introduce el nombre del alumno");
	nombre = sc.nextLine();
	nuevo = BuscarPorNombre(nombre,alumnos); 
	if(nuevo != null) {
		System.out.println("Ya esta matriculado");
	}
	else {
		nuevo = new Alumno(nombre);
		alumnos.add(nuevo); 
		indice = alumnos.indexOf(nuevo);
	System.out.println(alumnos.get(indice).toString());
	}
break;
case 2:
	//Paso 4 modificar un alumno buscando su nombre y modificando la nota
	String nombreReferencia;
	double nueva_nota;
	int indiceNota;
	System.out.println("Introduzca el nombre del alumno del cual se quiere modificar la nota");
	nombreReferencia = sc.nextLine();
	Alumno temporal = new Alumno(nombreReferencia);
	if(alumnos.contains(temporal)) {
		System.out.println("Introduzca la nueva nota ");
		nueva_nota = sc.nextDouble(); 
		indiceNota = alumnos.indexOf(temporal);
		//alumnos.set(indiceNota, temporal) Cambia el objeto por completo no solo un dato 
		temporal = alumnos.get(indiceNota);
		temporal.setNota(nueva_nota);
		System.out.println(alumnos.get(indiceNota).toString());
	}
	else {
		System.out.println("No puedes modificar algo que no existe");
	}
break;
	//Paso 5 Reemplazar el alumno Le pongo cero aunque de todas formas tenga 

case 3:
	String reemplazo_V;
	int indiceR;
	String reemplazo_N;
	System.out.println("Introduce el nombre de un alumno");
	reemplazo_V = sc.nextLine();
	Alumno conversion = new Alumno(reemplazo_V);
	if(alumnos.contains(conversion)) { //No requiere fors
		System.out.println("Introduce el nombre nuevo");
		reemplazo_N = sc.nextLine(); 
		indiceR = alumnos.indexOf(conversion);//indice
		conversion = new Alumno(0,reemplazo_N); //Apuntar al nuevo
		alumnos.set(indiceR, conversion); //Reemplazo 
		System.out.println(alumnos.get(indiceR).toString());
	}
	else {
		System.out.println("No puede reemplazar algo que no existe");
	}
break;
case 4:
	//Paso 6 Borrar al alumno dando su nombre la nota no deberia influir en esto
	Iterator<Alumno> it = alumnos.iterator();
	String sentenciado;
	System.out.println("Introduzca el nombre del alumno a borrar");
	sentenciado = sc.nextLine();
	Alumno reprimido  = new Alumno(sentenciado);
		while (it.hasNext()) {
		Alumno real = it.next(); //Para recorrer la coleccion (necesario) para seguir
		if(real.equals(reprimido)) { //Usa el equals para ver si el objeto es igual //NO USAR CONTAINS
			it.remove();
		}
		}
		//Verificar la coleccion
		for (Alumno aux: alumnos) {
			System.out.println(aux.toString());
		}
break;
case 5:
	
break;
case 6:
break;
default:
	System.out.println("Opción no válida volviendo al menú");
break;
}
} while(opcion != 6);
System.out.println("Gracias por ejecutarme");
	} 
public static Alumno BuscarPorNombre(String nombre, ArrayList<Alumno>alumnos) {
	for(Alumno aux : alumnos) {
		if(aux != null) {
			if(aux.getNombre().equalsIgnoreCase(nombre)) {
				return aux;
			}
			
		}
	}
	return null;
}
}
