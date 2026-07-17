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

public class Ejercicio16_11B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generar archivo original en funcion de las copias
		// Las copias se ven asi
		/*
		 * F1: Etmd eo 
		 * F2: siaosñr 
		 * No necesariamente las lineas tienen la misma longitud Al separarlas
		 * F1: Hl Ja 
		 * F2  oaun 
		 */ 
		// El resultado debe ser: Estimado señor
		Path p = Paths.get("Copia1.txt");
		Path p2 = Paths.get("Copia2.txt");
		Path c = Paths.get("Original.txt");
		Charset charset = Charset.forName("UTF-8");
		String linea_A = ""; //Linea de lectura del archivo de los pares
		String linea_B = ""; //Linea de lectura del archivo de los impares
		 //Linea que se escribira en el fichero 
		BufferedReader lectorA = null;
		BufferedReader lectorB = null;
		BufferedWriter escritor = null;
		try {
			if(Files.exists(c)) {
				Files.delete(c);
			}
			// Creamos los lectores tradicionales de caracteres
			lectorA = Files.newBufferedReader(p, charset);
			lectorB = Files.newBufferedReader(p2, charset);
			escritor = Files.newBufferedWriter(c, charset, CREATE);
			while ((linea_A = lectorA.readLine()) != null && ((linea_B = lectorB.readLine()) != null)) {
				 //Por cada linea nueva empiezan en un espacio en blanco para proceder a la concatenacion
				String linea_entera = "";
				/*
				if (linea_A.length() == linea_B.length()) {
					linea_entera += Simetrico(linea_entera,linea_A,linea_B);
				}
				else {
				*/
					linea_entera += Asimetrico(linea_entera,linea_A,linea_B);
				//}
				escritor.write(linea_entera);
				escritor.newLine();
				System.out.println(linea_entera);
			}
			/*
			int charA = 0;
			int charB = 0;
			boolean finA = false;
			boolean finB = false;

			
			// El bucle se ejecuta de verdad hasta que AMBOS archivos devuelvan -1
			while (!finA || !finB) {
			
			    // 1. Intentamos leer un carácter del Fichero A
			    if (!finA) {
			        charA = lectorA.read();
			        if (charA == -1) {
			            finA = true; // Se acabó el archivo A
			        } else {
			            escritor.write(charA); // Escribe el carácter (o número, o espacio, o ENTER)
			        }
			    }
			    
			    // 2. Intentamos leer un carácter del Fichero B
			    if (!finB) {
			        charB = lectorB.read();
			        if (charB == -1) {
			            finB = true; // Se acabó el archivo B
			        } else {
			            escritor.write(charB); // Escribe el carácter inmediatamente detrás
			        }
			    }
			}
			*/ //Alternativa de código
			
			// Cerramos todo al terminar
			lectorA.close();
			lectorB.close();
			escritor.close();
		}
		catch (NoSuchFileException e ) {
			System.out.println("No se encontró el fichero");
		}
		catch (AccessDeniedException e) {
			System.out.println("El fichero no tiene los permisos");
		}
		catch (IOException e) {
			System.out.println("Error de entrada y salida");
		}
		finally {
			if(lectorA != null) {
				try {
					lectorA.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Error en el archivo A");
				}
			}
			if (lectorB != null ) {
				try {
					lectorB.close();
				} catch (IOException e) {
					System.out.println("Error en el archivo B");
				}
			}
			if (escritor != null ) {
				try {
					escritor.close();
				} catch (IOException e) {
					System.out.println("Error de escritura");
				}
				
			}
		}
	}
	/*
	public static String Simetrico(String l_entera, String l_a, String l_b) {
		char a = ' ';
		char b = ' ';
		int longitud_max = Math.max(l_a.length(),l_b.length());
		System.out.println(longitud_max);
		for (int i = 0; i<longitud_max;i++) {
			a = l_a.charAt(i);
			b = l_b.charAt(i);
			l_entera = l_entera+a+b;
		}
		return l_entera;
	}
	*/
	//Los strings son inmutables
	public static String Asimetrico(String l_entera, String l_a, String l_b) {
		int posicionA = 0;
		int posicionB = 0;
		while (posicionA < l_a.length() || posicionB < l_b.length()) {
			if(posicionA < l_a.length()) {
				l_entera = l_entera + l_a.charAt(posicionA);
				posicionA++;
			}
			if(posicionB < l_b.length()) {
				l_entera = l_entera + l_b.charAt(posicionB);
				posicionB++;
			}
		}
		return l_entera;
	}
}
