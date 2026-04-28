package ej2Caducable;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Medicamento implements Caducable {
	private String nombre;
	private LocalDate fcaducidad;
	private int gramos;

	public Medicamento(String nombre, LocalDate fcaducidad, int gramos) {
		super();
		this.nombre = nombre;
		this.fcaducidad = fcaducidad;
		this.gramos = gramos;
	}

	public String getNombre() {
		return nombre;
	}

	public int getGramos() {
		return gramos;
	}

	@Override
	public boolean estaCaducado() {
		// TODO Auto-generated method stub
		if (fcaducidad.isBefore(LocalDate.now()))
			return true;
		return false;
	}

	@Override
	public int diasFaltanParaCaducar() {
		// TODO Auto-generated method stub
		 return (int)ChronoUnit.DAYS.between(LocalDate.now(),fcaducidad);
		
	}

	@Override
	public String toString() {
		return "Medicamento [nombre=" + nombre + ", fcaducidad=" + fcaducidad + ", gramos=" + gramos + "]";
	}

}
