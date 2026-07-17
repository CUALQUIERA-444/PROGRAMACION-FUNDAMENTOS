package Ejercicio9;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.AccessDeniedException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio16_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 9. Programa que lista los archivos de un directorio (sólo los archivos). Para cada
archivo que puede leer, imprimirá su contenido en pantalla
 */
	Scanner sc = new Scanner(System.in);
	Path p; 
	String directorio;
	String linea;
	DirectoryStream<Path> stream = null;
	BufferedReader lector = null;
	Charset charset = Charset.forName("UTF-8");
	System.out.println("Introduce el directorio");
	directorio = sc.nextLine();
	p = Paths.get(directorio);
	try {
		stream = Files.newDirectoryStream(p);
		for (Path aux: stream) {
			if(Files.isRegularFile(aux) ) {
				System.out.println(aux.getFileName());
				if(aux.getFileName().toString().endsWith(".txt") && Files.isReadable(aux)) { //Si no se pone el to String trabaja con Path
				lector = Files.newBufferedReader(aux,charset);
				while ((linea = lector.readLine()) != null) {
					System.out.println(linea);
				}
			}
			}
		}
		lector.close(); //Cerrar lector
		stream.close();	//Cerrar Stream
		}
	catch (IOException e) {
		System.out.println("Error en la lectura");
	}
	 	finally {
		if(lector != null) {
			try {
				lector.close();
			}
			catch (IOException e) {
				System.out.println("Error en la lectura del fichero");
			}
		}
		if(stream != null) {
			try {
				stream.close();
			}
			catch (IOException e) {
				System.out.println("Error en el recorrido del directorio");
			}
		}
	}
	}
}
