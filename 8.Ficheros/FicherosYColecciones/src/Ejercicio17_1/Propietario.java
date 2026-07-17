package Ejercicio17_1;
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
public class Propietario {
  private String dni;
  private String nombre;
  private String apellido;
  
  public Propietario(String dni, String nombre, String apellido) {
	super();
	this.dni = dni;
	this.nombre = nombre;
	this.apellido = apellido;
}
  public String getDni() {
	return dni;
  }
  public String getNombre() {
	return nombre;
  }
  public String getApellido() {
	return apellido;
  }
  @Override
  public String toString() {
	return "Propietario [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
  }
  
}
