package Ejercicio17_1;

import java.time.LocalDate;

/*
 * 1. Automóviles. Tenemos dos ficheros:
auto.info: contiene separado por comas la matrícula, fecha de compra, precio y el dni
del propietario.
Propietario.info: contiene separado por comas el dni del propietario, su nombre y
apellido.
Recorrer propietario.info y crear un hashMap con clave el DNI, en el que guardamos
todos los propietarios.
Recorrer auto.info y crear un LinkedList con los datos del auto de cada línea (si la
fecha es incorrecta, o si no existe el propietario se escribe un error en un archivo log y
se pasa a la siguiente línea).
Insertar en el linkedList los automóviles ordenados por fecha de compra de más
antigua a más reciente, y a misma fecha, ordenado de menor a mayor precio.
Volcar en un fichero (baratos.txt) todos los automóviles del LinkedList cuyo precio sea
inferior a 2000 euros, con el nombre y apellido de su propietario.
 */
public class Auto {
  private String matricula;
  private String DNI;
  private double precio;
  private LocalDate fecha_compra;
  
  public Auto(String matricula, String dNI, double precio, LocalDate fecha_compra) {
	super();
	this.matricula = matricula;
	DNI = dNI;
	this.precio = precio;
	this.fecha_compra = fecha_compra;
}
  public String getMatricula() {
	return matricula;
  }
  public String getDNI() {
	return DNI;
  }
  public double getPrecio() {
	return precio;
  }
  public LocalDate getFecha_compra() {
	return fecha_compra;
  }
  @Override
  public String toString() {
	return "Auto [matricula=" + matricula + ", DNI=" + DNI + ", precio=" + precio + ", fecha_compra=" + fecha_compra
			+ "]";
  }
  
}
