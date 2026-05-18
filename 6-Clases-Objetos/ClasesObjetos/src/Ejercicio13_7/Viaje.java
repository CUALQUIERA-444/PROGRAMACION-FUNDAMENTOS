package Ejercicio13_7;

import java.util.Scanner;

/*7. En una agencia de viajes se guarda la siguiente información por cada viaje: Ciudad
de origen y ciudad de destino, código, número de plazas, importe del viaje por
persona. Se pide hacer una clase Viaje que contenga al menos los siguientes
métodos:
1. Constructor. El código del viaje se forma con las dos primeras letras
del origen (en mayúsculas), las dos primeras letras del destino (en
mayúsculas) y el número de viaje.
2. Método que reserve un número de plazas pasado como parámetro.
Si no tiene plazas suficientes no reserva ninguna. Los niños tienen un
20% de descuento sobre el valor del billete. Devuelve el importe
total de la reserva, 0 si no se puede realizar.
3. Método que modifique el número de plazas de un viaje, sólo si es
posible, es decir nunca puede haber más reservas que plazas.
Retorna si se ha podido realizar o no la modificación.
4. Método toString.
5. Método que muestre el total recaudado por la agencia.
*/
//El enunciado no lo dice pero se da por hecho que existen mas de 1 vehiculo de transporte
public class Viaje {
	private String ciudadO;
	private String ciudadD;
	private String codigo;
	private int n_plazasTotales; //Todos los pasajeros tienen viajes personalizados
	private static double gananciasAgencia;
	private int plazasReservadas;
	private int plazasRestantes;
	private double importe_persona; //Importe por persona
	private int n_viaje;
public Viaje (String ciudadO, String ciudadD,int n_viaje,double importe_persona,int plazasTotales){
	this.ciudadO = ciudadO;
	this.ciudadD = ciudadD;
	this.n_viaje = n_viaje;
	this.n_plazasTotales = plazasTotales;
	this.importe_persona = importe_persona;
	this.plazasRestantes = n_plazasTotales;
	codigo = ciudadO.substring(0,2).toUpperCase()+ciudadD.substring(0,2).toUpperCase()+n_viaje;
}
public double ReservarPlazas(int n_plazas,int edades[]) {
	double importe_viaje = 0;
	if(plazasRestantes < n_plazas) { //Si lo que le queda al transporte es menor que las plazas que se quiera reservar
		//No se reserva
		return 0;
	}
	else {
		//int Edades[] = new int[n_plazas]; //Se reinicia borrandose todo lo cual me interesa
		//El array es opcional
		//Es mejor usar el scanner en el main una clase no debería comunicarse con el usuario
		//Creamos un array aca 
	for (int i = 0; i<edades.length;i++) {
		if(edades[i] < 18) {
		importe_viaje += importe_persona-importe_persona * 20 / 100;
	}
		else {
			importe_viaje += importe_persona;
		}
	}
	plazasReservadas += n_plazas; //Reserva El total 
	plazasRestantes = n_plazasTotales - plazasReservadas; //Cada reserva tiene lo suyo
	//Hay que coger todo lo reservado previamente 
	gananciasAgencia += importe_viaje;
	return importe_viaje;
	}
}
public boolean ModificarPlazasViaje(int nuevas) {
	if(plazasReservadas >= nuevas) //Modifica las plazas del viaje SIEMPRE Y CUANDO la nueva cantidad 
		//De plazas a poner no sea mayor a la cantidad de plazas reservadas
		//Nunca puede haber mas reservas que plazas 
		//Hablamos de que las reservas hechas sean ocupables para el publico creo que lo he entendido
		return false;
	else {
	this.n_plazasTotales = nuevas;
	plazasRestantes = n_plazasTotales - plazasReservadas ;
	return true;
	}
}
public static double getGananciasAgencia() {
	return gananciasAgencia;
}
@Override
public String toString() {
	return "Viaje [ciudadO=" + ciudadO + ", ciudadD=" + ciudadD + ", codigo=" + codigo + ", n_plazasTotales="
			+ n_plazasTotales + ", plazasRestantes=" + plazasRestantes
			+ ", importe_persona=" + importe_persona + ", n_viaje=" + n_viaje + "]";
}

}