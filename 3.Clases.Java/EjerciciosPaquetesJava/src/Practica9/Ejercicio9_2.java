package Practica9;
import java.time.format.*;
import java.util.Scanner;
import java.time.*;
public class Ejercicio9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Lee dos fechas de teclado (día, mes y año) 
 * y ordénalas de menor a mayor.
 */
/*
 * Lógica y código necesario 
 * Necesitamos leer dos strings por el teclado (Strings)
 * Convertirlas a fechas con la función .toLocalDate (Guardando en objeto de tipo LocalDate)
 * Compararlas con la función .isBefore dentro de un método void que imprima el resultado en cuestión
 * Y un DateTimeFormatter para que quede bonito
 */
		Scanner sc = new Scanner (System.in);
		DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha1;
		String fecha2;
		LocalDate trans1;
		LocalDate trans2;
		System.out.println("Introduce 2 fechas y te las ordenamos");
		fecha1 = sc.nextLine();
		fecha2 = sc.nextLine();
		trans1 = LocalDate.parse(fecha1,p);
		trans2 = LocalDate.parse(fecha2,p);
		OrdenarFechas(trans1,trans2,p);
	}
	public static void OrdenarFechas (LocalDate tr1, LocalDate tr2, DateTimeFormatter p) {
		if(tr1.isBefore(tr2) == true) {
			System.out.println(tr1.format(p)+"\n"+tr2.format(p));
		}
		else {
			System.out.println(tr2.format(p)+"\n"+tr1.format(p));
		}
	}
}
