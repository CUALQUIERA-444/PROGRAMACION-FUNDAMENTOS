package Practica9;

import java.time.LocalTime;
import java.util.Random;

public class Ejercicio9_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 8. Simular durante 1 minuto el lanzamiento de un dado, pasado ese tiempo
mostrar la cantidad de seises que han salido
 */
/*
 * Logica y codigo necesario
 * Debido a que en un minuto al ordenador le da bastante tiempo a mostrar cosas es necesario cambiarlo 
 * a un segundo 
 * Tambien tenemos que congelar el tiempo mientras sea necesario para esto guardamos el segundo de ahora 
 * con un LocalTime guardando usamos 2 LocalTime uno para ahora y otro para 1 segundos después
 * Necesitamos usar random así podemos generar números del 1 al 6.
 * Y mientras el dado de 6 vamos acumulando en un contador
 */
	LocalTime despues = LocalTime.now().plusSeconds(1); //Congelar el tiempo 
	Random r = new Random(); //Crear objeto random 
	int dado;
	int contador = 0;
	while (LocalTime.now().isBefore(despues)) {
		dado = r.nextInt(6)+1; //Antes 0 y 5 despues 1 y 6
		System.out.println(dado);
		if(dado == 6) {
			contador++;
		}
	}
	System.out.println("El 6 ha salido un total de "+contador+" veces");
	}
}
