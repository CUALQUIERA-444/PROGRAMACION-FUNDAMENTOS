package ejercicio1libros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Libro> libreria=new ArrayList<>();
		libreria.add(new Libro("El hobbit","J.R. Tolkien","Alfaguara",30));
		libreria.add(new Texto("Programacion","Felix Gómez","Mac Grawn",38,"DAW1",10));
		Scanner sc=new Scanner(System.in);
		
		Iterator<Libro> it=libreria.iterator();
		
		while(it.hasNext()) {
			Libro l=it.next();
			System.out.println(l.toString());
		}
		
		System.out.println("Anota precio:");
		double precio=sc.nextDouble();
		
		for (Libro l:libreria) {
			if (l.getPrecio()<precio)
				System.out.println(l);
		}

		System.out.println("A continuación muestro todos los cursos de los libros de texto de mi librería:");
		for (Libro l:libreria) {
			//if (l instanceof Texto)
		    if (l.getClass().getSimpleName().equals("Texto"))
				System.out.println(((Texto) l).getCurso());
		}
		
	}

}
