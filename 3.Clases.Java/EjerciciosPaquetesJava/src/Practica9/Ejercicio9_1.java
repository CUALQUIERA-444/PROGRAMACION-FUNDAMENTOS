package Practica9;
import java.time.format.*;
import java.util.Locale;
import java.time.*;
public class Ejercicio9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Muestra el día, mes y año actual, 
 * incluido el día de la semana.
 */
/* Logica y codigo necesario
 * Básicamente lo que tenemos que hacer es un objeto de tipo LocalDate que muestre la fecha de hoy asi como
 * Un enum del tipo dayofWeek para mostrar el día de la semana preferiblemente en español
 * Un DateTimeFormatter para la fecha tampoco viene mal
 */
	DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate ahora = LocalDate.now();
	DayOfWeek d = LocalDate.now().getDayOfWeek();
	System.out.println(ahora.format(p)+" "+d.getDisplayName(TextStyle.FULL,Locale.getDefault()));
	}
}
