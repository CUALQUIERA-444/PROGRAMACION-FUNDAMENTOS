package ej2Caducable;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Carnet implements Caducable {
	private String numero;
	private LocalDate fechaCaducidad;
	private String nombre;
	
	
	
	
	public Carnet(String numero, LocalDate fechaCaducidad, String nombre) {
		super();
		this.numero = numero;
		this.fechaCaducidad = fechaCaducidad;
		this.nombre = nombre;
	}

	@Override
	public boolean estaCaducado() {
		if (fechaCaducidad.isBefore(LocalDate.now()))
			return true;
		return false;
		
	}

	@Override
	public int diasFaltanParaCaducar() {
		// TODO Auto-generated method stub
		 return (int)ChronoUnit.DAYS.between(LocalDate.now(),fechaCaducidad);
	}

	@Override
	public String toString() {
		return "Carnet [numero=" + numero + ", fechaCaducidad=" + fechaCaducidad + ", nombre=" + nombre + "]";
	}
	
	

}
