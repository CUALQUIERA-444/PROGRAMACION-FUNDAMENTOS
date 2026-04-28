package ej1_alumnos2026;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc, pos;
		String nombre;
		double nota;
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);

		do {
			System.out.println("1.Alta\n2.Modificar nota\n3.Sustituir alumno\n4.Borrar\n5.Buscar");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Introduce nombre del alumno:");
				nombre = sc.nextLine();
				//pos = buscar(alumnos, nombre);
				pos = alumnos.indexOf(new Alumno(nombre));
				if (pos != -1)
					System.out.println("Ya existe ese alumno");
				else {
					System.out.println("Introduce nota:");
					nota = sc.nextDouble();
					// Alumno al=new Alumno(nombre,nota);
					// alumnos.add(al);
					alumnos.add(new Alumno(nombre, nota));
				}
				break;
			case 2:
				System.out.println("Introduce nombre del alumno:");
				nombre = sc.nextLine();
				pos = buscar(alumnos, nombre);
				if (pos == -1)
					System.out.println("Nombre de alumno incorrecto");
				else {
					System.out.println("Introduce la nueva nota:");
					nota = sc.nextDouble();
					alumnos.get(pos).setNota(nota);
				}
				break;
			case 3:
				System.out.println("Introduce nombre del alumno:");
				nombre=sc.nextLine();
				pos=buscar(alumnos,nombre);
				if (pos==-1)
					System.out.println("Nombre de alumno incorrecto");
				else {
					System.out.println("Introduce nombre nuevo alumno:");
					nombre = sc.nextLine();
					System.out.println("Introduce la nota del nuevo alumno:");
					nota = sc.nextDouble();
					Alumno a = new Alumno(nombre, nota);
					alumnos.set(pos, a);
				}
				break;
			case 4:
				System.out.println("Introduce nombre del alumno:");
				nombre=sc.nextLine();
				pos=buscar(alumnos,nombre);
				if (pos==-1)
					System.out.println("Nombre de alumno incorrecto");
				else {
					alumnos.remove(pos);
				}
				break;
			case 5:
				System.out.println("Introduce nombre del alumno:");
				nombre=sc.nextLine();
				pos=buscar(alumnos,nombre);
				if (pos==-1)
					System.out.println("No está en el array");
				else {
					System.out.println("Estos son los datos del alumno:"+alumnos.get(pos).toString());
				}
			}

		} while (opc != 6);

	}

	public static int buscar(ArrayList<Alumno> alumnos, String nombre) {
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre))
				return i;
		}
		return -1;
	}

}
