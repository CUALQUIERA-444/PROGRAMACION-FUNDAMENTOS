package Ejercicio15_9;
/*
 * 9. En una oficina de correos se quieren organizar las cartas que llegan. De cada
carta se guarda el apellido y nombre del destinatario, ciudad y país. Cada vez
que llega una carta a la oficina se coloca por orden alfabético en una colección
(elige la más adecuada).
Antes de guardar la carta en la LL anterior se comprueba que el país d de
destino es correcto, el país de destino sólo puede ser uno de 10 destinos
predeterminados al inicio del programa (usa la colección adecuada). Si el
destino no es correcto, la carta se coloca en el montón de excluidas (usa la
colección adecuada).
Las cartas se van extrayendo una a una de la colección inicial y se van
clasificando juntas las que tienen el mismo destino.
Mostrar en todo momento el contenido de todos los collection.
Hacer un menú que hasta que lo desee el usuario tenga las siguientes opciones:
1. Guardar carta ordenada. 2. Clasificar cartas. 3. Mostrar colecciones.
 */
public class Carta {
	private String apellido; //Suelen ordenarse en base a este campo
	private String nombre; //Suelen 
	private String ciudad;
	private String país;
	public Carta(String apellido, String nombre, String ciudad, String país) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.país = país;
	}
	public String getApellido() {
		return apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public String getPaís() {
		return país;
	}
	@Override
	public String toString() {
		return "Carta [apellido=" + apellido + ", nombre=" + nombre + ", ciudad=" + ciudad + ", país=" + país + "]";
	}
}
