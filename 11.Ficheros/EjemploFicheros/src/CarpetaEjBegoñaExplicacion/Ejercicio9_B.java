package CarpetaEjBegoñaExplicacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio9_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 9. Programa que lista los archivos de un directorio (sólo los archivos). Para cada
archivo que puede leer, imprimirá su contenido en pantalla
	 */
	Scanner sc = new Scanner(System.in);
	String carpeta;
	System.out.println("Introduce nombre de la carpeta con su ruta");
	carpeta = sc.nextLine();
	Path carp = Paths.get(carpeta); //Obtiene la ruta de la carpeta
	Charset charset = Charset.forName("UTF-8"); //Define el lenguaje
	if (!Files.exists(carp)) {//Comprobar si existe
		System.out.println("No existe esa carpeta");
	}
	else {
	if(!Files.isDirectory(carp)) //Comprueba si es una carpeta necesario evaluar esta condicion antes del else
			System.out.println("No es una carpeta");
	else { //Esto se encarga de recorrer el archivo mostrando todo lo que encuentre
		try {
			DirectoryStream<Path> stream = Files.newDirectoryStream(carp);
			for (Path path: stream) {
				if(Files.isRegularFile(path)) {
				System.out.println(path.getFileName().toString()+"-----");
			BufferedReader reader = Files.newBufferedReader(path,charset);
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
				}
			}
			reader.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	}
}
}