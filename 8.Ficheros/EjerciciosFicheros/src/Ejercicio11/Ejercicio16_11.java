package Ejercicio11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;

public class Ejercicio16_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *11  Fichero: Estimado señor .......
F1: Etmd eo
F2: siaosñr
Implementar dos procesos, uno para pasar del fichero original a los dos
transformados y otro para construir el original a partir de esos dos.
 */
  Path p1 = Paths.get("Original.txt");
  Path c1 = Paths.get("Copia1.txt");
  Path c2 = Paths.get("Copia2.txt");
  String linea;
  Charset charset = Charset.forName("UTF-8");
  BufferedReader lector = null;
  BufferedWriter escritorA = null;
  BufferedWriter escritorB = null;
  try {
	  if(Files.exists(c2) || Files.exists(c1)) {
		  Files.delete(c2);
		  Files.delete(c1);
	  }
	  lector = Files.newBufferedReader(p1,charset);
	  escritorA = Files.newBufferedWriter(c1, charset,CREATE);
	  escritorB = Files.newBufferedWriter(c2, charset,CREATE);
	  while ((linea = lector.readLine()) != null) {
		  String lineapar = ""; //Cada vez que pasa a una linea nueva se vacia el acumulador
		  String lineaimpar = ""; //
		  System.out.println(linea);
		  for (int i = 0; i<linea.length(); i++) {
			 // System.out.println(linea.charAt(i));
			  if(i % 2 == 0) {
				  lineapar = lineapar + linea.charAt(i); //La razon por la que usamos el acumulador es para 
				  //basicamente concatenar los caracteres extraidos y guardarlos en una linea personalizada para escribir en el fichero correspondiente 
			  }
			  else {
				  lineaimpar = lineaimpar + linea.charAt(i);
			  }
		  }
		  System.out.println(lineapar);
		  System.out.println(lineaimpar);
		  escritorA.write(lineapar);
		  escritorA.newLine();
		  escritorB.write(lineaimpar);
		  escritorB.newLine();
	  }
	 lector.close();
	 escritorA.close();
	 escritorB.close();
  }
  catch (NoSuchFileException e) {
	  System.out.println("El fichero no existe");
  }
  catch (AccessDeniedException e) {
	  System.out.println("El fichero no tiene permisos para la lectura/escritura");
  }
  catch (IOException e) {
	  System.out.println("Error general");
  }
  finally {
	  if(lector != null) {
		  try {
			lector.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en la lectura del fichero");
		}
		if(escritorA != null) {
			try {
				escritorA.close();
			} catch (IOException e) {
				System.out.println("Error en la escritura del fichero de los pares");
			}
		}
		if(escritorB != null) {
			try {
				escritorB.close();
			}
			catch (IOException e) {
				System.out.println("Error en la escritura del fichero de los impares");
			}
		}
	  }
  }
	}
}
