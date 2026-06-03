package clases;

import java.time.LocalDate;

public class Tarjeta {
	private int numero;
	private int cuenta;
	private String titular;
	private double limite;
	private String tipo;
	private LocalDate caducidad;
	private String clave;
	private int bloqueada;
	//Esto es una tarjeta de credito
	public Tarjeta(int numero, int cuenta, String titular, double limite, String clave) {
		super();
		this.numero = numero;
		this.cuenta = cuenta;
		this.titular = titular;
		this.limite = limite;
		this.clave = clave;
		this.caducidad = LocalDate.now().plusYears(1);
		this.tipo = "C";
		this.bloqueada = 0;
	}
	//Esto es una tarjeta de debito
	public Tarjeta(int numero, int cuenta, String titular, String clave) {
		super();
		this.numero = numero;
		this.cuenta = cuenta;
		this.titular = titular;
		this.clave = clave;
		this.tipo = "D";
		this.bloqueada = 0;
	}
	public int getNumero() {
		return numero;
	}
	public int getCuenta() {
		return cuenta;
	}
	public String getTitular() {
		return titular;
	}
	public double getLimite() {
		return limite;
	}
	public String getTipo() {
		return tipo;
	}
	public LocalDate getCaducidad() {
		return caducidad;
	}
	public String getClave() {
		return clave;
	}
	public int getBloqueada() {
		return bloqueada;
	}
	@Override
	public String toString() {
		return "Tarjeta [numero=" + numero + ", cuenta=" + cuenta + ", titular=" + titular + ", limite=" + limite
				+ ", tipo=" + tipo + ", caducidad=" + caducidad + ", clave=" + clave + ", bloqueada=" + bloqueada + "]";
	}
	
}
