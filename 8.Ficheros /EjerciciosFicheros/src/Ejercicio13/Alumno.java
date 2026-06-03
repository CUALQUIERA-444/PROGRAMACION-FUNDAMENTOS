package Ejercicio13;
import java.time.*;
public class Alumno {
	private String nombre,apellido;
	private double nota;
	private LocalDate fecha_nacimiento;
	public Alumno(String nombre, String apellido, double nota, LocalDate fecha_nacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota = nota;
		this.fecha_nacimiento = fecha_nacimiento;
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
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", nota=" + nota + ", fecha_nacimiento="
				+ fecha_nacimiento + "]";
	}
}
