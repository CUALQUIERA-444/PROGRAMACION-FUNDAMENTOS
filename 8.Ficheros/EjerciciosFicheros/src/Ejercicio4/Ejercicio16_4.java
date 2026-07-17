package Ejercicio4;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio16_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 4.Modifica el programa anterior para que sólo borre los ficheros que empiecen
por una letra anotada desde teclado
	*/
	//Paso 1 Variables y Path este ya sera entero puesto que es una carpeta
	//Ni continuaba los pasos el huevon que hizo esto (soy yo)
	Scanner sc = new Scanner(System.in);
	String ruta_carpeta;
	char letra;
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
		System.out.println("Introduzca la letra y todos los ficheros que empiezen por esta serán eliminados");
		letra = sc.nextLine().charAt(0);
		 System.out.println("Iniciando borrado");
		 DirectoryStream<Path> stream = null;
		 try {
			 stream = Files.newDirectoryStream(p);
         for (Path aux: stream) {
            if(!Files.isDirectory(aux)) {
            	if(Character.toUpperCase(aux.getFileName().toString().charAt(0)) == Character.toUpperCase(letra)) {
            		Files.delete(aux);
            	}
         }
     }
        System.out.println("Borrado terminado");
 } catch (IOException e) {
     System.out.println("Error al recorrer directorio: " + e.getMessage());
 }
	finally {
		try {
			if(stream != null) {
			stream.close(); //Si logra el cometido se convierte en el objeto previo sin llegar a ser null de ahi que funcione
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el cierre");		
		}
	}
	}
	}
}
