package ExamenExcepciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;

public class Examen_yo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Se quiere calcular el precio de un abono teatro de un usuario. Se piden los
		 * siguientes datos del usuario mientras sean incorrectos. - Fecha de
		 * nacimiento, leedla en un String con 4 dígitos para el año. Validad que es
		 * correcta utilizado excepciones. Mostrad la edad. (3 pto)
		 * 
		 * - Tipo de abono, un String que puede tomar los siguientes valores: “Normal”,
		 * “Familiar”, “VIP” ignorando mayúsculas y minúsculas. (1 pto). - Nombre de
		 * usuario que tiene que empezar por letra (en mayúscula o minúscula) y contener
		 * dígitos y letras en mayúsculas o minúsculas. En total con una longitud de 5 a
		 * 8. Usad patrón (1 pto).
		 * 
		 * Si los datos son correctos llamad a una función que calcule el importe. Los
		 * abonos normales son 10 euros, los VIP 50, los familiares 30. Si el usuario es
		 * jubilado (65 años o más) tiene un descuento del 20% y si es menor de 18 del
		 * 10%. Si ha elegido abono familiar y tiene menos de 18 años devolver una
		 * excepción propia con vuestro nombre y apellido. (2 ptos) Introducir una
		 * aserción en la función anterior para comprobar que el tipo de abono es el
		 * correcto. Si el cálculo del importe es correcto, generar una contraseña de
		 * longitud 7 que tenga los dos primeros caracteres del tipo de abono en
		 * mayúsculas y a continuación 5 dígitos aleatorios. Mostrad la contraseña por
		 * pantalla (2 ptos)
		 */
		Scanner sc = new Scanner(System.in);
		String f_nac;
		Random r = new Random();
		String regex = "^[A-Za-z][0-9A-Za-z]{5,8}";
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String nombre_usuario;
		boolean validacion = false;
		LocalDate fecha_nacimiento = null;
		String abono;
		int edad = 0;
		System.out.println("Introduce tu fecha de nacimiento");
		do {
			f_nac = sc.nextLine();
			try {
				fecha_nacimiento = LocalDate.parse(f_nac, d);
				validacion = true;
			} catch (DateTimeParseException e) {
				System.out.println("No puede nacer ese día");
			}
			if (validacion == false)
				System.out.println("Vuelve a intentarlo");
		} while (validacion == false);
		System.out.println(fecha_nacimiento.format(d));
		edad = Math.abs((int) ChronoUnit.YEARS.between(LocalDate.now(), fecha_nacimiento));
		System.out.println("Su edad es de " + edad);
		validacion = false;
		System.out.println("Introduce un tipo de abono (Normal/Familiar/VIP)");
		do {
			abono = sc.nextLine();
			abono = validar_abono(abono);
			if (abono == "error")
				System.out.println("Vuelva a introducir un tipo de abono");
			else
				validacion = true;
		} while (validacion == false);
		System.out.println(abono);
		validacion = false;
		System.out.println("Introduce tu nombre de usuario");
		do {
			nombre_usuario = sc.nextLine();
			if (nombre_usuario.matches(regex))
				validacion = true;
			else
				System.out.println("Vuelva a introducir un nombre correcto");
		} while (validacion == false);
		System.out.println(nombre_usuario);
		double importe = 0;
		try {
			importe = calcular_importe(abono, edad);
		} catch (MenorEdadExcepcion e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Su importe es de " + importe + " €");
		String abono_nuevo = abono.substring(0, 2);
		abono_nuevo = abono_nuevo.toUpperCase();
		int digito;
		for (int i = 0; i < 5; i++) {
			digito = r.nextInt(10);
			abono_nuevo = abono_nuevo + digito;
		} 
		System.out.println(abono_nuevo);
	}
	public static String validar_abono(String ab) {
		String opcion1 = "normal";
		String opcion2 = "familiar";
		String opcion3 = "VIP";
		//assert (ab.equalsIgnoreCase(opcion1) && ab.equalsIgnoreCase(opcion2) && ab.equalsIgnoreCase(opcion3))
				//: "Te has equivocado";
		if (ab.equalsIgnoreCase(opcion1) || ab.equalsIgnoreCase(opcion2) || ab.equalsIgnoreCase(opcion3))
			return ab;
		else
			return "error";
	}

	public static double calcular_importe(String abono, int edad) throws MenorEdadExcepcion {
		final double normal = 10, familiar = 30, vip = 50;
		double importe = 0;
		double descuento = 0;
		if (abono.equalsIgnoreCase("Familiar") && edad < 18)
			throw new MenorEdadExcepcion("Antonio Aco Durand");

		if (abono.equalsIgnoreCase("normal"))
			importe = normal;
		if (abono.equalsIgnoreCase("familiar"))
			importe = familiar;
		if (abono.equalsIgnoreCase("vip"))
			importe = vip;
		if (edad >= 65)
			descuento = 0.2;
		if (edad < 18)
			descuento = 0.1;
		importe = importe - importe * descuento;
		return importe;
	}
}