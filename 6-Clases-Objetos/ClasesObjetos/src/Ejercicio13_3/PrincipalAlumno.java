package Ejercicio13_3;
import java.util.*;
/*
 * Por cada alumno del DAW guardamos su número de matrícula y sus notas en las
tres asignaturas. Hacer una clase alumno que guarde está información. Realizar un
programa que cree tres alumnos, les asigne notas y a continuación los muestre
ordenados de mayor a menor nota media.
 */

//Cada vez que se cree una clase lo recomendable es en singular 
//Por que por lo general la clase define la estructura de UN UNICO OBJETO
//Y además por que generalmente se reservan los nombres de este estilo para las colecciones
//La razón por la que la primera letra esta en mayuscula es para ayudar al cerebro


public class PrincipalAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	Alumno alumno1 = new Alumno("1122-DDD");
	Alumno alumno2 = new Alumno("2211-DND");
	Alumno alumno3 = new Alumno ("2020-DIC");
	System.out.println(alumno1.toString());
	System.out.println(alumno2.toString());
	System.out.println(alumno3.toString());
	System.out.println(" ");
	OrdenarMedias(alumno1,alumno2,alumno3); //Necesario pasarlos
	}
	public static void OrdenarMedias(Alumno a, Alumno b, Alumno c) {
	//6 combinaciones 2 pares para los 3 numeros principales pasados
	if(a.getMedia() >= b.getMedia() && a.getMedia() >= c.getMedia()) {
		if(b.getMedia() >= c.getMedia()) {
			imprimir(a,b,c);
		}
		else {
			imprimir(a,c,b);
		}
	}
	else if(b.getMedia() >= a.getMedia() && b.getMedia() >= c.getMedia()) {
		if(a.getMedia() >= c.getMedia()) {
			imprimir(b,a,c);
		}
		else {
			imprimir(b,c,a);
		}
	}
	else {
		if(a.getMedia() >= b.getMedia()) {
			imprimir(c,a,b);
		}
		else {
			imprimir(c,b,a);
		}
	}
}
	public static void imprimir(Alumno a,Alumno b, Alumno c) {
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
	}
}