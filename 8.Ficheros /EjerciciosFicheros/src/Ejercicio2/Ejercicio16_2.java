package Ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.*;
import static java.nio.file.StandardCopyOption.*;
public class Ejercicio16_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* 
	 * 2 Programa que lee la ruta y el nombre de 2 ficheros y copia el primero en el segundo
	 * Si el segundo existe se pide confirmación.
	 * Se toma en cuenta que se trata de duplicado de archivos en rutas distintas
	 */
	//Paso 1 Crear y rellenar las rutas
	Scanner sc = new Scanner(System.in);
	String la;
	String lb;
	String lc;
	String ld;
	Path r1;
	Path c1;
	Path r2;
	Path c2;
	char confirmacion;
	do {
	System.out.println("Introduzca la primera ruta sobre el fichero que quiere buscar");
	la = sc.nextLine();
	r1 = Paths.get(la); 
	System.out.println("Introduzca el nombre del fichero que desea copiar");
	lb = sc.nextLine();
	c1 = Paths.get(lb);
	r1 = r1.resolve(c1);
	if(!Files.exists(r1)) {
		System.out.println("El fichero de origen o la ruta no existe vuelva a intentarlo");
	}
	} while(!Files.exists(r1));
	System.out.println("Introduzca la segunda ruta de sobre el que se realizara el pegado");
	lc = sc.nextLine();
	r2 = Paths.get(lc); //No salta errores solo si fuera null o caracteres invalidos como *
	System.out.println("Introduzca el nombre del fichero donde desea pegar");
	ld = sc.nextLine();
	c2 = Paths.get(ld);
	r2 = r2.resolve(c2);
	
	
	if(!Files.exists(r2)) {
		System.out.println("Creando Copia...");
		try {
			Files.copy(r1,r2); //Usa el nombre del fichero que no existe para generar la copia
			System.out.println("Operación terminada");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el copiado "+e.getMessage());
		}
	}
	else {
		System.out.println("El fichero ya existe desea sobreescribirlo? (S o s para confirmar cualquier otro caracter para cancelar)");
		confirmacion = sc.nextLine().charAt(0);
		if(confirmacion == 'S' || confirmacion == 's') {
			try {
				Files.copy(r1, r2, REPLACE_EXISTING);
				System.out.println("Operación terminada");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error inesperado en el proceso "+e.getMessage());
			}
		}
		else {
			System.out.println("Operacion cancelada");
		}
	}
	}
}
