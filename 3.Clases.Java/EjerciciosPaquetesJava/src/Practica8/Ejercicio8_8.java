package Practica8;

import java.util.Scanner;

public class Ejercicio8_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 8. Programa que dadas dos cadenas nos dice si la menor está contenida en la
mayor y si es así nos dice la posición en la cual la ha encontrado.
 */
/* Lógica y código necesario
 * Usando dos objetos de la clase String tenemos que compararlo entre ellos para posteriormente 
 * en caso de encontrar la posición donde se encuentra hay que guardarla e imprimirla y decirle 
 * a la función en este caso indexof que empieza a buscar mas adelante a partir de donde encontro
 * Necesitamos dos cadenas una mayor y una menor 
 * Un entero que guarde las posiciones asi como servir de referencia a indexof
 */
	String cadena1;
	String cadena2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce 2 cadenas");
	cadena1 = sc.nextLine().toUpperCase().replace("Á","A").replace("É","E").replace("Í","I").replace("Ó","O").replace("Ú","U");
	cadena2 = sc.nextLine().toUpperCase().replace("Á","A").replace("É","E").replace("Í","I").replace("Ó","O").replace("Ú","U");
	MostrarPosiciones(cadena1,cadena2);
	}
	public static void MostrarPosiciones(String c1, String c2) {
		int recorrido = 0;
	   if(c1.length() > c2.length()) {
		   System.out.println("Posiciones encontradas");
		   while ( recorrido < c1.length() )  {
			  if (c1.indexOf(c2,recorrido) > -1) {
				 System.out.println("Posicion "+c1.indexOf(c2,recorrido));
				  recorrido = c1.indexOf(c2,recorrido)+ c2.length();
			   }
			  else {
				  System.out.println("No se encontro en ninguna posicion");
				  break;
			  }
		   }
	   }
	   else if (c1.length() < c2.length()) {
		   System.out.println("Posiciones encontradas");
		   while ( recorrido < c2.length())  {
				  if (c2.indexOf(c1,recorrido) > -1) { //Si encuentra muestra la posicion y actualiza el buscador
					 System.out.println("Posicion "+c2.indexOf(c1,recorrido));
					recorrido = c2.indexOf(c1,recorrido)+ c1.length(); 
				   }
				  else { //Si no logra encontrar muestra esto y termina
					  System.out.println("No se encontro en ninguna posicion");
					  break;
				  }
			   }
		   }
	   else {
		   System.out.println("Tienen la mimsa longitud");
	   }
	   }
	}