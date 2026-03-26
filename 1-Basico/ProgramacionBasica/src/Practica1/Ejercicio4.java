package Practica1;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4. Programa que calcula la longitud de una 
		circunferencia de radio 3 metros (2πr)
		*/
		
	//Calcular la longitud de una circunferencia
	//Para calcular la longitud de una circunferencia (perimetro del circulo=
	//Se utiliza el valor del radio (r) o del diametro (d)
	//Las 2 formas son las siguientes
	
	//Longitud = 2 x pi x radio
	//Longitud = pi x diametro 
	//Al tener el radio usaremos la primera formula
		
	//Como tenemos variables constantes usaremos final 
	final double pi = 3.1416;
	final int factorConstante = 2; //Reglas de declaración ÑiÑiÑi 
	double radio = 3 ;
	double longitudTotal = factorConstante * pi * radio; //El resultado sera double 
	System.out.println("La longitud total de la circunferencia es de "+longitudTotal+" metros");
	//Alternativa con solo 1 decimal
	System.out.printf("La longitud total de la circunferencia es de %.1f metros",longitudTotal);
	}

}
