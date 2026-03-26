package Practica6_Bis;

import java.util.Scanner;

public class EjercicioS_2 {
/**
 * @author cualquiera
 * Esta es la función principal
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Leer letras por teclado hasta anotar $. Mostrar al finalizar la letra cuya secuencia
más veces se repite y cuantas veces se repite.
 */
/*
 * Por ejemplo, si se teclea la siguiente serie:
Assddggggaasssaadadad$
El programa tiene que decir que la secuencia más larga es la de la letra g y que aparece
4 veces seguida.
Tener en cuenta:
1. Permitir al usuario que introduzca todas las series que desee.
2. Validar que se introduzcan letras, y que además puedan ser mayúsculas y
minúsculas.
 */
	/* Notas 
	 * La idea es primero permitir al usuario introducir todos los caracteres que desee hasta que se anote $
	 * Si es $ se pregunta al usuario si quiere la misma serie
	 * Se le puede dar la opcion al usuario de preguntarle si desea continuar si si se le permite añadir más 
	 * y se le muestra la secuencia más repetida de esa serie y se le deja introducir más series 
	 * Si no se le muestra la secuencia más repetida de TODO EL PROGRANA 
	 */
	/* Variables sentencias y funciones
	 * Se necesita una variable que almacene la letra del usuario y guarde dicha letra previa 
	 * Despues una variable para comparar la letra anterior a la nueva
	 * Se necesita una comprobación para poder seguir la secuencia mientras la letra no sea $
	 * Se necesita una variable para almacenar si el usuario que seguir introduciendo series despues de escribir $
	 * Una variable int que guarde el mayor de la serie
	 * Una variable int que guarde el mayor global
	 */
	Scanner sc = new Scanner(System.in);
	int contador_letra;
	int record_global = 0;
	int record_serie = 0;
	char letra_ganadora_serie; 
	char letra_ganadora_global = ' '; //Inicializar por cuestiones de no tener un valor
	char letra_serie;
	char continuar;
	char letra_anterior = ' '; //DEBE TENER UN CARACTER OBLIGATORIAMENTE AUNQUE SEA UN ESPACIO EN BLANCO
	//Primero vamos a válidar que sea una letra o Ñ o $ y si no se le volvera a pedir la letra pero con la diferencia de que está no entre en la función que empieza 
	//A comparar y añadir al contador de serie 
	do {
	contador_letra = 0;
	record_serie = 0;
	letra_ganadora_serie = ' ';
	letra_anterior = ' '; //Letra anterior vuelve a estar en blanco cada vez que se inicia una serie
	System.out.println("Introduzca su serie");
	do {
		System.out.println("Introduzca letras UNA POR UNA");
	letra_serie = sc.nextLine().charAt(0);
	letra_serie = Character.toUpperCase(letra_serie);
	if((letra_serie < 'A' || letra_serie > 'Z') && letra_serie != 'Ñ' && letra_serie !='$') { //Si no es una letra o simbolo aceptado no entra
		System.out.println("Lo siento debe ser una letra o $");
	}
	else { //Tiene que entrar $ para acabar la serie y por defecto no afecta a ninguna de las condiciones ya que se acaba ahi
		if(letra_anterior == letra_serie) {
			contador_letra++;
		}
		else {
			if(contador_letra > record_serie) {
				letra_ganadora_serie = letra_anterior; //Antes de cambiar la letra anterior el record se va a la letra antes de que se cambie 
				record_serie = contador_letra;
			}
			//Siempre va a hacer esto va a cambiar
			letra_anterior = letra_serie;
			contador_letra = 1;
		}
	}
	} while(letra_serie != '$');
	System.out.println("La letra ganadora de esta serie es "+letra_ganadora_serie+" con un record de "+record_serie);
	do {
	System.out.println("Desea continuar escribiendo series?");
	continuar = sc.nextLine().charAt(0);
	continuar = Character.toUpperCase(continuar);
	if(continuar != 'S' && continuar != 'N' ) {
		System.out.println("Ciñase a lo escrito");
	}
	}
	while(continuar != 'S' && continuar != 'N');
	if(continuar  == 'S') {
		System.out.println("Ok continuamos");
	}
	else {
		System.out.println("Ok terminamos");
	}
	if(record_serie > record_global) {
		record_global = record_serie;
		letra_ganadora_global = letra_ganadora_serie;
    }
	} while (continuar == 'S');
	System.out.println("La letra ganadora global es "+letra_ganadora_global+" con un record de "+record_global);
}
}