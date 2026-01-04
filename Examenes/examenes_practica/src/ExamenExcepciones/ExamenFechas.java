package ExamenExcepciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ExamenFechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Requisitos y Especificaciones:
Definición de Excepciones (2 Ptos): Crea un "paquete" o módulo llamado gestion_inventario. Dentro de este, define las siguientes excepciones personalizadas:

InventarioException: Excepción base que hereda de la clase estándar Exception.

ProductoCaducadoException: Se lanza si la fecha de caducidad es anterior al día de hoy. El mensaje debe incluir el número de días que lleva caducado.

StockBajoException: Se lanza si el stock disponible es menor a 5 unidades.

Función de Verificación de Producto: Define una función clave llamada verificarProducto(nombre: String, fecha_caducidad_str: String, stock_actual: int):

fecha_caducidad_str se recibe como cadena de texto en formato "AAAA-MM-DD" (ej: "2025-01-31").

Dentro de la función, utiliza las herramientas de manejo de fechas de tu lenguaje (p. ej., date de datetime en Python o LocalDate en Java) para comparar la fecha de caducidad con la fecha actual del sistema. (4 Ptos)

Lógica de Excepciones:

Verificación de Caducidad: Comprueba si la fecha de caducidad es anterior a la fecha actual. Si lo es, calcula la diferencia en días y lanza ProductoCaducadoException.

Verificación de Stock: Si el stock disponible (stock_actual) es menor que 5, lanza StockBajoException.

Implementación de Asersión (2 Ptos):

Al comienzo de la función verificarProducto, implementa una aserción (assert) que garantice que el stock_actual nunca es negativo (es decir, debe ser mayor o igual a cero). Esto asegura que el dato de entrada es válido antes de cualquier procesamiento de negocio.

Si esta condición falla, la aserción debe detener la ejecución o lanzar un AssertionError con el mensaje: "ERROR DE DATO DE ENTRADA: El stock no puede ser negativo."
*/
		
	Scanner sc = new Scanner (System.in);
	LocalDate fecha_producto = null;
	String fecha;
	int dias = 0;
	boolean correcto = false;
	DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yy");
	do {
	try {
		System.out.println("Introduce una fecha");
		fecha = sc.nextLine();
		fecha_producto = LocalDate.parse(fecha,p);
		correcto = true;
	} catch (DateTimeParseException e) {
		// TODO Auto-generated catch block
		System.out.println("La fecha introducido es incorrecta");
	}
	}

	while (!correcto);
	try {
		dias = DiasCaducidad (fecha_producto);
	} catch (ProductoCaducidadException e) {
		System.out.println(e.getMessage());
	}
	  catch (ProductoNoCaducadoException a ) {
		  System.out.println(a.getMessage());
	  }
	String cod_producto;
	System.out.println("Introduce un código de producto");
	cod_producto = sc.nextLine();
	int stock = 0;
	stock = VerificacionProducto(cod_producto);
	System.out.println(stock);
	}
	public static int DiasCaducidad (LocalDate fecha) throws ProductoCaducidadException, ProductoNoCaducadoException {
		LocalDate hoy = LocalDate.now();
		int diff = (int)(ChronoUnit.DAYS.between(hoy,fecha));
		if (diff > 0) 
		throw new ProductoCaducidadException ("El producto se vence  enn " +diff);
		else 
		throw new ProductoNoCaducadoException ("El producto a caducado hace " +(-diff));
}
	public static int VerificacionProducto (String cod_producto) {
		int stock = 0;
		int oreo = 0, agua = 1, pelota =-3;
		cod_producto.toUpperCase();
		switch (cod_producto) { 
		case "oreo":
			stock = oreo;
			break;
		case "pelota":
			stock = pelota;
			break;
		case "agua":
			stock = agua;
			break;
		}
		assert (oreo < 0 && agua < 0 && pelota <0):"el producto no está disponible"; //&& Requiere que todas sean true 
		return oreo;
}
}