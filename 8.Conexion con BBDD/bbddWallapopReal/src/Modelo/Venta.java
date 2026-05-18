package Modelo;
import java.time.*;
public class Venta {
	private String codigo;
	private String emailComprador;
	private double precioventa;
	private LocalDate fecha;
	public Venta(String codigo, String emailComprador, double precioventa, LocalDate fecha) {
		super();
		this.codigo = codigo;
		this.emailComprador = emailComprador;
		this.precioventa = precioventa;
		this.fecha = fecha;
	}
	public Venta() {
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getEmailComprador() {
		return emailComprador;
	}
	public void setEmailComprador(String emailComprador) {
		this.emailComprador = emailComprador;
	}
	public double getPrecioventa() {
		return precioventa;
	}
	public void setPrecioventa(double precioventa) {
		this.precioventa = precioventa;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Venta [codigo=" + codigo + ", emailComprador=" + emailComprador + ", precioventa=" + precioventa
				+ ", fecha=" + fecha + "]";
	}
	
}
