package Ejercicio13;

import java.time.LocalDate;

public class AlumnoRemake {
 private String nombre; 
 private String apellido;
 private double nota;
 private LocalDate fecha_nacimiento;
 
 public AlumnoRemake(String nombre, String apellido, double nota, LocalDate fecha) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.nota = nota;
	this.fecha_nacimiento = fecha;
}
 public String getNombre() {
	return nombre;
 }
 public String getApellido() {
	return apellido;
 }
 public double getNota() {
	return nota;
 }
 public LocalDate getFecha_nacimiento() {
	return fecha_nacimiento;
 }
 @Override
 public String toString() {
	return "AlumnoRemake [nombre=" + nombre + ", apellido=" + apellido + ", nota=" + nota + ", fecha_nacimiento="
			+ fecha_nacimiento + "]";
 }
}
