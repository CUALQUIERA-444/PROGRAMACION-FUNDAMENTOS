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
//Es recomendable tratarlas todas las excepciones en el main o controlador principal 
//En caso de que se usen funciones 
	Scanner sc = new Scanner (System.in);
	String cadena;
	LocalDate fech;
	DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	do {
	System.out.println("Introduce una cadena (Si quiere terminar el programa introduzca FIN)");
	cadena = sc.nextLine();
	if(!cadena.equalsIgnoreCase("FIN")) {
	try {
	fech = BuscarFecha(cadena,p);
	System.out.println("Se encontro la fecha "+fech.format(p));
	}
	catch (DateTimeParseException e) {
	System.out.println("No es una fecha");
	}
	catch (MuchasFechasException a) {
	System.out.println(a.getMessage());	
	}
	catch (NingunaFechaException b) {
	System.out.println(b.getMessage());	
	}
	}
	}
	while(!cadena.equalsIgnoreCase("FIN"));
	System.out.println("Gracias por ejecutarme");
	}	
	/***
	 * Las excepciones chequeadas por lo general SIEMPRE se lanzan 
	 * Si hay combinaciones entre runtime y chequeadas por lo general lo que se suele hacer es lanzarla
	 * aunque claro hay excepciones valga la redudancia:
	 * En algunas ocasiones es necesario recordar que las excepciones IMPIDEN que el programa deje de ejecutarse
	 * por lo que si tienes un catch y no sabes que mas hacer esencialmente estas algo jodido
	 */
	public static LocalDate BuscarFecha (String c,DateTimeFormatter p) throws NingunaFechaException,MuchasFechasException {
	String posible = " ";
	int contador = 0;
	for (int i = 0; i<c.length();i++) {
		if(Character.isDigit(c.charAt(i))){ //Devuelve booleano
			if(i+10 <= c.length()) { //EJEMPLO SE ENCUENTRA EN 1 necesita 10 + para completarse que es igual a 11 -> La cadena no mide eso error
				posible = c.substring(i,i+10);
				i = i+9; //NECESARIO PARA QUE NO PROCEDA A COMPARAR LOS SIGUIENTES "NUMEROS" Y SALTE HACIA ADELANTE
				//AL FINAL DE LA VUELTA SE HACE UN ++ PARA SALTAR HACIA ADELANTE
				contador++;
		}
		}
	}
	if (contador == 0) {
		throw new NingunaFechaException("No se encontro la fecha");
	}
	else if (contador > 1) {
		throw new MuchasFechasException("Se encontraron muchas fechas");
	}
	else 
	return LocalDate.parse(posible, p);
}
}