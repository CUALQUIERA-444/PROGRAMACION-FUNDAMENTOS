package ej3_cargamentos;

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


	public String getFruta() {
		return fruta;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public double getKilos() {
		return kilos;
	}
	
	
	

	
}
