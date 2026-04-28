package Practica9;
import java.time.*;
import java.time.format.*;
import java.util.Locale;
import java.util.Scanner;
public class Ejercicio9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 6. Programa que lea tu fecha de nacimiento y diga el día de la semana (lunes,
martes, miércoles...).
 */
/* Lógica y código necesario
 * Básicamente lo que necesitamos es poner la fecha de nacimiento usando un string 
 * Y posteriormente usando el enum DayOfWeek mostrar el respectivo día del nacimiento
 * Necesitamos
 * 1 String para guardar la fecha de nacimiento 
 * 1 LocalDate para almacenar la fecha 
 * 1 Formatter para permitir que el usuario introduzca bien la fecha 
 * 1 DayOfWeek para mostrar el día de la semana correspondiente a la fecha de nacimiento
 */
	Scanner sc = new Scanner (System.in);
	DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	String nacimiento = " "; 
	LocalDate fechaNac;
	while (!nacimiento.equalsIgnoreCase("FIN")){
	System.out.println("Introduce tu fecha de nacimiento y te diremos el día que naciste (Introduzca fin si quiere "
			+ " terminar el programa)");
	nacimiento = sc.nextLine();
	if (!nacimiento.equalsIgnoreCase("FIN")) {
		fechaNac = LocalDate.parse(nacimiento,p);
		DayOfWeek d = fechaNac.getDayOfWeek();
		System.out.println(fechaNac.format(p)+" corresponde al día "+d.getDisplayName(TextStyle.FULL,Locale.getDefault()));
	}
	}
	System.out.println("Gracias por ejecutarme");
	}
}
