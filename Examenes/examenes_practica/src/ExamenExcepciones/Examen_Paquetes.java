package ExamenExcepciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;
import java.time.chrono.*;
import java.time.*;
public class Examen_Paquetes {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Se quiere calcular el precio de un abono teatro de un usuario. Se piden los siguientes datos del usuario mientras sean incorrectos.
		
		Fecha de nacimiento, leedla en un String con 4 dígitos para el año. Validad que es correcta utilizado excepciones. Mostrad la edad. (3 pto)
		 
		Tipo de abono, un String que puede tomar los siguientes valores: “Normal”, “Familiar”, “VIP” ignorando mayúsculas y minúsculas. (1 pto).
		Nombre de usuario que tiene que empezar por letra (en mayúscula o
		minúscula) y contener dígitos y letras en mayúsculas o minúsculas. En total con una longitud de 5 a 8. Usad patrón (1 pto).
		
		Si los datos son correctos llamad a una función que calcule el importe. Los abonos
	    normales son 10 euros, los VIP 50, los familiares 30. Si el usuario es jubilado (65 años o más) tiene un descuento del 20% y si es menor de 18 del 10%. Si ha elegido abono
		familiar y tiene menos de 18 años devolver una excepción propia con vuestro nombre y apellido. 
		
		
		Introducir una aserción en la función anterior para comprobar que el tipo de abono
		es el correcto.
		
		Si el cálculo del importe es correcto, generar una contraseña de longitud 7 que tenga
		los dos primeros caracteres del tipo de abono en mayúsculas y a continuación 5
		dígitos aleatorios. Mostrad la contraseña por pantalla (2 ptos)
		 */
		
		//Leer en un String la fecha_nacimiento debe tener 4 digitos para el año 
		//Se valida usando excepciones y un bucle hasta que lo introduzca bien
		//Mostrar la edad 
		String fecha_form;
		LocalDate fecha_nacimiento = null;
		boolean validacion = false;
		int años;
		DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
		System.out.println("Introduce la fecha");
		fecha_form = sc.nextLine();
		try {
		fecha_nacimiento = LocalDate.parse(fecha_form,p);
		validacion = true;
		}
		catch (DateTimeParseException e) {
		System.out.println("No se puede convertir su fecha lo siento");
		}
		}
		while (validacion == false);
		años = (int)ChronoUnit.YEARS.between(fecha_nacimiento,LocalDate.now());
		String abono;
		String regex = "^[A-Za-z][0-9a-zA-Z]{4,7}" ; //Si se valida la longitud no es necesario poner * EL | Funciona solo para el primer caracter
		String nombre_usuario;
		//No es posible forzar digitos y letras
		System.out.println("Edad "+años);
		validacion = false;
		//Tipo de abono, un String que puede tomar los siguientes valores: “Normal”, “Familiar”, “VIP” ignorando mayúsculas y minúsculas. (1 pto).
		//Nombre de usuario que tiene que empezar por letra (en mayúscula o
		//minúscula) y contener dígitos y letras en mayúsculas o minúsculas. En total con una longitud de 5 a 8. Usad patrón (1 pto).
		do {
		System.out.println("Introduce el tipo de abono (Normal/Familiar/VIP)");
		abono = sc.nextLine();
		if (abono.equalsIgnoreCase("Normal") || abono.equalsIgnoreCase("Familiar")|| abono.equalsIgnoreCase("VIP")) {
			System.out.println("Su abono es de tipo "+abono);
			validacion = true;
		}
		else 
			System.out.println("Lo siento abono invalido (Tiene que ser alguna de las 3 opciones que le hemos dejado vuelvalo a intentar)");
		}
		while (validacion == false);
		do {
		System.out.println("Introduzca su nombre de usuario");
		nombre_usuario = sc.nextLine();
		nombre_usuario = validar_nombre(nombre_usuario,regex);
	    }
		while (nombre_usuario.equals("error"));
		System.out.println(nombre_usuario);
		/*Si los datos son correctos llamad a una función que calcule el importe. Los abonos
	    normales son 10 euros, los VIP 50, los familiares 30. Si el usuario es jubilado (65 años o más) tiene un descuento del 20% y si es menor de 18 del 10%. Si ha elegido abono
		familiar y tiene menos de 18 años devolver una excepción propia con vuestro nombre y apellido. 
	
		Introducir una aserción en la función anterior para comprobar que el tipo de abono
		es el correcto.
		*/
		double importe;
		validacion = false;
		do  {
		try {
		importe = calcular_importe(años,abono);
		validacion = true;
		}
		catch (IlegalidadException e){	
		System.out.println(e.getMessage());
		}
	}
		while (validacion == false);
	}
	public static String validar_nombre (String nombre_usuario,String r) {
		if (!nombre_usuario.matches(r)) {
			System.out.println("Lo siento vuelva a intentarlo");
			return "error";
	}
	   System.out.println("Su código es");
	   return nombre_usuario;
	}
	public static double calcular_importe (int e, String abono) throws IlegalidadException {
	final double normal = 10, adulto = 30 , VIP = 50;
	sc.useLocale(Locale.ENGLISH);
	assert (abono.equalsIgnoreCase("Familiar") && abono.equalsIgnoreCase("VIP") && abono.equalsIgnoreCase("Normal")) :"Te has equivocado"; //TIENEN QUE SER FALSE
	if (e < 18 && abono.equalsIgnoreCase("Familiar"))
	throw new IlegalidadException("Antonio Aco Durand");
	return 0;
	}
}





