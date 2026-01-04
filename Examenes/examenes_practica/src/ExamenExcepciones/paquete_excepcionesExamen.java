package ExamenExcepciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;





public class paquete_excepcionesExamen {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Se quiere calcular el precio de un abono teatro de un usuario. Se piden los
		 * siguientes datos del usuario mientras sean incorrectos. - Fecha de
		 * nacimiento, leedla en un String con 4 dígitos para el año. Validad que es
		 * correcta utilizado excepciones. Mostrad la edad. Tipo de abono, un String que
		 * puede tomar los siguientes valores: “Normal”, “Familiar”, “VIP” ignorando
		 * mayúsculas y minúsculas. - Nombre de usuario que tiene que empezar por letra
		 * (en mayúscula o minúscula) y contener dígitos y letras en mayúsculas o
		 * minúsculas. En total con una longitud de 5 a 8. Usad patrón
		 * 
		 * Si los datos son correctos llamad a una función que calcule el importe. Los
		 * abonos normales son 10 euros, los VIP 50, los familiares 30. Si el usuario es
		 * jubilado (65 años o más) tiene un descuento del 20% y si es menor de 18 del
		 * 10%. Si ha elegido abono familiar y tiene menos de 18 años devolver una
		 * excepción propia con vuestro nombre y apellido. Introducir una aserción en la
		 * función anterior para comprobar que el tipo de abono es el correcto. Si el
		 * cálculo del importe es correcto, generar una contraseña de longitud 7 que
		 * tenga los dos primeros caracteres del tipo de abono en mayúsculas y a
		 * continuación 5 dígitos aleatorios. Mostrad la contraseña por pantalla
		 */
		Scanner sc = new Scanner(System.in);
		double importe;
		String Fecha_nacimiento;
		String tipo_abono;
		long edad = 0;
		String nombre_usuario;
		boolean validacion = false;
		String regex = ("^[a-z]|[A-Z][a-zA-Z0-9]+");
		DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do { // Validar Nombre_usuario
			System.out.println("Introduzca su nombre de usuario");
			nombre_usuario = sc.nextLine();
			if (nombre_usuario.length() < 5 || nombre_usuario.length() > 8) // Si la longitud es 5 6 7 o 8 si entra
				System.out.println("Introduzca su usuario con la longitud adecuada");
			else if (!nombre_usuario.matches(regex))
				System.out.println("Lo siento no encaja con nuestro patrón establecido vuelva a intentarlo");
			else {
				validacion = true;
				System.out.println(nombre_usuario);
			}
		} while (validacion == false);
		validacion = false;
		do { // Validar Fecha_de_Nacimiento
			try {
				System.out.println("Introduzca su fecha de nacimiento(Año-mes-dia)");
				Fecha_nacimiento = sc.nextLine();
				LocalDate Fecha_nac_mod = LocalDate.parse(Fecha_nacimiento);
				edad = ChronoUnit.YEARS.between(Fecha_nac_mod, LocalDate.now());
				System.out.println("Tu fecha de nacimiento es " + Fecha_nac_mod.format(p));
				System.out.println("Su edad es de " + edad);
				validacion = true;
			} catch (DateTimeParseException e) {
				System.out.println("Introduzca fecha válida");
			}
		} while (validacion == false);
		validacion = false;
		do { // Validar abono
			System.out.println("Introduzca el abono (OPCIONES: VIP, FAMILIAR, NORMAL )");
			tipo_abono = sc.nextLine();
			// Para validar 3 booleanos y saber que todos estos sean falsos
			// Se pone &&
			if (!tipo_abono.equalsIgnoreCase("Normal") && tipo_abono.equalsIgnoreCase("Familiar") == false
					&& tipo_abono.equalsIgnoreCase("Vip") == false)
				System.out.println("Lo siento vuelva a introducir el abono");
			else {
				validacion = true;
				System.out.println(tipo_abono);
			}
		} while (validacion == false);
		importe = Calculo_importe(tipo_abono, edad);
	}
	


	public static double Calculo_importe(String abono,long e) {
		Excepcion_abono a = new Excepcion_abono("Antonio Aco");
		if (abono.equalsIgnoreCase("Familiar") && e < 18) 
			System.out.println(a);
		double total = 0;
		if(abono.equalsIgnoreCase("Normal"))
			total = 10;
		else if(abono.equalsIgnoreCase("Familiar"))
			total = 30;
		else 
			total = 50;
		
			if ( e >= 65)
			total = total - total * 0.20;
			else if ( e < 18) 
			total = total - total * 0.10;
		return total;
	}
}
