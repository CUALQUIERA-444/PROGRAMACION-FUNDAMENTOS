package Practica5;

public class Ejercicio5_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 20. Programa que muestra por pantalla los números del 1 al 100 sin mostrar
		 * aquellos números que sean múltiplos de 5.
		 */
		/*
		 * Lógica Basicamente un bucle que vaya mostrando cada número y si es múltiplo
		 * de 5 lo descarta aquellos que son múltiplo de 5 son aquellos que al
		 * multiplicarlos por 5 te da un número dicho numero si lo divides entre el
		 * multiplo te da resto 0 así que es cuestion de descartarlos y poco más
		 */
		/*
		 * Variables y sentencias de control un if Las del for y algunas constantes
		 * (opcional)
		 */
		final int inicio = 1, fin = 100, resto = 0, divisor = 5;
		for (int i = inicio; i <= fin; i++) {
			if (i % divisor != resto)
				System.out.print(i + " "); // Este ejercicio tambien se puede hacer con continue
		}
	}
}
