package Comerciales;

public class Fijo extends Comercial{
	private static double fijo;
	private static double comision=5;
	public Fijo(String nombre) {
		// TODO Auto-generated constructor stub
		super(nombre);
	}
	public static void setFijo(double fijo) {
		Fijo.fijo = fijo;
	}
	@Override
	public String toString() {
		return "Fijo [nombre=" + nombre + ", numero=" + numero + ", marcaA=" + marcaA + ", marcaB=" + marcaB
				+ ", marcaC=" + marcaC + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
