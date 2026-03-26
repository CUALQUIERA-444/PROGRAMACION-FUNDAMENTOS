package Practica1;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6. Programa en el que declaramos las variables edad, estudios, ingresos (decidir cuál
				es el tipo de dato más adecuado para cada una) y les damos una valor. Almacenar
				en una variable booleana jasp el valor:
				Verdadero si la edad es inferior a 28, el nivel de estudios es mayor que tres y los
				ingresos superan los 28.000 €
		Falso en caso contrario
		*/
		int edad = 29;
		int nivel_estudio = 4;
		double ingresos = 28000.1; //El punto es para los decimales
		//No necesariamente se necesita un if
		boolean jasp = (edad > 28) && (nivel_estudio > 3) && (ingresos > 28000);
		System.out.println("La respuesta es "+jasp);
	}
}
