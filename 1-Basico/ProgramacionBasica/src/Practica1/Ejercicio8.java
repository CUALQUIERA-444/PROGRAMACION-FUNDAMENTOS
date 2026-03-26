package Practica1;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*8.Programa que dada una variable t que contiene un tiempo en segundos, nos
muestre dicho tiempo expresado en horas, minutos y segundos.
		*/
		//Minutos = 60 segundos
		//Horas = 60 minutos
		//En una fila solo se pueden declarar variables concatenadas de un mismo tipo
		//Ejemplo int cualquiera = 3600, minutos = 2000;
		//Lo mejor para este ejercicio es sacar todo con el dato de los segundos 
		final int t = 7261, minutos = t / 60, horas = t / 3600;
		System.out.println("Resultado crudo");
		System.out.println("La hora es "+horas+":"+minutos+":"+t);
		//Resultado formato reloj
		//La idea es ir de pequeño mas grande es decir para sacar 
		//Los segundos sobrantes se hace el modulo de los segundos totales basicamente segundos_totales % 60 que son los segundos que tiene un minuto y por lo tanto sobran
		//Los minutos sobrantes se hace el modulo de los minutos totales basicamente minutos_totales % 60 que son los minutos que tiene una hora 
		//Finalmente para la hora se hace el modulo de las horas totales basicamente horas_totales % 24 que son las horas que tiene un dia
		int horas_totales = horas % 24; 
		int minutos_reloj = minutos % 60;
		int segundos_totales = t % 60;	
		System.out.println("Resultado reloj");
		System.out.println("La hora es "+horas_totales+":"+minutos_reloj+":"+segundos_totales);
	}
}