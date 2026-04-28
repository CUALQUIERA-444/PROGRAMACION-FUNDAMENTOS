package Ejercicio3;

public class Vehículo {
	private String marca;
	private String modelo;
	private String matricula;
	private double precio;
	public Vehículo(String marca, String modelo, String matricula,double precio) {
		// TODO Auto-generated constructor stub
	 this.marca = marca;
	 this.modelo = modelo;
	 this.matricula = matricula;
	 this.precio = precio;
	}
	public Vehículo() {
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
