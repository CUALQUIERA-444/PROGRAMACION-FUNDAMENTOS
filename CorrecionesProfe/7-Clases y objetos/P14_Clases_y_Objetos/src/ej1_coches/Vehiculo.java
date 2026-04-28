package ej1_coches;

import java.time.LocalDate;

public class Vehiculo {
	private String matricula,marca,modelo;
	private int año, categoria;
	private boolean alquilado;
	private double ganancias;
	private static double gananciasTotales;
	private static int numAlquilados;
	private static final double tarifa1A=45, tarifa1B=30, tarifa2A=50, tarifa2B=40 ;
	
	public Vehiculo(String matricula, String marca, String modelo, int año, int categoria) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.categoria = categoria;
	}
	
	public double alquilar(int dias) {
		double precio=0;
		
		if (alquilado)
			return 0;
		
		alquilado=true;
		
		if (categoria==1) {
			if (dias<=2)
				precio=tarifa1A*dias;
			else
				precio=tarifa1B*dias;
		}
		else {
			if (dias<=2)
				precio=tarifa2A*dias;
			else
				precio=tarifa2B*dias;
		}
		
		ganancias+=precio;
		gananciasTotales+=precio;
		numAlquilados++;
		return precio;
				
	}
	
	public boolean devolver() {
		if (alquilado) {
			alquilado=false;
			numAlquilados--;
			return true;
		}
		return false;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	public static int getNumAlquilados() {
		return numAlquilados;
	}

	public double getGanancias() {
		return ganancias;
	}

	public static double getGananciasTotales() {
		return gananciasTotales;
	}
	

	public String getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", año=" + año
				+ ", categoria=" + categoria + ", alquilado=" + alquilado + ", ganancias=" + ganancias + "]";
	}
	
	public static boolean validarMatricula(String mat) {
		return mat.matches("[0-9]{4}[A-Za-z]{3}");
	}
	
	public static boolean validarAño(int año) {
		if (año>LocalDate.now().getYear())
			return false;
		return true;
	}
	
	
	
	
}
