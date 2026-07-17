package Ejercicio10;

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
public class Ejercicio16_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 10. Dado un fichero de texto (creado con cualquier editor de texto plano), crear
otro fichero en el que se han eliminado las vocales.
 */
  Path p = Paths.get("Abecedario.txt");
  Path p2 = Paths.get("AbecedarioSinVocales.txt");
  Charset charset = Charset.forName("UTF-8");
  BufferedWriter escritor = null;
  BufferedReader lector = null;
  String linea;
  try {
  if(Files.exists(p2)) {
	  Files.delete(p2);
  }
	  lector = Files.newBufferedReader(p, charset);
	  escritor = Files.newBufferedWriter(p2,charset,CREATE);
	  while ((linea = lector.readLine()) != null) {
		  System.out.println(linea);
		  //En los regex [ ] Siginifica cualquiera de los que estan dentro aun separados aun juntos
		  escritor.write(linea.replace("a", "").replace("e", "").replace("i", "")
				  .replace("o", "")
				  .replace("u", "")
				  .replace("A", "")
				  .replace("E", "")
				  .replace("I", "")
				  .replace("O", "")
				  .replace("U", ""));
		  escritor.newLine();
	  }
	  lector.close();
	  escritor.close();
  }
  catch (NoSuchFileException e) {
	  System.out.println("El fichero no existe");
  }
  catch (AccessDeniedException e) {
	System.out.println("El fichero no tiene permisos");  
  }
  catch (IOException e) {
	  System.out.println("Error en la escritura");
  }
  finally {
	  if (lector != null) {
		  try {
			lector.close();
		  } catch (IOException e) {
			System.out.println("Error en la lectura");
		  }
	  }
	  if (escritor != null ) {
		  try {
			escritor.close();
		  } catch (IOException e) {
			System.out.println("Error en la escritura");
		  } 
	  }
  }
	}
}
