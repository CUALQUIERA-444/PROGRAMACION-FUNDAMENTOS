package Modelo;

public class Usuario {
	private String email;
	private String nombre;
	private String ciudad;
	private double valoracion;
	public Usuario(String email, String nombre, String ciudad, double valoracion) {
		super();
		this.email = email;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.valoracion = valoracion;
	}
	public Usuario() {
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public double getValoracion() {
		return valoracion;
	}
	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}
	@Override
	public String toString() {
		return "Usuario [email=" + email + ", nombre=" + nombre + ", ciudad=" + ciudad + ", valoracion=" + valoracion
				+ "]";
	}
	
}
