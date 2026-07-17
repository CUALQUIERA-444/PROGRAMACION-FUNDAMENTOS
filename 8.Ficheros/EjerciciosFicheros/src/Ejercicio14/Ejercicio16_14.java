package Ejercicio14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio16_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 14 Programa que elimina una palabra introducida por teclado de un fichero.
	 * El nombre del fichero de entrada y el de salida se introducen por teclado 
	 * y no pueden coincidir
	 * Notas 
	 * El fichero de entrada es sobre el que se va a eliminar contenido 
	 * El de salida no importa su estado como si está en blanco puesto que este se creara en base al otro fichero
	 */
	//Paso 1 pedir los nombres de los ficheros 
	String linea_lectura;
	String linea_usuario;
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el nombre del fichero");
	String s1 = sc.nextLine();
	System.out.println("Introduce el nombre del segundo fichero");
	String s2 = sc.nextLine();
	//Paso 2 declarar lectores
	BufferedWriter escritor = null;
	BufferedReader lector = null;
	if(!s1.endsWith(".txt") || !s2.endsWith(".txt")) { //String
		System.out.println("Error ambos ficheros deben tener la extension .txt");
	}
	else if(s1.equalsIgnoreCase(s2)) {
		System.out.println("Error no pueden tener el mismo nombre");
	}
	else {
	Path p1 = Paths.get(s1);
	Path p2 = Paths.get(s2); //Si introduces algo por consola lo interpreta como fichero sin extension pero lo interpreta
	if(!Files.exists(p1)) {
		System.out.println("Error el primer fichero debe existir");
	}
	else if(!Files.isReadable(p1)) { //Si es leible // Files.isExecutable Si es ejecutable
		System.out.println("No tiene permisos");
	}
	else {
		try {
			if(Files.size(p1) > 0) {
				System.out.println("Introduce una palabra y generaremos un fichero eliminando esa palabra");
				linea_usuario = sc.nextLine();
				//Declarar el lector y el escritor 
				lector = Files.newBufferedReader(p1);
				escritor = Files.newBufferedWriter(p2);
				while ((linea_lectura = lector.readLine()) != null) {
						escritor.write(linea_lectura.replace(linea_usuario, ""));
						escritor.newLine();
				}
				lector.close();
				escritor.close();
			}	
			else {
				System.out.println("Error el fichero se pudo verificar pero no se abrira debido a que esta vacio");
			}
		}
		catch (NoSuchFileException e) {
			System.out.println("El fichero no existe");
		}
		catch (AccessDeniedException e) {
			System.out.println("No se tienen los permisos para abrir el fichero");
		}
		catch (IOException e) {
			System.out.println("El fichero debe tener contenido");
		}
	finally {
		if (lector != null) {
			try {
			lector.close();
			} catch (IOException e) {
			System.out.println("Error general en el cierre del lector");
			}
		}
	    if (escritor != null) {
	    	try {
	    	escritor.close();
	    	} catch (IOException e) {
	    	System.out.println("Error general en el cierre del escritor");
	    	}
	    }
		}
	}
	}
	}
}

