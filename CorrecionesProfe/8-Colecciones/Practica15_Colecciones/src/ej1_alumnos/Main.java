package ej1_alumnos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;
		double nota;
		String nombre;
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Alumno> alumnos=new ArrayList<>();
		
		do {
			System.out.println("1.Alta alumno\n.Modificar nota alumno\n3.Sustituir alumno\n4.Borrar alumno\n5.Decir si un alumno está\n6.Mostrar\n7.Salir");
			System.out.println("Anota opcion:");
			opc=sc.nextInt();
			sc.nextLine();
			
			switch(opc) {
			case 1:
				System.out.println("Anota nombre:");
				nombre=sc.nextLine();
				if (alumnos.contains(new Alumno(nombre)))
					System.out.println("El alumno existe");
				else {
					System.out.println("No existe");
					System.out.println("Introduce la nota:");
					nota=sc.nextDouble();
					alumnos.add(new Alumno(nombre,nota));
				}
				break;
			case 2:
				System.out.println("Anota nombre:");
				nombre=sc.nextLine();
				int pos=alumnos.indexOf(new Alumno(nombre));
				if (pos==-1)
					System.out.println("No existe el alumno");
				else {
					System.out.println("Introduce la nota:");
					nota=sc.nextDouble();
					alumnos.get(pos).setNota(nota);
				}
					
				break;
			case 3:
				System.out.println("Anota nombre:");
				nombre=sc.nextLine();
				pos=alumnos.indexOf(new Alumno(nombre));
				if (pos==-1)
					System.out.println("No existe el alumno");
				else {
					System.out.println("Introduce nombre nuevo alumno:");
					nombre=sc.nextLine();
					System.out.println("Introduce la nueva nota:");
					nota=sc.nextDouble();
					alumnos.set(pos,new Alumno(nombre,nota));
				}
				break;
			case 4:
				System.out.println("Anota nombre:");
				nombre=sc.nextLine();
				pos=alumnos.indexOf(new Alumno(nombre));
				if (pos==-1)
					System.out.println("No existe el alumno");
				else {
					alumnos.remove(pos);
				}
				break;
			case 5:
				System.out.println("Anota nombre:");
				nombre=sc.nextLine();
				if (estAlumno(alumnos,nombre))
					System.out.println("El alumno existe");
				else
					System.out.println("No existe");
				break;
				
			case 6:
				/*for(int i=0;i<alumnos.size();i++)
					System.out.println(alumnos.get(i).toString());*/
				Iterator<Alumno> it=alumnos.iterator();
				while(it.hasNext())
					System.out.println(it.next().toString());
				
			}
			
		}while(opc!=7);
		

	}
	
	public static boolean estAlumno(ArrayList<Alumno> alumnos,String nombre) {
		for(int i=0;i<alumnos.size();i++)
			if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre))
				return true;
		
		return false;
	}

}
