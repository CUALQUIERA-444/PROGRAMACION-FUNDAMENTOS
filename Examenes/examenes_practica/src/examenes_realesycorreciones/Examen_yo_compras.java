package examenes_realesycorreciones;

import java.util.Random;
import java.util.Scanner;

public class Examen_yo_compras {
//Nota se puede repetir texto 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double presupuesto; // Cambia
		double total_gastado = 0;
		double precio_unidad; // Cambia
		double total = 0; // Cambia
		String codigo; // Cambia
		boolean validacion; // Cambia
		int controlador = 0;
		boolean control = false; // Cambia
		int cualquier_unidad; // Cambia
		Random r = new Random(); // Cambia
		Scanner sc = new Scanner(System.in); // Scanner
		System.out.println("Anota tu presupuesto máximo"); // Pedir presupuesto
		presupuesto = sc.nextDouble(); // Guardar respuesta
		System.out.println("Placeholder"); // Placeholder para el código
		codigo = sc.nextLine();
		while (codigo.equalsIgnoreCase("FIN") == false) { // Hacer lo de dentro mientras el usuario no me ponga FIN
			do {
				if (controlador > 0) {
				sc.nextLine();
			}
				System.out.println("Anotar el código del producto"); // Pedir código una vez
				codigo = sc.nextLine();
				validacion = Validar_codigo(codigo);
				if (codigo.equalsIgnoreCase("FIN") == true) {// Si lo insertado es FIN el programa debería terminar
					control = true; // Se guarda antes de salir del bucle
					break;
				}
			}
			while (validacion == false);
			if (control == true)
				break;
			cualquier_unidad = r.nextInt(3) + 1; // Original de 0 a 3 //Nuevo de 1 a 4
			do {
				System.out.println("Introduzca el precio por unidad (HAZLO BIEN)");
				precio_unidad = sc.nextDouble();
			} while (precio_unidad < 0);
			total = Calcular_precio(precio_unidad, codigo, cualquier_unidad);
			if (total_gastado + total > presupuesto) {
				controlador++;
			}
			else {
				System.out.println("Producto fuera de la bolsa");
				controlador++;
				total_gastado += total;
			}
		}
	}

	public static boolean Validar_codigo(String cadena_cod) {
		final char cod = Character.toUpperCase(cadena_cod.charAt(1)); // NO cambia solo se quiere validar
		if (cadena_cod.length() != 5 && cadena_cod.length() != 4)
			return false;
		if ((cadena_cod.charAt(0) != 'P') && (cod < 0 && cod > 9) && (cod < 'A' && cod > 'Z')) // No es una																						// instrucción
			for (int i = cadena_cod.charAt(2); i <= cadena_cod.length() - 1; i++) {
				if (cadena_cod.charAt(i) < 0 && cadena_cod.charAt(i) > 9 )
					return false;
			}
		return true;
	}

	public static double Calcular_precio(double pr_u, String cod, int cualquier_unidad) {
		if (cod.charAt(1) == 'P')
			return pr_u * cualquier_unidad - pr_u * cualquier_unidad * 0.20;
		else
			return pr_u * cualquier_unidad;
	}
}
