package ej4_alumnoshashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;
		double nota;
		String nombre;
		
		Scanner sc=new Scanner(System.in);
		HashMap<String,Double> alumnos=new HashMap<>();
		
		do {
			System.out.println("1.Alta alumno\n2.Modificar nota alumno\n3.Sustituir alumno\n4.Borrar alumno\n5.Decir si un alumno está\n6.Mostrar\n7.Salir");
			System.out.println("Anota opcion:");
			opc=sc.nextInt();
			sc.nextLine();
			
			switch(opc) {
			case 1:
				System.out.println("Anota nombre:");
				nombre=sc.nextLine();
				if (alumnos.containsKey(nombre))
					System.out.println("El alumno existe");
				else {
					System.out.println("No existe");
					System.out.println("Introduce la nota:");
					nota=sc.nextDouble();
					alumnos.put(nombre, nota);
				}
				break;
			case 2:
				System.out.println("Anota nombre:");
				nombre=sc.nextLine();
				if (!alumnos.containsKey(nombre))
					System.out.println("El alumno no existe");
				else {
	
					System.out.println("Introduce la nota:");
					nota=sc.nextDouble();
					alumnos.put(nombre, nota);
					//alumnos.replace(nombre,nota);
				}
					
				break;
			case 3:
				System.out.println("Anota nombre:");
				nombre=sc.nextLine();
				if (!alumnos.containsKey(nombre))
					System.out.println("El alumno no existe");
				else {
					alumnos.remove(nombre);
					System.out.println("Introduce nombre nuevo alumno:");
					nombre=sc.nextLine();
					System.out.println("Introduce la nueva nota:");
					nota=sc.nextDouble();
					
					alumnos.put(nombre,nota);
				}
				break;
			case 4:
				System.out.println("Anota nombre:");
				nombre=sc.nextLine();
				if (alumnos.remove(nombre)==null)
				
					System.out.println("No existe el alumno");
				else {
					System.out.println("Alumno borrado");
				}
				break;
			case 5:
				System.out.println("Anota nombre:");
				nombre=sc.nextLine();
				if (!alumnos.containsKey(nombre))
					System.out.println("El alumno no existe");
				else 
					System.out.println("El alumno existe");
				break;
				
			case 6:
				
				 for (String clave : alumnos.keySet()) {
			         System.out.println(clave + " tiene " + alumnos.get(clave));
			        }
			}
			
		}while(opc!=7);
		

	}
	

}
