package ExamenExcepciones;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Ej2_Begoña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fecha;
		String tipo, usuario;
		double importe;

		// Leer y validar los datos
		fecha = LocalDate.now();
		tipo = "Familiar";
		usuario = "A234bB";
		// Controlar la excepción.
		try {
			importe = calcularImporte(fecha, tipo, usuario);
		} catch (EdadIncorrectaException e) {
			// TODO Auto-generated catch block
			System.out.println("Se ha producido un error al calcular el importe");
			System.out.println(e.getMessage());
		}

	}

	public static double calcularImporte(LocalDate fecha, String tipo, String usuario) // Puede devolver excepcion
			throws EdadIncorrectaException {
		double imp = 0;
		long edad;
		if (tipo.equalsIgnoreCase("normal"))
			imp = 10;
		else if (tipo.equalsIgnoreCase("VIP"))
			imp = 50;
		else
			imp = 30;
		edad = ChronoUnit.YEARS.between(LocalDate.now(), fecha);
		if (edad > 65)
			imp = imp * 0.8;
		else if (edad < 1)
			imp = imp * 0.9;
		if (edad < 18 && tipo.equalsIgnoreCase("Familiar"))
			// La excepcion
			throw new EdadIncorrectaException("No se pemite tipo familiar a menores"); // Crear excepcion
		return imp;
	}
}
