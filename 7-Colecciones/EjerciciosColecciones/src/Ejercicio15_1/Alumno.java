package Ejercicio15_1;

import java.util.Objects;

/*
//Todos los ejercicios que tengan la coleccion definida por lo genera se suelen cambiar
1. Programa que lleve en un ArrayList la información de una serie de alumnos,
por cada alumno se guarda su nombre y su nota. Se pide hacer un menú que permita:
1. Dar de alta a un alumno, comprobando que no existe previamente en el
ArrayList. 
2. Modificar la nota de un alumno dado.
3. Sustituir un alumno por otro anotado por teclado.
4. Borrar un alumno dado su nombre.
5. Nos dice si un alumno está en el ArrayList /Clase. Lo normal es por nombre nadie en su sano juicio busca a su hijo usando su nombre y su nota
//Teoricamente todas las cosas que me piden se pueden verificar en el ArrayList
/// Bueno realmente no se algunos seguro 
*/
public class Alumno {
	private double nota; //Algo que pertenece a un alumno que ya existe 
	private String nombre;


	public Alumno(double nota, String nombre) {
		this.nota = nota;
		this.nombre = nombre;
	}
	public Alumno (String nombre) {
		this.nombre = nombre;
	} //Puede modificar su nota
	
	public boolean equals(Object obj) { //NO
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	public String getNombre() {
		return nombre;
	}
	@Override
	public String toString() {
		return "Alumno [nota=" + nota + ", nombre=" + nombre + "]";
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
}

