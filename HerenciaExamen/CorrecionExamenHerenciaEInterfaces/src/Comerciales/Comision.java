package Comerciales;

public class Comision extends Comercial {
	private static final double fijo = 10;
	private String acuerdo;
	
	public Comision(String nombre, String acuerdo) {
		super(nombre);
		this.acuerdo = acuerdo;
	}

	@Override
	public String toString() {
		return "Comision [acuerdo=" + acuerdo + ", nombre=" + nombre + ", numero=" + numero + ", marcaA=" + marcaA
				+ ", marcaB=" + marcaB + ", marcaC=" + marcaC + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

 
	
}
