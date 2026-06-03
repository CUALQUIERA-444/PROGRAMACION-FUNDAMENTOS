package Ejercicio6;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio16_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 6. Voluntario: Hacer el apartado anterior sin la suposición de que sólo habrá
archivos, puede haber subdirectorios. (Usad recursión)
	Recursion == Meterse en los subdirectorios y borrar
	 */
	Scanner sc = new Scanner(System.in);
	String carpeta;
	boolean vacio = true;
	Path pcarpeta;
	char confirmacion;
	do {
	System.out.println("Introduce el nombre de la carpeta");
	carpeta = sc.nextLine(); //Vacio == Carpeta raiz del proyecto actual
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
		 stream.close();
		 stream = null;
		 if(vacio) {
			 Files.delete(pcarpeta);
			 System.out.println("Borrado exitoso");
		 }
		 else {
			 System.out.println("Desea borrar la carpeta? (S o s para confirmar cualquier otra cosa para cancelar) ");
			 confirmacion = sc.nextLine().charAt(0);
			 if(confirmacion != ' ') {
				 if(confirmacion == 'S' || confirmacion == 's') {
					BorradoRecursivo(pcarpeta);
					System.out.println("Borrado exitoso");
				 }
				 else {
					 System.out.println("Operacion cancelada");
				 }
			 }
			 else {
				 System.out.println("No sea gracioso");
			 }
		 }
	 }
	 catch (IOException e){
		 System.out.println("Error en el borrado "+e.getMessage());
	 }
	 catch (IndexOutOfBoundsException e) {
		 System.out.println("La confirmacion no puede quedar vacío");
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
	public static void BorradoRecursivo(Path pcarpeta) throws IOException {
		DirectoryStream<Path> stream = Files.newDirectoryStream(pcarpeta);
		 for(Path aux: stream) { //Se necesita abrir cada vez que se recorra
			if(Files.isDirectory(aux)) {
			 BorradoRecursivo(aux);
			}
			else {
			 Files.delete(aux);
			}
		 }
		 stream.close();
		 stream = null;
		 Files.delete(pcarpeta);
	}
}