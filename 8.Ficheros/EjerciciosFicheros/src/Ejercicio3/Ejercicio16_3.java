package Ejercicio3;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio16_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*3. Programa que acepta el nombre de una carpeta por teclado y borra todos los
		ficheros que contiene (sólo ficheros)
		Ficheros == Cualquier archivo que no sea una carpeta
	*/
	//Paso 1 Variables y Path este ya sera entero puesto que es una carpeta 
	Scanner sc = new Scanner(System.in);
	String ruta_carpeta;
	Path p;
	System.out.println("Introduce la ruta de la carpeta/directorio");
	ruta_carpeta = sc.nextLine();
	p = Paths.get(ruta_carpeta);
	if(!Files.exists(p)) {
		System.out.println("No se encontro la carpeta/directorio");
	}
	else if(!Files.isDirectory(p)) {
		System.out.println("No es una carpeta/directorio");
	}
	else {
		 System.out.println("Iniciando borrado");
		 DirectoryStream<Path> stream = null;
		 try {
			 stream = Files.newDirectoryStream(p);
         for (Path aux: stream) {
            if(!Files.isDirectory(aux)) {
            	Files.delete(aux);
         }
     }
 } catch (IOException e) {
     System.out.println("Error al recorrer directorio: " + e.getMessage());
 }
	finally {
		try {
			if(stream != null) {
			stream.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el cierre");		
		}
	}
	}
	}
}
