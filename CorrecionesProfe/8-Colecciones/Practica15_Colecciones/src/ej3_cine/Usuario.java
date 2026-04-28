package ej3_cine;

import java.util.Objects;

public class Usuario {
	private String nombre;
	private int nEntradas;
	//private static int totalEntradas;
	
	public Usuario(String nombre, int nEntradas) {
		super();
		this.nombre = nombre;
		this.nEntradas = nEntradas;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", nEntradas=" + nEntradas + "]";
	}
	
	/**
	 * Simula la compra de entradas
	 * @return -1 si no hay sufientes entradas
	 *          el totalEntradas restantes si hay suficientes
	 */
	
	
	public String getNombre() {
		return nombre;
	}
	public int getnEntradas() {
		return nEntradas;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nEntradas, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return nEntradas == other.nEntradas && Objects.equals(nombre, other.nombre);
	}
	
	
	
	

}
