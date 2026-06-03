package Ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio16_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* 
	 * 7. Programa que cuenta los caracteres de un archivo (Contenido no el nombre)
	 * Nota en mi examen va a ser todo con Buffer agradezco a Dios esta decision por que el otro es algo raro 
	 */
	//Experimento con Alumnos.txt
	Scanner sc = new Scanner(System.in);
	String fichero;
	String linea;
	int acumulador_caracteres = 0;
	Charset charset = Charset.forName("UTF-8");
	BufferedReader lector = null;
	Path p;
	System.out.println("Introduce la ruta del fichero y te devolveremos la cantidad de caracteres que tiene");
	fichero = sc.nextLine();
	p = Paths.get(fichero);
	if(!Files.exists(p)) {
		System.out.println("El fichero no existe");
	}
	else if(Files.isDirectory(p)) {
		System.out.println("No vamos a contar los caracteres de un directorio");
	}
	else {
		try {
			lector = Files.newBufferedReader(p,charset);
			linea = lector.readLine();
			while (linea != null) {
			acumulador_caracteres = acumulador_caracteres + linea.length();
			linea = lector.readLine();
			}
			System.out.println("Total caracteres "+acumulador_caracteres); //Sin contar los daltos de linea
		} catch (IOException e) {
			System.out.println("Error en la lectura");
		}
		finally {
			if(lector != null) {
				try {
					lector.close();
				} catch (IOException e) {
					System.out.println("Error en el cierre");
				}
			}
		}
	}
	}
}
