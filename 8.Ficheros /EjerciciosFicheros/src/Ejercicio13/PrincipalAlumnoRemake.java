package Ejercicio13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PrincipalAlumnoRemake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 13. Programa que lee de teclado un fichero de texto con la información de varios
alumnos. En cada línea separada por comas, aparece el nombre, primer
apellido, nota (double) y fecha de nacimiento de cada alumno. Con los alumnos
leídos crea un ArrayList, luego lo ordena por nota de mayor a menor.
e introducir los alumnos en otro archivo (Cualquier error se manda a un archivo llamado error.log)
 */
//Paso 1 Crear el ArrayList 
		ArrayList<AlumnoRemake> alumnosnuevos = new ArrayList<>();
//Paso 2 Crear el Path 
		Path p = Paths.get("Alumnos2.txt");
//Paso 3 Declarar los instrumentos de lectura y escritura
Charset charset = Charset.forName("UTF-8");
BufferedReader lector = null;
BufferedWriter escritor = null;
try {
	lector = Files.newBufferedReader(p,charset); 
	escritor = Files.newBufferedWriter(p,charset,CREATE);
} 
catch () {
	
}
	}
}
