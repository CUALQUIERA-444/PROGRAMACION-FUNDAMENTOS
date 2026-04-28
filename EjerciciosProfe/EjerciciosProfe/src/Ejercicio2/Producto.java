package Ejercicio2;

public class Producto {
	private String nombre;
	private double coste_unidad;
	private double precio_venta;
	private int unidades;
	public Producto(String nombre, double coste_unidad, double precio_venta, int media) {
		// TODO Auto-generated constructor stub
	this.nombre = nombre; //this identifica al atributo cuando tiene el mismo nombre que el parametro
	this.coste_unidad = coste_unidad;
	this.precio_venta = precio_venta;
	media = unidades;
	}
	public Producto () {
	}
	public double beneficio() {
		return (precio_venta * unidades) - (unidades * coste_unidad);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCoste_unidad() {
		return coste_unidad;
	}
	public void setCoste_unidad(double coste_unidad) {
		this.coste_unidad = coste_unidad;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
}
