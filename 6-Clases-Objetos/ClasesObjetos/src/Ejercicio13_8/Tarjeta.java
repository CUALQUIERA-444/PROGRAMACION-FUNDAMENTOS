package Ejercicio13_8;
import java.time.*;
/*
 * • Número de tarjeta.
• Titular.
• Clave (4 dígitos, puede tener ceros por delante)
• Saldo
• Mes y año de validez, 5 años después de la fecha actual.
 */
public class Tarjeta {
	private String numero_tarjeta;
	private String titular;
	private String clave;
	private double saldo;
	private int mes;
	private int año;
	private boolean bloquear = false;
	private static int contador_pagos;
	private static int contador_recargas;
public Tarjeta(String numero_tarjeta,String titular,String Clave,double saldo) {
	this.numero_tarjeta = numero_tarjeta;
	this.titular = titular;
	String regex = "^\\d{4}$";
	if(!Clave.matches(regex)) //La clave vale algo 
		throw new IllegalArgumentException("La clave no es valida"); //El sistema lo entiende
	this.clave = Clave; //Se valida mejor em el main 
	//Se valida en el constructor cuando no haya pedido de datos de por medio
	//O con excepciones
	this.saldo = saldo;
	LocalDate fechaActual = LocalDate.now();
	LocalDate fechaValidez = fechaActual.plusYears(5);
	this.mes = fechaValidez.getMonthValue();
	this.año = fechaValidez.getYear();
}
public void Pagar(String contraseña, int mes_operacion, int año_operacion,double importe) {
	if(bloquear) {
		System.out.println("Su tarjeta esta bloqueada");
	}
	else if(!contraseña.equalsIgnoreCase(clave)) {
		System.out.println("La contraseña no es valida");
	}
	else if(saldo < importe) {
		System.out.println("No se puede realizar el pago");
	}
	else if(año_operacion > año || (año_operacion == año && mes_operacion > mes)) { //Jerarquia de mayor a menor 
		System.out.println("Su tarjeta ya caduco");
		}
	else {
		saldo -= importe;
		contador_pagos = contador_pagos + 1;
		System.out.println("Pago realizado con exito");
	}
}
public void RecargarTarjeta(double aumento) {
	if(!bloquear) {
		System.out.println("Su tarjeta esta bloqueada");
	}
	if(aumento <= 0) {
		System.out.println("No se puede aumentar el saldo de su tarjeta");
	}
	else {
		saldo += aumento;
		contador_recargas = contador_recargas + 1;
	}
}
public void Bloquear() { //Recomendable una separada pero por ahora solo usaremos una 
	if(bloquear == false)
	bloquear = true;
	else {
	bloquear = false;
	}
}
public boolean mismaTarjeta(Tarjeta t) {
	if(numero_tarjeta.equals(t.numero_tarjeta) && titular.equals(t.titular)) {
		return true;
	}
	return false;
}

@Override
public String toString() {
	return "Tarjeta [numero_tarjeta=" + numero_tarjeta + ", titular=" + titular + ", clave=" + "****" + ", saldo="
			+ saldo + ", mes=" + mes + ", año=" + año + ", bloquear=" + bloquear + "]";
}
public static int getContador_pagos() {
	return contador_pagos;
}
public static int getContador_recargas() {
	return contador_recargas;
}

}
