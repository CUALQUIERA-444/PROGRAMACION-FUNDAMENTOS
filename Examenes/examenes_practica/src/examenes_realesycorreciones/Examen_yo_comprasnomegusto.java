package examenes_realesycorreciones;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Examen_yo_comprasnomegusto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Por cada persona que llega se anota el presupuesto máximo
		// Presupuesto que poseen
		final int zona1 = 5, zona2 = 7, zona3 = 10; // Precios de zona que no van a cambiar
		double presupuesto;
		String código;
		double total_gastado = 0;
		double precio_unidad;
		boolean validación;
		double media;
		int acumulador_compras = 0;
		double guardar_compras = 0;
		int unidades;
		double total;
		double compra1 = 0;
		double compra2 = 0;
		int contador_enviosT = 0;
		int contador_enviosJ = 0;
		double porcentaje_jubilados;
		String afirmacion;
		int zona_envio;
		int cliente = 0;
		Random r = new Random();// Valor aleatorio
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		do {
			System.out.println("Buenas tardes usted es el cliente" + " " + cliente + "por favor compre");
			total_gastado = 0;
			System.out.println("Introduzca el presupuesto para su compra");
			presupuesto = sc.nextDouble(); // Guardo decimal
			sc.nextLine();
			// Se lee el código de producto hasta que sea válido
			// Validar con una función
				do {
					System.out.println("Introduce el código");
					código = sc.nextLine(); // Guardo String con el código
					if(código.equalsIgnoreCase("FIN"))
					break;
					validación = Validar_Código(código); // termina la compra de este cliente
		         if (validación == false) {
		             System.out.println("Código inválido, vuelva a intentarlo.");
		                }
				} 
				while (validación == false);
				if(código.equalsIgnoreCase("FIN"))
					break;
				unidades = r.nextInt(3) + 1; // Antes del 0 al 3 + 1 Ahora entre 1 y 4
				do { // Verificamos si es positivo
					System.out.println("Introduce precio por unidad");
					precio_unidad = sc.nextDouble();
				} while (precio_unidad < 0);
				total = calcular_total(precio_unidad, código, unidades);
				// Comprobar que el usuario no se ha pasado del precio inicial
				// Si es así anular este producto
				if (total > presupuesto - total_gastado) // Si el total es superior al
					// presupuesto - total gastado basicamente restando lo ya gastado
					// se reembolsa el producto y se vuelve a ejecutar
					System.out.println("Producto devuelto");
				else // El precio del producto se acumula
					total_gastado = total_gastado + total;
				// El total gastado es lo que va a salir del bucle
			// Hacer el envío fuera del while por que esto ya es cuando has
			// terminado de comprar
			int edad;
			System.out.println("Antes de nada introduzca su edad");
			edad = sc.nextInt();
			sc.nextLine();
			do {
				System.out.println("Desea realizar el pedido a domicilio(SI O NO)");
				afirmacion = sc.nextLine();
			} while (!afirmacion.equalsIgnoreCase("SI") && !afirmacion.equalsIgnoreCase("NO"));
			if (afirmacion.equalsIgnoreCase("SI")) {
				
				if (edad > 65) {
					System.out.println("Seleccione Zona de envío (1,2 o 3)");
					zona_envio = sc.nextInt();
					contador_enviosJ++;
					contador_enviosT++;
					System.out.println("El importe será de" + " " + total_gastado + "€");
				}
				else {
					System.out.println("Seleccione Zona de envío (1,2 o 3)");
					zona_envio = sc.nextInt();
					switch (zona_envio) {
					case 1:
						total_gastado = zona1 + total_gastado;
						break;
					case 2:
						total_gastado = zona2 + total_gastado;
						break;
					case 3:
						total_gastado = zona3 + total_gastado;
						break;
					}
					System.out.println("El importe será de" + " " + total_gastado + "€");
					contador_enviosT++;
				}
				System.out.println("El importe será de" + " " + total_gastado + "€");
			} else {
				//System.out.println("Lo siento zona de envío no válida");
				System.out.println("El importe será de" + " " + total_gastado + "€");
			}
			cliente++;
			guardar_compras = total_gastado + guardar_compras;
			acumulador_compras++;
			if (total_gastado > compra1) {
				compra2 = compra1;
				compra1 = total_gastado;
			} else if (total_gastado > compra2) {
				compra2 = total_gastado;
			}
		} while (presupuesto != 0);
		porcentaje_jubilados = (double) (contador_enviosJ * 100) / contador_enviosT;
		System.out.println("El porcentaje de envíos realizado a jubilados es de" + porcentaje_jubilados + "%");
		System.out.println("La media del importe de todas las compras realizadas es de"
				+ guardar_compras / acumulador_compras + "€");
		System.out.println("La primera compra mas cara es la de" + compra1);
		System.out.println("La segunda compra más cara es la de" + compra2);
	}

	public static boolean Validar_Código(String c) {
		// Primero verificar si tiene longitud 4 o 5 caso contrario devolver falso
		if (c.length() != 4 && c.length() != 5)
			return false;
		// Posteriormente verificar si la primera letra del string es un caracter
		else if (c.charAt(0) != 'P')
			return false;
		// Despues verificar si la segunda letra del string esta entre A y Z como?
		else if (c.charAt(1) < 'A' || c.charAt(1) > 'Z')
			return false;
		// Recorrer el String verificando que sean dígitos
		for (int i = 2; i <= c.length() - 1; i++) {
			if (c.charAt(i) < '0' || c.charAt(i) > '9')
				return false;
		}
		return true;
	}

	public static double calcular_total(double pu, String c, int u) {
		// Condición para aplicar descuento
		if (c.charAt(1) == 'P')
			return pu * u - pu * u * 0.20;
		// Condición de 3 unidades pagando solo 2
		else if (c.charAt(1) == 'L' && u == 3)
			return pu * (u - 1);
		else if (c.charAt(1) == 'L' && u == 4)
			return pu * (u - 1);
		return pu * u;
	}
}
