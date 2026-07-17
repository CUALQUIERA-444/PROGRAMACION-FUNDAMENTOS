package Ejercicio12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;

public class Ejercicio16_12 {

	public static void main(String[] args) {
/*12. Codificar un programa que lee un fichero de texto y escribe en otro sólo las líneas
que contiene una palabra introducida por teclado.
*/
Scanner sc = new Scanner(System.in);
Path p = Paths.get("Normal.txt");
Path p2 = Paths.get("Exclusivo.txt");
String linea_lectura;
String linea_usuario;
BufferedWriter escritor = null;
Charset charset = Charset.forName("UTF-8");
BufferedReader lector = null;
System.out.println("Introduce línea");
linea_usuario = sc.nextLine();
try {
	escritor = Files.newBufferedWriter(p2,charset,CREATE);
	lector = Files.newBufferedReader(p, charset);
	while ((linea_lectura = lector.readLine()) != null) {
		System.out.println(linea_lectura);
		if(linea_lectura.contains(linea_usuario)) {
			escritor.write(linea_lectura);
			escritor.newLine();
		}
	}
	lector.close();
	escritor.close();
}
catch (NoSuchFileException e) {
	System.out.println("El fichero no existe");
}
catch (AccessDeniedException e) {
	System.out.println("No tiene permisos para abrir el fichero");
}
catch (IOException e) {
	System.out.println("Error general");
}
finally {
	if (lector != null) {
		try {
			lector.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en la lectura del fichero");
		}
	}
	if(escritor != null) {
		try {
			escritor.close();
		} catch (IOException e) {
			System.out.println("Error en la escritura del fichero");
		}
	}
}
	}
}
