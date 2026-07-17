package Ejercicio8;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio16_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* 
	 * 8.Programa que lee un archivo y cuenta las veces que se repite una letra anotada desde teclado
	 */
	Scanner sc = new Scanner(System.in);
	String archivo; 
	String linea;
	Path p;
	char letra;
	int contador = 0;
	BufferedReader lector = null;
	Charset charset = Charset.forName("UTF-8");
	System.out.println("Introduce el nombre del archivo que vaya a leer");
	do {
	archivo = sc.nextLine();
	p = Paths.get(archivo);
	if(!Files.exists(p) || Files.isDirectory(p)) {
		System.out.println("El fichero no existe o es un directorio vuelva a intentarlo");
	}
	} while(!Files.exists(p) || Files.isDirectory(p));
	System.out.println("Introduce una letra y contaremos cuantas apariciones de esta hay en el fichero ");
	letra = sc.nextLine().charAt(0);
	try {
		lector = Files.newBufferedReader(p,charset);
		linea = lector.readLine();
		while (linea != null) {
			System.out.println(linea);
			if(linea.toUpperCase().indexOf(Character.toUpperCase(letra)) != -1 ) { //Solo devuelve la primera ocurrencia y estamos leyendo por linea 
			contador++;
			}
			linea = lector.readLine();
		}
		System.out.println("Apariciones "+contador);
	}
	catch (IOException e){
		System.out.println("Error en la lectura del fichero");
	}
	catch (IndexOutOfBoundsException e) {
		System.out.println("No puede quedar el campo vacío");
	}
	finally {
		if(lector != null) {
			try {
				lector.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error en el cerrado");
			}
		}
	}
	}
}
