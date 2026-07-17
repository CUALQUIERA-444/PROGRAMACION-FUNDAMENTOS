package Ejemplo1;
import java.nio.file.*; //Paquete para las clases y objetos necesarios para la lectura y escritura de ejercicios
import java.util.*;
import java.io.*;
public class PracticaPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Stream = Lugar por donde viajan los datos byte a byte o caracter a caracter
/*
 * 1. Programa que:
a) Pide ruta y nombre de un fichero y nos da información sobre él
b) Permite borrar un fichero
c) Lista los archivos contenidos en un directorio y muestra información sobre
ellos o lo crea si no existe
 */
	//a)
	Path p;
	String ruta; 
	String nombre;
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce la ruta del fichero que desee buscar");
	ruta = sc.nextLine();
	System.out.println("Introduce el nombre del fichero que desee buscar");
	nombre = sc.nextLine();
	p = Paths.get(System.getProperty("user.home"),ruta,nombre); //Path NO BUSCA al menos cuando se trata de operar con FILES
	try {
	//Poner . en los path get quiere decir partiendo desde donde se encuentra el proyecto Eclipse 
	//Poner . en otras zonas de la ruta indica el directorio actual
	System.out.println("Nombre "+p.getFileName());
	System.out.println("Padre "+p.getParent());
	System.out.println("Encontrados "+p.getNameCount());//Cuenta la cantidad de elementos dentro de la ruta sin contar la raiz
	
	System.out.println("Elemento mas cercano a Root "+p.getName(0)); //Root = /
	
	System.out.println("Elemento de root (Ruta absoluta) "+p.getRoot().toString()); //Para usar to_string necesario ifs de null
	System.out.println("Files "+p.getFileSystem().toString());
	}
	catch (NullPointerException e){
		System.out.println("Error en la ruta");
	}
	catch (IllegalArgumentException e) {
		System.out.println("Error en el indice de busqueda");
	}
	//b) Permite borrar un fichero Files no usa objetos creados por mi
	if(Files.exists(p)) { //Ignorar el enlace simbolico
		try {
			Files.delete(p);
			System.out.println("Borrado exitoso");
		}
		catch(IOException e) { //Error multiusos
			System.out.println("Error general "+e.getMessage());
		}
	}
	else {
		System.out.println("El fichero no existe");
	}
	//Tienes que especificar el formato (la extensión 
	//como .txt, .pdf, .png, etc.) SIEMPRE que estés creando,
	//buscando, borrando 
	//o interactuando con un fichero concreto desde tu código.
	
	//c) Lista los archivos contenidos en un directorio y muestra información sobre
		//ellos o lo crea si no existe
	Path c2 = Paths.get("..");
	if(Files.isDirectory(c2)) {
		try {
		DirectoryStream <Path> stream = Files.newDirectoryStream(c2);
		//No tiene filtro 
		for(Path aux: stream) {
			System.out.println(aux.getFileName().toString());
		}
		stream.close(); //Cerrar el Stream para liberar la memoria
		}
		catch (IOException e) {
			System.out.println("Error general "+e.getMessage());
		}
	}
	else {
		System.out.println("El directorio no existe");
		try {
			Files.createDirectories(c2);
		}
		catch (IOException e) {
			System.out.println("Error general "+e.getMessage());
		}
	}
	//IOException Se traga las siguientes excepciones 
	//FileNotFoundException (Si el archivo no existe).
	//AccessDeniedException (Si no tienes permisos de administrador en Linux).
	//NoSuchFileException (La versión moderna de que no existe el fichero en java.nio).
	//DirectoryNotEmptyException (Si intentas borrar una carpeta que tiene cosas dentro)
	
	//No se traga estas 
	//NullPointerException
	//IllegalArgumentException
	//IndexOutOfBoundsException
	}
}



	
