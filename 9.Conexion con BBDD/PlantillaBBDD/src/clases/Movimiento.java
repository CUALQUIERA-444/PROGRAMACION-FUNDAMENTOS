package clases;

import java.time.LocalDate;

public class Movimiento {
 private int numero;
 private int tarjeta;
 private int cargado;
 private double importe;
 private LocalDate fecha;
 public Movimiento(int numero, int tarjeta, int cargado, double importe, LocalDate fecha) {
	super();
	this.numero = numero;
	this.tarjeta = tarjeta;
	this.cargado = cargado;
	this.importe = importe;
	this.fecha = fecha;
 }
 public int getNumero() {
	return numero;
 }
 public int getTarjeta() {
	return tarjeta;
 }
 public int getCargado() {
	return cargado;
 }
 public double getImporte() {
	return importe;
 }
 public LocalDate getFecha() {
	return fecha;
 }
 
}
