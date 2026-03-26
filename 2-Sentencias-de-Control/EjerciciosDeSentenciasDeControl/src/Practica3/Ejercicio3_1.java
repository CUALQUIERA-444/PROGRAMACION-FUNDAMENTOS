package Practica3;

import java.util.Scanner;

public class Ejercicio3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Programa que lee dos números, si son positivos los suma, si son negativos los resta y si
alguno es nulo saca un mensaje de error.
 */
	Scanner sc = new Scanner (System.in);
	int n1;
	int n2;
	System.out.println("Introduce el primer número");
	n1 = sc.nextInt();
	System.out.println("Introduce otro número");
	n2 = sc.nextInt();
	if ((n1 > 0) && (n2 > 0))
		System.out.println("La suma de sus numeros es "+(n1+n2));
	else if ((n1 < 0) && (n2 < 0))
		System.out.println("La resta de sus numeros es "+(n1-n2));
	else if ((n1 == 0) || (n2 == 0))
		System.out.println("Lo siento ha habido un error alguno de sus números es nulo");
	
	//Diferencia entre if y else if 
	/* 
	 * 1.Si se pone varios ifs uno detrás de otro. Java está obligado a leerlos todos aunque el primero
	 * haya sido verdad  
	 */
	if (n1 > 0) //Ejecuta y sigue leyendo
		System.out.println("Es positivo");
	if(n1 == 0) //No es verdad pierde el tiempo comprobando
		System.out.println("Es cero");
	if (n1 < 0) //No es verdad pierde el tiempo comprobando 
		System.out.println("Es negativo");
	/*
	 * Problema: Es menos eficiente porque hace comprobaciones innecesarias.
Riesgo: Si dos condiciones pudieran ser ciertas a la vez, 
se ejecutarían ambos bloques, lo cual a veces no es lo que queremos.
	 */
	
	/*
	 * 2. Usando else if (Salidas excluyentes)
	 * El else if crea una cadena. En cuanto Java encuentra una condición que se cumple, ejecuta ese bloque y
	 *  se salta el resto de la cadena. No vuelve a preguntar.
		Eficiencia: Si n1 y n2 son positivos, Java ejecuta la suma y salta directamente al final del programa. 
		ni siquiera mira si son negativos o nulos.
		Lógica: Te aseguras de que solo ocurra una de las tres opciones.
	 */
	}
}
