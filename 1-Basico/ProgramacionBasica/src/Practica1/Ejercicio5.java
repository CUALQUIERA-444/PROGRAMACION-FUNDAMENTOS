package Practica1;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5. Programa que calcula el área de una circunferencia de radio 5,2 centímetros
		(π r2 )
		*/
		//Para calcular el area de una circunferencia se usa la siguiente formula
		//Area = pi x radio al cuadrado
		final double pi = 3.1416; 
		double radio = 5.2 * 5.2;
		double area = pi * radio; //El double se imprime en función de los decimales del resultado
		System.out.println("El área de la circunferencia es de "+area+" metros cuadrados");
		System.out.printf("El área de la circunferencia redondeado a 2 decimales es de %.2f metros cuadrados \n",area);
	}
}

