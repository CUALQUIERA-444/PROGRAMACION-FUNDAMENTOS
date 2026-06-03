package Ejercicio15_3;

import java.util.Objects;

/*
 * 3. Simulad el comportamiento de una cola de usuarios en la taquilla de un cine
usando una linkedList. Inicialmente se anotan el número de entradas disponibles.
Haced un menú con tres opciones:
1. Llegada de un usuario a la cola del cine. Se le pide el nombre y el número de
entradas, se le guarda el usuario al final de la cola.
2. Un usuario compra sus entradas. Se saca el primer usuario de la cola. El
usuario o compra todas las entradas que tenía pensado comprar o ninguna,
es decir, si no quedan suficientes entradas disponibles se va sin comprar
ninguna. Si después de comprar se agotan las entradas, se eliminan a todos
los usuarios de la cola y se sale del menú.
3. Un usuario random abandona la cola
 */
public class Usuario {
	private int entradas_solicitadas;
	private String nombre;
	//Las entradas disponibles no son algo del usuario 
	public Usuario(int entradas_solicitadas, String nombre) {
		this.entradas_solicitadas = entradas_solicitadas;
		this.nombre = nombre;
	}
	public void Compra() {
	    entradas_solicitadas = 0;
	}
	@Override
	public String toString() {
		return "Usuario [entradas_solicitadas=" + entradas_solicitadas + ", nombre=" + nombre + "]";
	}
	public int getEntradas_solicitadas() {
		return entradas_solicitadas;
	}
	public String getNombre() {
		return nombre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(entradas_solicitadas, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return entradas_solicitadas == other.entradas_solicitadas && Objects.equals(nombre, other.nombre);
	}
	
}
