package ejerciciosString;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int longitud = 3;
		Scanner sc = new Scanner(System.in);
		String nombre;
		String apellido;
		String segundo_apellido = "";
		String codigo;
		
		// Falta bucle para admitir a varias personas

		System.out.println("Introduce tu nombre");
		nombre = sc.nextLine();

		System.out.println("Introduce tu apellido");
		apellido = sc.nextLine(); // Usando la lógica debería salir

		if (apellido.length() < longitud) {// Verifico si es mayor o igual que 3 para calcular el substring
			System.out.println("Introduce segundo apellido:");
			segundo_apellido = sc.nextLine();
		}

		codigo = generaCodigo(nombre, apellido, segundo_apellido);
		System.out.println("El código es " + codigo);
	}

	

	// Los else if están al mismo nivel que el if
	public static String generaCodigo(String n, String apellido1, String apellido2) {
		String todo = "";
		if (apellido1.length() >= 3)
			todo = n.substring(0, 1) + apellido1.substring(0, 3);
		else if (apellido2.length() >= 3)
			todo = n.substring(0, 1) + apellido2.substring(0, 3);
		else if (apellido1.length() > apellido2.length())
			todo = n.substring(0, 1) + apellido1;
		else
			todo = n.substring(0, 1) + apellido2;

		return todo;
	}
}
