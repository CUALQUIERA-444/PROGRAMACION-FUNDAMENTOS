package Ejercicio1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio16_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Haced un programa que lea por teclado el nombre de un fichero junto con la
ruta en la que se encuentra y diga si existe o no. Si no existe mostrar un error.
Si existe escribid una a una las distintas carpetas de su ruta (usad métodos de la
clase Path)
Ejemplo, si existe el archivo c:\prueba\ficheros\mio.txt que escriba:
C:\
prueba
ficheros
mio.txt
 */
	//Paso 1 leer la ruta junto al fichero 
	Scanner sc = new Scanner(System.in);
	Path p;
	String ruta;
	System.out.println("Introduce el nombre de la ruta junto al fichero");
	ruta = sc.nextLine(); //La ruta si no usa el system.getproperty debe ser escrito con /home/usuario
	p = Paths.get(ruta);
	//Paso 2 Condiciones 
	if(!Files.exists(p)) {
		System.out.println("Error el fichero no existe");
	}
	else {
		int n = p.getNameCount(); //Cantidad de elementos en la ruta incluryendose
		Path proot = p.getRoot();
		if(proot != null) {
			System.out.println(proot); //SOLO COMPONENTE ROOT
		}
			for (int i = 0; i<n; i++) {
				System.out.println(p.getName(i)); //No devuelve el componente root
			}
		}
  	}
	}

