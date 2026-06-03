package Comerciales;

import java.util.Objects;

//Nota //Comercial 
		//Nombre
		//Numero
		//MarcaA, MarcaB, Marca C
		//Fijos 
		//Sueldo Fijo
		//Final comision = 5;
		//Comision 
		//Final double comision 
		//String Marca 
public class Comercial {
	protected String nombre;
	protected int numero;
	protected int marcaA,marcaB,marcaC;
	private static int numeroTotal = 0;
	
	public Comercial(String nombre) {
		this.nombre = nombre;
		numeroTotal++; //Dato igual para todos asignado a un cambiante
		numero = numeroTotal++;
	}
	public void vender(String marca,int unidades) {
		switch(marca) {
		case "A":
			marcaA = unidades + marcaA;
		break;
		case "B":
			marcaB = unidades + marcaB;
		break;
		case "C":
			marcaC = unidades + marcaC;
		break;
		}
	}
	@Override
	public String toString() {
		return "Comercial [nombre=" + nombre + ", numero=" + numero + ", marcaA=" + marcaA + ", marcaB=" + marcaB
				+ ", marcaC=" + marcaC + "]";
	}


	public int getNumero() {
		return numero;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comercial other = (Comercial) obj;
		return Objects.equals(nombre, other.nombre);
	}


	
	

}
