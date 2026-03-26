package ejemploficheros;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Desafio_Oso {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Path entrada = Paths.get("/home/cualquiera/ASIGNATURAS 1DAW/PROGRAMACION-FUNDAMENTOS/11.Ficheros/EjemploFicheros/origen.txt");
				Path salida = Paths.get("/home/cualquiera/ASIGNATURAS 1DAW/PROGRAMACION-FUNDAMENTOS/11.Ficheros/EjemploFicheros/destino.txt");
				// Array de bytes para leer todos los bytes del archivo
				InputStream istream=null;
				OutputStream ostream=null;
				int c;
				try {
					//InputStream y OutputStream de java.io nos permiten trabajar byte a byte
					//Los generamos de forma eficiente utilizando java.nio
					istream = Files.newInputStream(entrada);
					ostream = Files.newOutputStream(salida);
					while ((c = istream.read()) != -1) {
						// Escribimos todos los bytes en el archivo salida
						// Despu�s de ejecutar comprobar que es igual a entrada
					if (c != 'A' && c!='a' && c!='e' && c!='E' && c!='i' && c!='I' && c!='o' && c!='O' && c!='U' && c!='u'  )
					//if (c != 'A' && c!='a' && c!='e' && c!='E' && c!='i' && c!='I' && c!='o' && c!='O' && c!='U' && c!='u' ) en numero
					//Algunos int son internamente chars tambien
						ostream.write(c);
					}
					//Fichero en el que tengo una frase se le llama origen.txt y solo llevo las consonantes a destino.txt
					istream.close();
					ostream.close();
				} catch (IOException io) {
					System.err.println(io);
				}
			}
}
