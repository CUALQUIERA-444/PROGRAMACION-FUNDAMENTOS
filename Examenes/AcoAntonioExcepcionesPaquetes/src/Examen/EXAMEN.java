package Examen;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class EXAMEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se lee de teclado en un unico String el nombre y 2 apellidos del alumno. Mediante una función se calcula
		//el código del alumno que está formado por la primera letra de cada palabra en mayúsculas 
		//Por ejemplo: El código de "Pedro Lorenzo Sanz". será "PLS Generalizarlo para cualquier número de palabras
		Scanner sc = new Scanner (System.in);
		String nombre;
		char mayus;
		int nota;
		String nombre_completo =" ";
		System.out.println("Introduce tu nombre completo (Nombre y como minimo 2 apellidos Cada dato empieza en mayúsculas");
		nombre= sc.nextLine();
		for (int i = 0; i <nombre.length();i++) {
		mayus = nombre.charAt(i);
		if (mayus  >= 'A' && mayus <= 'Z') 
			nombre_completo = nombre.replace(nombre.charAt(i), mayus);
		}
		System.out.println(nombre_completo);
		//A continuacion se calcula de forma aleatoria la nota del alumno entre 
		//(0 y 9)
		Random r = new Random();
		nota = r.nextInt(10); //0 y 9
		System.out.println(nota);
		//Se obtiene la fecha (LocalDateTime)en la que el alumno entrega la tarea: el año y el 
		//mes no se anotan ya que se considera que es el 2025 y el mes es 12, el dia tiene que ser
		//el 16 y el 17 y la hora tiene que estar entre 0 y 23 y los minutos entre 0 y 59 a
		//Usar excepcion para controlar la fecha introducida
		DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy:HH:mm");
		LocalDateTime fecha_entrega = null;
		int horas;
		int minutos;
		int dia;
		int año;
		int mes;
		boolean validacion = false;
		do {
		try {
		System.out.println("Introduce las horas entre (0 y 23)");
		horas = sc.nextInt();
		System.out.println("Introduce los minutos entre (0 y 59)");
		minutos = sc.nextInt();
		System.out.println("Introduce el día (Tiene que ser entre 16 y 17");
		dia = sc.nextInt();
		if (dia != 16 && dia != 17) 
		throw new NumeroNoValido("Numero no valido");
		fecha_entrega = LocalDateTime.of(año = 2025, mes = 12, dia, horas, minutos);
		System.out.println(fecha_entrega.format(p));
		validacion = true;
		}
		catch (InputMismatchException e){
		sc.nextLine();
		System.out.println("Error valor no valido");
		}
		catch (NumeroNoValido b) {
			System.out.println(b.getMessage());
		}
		catch (DateTimeException a) {
			System.out.println("Introduzca datos válidos para la creacion");
		}
		}
		while (validacion == false);
		penalizarNota(fecha_entrega,p,nota);
	}
	public static void penalizarNota (LocalDateTime fecha_entrega,DateTimeFormatter p,int nota) {
		int year;
		int month; 
		int dia;
		int hora;
		int minuto;
		int year2;
		int month2; 
		int dia2;
		int hora2;
		int minuto2;
		int nota2;
		int penalizacion = 0;
		LocalDateTime lanzar = LocalDateTime.of(year = 2025,  month = 12, dia = 16, hora = 10, minuto = 00);
		LocalDateTime finalizar = LocalDateTime.of (year2 = 2025, dia2= 12,  dia2 = 17, hora2 = 10, minuto2 = 00);
		try {
		if (fecha_entrega.isBefore(lanzar)) 
			throw new ApellidoException ("ACO");
		}
		catch (ApellidoException e) {
			System.out.println(e.getMessage());
		}
		if (fecha_entrega.isAfter(finalizar)) {
			nota2 = (int)ChronoUnit.HOURS.between(fecha_entrega,finalizar);
			nota = nota - nota2;
			System.out.println(nota2);
			penalizacion++;
		}
		else {
			System.out.println("No hay penalización");
			System.out.println(nota);
		}
	}
}




