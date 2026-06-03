package Ejercicio15_6;
import java.util.*;
public class Instrumentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *6. Crea un HashSet con los nombres de varios instrumentos musicales. A continuación
lee el nombre de varios instrumentos hasta anotar fin, indica para cada
instrumento si está o no está en el conjunto. Si no está lo añades. 
 */
 //Paso 1 crear el hashset 
 HashSet<String> instrumentos = new HashSet<>();
 //Paso 2 Pedir La anotacion de los instrumentos rellenar Hashset
 Scanner sc = new Scanner(System.in);
 String instrumento;
 do {
 	System.out.println("Introduzca instrumentos");
 	instrumento = sc.nextLine();
 	if(!instrumento.equalsIgnoreCase("FIN")) {
 	if(!instrumentos.contains(instrumento)) { //No modifica a la hora de preguntar
 		System.out.println("Añadiendo el instrumento...");
 		instrumentos.add(instrumento); //Modifica a la hora de usar 
 	}
 	else {
 		System.out.println("Ya existe el instrumento");
 	}
 	}
	} while(!instrumento.equalsIgnoreCase("FIN"));
//Paso 3 Mostrar HashSet 
 for (String aux: instrumentos) {
	 System.out.println(aux);
 }
}
}