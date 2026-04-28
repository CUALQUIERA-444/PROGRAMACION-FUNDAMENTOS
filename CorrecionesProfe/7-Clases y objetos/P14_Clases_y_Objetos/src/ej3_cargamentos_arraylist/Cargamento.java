package ej3_cargamentos_arraylist;

import java.util.Objects;

public class Cargamento {
	private String fruta, procedencia;
	private double kilos;
	private double precioCompra, precioVenta;
	private static double beneficio;
	
	public Cargamento(String fruta, String procedencia, double kilos, double precioCompra, double precioVenta) {
		this.fruta = fruta;
		this.procedencia = procedencia;
		this.kilos = kilos;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
	}
	
	
/**
 * Este constructor lo utilizamos para el indexOf del ArrayList
 * @param fruta
 * @param procedencia
 */
	public Cargamento(String fruta, String procedencia) {
		super();
		this.fruta = fruta;
		this.procedencia = procedencia;
	}



	@Override
	public String toString() {
		return "Cargamento [fruta=" + fruta + ", procedencia=" + procedencia + ", kilos=" + kilos + ", precioCompra="
				+ precioCompra + ", precioVenta=" + precioVenta + "]";
	}
	
	public boolean rebajar(double imp) {
		if (precioVenta-imp<precioCompra)
			return false;
		precioVenta-=imp;
		return true;
		
	}
	
	public double vender(double cantidad) {
		double importe=0;
		if (kilos>=cantidad) {
			kilos-=cantidad;
			importe=cantidad*precioVenta;
			beneficio=cantidad*(precioVenta-precioCompra);
			return importe;
		}
		return importe;	
	}
	
	public static boolean mismaProcedencia(Cargamento c1, Cargamento c2) {
		if (c1.procedencia.equalsIgnoreCase(c2.procedencia))
			return true;
		return false;
	}
	
	public boolean mismaProcedencia2(Cargamento c) {
		if (procedencia.equalsIgnoreCase(c.procedencia))
			return true;
		return false;
	}

	public static double getBeneficio() {
		return beneficio;
	}

	public static void setBeneficio(double beneficio) {
		Cargamento.beneficio = beneficio;
	}

	public String getFruta() {
		return fruta;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public double getKilos() {
		return kilos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fruta, procedencia);
	}

	/**
	 * Creo el equals para usar el indexOf del ArrayList
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cargamento other = (Cargamento) obj;
		return Objects.equals(fruta, other.fruta) && Objects.equals(procedencia, other.procedencia);
	}

	
	
	
	

	
}
