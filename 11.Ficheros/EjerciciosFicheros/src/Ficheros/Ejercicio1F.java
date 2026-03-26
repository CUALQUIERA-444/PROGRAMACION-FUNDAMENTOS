package Ficheros;

import java.io.File;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio1F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fichero;
		String ruta_inicial;
		Scanner sc = new Scanner(System.in);
		//Se puede tambien pedir de golpe
		System.out.println("Introduce la ruta del fichero");
		ruta_inicial= sc.nextLine();
		System.out.println("Introduce el nombre del fichero");
		fichero = sc.nextLine();
		Path ruta= Paths.get(ruta_inicial);
		System.out.println(ruta.toString());
		if(!Files.exists(ruta))
			System.out.println("ERROR NO SE PUDO ENCONTRAR EL ARCHIVO");
		else 
			for (int i = 0; i < ruta.getNameCount(); i++ ) {
				System.out.println(ruta.getName(i));
	}
	}
}
