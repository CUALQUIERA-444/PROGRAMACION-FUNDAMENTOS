package Ejemplo2;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedWriter;
import static java.nio.file.StandardOpenOption.*;
public class PracticaFilesBufferYyoQueSe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*2. Codificar un programa que lee cadenas de teclado y las escribe en un archivo,
		cada cadena en una línea.
		. Escribe por defecto donde se encuentra el proyecto
	3. Codificar un programa que lee un fichero de texto y escribe en otro sólo las
	líneas que empiezan por mayúscula.
	*/
	//Los que tienen buffer suelen coger trozos grandes y los otros van byte a byte
	//2 
	String linea;  
	Path p = Paths.get(".","salida.txt"); //Separa ambos cachos y forma una ruta con eso 
	Scanner sc = new Scanner(System.in);
	Charset charset = Charset.forName("UTF-8"); //Define el formato con el que se escribira en el archivo
	BufferedWriter buff = null;
	try {
		//Archivos Por defecto que se escriben TIENEN ESTAS OPCIONES CREATE,TRUNCATE_EXISTING y WRITE.
		buff = Files.newBufferedWriter(p, charset,CREATE);
		//"If APPEND is present then WRITE is ignored or implies writing. 
		//However, if both APPEND and TRUNCATE_EXISTING are present, 
		//an IllegalArgumentException is thrown."
		//Create con Write borran todo asi que usamos create y write para abrir los permisos de que se reescriba cada vez que se abra el archivo
		do {
			System.out.println("Anota línea (FIN para salir) ");
			linea = sc.nextLine();
			if(!linea.equalsIgnoreCase("FIN")) {
				buff.write(linea);
				//Nueva Linea para separarlas
				buff.newLine();
			}
		} while(!linea.equalsIgnoreCase("FIN"));
		buff.close();
	}
	catch (IOException e) {
		System.out.println("Error en la escritura "+e.getMessage());
	}
	finally {
		try {
			if(buff != null) {
				buff.close();
			}
		}
		catch (IOException e) {
			System.out.println("Error en el cierre "+e.getMessage());
		}
	}
	//3 Codificar un programa que lee un fichero de texto y escribe en otro sólo las
	//líneas que empiezan por mayúscula.
	String linea2;
	Path p2 = Paths.get("salida.txt");
	Path p3 = Paths.get("escupiendoMayus.txt");
	BufferedReader lector = null;
	BufferedWriter escritor = null;
	try {
		lector = Files.newBufferedReader(p2,charset);
		escritor = Files.newBufferedWriter(p3,charset,CREATE);
		linea2 = lector.readLine(); //Lee la primera linea
		while(linea2 != null) { //No puede dar null los metodos si primero se comprueba
			//Lo de vacio es porque si se extrae una linea vacia el substring salta otra excepcion que es IndexOutOfBoundsException
			//Asi que se salta la linea si esta vacia y solo valida si tiene algo 
			if(!linea2.isEmpty()) {
			String regex = "^[A-Z]$";
			if(linea2.substring(0,1).matches(regex)) {
				escritor.write(linea2);
				escritor.newLine();
			}
			}
			linea2 = lector.readLine(); //Al final lee la siguiente hasta el final
		}
		//lector.close(); NO NECESARIO CON EL FINALLY 
		//escritor.close();
	}
	catch (IOException e) {
		System.out.println("Error en la operación "+e.getMessage());
	}
	finally {
		try {
			if(lector != null) {
				lector.close();
			}
			if(escritor != null) {
				escritor.close();
			}
		}
		catch (IOException e) {
			System.out.println("Error en el cierre "+e.getMessage());
		}
	}
	}
}
