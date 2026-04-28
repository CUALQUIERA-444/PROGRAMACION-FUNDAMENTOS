package EjerciciosPaquetesExcepciones;
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
public class Ejercicio10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1. Lee dos fechas de teclado en formato dd/mm/aa, de manera que la primera sea
		menor que la segunda. Controla con excepciones que la fecha sea correcta.
		Haz una función que reciba las dos fechas y si son del mismo mes retorna los días que
		hay entre ambas, si no retorna los meses que hay entre ambas.
		*/
	/* Lógica y código necesario
	 * Básicamente se leen de teclado dos fechas y hay que asegurar que la primera sea menor a la segunda 
	 * Primero validando que ambas fechas sean realmente fechas usando el LocalDateparse y el patron 
	 * Posteriormente necesitamos en una función pasar las fecha Si tienen el mismo mes (equals.get)? retornamos la diferencia 
	 * de días caso contrario devuelve la diferencia de meses.
	 * Necesitamos 2 Strings y 2 fechas asi como enteros y uso de metodos dentro de las funciones y 2 excepciones
	 * gestionadas por un try 
	 */
	Scanner sc = new Scanner(System.in);
	String c1;
	String c2;
	int mes_dia;
	DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate f1 = null ;
	LocalDate f2 = null;
	boolean ejecutar;
	do {
	ejecutar = true; //Si esto no se reinicia la proxima vez que introduzcas cosas bien no ejecutara lo de abajo y volvera
	//a empezar
	System.out.println("Introduzca una fecha (Si quiere terminar el programa introduzca FIN)");
	c1 = sc.nextLine();
	try { //Codigo que se intenta ejecutar pero si falla saltan excepciones que interrumpen el programa
	 //Aun si no provoca excepcion requiere que tenga un valor asi que lo podemos sacar fuera 
	//Como quiero un orden meto el segundo en el try 
		if(!c1.equalsIgnoreCase("FIN")) {
		f1 = LocalDate.parse(c1,p);
		System.out.println("Introduzca una segunda fecha");
		c2 = sc.nextLine();
		f2 = LocalDate.parse(c2,p);
		if(f1.isAfter(f2)) {
			throw new PosicionAdelantadaException("La primera fecha introducida debe ser menor a la anterior");
		}
		}
	} 
	catch (DateTimeParseException e) { //Si a saltado a alguna de las excepciones sale incorrecto false (cambiarlo a true antes de volver a ejecutar es la solucion)
		ejecutar = false;
		System.out.println("La fecha introducida no es válida");
	}
	catch (PosicionAdelantadaException e) { //El catch caza para permitir que el programa se ejecute por lo 
		//que capturada o salio bien sin condiciones el codigo de abajo se ejecuta
		ejecutar = false;
		System.out.println(e.getMessage());
	}
	if(ejecutar && !c1.equalsIgnoreCase("FIN")) {
	mes_dia = CalculoConFechas(f1,f2); //Su validacion esta en un try las inicializamos a null
	if (f1.getMonthValue() == f2.getMonthValue()) {
	System.out.println("Hay "+mes_dia+" dias de diferencia");
	}
	else {
	System.out.println("Hay "+mes_dia+" meses de diferencia");
	}
	}
	} while (!c1.equalsIgnoreCase("FIN"));
	System.out.println("Gracias por ejecutarme");
	}
	public static int CalculoConFechas(LocalDate f1, LocalDate f2) {
		if(f1.getMonthValue() == f2.getMonthValue()) {
			return (int)ChronoUnit.DAYS.between(f1, f2);
		}
		else {
			return (int)ChronoUnit.MONTHS.between(f1, f2);
		}
	}
}
