package Ejercicio14_1;

import java.util.Objects;

/*En una empresa de alquiler de automóviles se guarda por cada vehículo la
siguiente información: matrícula, modelo, marca, año de matriculación, categoría
(1 ó 2). Crear una clase Vehículo que pueda realizar las siguientes operaciones:
 * - Alquiler de un vehículo: Se le pasa el número de días que se quiere alquilar
y se retorna el importe del mismo teniendo en cuenta las siguientes tarifas:
Tipo		  2 dias        Mas de 
vehiculo	  o menos		2 días
1			  45€/día		30 euros/día
2			  50€/dia		40 euros/día

Si el vehículo ya está alquilado se retorna 0.
- Devolver un vehículo. Si no está alquilado da error.
- Saber si un vehículo está alquilado o no.
- Saber cuántos vehículos hay alquilados en este momento.
- Ganancias totales de ese vehículo.
- Método que me retorne cuáles son las ganancias totales de toda la
empresa.
 */
public class Vehiculo {
private String matricula; //Por defecto null
private String modelo;
private String marca;
private int año_matriculacion; //No se puede comparar con regex pero solo pide el año asi que se puede dejar asi
private int categoria;
private boolean alquilado = false;
private static int contador_alquileres;
private double gananciasvehiculo;
//El precio en este contexto no es un atributo de la clase si bien cumple con las condiciones de pertenecer a un vehiculo
//Tu no sabes realmente el precio exacto de dicho vehiculo a menos que uses otros metodos los puedes definir como 
//Precios constantes/estaticos para usarlos pero no son como los "atributos normales" en este contexto en particular
//Es decir es algo que se halla en base al calculo de la operacion
private static double gananciastotales; //Acumulador si fuera una variable temporal seria otra historia
public Vehiculo(String matricula, String modelo, String marca, int año_matriculacion, int categoria) {
	this.matricula = matricula;
	this.modelo = modelo;
	this.marca = marca;
	this.año_matriculacion = año_matriculacion;
	this.categoria = categoria; //Se valida mejor con un while porque si no lo demas se rompe en cuanto hay un error
	}
public double AlquilarVehiculo(int dias) {
	double tarifa;
	double importe_total;
	if(alquilado == true)
		return 0;
	else if(dias <= 0) {
		return -1;
	}
	else {
		if(categoria == 1) {
			if(dias > 2) {
				tarifa = 30;
				importe_total = tarifa * dias;
			}
			else {
				tarifa = 45;
				importe_total = tarifa * dias;
			}
		}
		else {
			if(dias > 2) {
				tarifa = 40;
				importe_total = tarifa * dias;
			}
			else {
				tarifa = 50;
				importe_total = tarifa * dias;
			}
	}
	this.alquilado = true;
	contador_alquileres++; //this funciona con atributos estaticos pero no es buena practica
	gananciasvehiculo += importe_total;
	gananciastotales += importe_total;
	return importe_total;
	}
}

public boolean RevisarAlquiler() {
	return this.alquilado; //Se puede moderar en el main
}
public void DevolverVehiculo() {
	if(alquilado == false) {
		System.out.println("Este vehiculo ya fue devuelto");
	}
	else {
		contador_alquileres--;
		alquilado = false;
		System.out.println("Vehiculo devuelto exitosamente");
	}
}
public static int getContador_alquileres() {
	return contador_alquileres;
}
public double getGananciasvehiculo() {
	return gananciasvehiculo;
}
public static double getGananciastotales() {
	return gananciastotales;
}
public String getMatricula() {
	return matricula;
}
@Override
public String toString() {
	return "Vehiculo [matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", año_matriculacion="
			+ año_matriculacion + ", categoria=" + categoria + ", alquilado=" + alquilado + ", gananciasvehiculo="
			+ gananciasvehiculo + "]";
}


/*
@Override
public int hashCode() {
	return Objects.hash(matricula);
}
*/
//@Override
/* Comparador General generable a traves de source
public boolean equals(Object obj) { 
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Vehiculo other = (Vehiculo) obj;
	return Objects.equals(matricula, other.matricula);
}
*/
}
