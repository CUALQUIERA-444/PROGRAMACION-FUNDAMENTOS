package Practica4;

import java.util.Scanner;

public class Ejercicio4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4. Programa que lea una hora expresada en segundos transcurridos desde las 12
		de la noche y la convierta en horas, minutos y segundos o viceversa. Lee una
		hora como horas, minutos y segundos y la transforma en segundos.
	*/
	/* Lógica
	 * Primero tiene en cuenta que partimos de las 12 de la noche lo cual no afecta en ABSOLUTAMENTE NADA ya que estamos partiendo de los 0 segundos basicamente
	 *
	 * Nota un dia tiene 86400 segundos 
	 * El enunciado es algo caotico por lo que asumiremos lo siguientes 
	 * El programa en funcion de lo que pida el usuario hará lo siguiente
	 * Si se te ofrecen segundos se te dira la hora en formato de horas:minutos:segundos 
	 * Si se te ofrece la hora:minutos y segundos en su lugar lo transformaras a segundos
	 * Variables para los segundos la hora:minutos:segundos en cuestion
	 * Y 1 char para validar la opcion
	 */
	Scanner sc = new Scanner(System.in);
	char opcion;
	int segundos_usuario = 0;
	int horas = 0; //El cero es por seguridad nada personal
	int minutos = 0;
	int segundos_reducidos = 0;
	System.out.println("Introduce la operación que quiera realizar \"S si quiere transformar sus segundos H si quiere transformar la hora/minutos/segundos reloj etc en segundos\"");
	opcion= sc.nextLine().charAt(0);
	opcion = Character.toUpperCase(opcion);
	if(opcion == 'S') {
	System.out.println("Introduzca los segundos");
	segundos_usuario = sc.nextInt(); //3660
	horas = segundos_usuario / 3600 % 24 + horas; //Esto dara las horas restantes (Con eso puedes ir construyendo el reloj la suma no es necesario por que estoy sumando 0)
												  //Pero es mas que nada por cuestiones de seguridad basicamente sumar desde las 12 de la noche
	minutos = segundos_usuario / 60 % 60 + minutos; //Esto es pasar los segundos a minutos y de esos minutos sacar los minutos que no hacen una hora restantes que sirven para el reloj
	segundos_reducidos = segundos_usuario % 60; //Finalmente considerando que se pueden representar como maximo 60 segundos con el modulo podemos sacar los segundos que no se han usado ni para los minutos ni las horas y por lo general no deberia ser superior a 
												// a 59 en caso que lo fuera el modulo se encarga de ajustarlo a 0 
	System.out.println("Su hora en formato de reloj "+horas+":"+minutos+":"+segundos_reducidos);
	}
	else if (opcion == 'H') {	
	System.out.println("Introduce la hora");
	horas = sc.nextInt();
	System.out.println("Introduce los minutos");
	minutos = sc.nextInt();
	System.out.println("Introduce los segundos");
	segundos_reducidos = sc.nextInt();
	if(horas > 24 || minutos > 59 || segundos_reducidos > 59) {
		System.out.println("Lo siento debe ser en formato reloj");
	}
		else {
			segundos_usuario = horas * 3600 + minutos * 60 + segundos_reducidos; //Segundos de las horas + segundos de los minutos + los segundos estandar
		}
	System.out.println("Sus segundos son "+segundos_usuario+" segundos");
	}
	else 
	System.out.println("No es ninguna de las opciones que se le pidió");
	}
}
