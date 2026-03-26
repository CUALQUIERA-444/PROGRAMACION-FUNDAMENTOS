package Practica6_Bis;

import java.util.Scanner;

public class EjercicioS_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5. Programa que lee un número decimal y lo transforma en su correspondiente
		 * número romano
		 */
		/*
		 * Notas Se refiere a numeros del sistema decimal base 10 numeros enteros
		 * basicamente ya que no existian decimales de coma flotante como tal en roma
		 * tampoco se hizo este sistema con numeros negativos en mente
		 *
		 * 
		 * Los romanos no tenían una letra para el 5000 o el 10,000. Lo que hacían era
		 * poner una raya horizontal encima de la letra (llamada vinculum) para
		 * multiplicar su valor por 1000. Como en la consola de Java no puedes pintar
		 * rayas encima de las letras fácilmente, el límite estándar para estos
		 * ejercicios siempre es 3999.
		 * 
		 */
		/*
		 * Lógica la idea es simple leer un número entero y que lo transforme en romano
		 * puede ser con validación o no en este caso se tendrá en cuenta
		 *
		 * 
		 * 1000 M 
		 * 900 CM (1000 - 100) TAMPOCO SE PUEDE REPETIR POR QUE LA IDEA ES PARA EL NUMERO QUE 2 DE ESOS PODRIAN REPRESENTAR O SEA 1800 SE EMPIEZA COGIENDO EL 1000 SE APLICA PARA TODOS LOS DE ANTES DEL X 19
		 * 500 D NO SE PUEDE REPTIR POR QUE LO IDEAL ES USAR LO MAS GRANDE O SEA 1000
		 * 400 CD (500 - 100) NO SE PUEDE REPETIR POR QUE NUEVAMENTE SI TIENES 2 DE ESTOS 800 LO QUE ESPERAN ES COGER EL MAS GRANDE 500,100,100,100 O SEA DCCC
		 * 100 C 
		 * 90 XC (100 - 10) 
		 * 50 L NO SE PUEDE REPETIR POR QUE LO IDEAL ES USAR EL MAS GRANDE O SEA 100
		 * 40 XL (50 - 10) 
		 * 10 X 
		 * 9 IX (10 - 1) 
		 * 5 V NO SE PUEDE REPETIR POR QUE LO IDEAL ES USAR EL MAS GRANDE O SEA 10 (SEGUN ROMANOS)
		 * 4 IV (5 - 1) 
		 * 1 I 
		 * Para poder realizar  este ejercicio es importante tener estas 3 reglas de oro en cuenta 
		 * 1-Suma Si una letra está a la derecha de otra igual o mayor, se suma.
		 * Ejemplo: VI = 5 + 1 = 6 
		 * 
		 * 2-Resta (La clave del ejercicio): Si una letra menor está a la izquierda
		 * de una mayor, se resta
		 * Ejemplo: IV = 5 - 1 = 4 o IX = 10 - 1 = 9
		 * 
		 * 3-Límite de repetición:
		 * No puedes repetir la misma letra más de 3 veces seguidas.Para
		 * el 4 no usas IIII, usas IV.Para el 40 no usas XXXX, usas XL.
		 * Generalmente el 4 y 5 y sus productos por 100 NO SE PUEDEN REPERIR
		 */
		/*
		 * Variables funciones sentencias...
		 * Es obligatorio usar un String ya que un número romano esencialmente es una cadena de caracteres y hacerlo con un simple caracter sería una tortura
		 * Un int que recojera el número del usuario a tranformar que dependiendo de si es positivo y menor o igual que 3999 será transformado o no
		 */
		/**
		 * Primero nos encargaremos de que el numero introducido es correcto
		 */
		Scanner sc = new Scanner (System.in);
		int number;
		int comparacion;
		String roman_number;
		System.out.println("Introduce un número y te lo transformaremos en su valor romano");
		do {
		number = sc.nextInt(); //Recoger el número del usuario
		comparacion = ValidarNumero(number);
			if(comparacion == 0) {
			System.out.println("Número no aceptado vuelva a intentarlo");
			}
		} while(comparacion == 0);
		roman_number = ExtraerRomano(number);
		System.out.println(roman_number);
	}
	public static int ValidarNumero(int comparar) {
		if(comparar > 0 && comparar <= 3999) {
			return comparar;
		}
		return 0;
	}
	public static String ExtraerRomano(int number) {
		String roman_sign = "";
		int numero_buscador;
		while(number > 0) {//Reducir el número hasta que sea 0 donde no se podra expresar el número en romano 
		//Como solo nos interesa el romano realmente no nos importa el destino del numero original
		/** PENSAR
		 * 3999 = MMM (3000) + CM (900) + XC (90) + IX (9) -> MMMCMXCIX
		 * 1800 = M (1000) + D (500) + C (100) + C(100) + C (100)
		 * SI EL NUMERO VA ANTES DE UN MULTIPLO DE 5 el menor se va a atras pero es mas sencillo evaluar todo
		 */
		numero_buscador = ExtraerNumeroValidoR(number); //88 - 50 = 38 - 10 = 28 - 10 = 18 - 10  = 8 - 5 = 3 - 1 = 2 - 1 = 1 - 1 = 0 LXXXVIII
		number = number - numero_buscador;
		roman_sign = roman_sign + ExtraerSimbolo(numero_buscador);
		// return roman_sign; Se queda con lo último 
		}
		return roman_sign;
		}
	public static int ExtraerNumeroValidoR (int number) {
		/*switch (number) {
		case 1000: //No se pueden poner comparaciones en el switch case pero se pueden poner 2 cases en una misma instruccion
		return 1000;
		No podemos aplicar switch - case por que no puedo poner las comparaciones necesarias
		Asi que usaamos ifs
		*/
		if (number >= 1000 ) {
			return 1000;
		}
		else if (number >= 900 ) {
			return 900;
		}
		else if (number >= 500 ) {
			return 500;
		}
		else if (number >= 400 ) {
			return 400;
		}
		else if (number >= 100 ) {
			return 100;
		}
		else if (number >= 90 ) {
			return 90;
		}
		else if (number >= 50 ) {
			return 50;
		}
		else if (number >= 40 ) {
			return 40;
		}
		else if (number >= 10 ) {
			return 10;
		}
		else if (number == 9 ) {
			return 9;
		}
		else if (number >= 5 ) {
			return 5;
		}
		else if (number == 4 ) {
			return 4;
		}
		else if (number >= 1 ) {
			return 1;
		}
		return 0; //En caso de que nada se cumpla No hace nada pero estoy obligado a ponerlo
}
	public static String ExtraerSimbolo(int numberSearcher) {
		switch (numberSearcher) {
		case 1000:
		return "M";
		case 900:
		return "CM";
		case 500:
		return "D";
		case 400:
		return "CD";
		case 100:
		return "C";
		case 90:
		return "XC";
		case 50:
		return "L";
		case 40:
		return "XL";
		case 10:
		return "X";
		case 9:
		return "IX";
		case 5:
		return "V";
		case 4:
		return "IV";
		case 1:
		return "I";
		default: //De nuevo obligado 
		return "0";
		}
	}
}
