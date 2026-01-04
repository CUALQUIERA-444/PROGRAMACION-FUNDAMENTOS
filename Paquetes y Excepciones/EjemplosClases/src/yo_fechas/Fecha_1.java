package yo_fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.*;

public class Fecha_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 Muestra el día, mes y año actual incluido el día de la semana
		DateTimeFormatter patter; // Declaramos el patrón
		// Month mes = Month.NOVEMBER; Clase de tipo month
		patter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy"); // Inicializamos el patrón
		LocalDate fecha_actual = LocalDate.now(); // Obtenemos la fecha actual
		DayOfWeek dia_semana = fecha_actual.getDayOfWeek();

		// Resultado con patrón y objeto?
		System.out.println(patter.format(fecha_actual) + "/" + dia_semana);

		LocalDate fecha_sinp = LocalDate.now();
		// Resultado sin patrón y con funcion
		System.out.println(fecha_sinp.getDayOfWeek() + "/" + fecha_sinp);
	}
}
