package Practica5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 16. Una empresa que se dedica a la venta de desinfectantes necesita un
		 * programa para gestionar las facturas. En cada factura figura: el código del
		 * artículo, la cantidad vendida en litros y el precio por litro. El programa
		 * pedirá los datos de 5 facturas introducidas y calculará y mostrará:
		 * Facturación total cantidad en litros vendidos del artículo 1 número de
		 * facturas que se emitieron de más de 600 €.
		 */
		/*
		 * Lógica Se piden los datos de cada factura /Desinfectantes)los cuales son los
		 * siguientes Codigo de articulo Cantidad vendida en litros Precio por litro
		 * 
		 * /* Notas Cuando hablamos de facturación total nos referimos a la suma de
		 * todas las facturas
		 * Generalmente un gestor de facuras puede recibir mas de una factura con el mismo codigo lo cual esta bien pero por cuestiones de seguridad se asignara un numero limitado
		 * de codigos es decir 5 productos para 5 facturas que opcionalmente podran ser 5 facturas para un unico producto o una para los 5 entre otras opciones
		 */
		/*
		 * Variables Una que almacene el codigo del articulo (Va por numero) (int) (por
		 * defecto se usará del 1 al 5 aunque el orden se puede mezclar) Otra para la
		 * cantidad de desinfectante en litros (double) Una que almacene el precio por
		 * cada litro (double)
		 */
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		int codigo;
		double litros;
		double litros_1 = 0; // Guarda los litros del articulo 1 //Inicializar debido a probabilidades de que
								// no entre al else
		double precio_litro;
		int contador_600 = 0; // Contador para las facturas de mas de 600€
		double factura_total = 0; // Se encargara de la facuración total
		double factura_individual; // Se encargará de la facturación individual
		for (int i = 1; i <= 5; i++) { // Dentro de los for funciona distinto pero en resumen la sentencia en si no se
										// considera una linea para Java
			System.out.println("Introduce el código del artículo");
			codigo = sc.nextInt();
			if (codigo <= 0 || codigo > 5) {
				System.out.println("Código inválido vuelva a intentarlo");
				i--; // El --i solo afecta la linea en la que se esta usando
			}
			/*
			 * else if (codigo != i) { System.out.println("Pon en orden los codigos"); i--;
			 * No necesariamente tienen que ser en orden por lo que libertad en ese aspecto
			 * }
			 */
			else {
				System.out.println("Introduce la cantidad de desinfectante que se ha vendido en litros");
				litros = sc.nextDouble();
				System.out.println("Introduce el precio por litro");
				precio_litro = sc.nextDouble();
				if (codigo == 1) {
					litros_1 += litros; // Pueden meter varias veces el código 1
				}
				factura_individual = precio_litro * litros;
				if (factura_individual > 600) {
					contador_600++;
				}
				factura_total += factura_individual;
			}
		}
		System.out.printf("La facturación total de todos los productos es de %.2f euros \n", factura_total);
		System.out.println("La cantidad de litros vendidos del artículo 1 es de " + litros_1 + " litros");
		System.out.println("La cantidad de facturas que superan los 600€ es de " + contador_600 + " facturas");
	}
}
