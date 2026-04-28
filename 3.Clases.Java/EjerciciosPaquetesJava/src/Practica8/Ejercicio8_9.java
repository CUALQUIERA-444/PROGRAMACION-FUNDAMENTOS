package Practica8;

import java.util.Scanner;

public class Ejercicio8_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 9. Programa que lee dos cadenas por teclado y calcula el número de veces que se repite
la de menor longitud en la de mayor sustituyendo todas sus apariciones por
mayúsculas.
 */
/*
 * Logica y codigo necesario 
 * Necesitamos un programa que sea capaz de nuevo de comparar si una cadena es mayor que otra pero esta vez 
 * en caso de encontrarla hay que sustituir todas sus apariciones por mayusculas ahora esto no suena 
 * tan complicado pero la cosa es las tildes y las ñ así como en caso de escribir letras combinadas por lo general el 
 * programa no lo suele entender pero intentaremos sobrellevarlo
 * 
 * En todo caso lo que tenemos que hacer es comparar primero y despues con un contador ver cuantas veces se
 * repite dicha cadena nuevamente con indexof
 * Haremos 2 funciones un int que muestre la cantidad de apariciones mostrandolas y otra que devuelva el string la palabra intercambia
 * necesitamos 2 strings, un contador, un metodo indexof con un bucle que se vaya ejecutando y finalmente 
 * un replace para sustituir quizas necesitamos limpiar un poco las palabras
 */
	String c1; 
	String c2;
	String c1_limpio;
	String c2_limpio;
	int contador_apariciones; //Quieras o no te voy a usar 
	Scanner sc = new Scanner (System.in);
	System.out.println("Introduce 2 cadenas");
	c1 = sc.nextLine();
	c2 = sc.nextLine();
	c1_limpio = c1.toUpperCase().replace("Á","A").replace("É","E").replace("Í","I").replace("Ó", "O").replace("Ú", "U");
	c2_limpio = c2.toUpperCase().replace("Á","A").replace("É","E").replace("Í","I").replace("Ó", "O").replace("Ú", "U");
	if(c1_limpio.length() > c2_limpio.length()) {
		contador_apariciones = Recontar(c1_limpio,c2_limpio);
		if (contador_apariciones > 0) {
			System.out.println("Se ha encontrado la más corta dentro de la más larga un total de "+contador_apariciones+" veces");
		}
		else {
			System.out.println("No se encontró");
		}
		c1 = Aesthetic(c1,c2);
		System.out.println("Modificacion "+c1);
	}
	else if (c2_limpio.length() > c1_limpio.length()){
		contador_apariciones = Recontar(c2_limpio,c1_limpio);
		if (contador_apariciones > 0) {
		System.out.println("Se ha encontrado la más corta dentro de la más larga un total de "+contador_apariciones+" veces");
	}
		else {
			System.out.println("No se encontró");
		}
		c2 =  Aesthetic(c2,c1);
		System.out.println("Modificacion "+c2);
	}
	else {
		System.out.println("Son iguales");
	}
	}
	public static int Recontar (String c1, String c2) {
		int recorrido = 0;
		int contador = 0;
		int pos = c1.indexOf(c2,recorrido);  //Busca la primera vez ESTO NO SE ACTUALIZA POR QUE POS ESTA DENTRO DEL WHILE
		//E IGNORA ESTO CON RAZÓN 
		while (pos != -1) { //Mientras encuentre ejecuta  
			contador++;//Actualizar contador
			recorrido = pos + c2.length(); //Actualizar posición de partida 
			pos = c1.indexOf(c2,recorrido); //Actualizar búsqueda 
			}
		return contador;
		}
	public static String Aesthetic (String c1, String c2) {
		if(c1.length() > c2.length())
		return c1.replace(c2.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú","u"), c2.toUpperCase());
		else 
		return c2.replace(c1.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú","u"), c2.toUpperCase());
	}
}

