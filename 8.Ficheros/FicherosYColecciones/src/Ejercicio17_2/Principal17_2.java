package Ejercicio17_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.AccessDeniedException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;

public class Principal17_2 {
/*
 * 2. Leed el nombre de dos carpetas por teclado y mostrad el nombre de todos los
archivos (no directorios) contenidos en las carpetas sin repetirlos.
Ejemplo:
Si tenemos dos directorios con los siguientes archivos:
Directorio1: a1, a2, a3, b1, b2
Directorio2: a2, a3, a4, b1,b3
La salida sería: a1,a2,a3,a4,b1,b2,b3
 */
//Procesaremos primero una y despues la otra
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stud
	//Paso 4 hacer un HahSet por que la idea para mostrar no repetidos es usar el .toString de los ficheros Solo la parte antes del punto usando 
	//Un bucle y se detiene cuando encontra el punto guarda la posicion 
	HashSet<String> directorioa = new HashSet<>();
	HashSet<String> directoriob = new HashSet<>();
	HashSet<String> unicos = new HashSet<>();
	//Paso 5 Guardar strings  
	String colocacion;
	//Paso 1 Leer las carpetas y usar los Paths
	System.out.println("Introduce el nombre de la carpeta");
	String carpetaA = sc.nextLine();
	System.out.println("Introduce el nombre de la segunda carpeta");
	String carpetaB = sc.nextLine();
	Path a = Paths.get(carpetaA);
	Path b = Paths.get(carpetaB);
	String colocacion2;
	DirectoryStream<Path> stream = null;
	DirectoryStream<Path> stream2 = null;
	//Paso 2 Validamos las rutas para que realmente sean directorios y ahorrarnos las excepciones posteriores con respecto a lectura de directorios
	if(!Files.exists(a) || !Files.exists(b)) {
		System.out.println("El fichero A o B no existe");
	}
	else if(!Files.isDirectory(a) || !Files.isDirectory(b)) {
		System.out.println("El fichero A o B no es un directorio");
	}
	//Paso 3 leemos los directorios
	//Substring = posicion que quiere terminar pero sin incluir la posicion final 
	else {
		try {
			 stream = Files.newDirectoryStream(a);
			//El objeto aux.toString devuelve TODA LA RUTA DEL FICHERO ES DECIR JUNTO AL DIRECTORIO
			for (Path aux: stream) {
				int posicion = aux.getFileName().toString().length(); 
				//Necesario por que si no guarda los puntos y pueden aparecer problemas cuestionables
				//Si no hay extension se coje todo el texto
				if(!Files.isDirectory(aux)) {
				for (int i = 0; i<aux.getFileName().toString().length(); i++) {
					if (aux.getFileName().toString().charAt(i) == '.') {
						posicion = i;
						break;
					}
				}
				colocacion = aux.getFileName().toString().substring(0, posicion);
				directorioa.add(colocacion);
				unicos.add(colocacion);
				}
			}
		stream.close();
		//Paso 4 Recorremos el segundo 
		 stream2 = Files.newDirectoryStream(b);
		for (Path aux2: stream2) {
			int posicion2 = aux2.getFileName().toString().length(); 
			//Necesario por que si no guarda los puntos y pueden aparecer problemas cuestionables
			//Si no hay extension se coje todo el texto
			if(!Files.isDirectory(aux2)) {
			for (int i = 0; i<aux2.getFileName().toString().length(); i++) {
				if (aux2.getFileName().toString().charAt(i) == '.') {
					posicion2 = i;
					break;
				}
			}
			colocacion2 = aux2.getFileName().toString().substring(0, posicion2);
			directoriob.add(colocacion2);
			unicos.add(colocacion2);
			}
		}
			stream2.close();
			boolean primero = true;
			System.out.println("Directorio 1");
			for (String aux: directorioa) {
				if(!primero) {
					System.out.print(",");
				}
				primero = false;
				System.out.print(aux);
			}
			System.out.println("\nDirectorio2");
			primero = true;
			for (String aux: directoriob) {
				if(!primero) {
					System.out.print(",");
				}
				primero = false;
				System.out.print(aux);
			}
			System.out.println("\nUnicos");
			primero = true;
			for (String aux: unicos) {
				if(!primero) {
					System.out.print(",");
				}
				primero = false;
				System.out.print(aux);
			}
		}
		catch (NoSuchFileException e) {
			System.out.println("El fichero no existe");
		}
		catch (AccessDeniedException e) {
			System.out.println("El fichero existe pero no tiene los permisos");
		}
		 catch (IOException e) {
			System.out.println("Error en el recorrido de la carpeta");
		}
		finally {
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Error en el recorrido de la carpeta A");
				}
			}
			if(stream2 != null) {
				try {
					stream2.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Error en el recorrido de la carpeta B");
				}
			}
		}
	}
	}
}
