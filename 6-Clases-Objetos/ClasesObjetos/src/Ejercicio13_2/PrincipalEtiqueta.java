package Ejercicio13_2;

public class PrincipalEtiqueta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Programa que construye etiquetas. Una etiqueta es un recuadro de una altura y
		anchura determinada, realizado con un determinado carácter, por ej:

		++++++
		+    +
		++++++

		Etiqueta de altura 3, anchura 6, carácter ‘+’.
		Hacer un constructor, un método para mostrarla por pantalla y otro para
		modificar el carácter con el que se dibuja.
*/
/* 
 * Lógica codigo y notas 
 * Necesitamos que el código llame a una clase que le permita crear una representación
 * Grafica una vez hecho esto debemos programar 2 funciones que puedan 
 * Uno para mostrar el dibujo por pantalla y otro que se encarge de modificar
 * el caracter con el que se dibuja
 * EXTRA: SI SE PUEDE O ES RELATIVAMENTE SIMPLE VER SI SE PUEDE MODIFICAR cada vez que la altura sea impar 
 * dibujar solo una determinada parte de la etiqueta ejemplos
 * ++++++           ++++++				++++++
   +    +			++++++				++++++
   ++++++			++++++				+    +
   					++++++				++++++
   										++++++
 */
	int anchura = 6;
	int altura = 5 ;
	char caracter = '+';
	Etiqueta eti1 = new Etiqueta(anchura,altura,caracter); //"Procede a ocupar espacio en memoria"
	eti1.MostrarEtiqueta();
	eti1.ModificarCaracter(':');
	eti1.MostrarEtiqueta();
	}
}
