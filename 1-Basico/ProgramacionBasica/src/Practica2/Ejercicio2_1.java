package Practica2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. Repetir los ejercicios de la hoja 1 modificando el código para introducir los
		valores de las variables desde teclado.
		*/
		/*1-2. Programa en el que declaramos una variable entera con valor nuestra edad y
		escribimos la siguiente salida:
		MI EDAD: aparecerá el valor
		MI EDAD EL PRÓXIMO ANYO: aparecerá el correspondiente valor
		*/
		int edad;
		int añoQueViene_edad;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Introduce tu edad");
		edad = sc.nextInt();
		añoQueViene_edad = edad + 1;
		System.out.println("MI EDAD: "+edad);
		System.out.println("MI EDAD EL PRÓXIMO AÑO: "+añoQueViene_edad);
		/* 3. Programa en el que declaramos dos variables reales con el valor que queramos y
		mostramos la siguiente salida
		5.6666666 + 3.4444444= 9,11111
		(Utiliza los valores que tú quieras)
		*/
		double n1;
		double n2;
		double resultado;
		System.out.println("Introduce un número decimal");
		n1 = sc.nextDouble();
		System.out.println("Introduce un segundo número decimal");
		n2 = sc.nextDouble();
		resultado = n1+n2;
		System.out.printf("%.7f + %.7f = %.7f\n",n1,n2,resultado);
		
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
	final double factor_constante = 2, pi = 3.1416;
	double radio;
	double longitud;
	System.out.println("Introduce el radio de tu circunferencia para calcular la longitud");
	radio = sc.nextDouble(); 
	longitud = factor_constante * pi * radio;
	System.out.printf("La longitud de su circunferencia es de %.1f metros cuadrados \n",longitud);
	/*5. Programa que calcula el área de una circunferencia de radio 5,2 centímetros
	(π r2 )
	*/
	//Para calcular el area de una circunferencia se usa la siguiente formula
	//Area = pi x radio al cuadrado
	double area = pi * radio * radio; //Estatico con los valores hasta que se cambie el valor de area
	System.out.printf("Area con el radio previo %.1f metros \n",area);
	System.out.println("Introduzca otro radio distinto para calcular el area de su circunferencia");
	radio = sc.nextDouble();
	area = pi * radio * radio;
	System.out.printf("Area con el radio nuevo %.1f metros cuadrados \n",area); 
	/*6. Programa en el que declaramos las variables edad, estudios, ingresos (decidir cuál
	es el tipo de dato más adecuado para cada una) y les damos una valor. Almacenar
	en una variable booleana jasp el valor:
	Verdadero si la edad es inferior a 28, el nivel de estudios es mayor que tres y los
	ingresos superan los 28.000 €
Falso en caso contrario
*/
	final int edad_maxima = 28, estudios_mayor = 3;
	final double ingresos_minimos = 28000;
	int edad_2,nivel_estudios;
	double ingresos;
	boolean jasp;
	System.out.println("Introduzca una edad distinta a la previa");
	edad_2 = sc.nextInt();
	System.out.println("Introduzca su nivel de estudio \"Formato númerico\"");
	nivel_estudios = sc.nextInt();
	System.out.println("Introduzca sus ingresos");
	ingresos = sc.nextDouble();
	sc.nextLine(); //Se requiere "limpiar el buffer en caso de leer un double int o boolean y lo que se vaya a leer 
				   //Despues es un string o un char ya que si no cojen un salto de linea invisible
	jasp = (edad_2 < edad_maxima) && (estudios_mayor < nivel_estudios) && (ingresos > ingresos_minimos);
	System.out.println("El resultado es "+jasp);
	/* 7.Programa que dadas dos variables a y b, 
	 * intercambie sus valores
	 */
	//Se requiere una tercer variable
	char a;
	char b;
	char c;
	System.out.println("Introduzca una letra que sera asignada a la variable a");
	a = sc.nextLine().charAt(0);
	System.out.println("Introduzca una letra que sera asignada a la variable b");
	b = sc.nextLine().charAt(0); 
	c = a;
	a = b;
	b = c;
	System.out.println("Sus valores intercambiados "+a+" "+b);
	/*8.Programa que dada una variable t que contiene un tiempo en segundos, nos
	muestre dicho tiempo expresado en horas, minutos y segundos.
	*/
	final int horas_determinadas = 24, minutos_determinados = 60, segundos_determinados = 60;
	int t;
	int minutos;
	int horas;
	System.out.println("Introduce los segundos");
	t = sc.nextInt();
	minutos = t / 60;
	horas = t / 3600; //Si ocurren cosas raras revertir la linea suele funcionar
	System.out.println("Resultado crudo");
	System.out.println(horas+":"+minutos+":"+t);
	t = t % segundos_determinados;
	minutos = minutos % minutos_determinados;
	horas = horas % horas_determinadas;
	System.out.println("Resultado en formato reloj");
	System.out.println(horas+":"+minutos+":"+t);
	}
}
