package yo_fechas;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Fecha_8 {
//8.Simular durante 1 segundo el lanzamiento de un dado, pasado ese tiempo
//mostrar la cantidad de seises que han salido
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador_seis = 0;
		Random r = new Random();
		int dado;
		// dado = r.nextInt(6)+1; //NO GENERA RANDOM DENTRO DEL WHILE SOLO EN LA FUNCION
		// PRINCIPAL
		// EL RANDOM SE GENERA ASI POR CIERTO

		// Hacer un do mientras no haya pasado un segundo cuando lo haya hecho para
		// Problema AMBOS SE VAN A EJECUTAR SIMULTANEAMENTE!!
		// Solucion al ejecutar guardar ese segundo de forma rapida;
		// De este modo solo cambiara el primero
		LocalDateTime segundo_extra = LocalDateTime.now().plusSeconds(1);
		while (LocalDateTime.now().isBefore(segundo_extra)) {
			// Antes del 0 al 5 +1 ahora del 1 al 6
			dado = r.nextInt(6) + 1;
			System.out.println(dado);
			if (dado == 6)
				contador_seis++;
		}
		System.out.println("Ha habido un total de " + contador_seis + " seises");
	}
}
