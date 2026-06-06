package Ejercicio13;

public class AlumnoRemake {
 private String nombre; 
 private String apellido;
 private double nota;
 
 public AlumnoRemake(String nombre, String apellido, double nota) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.nota = nota;
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
 @Override
 public String toString() {
	return "AlumnoRemake [nombre=" + nombre + ", apellido=" + apellido + ", nota=" + nota + "]";
 }
}
