package EjerciciosPaquetesExcepciones;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.*;
import java.time.format.*;
public class Ejercicio10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 4. Lee una cadena e intenta extraer una fecha con el formato dd/mm/yyyy de su
contenido (la cadena puede tener otras cosas, por ejemplo “Yo nací el 29/02/1998”).
Los casos en los que no se encuentre ninguna fecha o se encuentren varias deberán
manejarse con excepciones.
 */
/* 
 * Logica codigo y anotaciones 
 * Se lee una cadena y se intenta extraer la fecha usando el metodo .isDigit debido a que las fechas empiezan por un digito
 * Una vez se encuentra el digito se tiene que comparar la longitud total de la fecha introducida "que en este caso es 29/02/1998"
 * Usamos siempre el formato del 0 primeramente es necesario comparar que la longitud de una u otra
 * Ya que si lo encuentras y es menor automaticamente 
 * Necesitamos una (String para guardar la fecha del usuario)
 * Un (Formatter de tipo dd/MM/yyyy)
 * Una excepcion que si la fecha no es posible parsearla (Salta la excepcion)
 * Si se encuentran varias (Salta una excepcion personalizada)
 */
	Scanner sc = new Scanner (System.in);
	String cadena;
	LocalDate fech;
	DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	System.out.println("Introduce una cadena (Si quiere terminar el programa introduzca FIN)");
	cadena = sc.nextLine();
	BuscarFecha(cadena);
	}
	public static void BuscarFecha (String c) {
	try {
	for (int i = c.length()-c.length(); i<c.length();i++) {
		if(!Character.isDigit(c.charAt(i))){ //Devuelve booleano
			throw new CadenaVaciaException("No se encontró la fecha");
		}
		else {
			if(i+10 <= c.length())
		}
	}
	}
	catch (CadenaVaciaException e) {
		System.out.println(e.getMessage());
	}
	}
}
