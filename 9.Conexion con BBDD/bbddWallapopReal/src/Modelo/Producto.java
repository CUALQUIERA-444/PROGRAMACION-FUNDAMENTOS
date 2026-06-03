package Modelo;

public class Producto {
private int id_producto;
private String nombre;
private String descripcion;
private double precio;
private int id_usuario;
private String estado;
private String categoria;
public Producto() {
}
public Producto(int id_producto, String nombre, String descripcion, double precio, int id_usuario, String estado,
		String categoria) {
	super();
	this.id_producto = id_producto;
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.precio = precio;
	this.id_usuario = id_usuario;
	this.estado = estado;
	this.categoria = categoria;
}
public int getId_producto() {
	return id_producto;
}
public void setId_producto(int id_producto) {
	this.id_producto = id_producto;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public int getId_usuario() {
	return id_usuario;
}
public void setId_usuario(int id_usuario) {
	this.id_usuario = id_usuario;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
@Override
public String toString() {
	return "Producto [id_producto=" + id_producto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio="
			+ precio + ", id_usuario=" + id_usuario + ", estado=" + estado + ", categoria=" + categoria + "]";
}

}
