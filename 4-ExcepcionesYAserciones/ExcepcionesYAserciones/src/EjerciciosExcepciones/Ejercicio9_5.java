package EjerciciosExcepciones;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 5. Realizar un programa que quiere calcular el total de emisiones de CO2 de varios
vehículos en una ciudad, terminad al anotar F. Hacer una función que reciba el
tipo de distintivo del vehículo (0,E,C,B) y los kms recorridos y devuelva las
emisiones de co2. Por cada km según el tipo de distintivo se producen las
siguientes emisiones:
Estos son los factores de emision
0: cero kg/km
E: 0.001 kg/km
C: 0.02 kg/km
B: 0.05 kg/km
Si la función recibe un distintivo que no es ninguno de los anteriores, devuelve
una excepción propia DistintivoErroneoException.
 */ 
/*Lógica, código necesario y anotaciones
 * Las emisiones de CO2 Consisten en la liberación de dióxido de carbono a la atmósfera,
 *  principalmente por la quema de combustibles fósiles (carbón, petróleo, gas), 
 *  la deforestación y procesos industriales
 * Dicho esto para calcular los factores de emision se sigue la siguiente formula
 * EMISIONES DE CO2 = KM RECORRIDOS * FACTOR DE EMISIÓN (KG DE EMISIÓN POR KM) 
 * 	Esto varía un poco si hablamos de gramos puesto que lo recomendable es aplicar esta formula en kg o toneladas para un 
 * resultado más preciso 
 * Una vez entendido esto la idea del ejercicio es simplemente dejar que el usuario anote el tipo de distintivo
 * con un (char) y posteriormente los km recorridos (double) puesto que nosotros tenemos el factor de emisión por km
 * en kg nosotros lo que tenemos que hacer es simplemente multiplicar los kms dados x el dato correpondiente al distintivo
 * ahora bien si el distintivo es incorrecto se lanza una excepción propia llamada DistintivoErroneoException
 * Vamos a hacer tambien que mientras el usuario introduzca algo que no este entre 0 y 100 en los km salte una excepcion 
 * propia para evitar errores en la introduccion de datos
 * Si el distintivo es F el programa MUERE
 * 
 */
	Scanner sc = new Scanner (System.in);
	sc.useLocale(Locale.ENGLISH);
	char distintivo = ' ';
	double km_recorridos;
	double emisiones_CO2; 
	do {
	System.out.println("Introduce el tipo de distintivo de su vehículo (0|E|C|B) (SI quiere acabar el programa introduzca F)");
	try {
		distintivo = sc.nextLine().toUpperCase().charAt(0); //Coge el string lo pasa a mayuscula se queda solo con el primero fin
		if(distintivo != 'F') {
		EmisionesMultiTarea(distintivo,0); //Hace comprobación rápida
		System.out.println("Introduce los kilometos recorridos");
		km_recorridos = sc.nextDouble();
		sc.nextLine(); //Limpiar Buffer en cualquier caso realmente excepcion o no
		emisiones_CO2 = EmisionesMultiTarea(distintivo,km_recorridos);
		System.out.println(emisiones_CO2+" kg/km");
	}
	}
	catch (DistintivoErroneoException e){ 
		System.out.println(e.getMessage());
	}
	catch (InputMismatchException e) {
		System.out.println("Deben ser números los que introduzca");
		sc.nextLine(); //Limpia el buffer si salta aca,
	}
	catch (RangoInvalido e) { //Esto salta en la linea emisiones_CO2 por lo que scanner se limpia
		System.out.println(e.getMessage());
	}
	/*finally {
		sc.nextLine();
	}
	*/ //No esta bien se ejecuta si el dato procesado (Double es correcto)
	}
	 while (distintivo != 'F');
	System.out.println("Gracias por ejecutarme");
	}
	public static double EmisionesMultiTarea (char d, double km) throws DistintivoErroneoException,RangoInvalido{
		final double a = 0,b = 0.001, c = 0.02, e= 0.05;
		if(km <  0 || km > 100) {
			throw new RangoInvalido("Rango de kilometros invalido");
		}
		switch (d) {
		case '0':
		return a * km;
		case 'E':
		return b * km;
		case 'C':
		return c * km;
		case 'B': //En caso de que corresponda diferentes cosas suceden
		return e * km;
		default:
		throw new DistintivoErroneoException("Tipo de dato no válido tiene que introducir los datos mencionados previamente");
	}
	}
}
