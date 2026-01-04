package práctica5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio17_Práctica5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operador;
		double num1,num2;
		double operacion;
		char empezar_terminar;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);// Si la sintaxis no tiene sentido parar
		System.out.println("Introduzca c o C para comenzar a usar la calculadora");
		empezar_terminar = sc.nextLine().charAt(0);
		if ( empezar_terminar == 'C' || empezar_terminar == 'c') {
		while ( empezar_terminar == 'S' || empezar_terminar == 's' || empezar_terminar =='c' || empezar_terminar == 'C') {
		// Hace esto mientras empezar_terminar sea c C s o S
		// La idea es poner C para comenzar hacer todo el proceso y despues si se quiere seguir escribir s y si no f
			System.out.println("Introduzca el primer valor para su operación");
			num1 = sc.nextDouble();
			System.out.println("Introduzca el segundo valor para su operación");
			num2 = sc.nextDouble();
			sc.nextLine();
			System.out.println("Introduzca el simbolo de la operación para poder saber que operacion desee hacer");
			operador = sc.nextLine().charAt(0);
			switch(operador) {
			case '+':
			operacion = num1 + num2;
			System.out.println("La suma de tus números es de:"+operacion);
			break;
			case '-':
			operacion = num1 - num2;
			System.out.println("La resta de tus números es de:"+operacion);
			break;
			case '*':
			operacion = num1 * num2;
			System.out.println("La multiplicación de tus números es de:"+operacion);	
			break;
			case '/':
			operacion = num1 / num2;
			System.out.println("La división de tus números es de:"+operacion);
			break;
		}
			System.out.println("Si quiere continuar escriba s o S si quiere terminar escriba f o F");
			empezar_terminar = sc.nextLine().charAt(0);
			if ( empezar_terminar != 's' && empezar_terminar != 'S' && empezar_terminar != 'F' && empezar_terminar !='f') {
				System.out.println("Error Caracter no deseado");
				System.exit(0);
			}
				else if (empezar_terminar == 'F' || empezar_terminar == 'f') {
					System.out.println("Cerrando Calculadora");
					System.exit(0);
				}
		}
			
		}
		else if ( empezar_terminar == 'F' || empezar_terminar == 'f') {
			System.out.println("Calculadora cerrada");
			System.exit(0);
		}
			else {
			System.out.println("Error Caracter no deseado");
		System.exit(0);
	}
	}
}
	