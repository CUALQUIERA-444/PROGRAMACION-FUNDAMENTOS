package Ejercicio1;
//Se escriben los nombre de las clases con la primera letra en mayuscula y en singular
public class Empleado {
	private String nombre;
	private String apellido;
	private double salario_anual;
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	public Empleado(String nombre, String apellido, double salario_anual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario_anual = salario_anual;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getSalario_anual() {
		return salario_anual;
	}
	public void setSalario_anual(double salario_anual) {
		this.salario_anual = salario_anual;
	}
	public double salarioMensual() { //Los metodos del objeto pueden utilizar los atributos de la clase y a otros métodos 
		return salario_anual / 12;
	}
	public double extra(double porcentaje) {
		return salario_anual * porcentaje / 100 + 1000;
	}
}
