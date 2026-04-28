package EjerciciosPaquetesExcepciones;
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.util.Scanner;

public class Ejercicio10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. Haz un juego interactivo donde el ordenador genera una fecha secreta y el usuario
trata de averiguarla. El usuario va haciendo preguntas en las que indica una fecha y el
ordenador responde si la fecha secreta es mayor o menor que la introducida. El juego
termina cuando se averigua la fecha. Los casos en los que el usuario no introduzca una
fecha con un formato válido deben manejarse con excepciones.
 */
/* Lógica codigo necesario y anotaciones
 * Vamos a hacer un juego interactivo en donde la fecha sera generada aleatoriamente usando random
 * Y el usuario introduce una fecha y el programa contesta diciendo si es mayor o menor que la introducida
 * (Termina al adivinar la fecha) Se maneja con la excepcion DateTimeParseException la fecha (Usaremos formato dd/MM/yyyy)
 * Lo ideal es primero probar con algo que yo pueda averiguar para saber que el programa funciona 
 * "Adivinar una fecha aleatoria es complicado"
 */
	/*
	 * Por ahora primero necesitamos 1 String para guardar las respuestas del usuario 2 localdate uno con el secreto 
	 * y otro con el que vaya queriendo adivinar el usuario primero probaremos con el dia de hoy y posteriormente 
	 * probaremos con una ya aleatoria
	 */
	Scanner sc = new Scanner(System.in);
	String fecha_ca;
	//LocalDate fecha_random = LocalDate.now(); //Funciona
	LocalDate fecha_random;
	LocalDate fecha_us = null;
	fecha_random = GenerarFecha();
	do {
	System.out.println("Adivina mi fecha");
	fecha_ca = sc.nextLine();
	try {
	fecha_us = ValidarFecha(fecha_ca);
	}
	catch (DateTimeParseException e) {
		System.out.println("Fecha no valida");
	}
	if(fecha_us != null) {
		if(fecha_us.isBefore(fecha_random)) {
			System.out.println("La fecha es menor que la elegida");
		}
		else if(fecha_us.isAfter(fecha_random)) {
			System.out.println("La fecha es mayor que la elegida");
		}
		else {
			System.out.println("Correcto");
		}
	}
	}while(fecha_us == null || !fecha_us.equals(fecha_random)); //Se pone la condicion de fecha_us para que Java
	//Que es vago no lea el equals 
	System.out.println("Gracias por ejecutarme");
	}
	public static LocalDate GenerarFecha() {
		DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Random r = new Random();
		boolean fichar; 
		int año;
		int mes;
		int dia;
		do {
		fichar = true;
		año = r.nextInt(28)+1999; //Del 0 al 27 //28 Numeros  del 1999 al 2026 Limite
		mes = r.nextInt(12)+1; //Del 0 al 11 Del 1 al 12
		dia = r.nextInt(31)+1; //Del 0 al 30 + 1 = del 1 al 31
		boolean bisiesto = (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
		if((dia == 31) && (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11)){
			fichar = false;
		}
		else if(mes == 2 && dia == 30) {
			fichar = false;
		}
		else if(mes == 2 && dia == 29 && bisiesto == false)
			fichar = false;
		} while (!fichar);
		return LocalDate.of(año, mes,dia); //Sin importar el formato java es capaz de realizar comparaciones
	}
 	public static LocalDate ValidarFecha (String fecha) {
		DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return LocalDate.parse(fecha,p);
		//if(LocalDateParse(fecha,p) == null) Se tiene que intentar la accion especifica no recomendable lanzar excepciones
		//Tipo runtime en funciones 
		/*try {
			fech = LocalDate.parse(fecha,p);
			return fech;
		}
		catch (DateTimeParseException e) {
			return null;
		} //Si devuelvo null se jode la operacion (El while)
		*/ 
	}
}
