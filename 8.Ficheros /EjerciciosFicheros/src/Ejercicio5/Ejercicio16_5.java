package Ejercicio5;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio16_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 5. Programa que acepta el nombre de una carpeta por teclado y permita borrarla ,
tanto si está vacía como si no. Si no está vacía debe pedir confirmación. Dentro
de la carpeta sólo tendremos archivos
	Archivos == todo menos carpetas
	 */
	Scanner sc = new Scanner(System.in);
	String carpeta;
	boolean vacio = true;
	Path pcarpeta;
	char confirmacion;
	do {
	System.out.println("Introduce el nombre de la carpeta");
	carpeta = sc.nextLine();
	pcarpeta = Paths.get(carpeta);
	if(!Files.exists(pcarpeta)) {
		System.out.println("La carpeta no existe Vuelva a intentarlo");
	}
	else if(!Files.isDirectory(pcarpeta)) {
		System.out.println("No es una carpeta Vuelva a intentarlo");
	}
	} 
	while(!Files.exists(pcarpeta) || !Files.isDirectory(pcarpeta));
	DirectoryStream<Path> stream = null;
	 try {
		 stream = Files.newDirectoryStream(pcarpeta);
		 for(Path aux: stream) {
			 vacio = false; //Si no se hace esto 
			 break;
		 }
		 if(vacio) {
			 Files.delete(pcarpeta);
			 System.out.println("Borrado exitoso");
		 }
		 else {
			 System.out.println("Desea borrar la carpeta? (S o s para confirmar cualquier otra cosa para cancelar) ");
			 confirmacion = sc.nextLine().charAt(0);
			 if(confirmacion != ' ') {
				 if(confirmacion == 'S' || confirmacion == 's') {
					stream = Files.newDirectoryStream(pcarpeta);
			 for(Path aux: stream) { //Se necesita abrir cada vez que se recorra
				 Files.delete(aux);
			 }
			 Files.delete(pcarpeta);
				 }
				 else {
					 System.out.println("Operacion cancelada");
				 }
			 }
			 else {
				 System.out.println("No sea gracioso");
			 }
			 System.out.println("Borrado exitoso");
		 }
	 }
	 catch (IOException e){
		 System.out.println("Error en el borrado "+e.getMessage());
	 }
	 finally {
		 if(stream != null) {
			 try {
				stream.close();
			 } catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error al cerrar el stream "+e.getMessage());
			 }
		 }
	 }
	}
}