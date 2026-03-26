package Practica4;

import java.util.Scanner;

public class Ejercicio4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. Programa que lee tres números y permite al usuario elegir si quiere verlos
ordenados en forma ascendente o descendente
 */
	//Notas
		//Se puede declarar una variable en un if y esto saldra true
		//No se puede poner una variable distinta de boleean en un if     
		//Por lo general los ifs que solo tengan una linea no necesitan llaves pero es recomendable ponerlas en algunos casos
		//Los else sin llaves por defecto siempre estan conectados al ULTIMO IF que encuentren
	int numero;
	int numero2;
	int numero3;
	char confirmacion;
	Scanner sc = new Scanner (System.in);
	System.out.println("Introduce 3 numeros");
	numero = sc.nextInt();
	numero2 = sc.nextInt();
	numero3 = sc.nextInt();
	sc.nextLine(); //Antes de leer se necesita limpiar el buffer
	System.out.println("Desea verlos en orden ascendente o descendente? OPCIONES \"(A (ASCENDENTE) D (DESCENDENTE)\"");
	confirmacion = sc.nextLine().charAt(0);
	confirmacion = Character.toUpperCase(confirmacion);
	if (confirmacion == 'A') {//Empezamos por las ascendentes
		if(numero <= numero2 && numero<=numero3 && numero2<=numero3) {
			System.out.println("Sus números en formato ascendente "+numero+" "+numero2+" "+numero3);
		}
		else if(numero <= numero2 && numero <= numero3 && numero3<=numero2 ) {  //El problema es que otros patrones entran aca
			System.out.println("Sus numeros en formato ascendente "+numero+" "+numero3+" " +numero2);
		}
		else if(numero2 <= numero && numero2<= numero3 && numero <= numero3) {
			System.out.println("Sus numeros en formato ascendente "+numero2+" "+numero+" "+numero3); 
		}
		else if (numero2 <= numero && numero2 <= numero3 && numero3 <= numero) {
			System.out.println("Sus numeros en formato ascendente "+numero2+" "+numero3+" "+numero);
		}
		else if (numero3 <= numero2 && numero3<=numero && numero <= numero2) {
			System.out.println("Sus numeros en formato ascendente "+numero3+" "+numero+" "+numero2);
		}
		else { 
			System.out.println("Sus numeros en formato ascendente "+numero3+" "+numero2+" "+numero);
	}
	}
	else if (confirmacion == 'D') {//Empezamos por las ascendentes
		if(numero >= numero2 && numero>=numero3 && numero2>=numero3) {
			System.out.println("Sus números en formato descendente "+numero+" "+numero2+" "+numero3);
		}
		else if(numero >= numero2 && numero >= numero3 && numero3>=numero2 ) {  //El problema es que otros patrones entran aca
			System.out.println("Sus numeros en formato descendente "+numero+" "+numero3+" " +numero2);
		}
		else if(numero2 >= numero && numero2>= numero3 && numero >= numero3) {
			System.out.println("Sus numeros en formato descendente "+numero2+" "+numero+" "+numero3); 
		}
		else if (numero2 >= numero && numero2 >= numero3 && numero3 >= numero) {
			System.out.println("Sus numeros en formato descendente "+numero2+" "+numero3+" "+numero);
		}
		else if (numero3 >= numero2 && numero3 >=numero && numero >= numero2) {
			System.out.println("Sus numeros en formato descendente "+numero3+" "+numero+" "+numero2);
		}
		else { 
			System.out.println("Sus numeros en formato descendente "+numero3+" "+numero2+" "+numero);
	}
	}
	else {
	System.out.println("Esa letra no es válida");	
	}
}
}