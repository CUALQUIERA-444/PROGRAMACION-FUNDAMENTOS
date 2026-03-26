package Practica1;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* 3. Programa en el que declaramos dos variables reales con el valor que queramos y
mostramos la siguiente salida
5.6666666 + 3.4444444= 9,11111
(Utiliza los valores que tú quieras)
*/
		//Cuando hablamos de variables reales hablamos por lo general de los decimales
		
		//Es necesario poner los decimales a la derecha cuantos quieras que se muestran
		double n1 = 5.6666666;
		double n2 = 6.5555555;
		System.out.println(n1+" + "+n2+" = "+(n1+n2));
		
		//Si si quisiera mostrar en formato float se hace esto
		//La razon por la que java por defecto usa double es por que cuando pones un decimal (.) java por defecto intuye un double
		//Entonces cuando intentas imprimir un decimal java se "asusta" por que cree que vas a perder informacion con esto
		//Para ponerlo en contexto es como sacar 2 litros de agua de una jarra que permite 2 litros y meterlo en un vaso que solo puede
		//contener 1 litro
		//Para imprimir decimales en formato float entonces es necesario ponerles despues del valor el sufijo f.
		float n1_1 = 5.6666666f;
		float n2_1 = 6.5555555f;
		System.out.println(n1_1+" + "+n2_1+" = "+(n1_1+n2_1));
		
		
		//No deja imprimir decimales a la derecha 
		//Cuando se intenta 
		//Java siempre se encarga de eliminar los decimales a la derecha que no aporten información al valor 
		
		//PARA FORZAR ESTO HACEMOS LO SIGUIENTE
		//Para usar lo de la impresion de un nunero con un numero determinado de decimales se requiere usar printf
		float n1_2= 5.66666666f;
		float n2_2 = 6.5555555f;
		//Lo que hace el %.3f es definir una mascara para la representacion
		//Permitiendo 3 decimales a la derecha escritos (redondeado)
	System.out.printf("%.3f + %.3f = %.3f\n",n1_2,n2_2,(n1_2+n2_2));
	
	//Para el double es igual 
	double n3_1= 5.66666666;
	double n3_2 = 6.5555555;
	
System.out.printf("%.3f + %.3f = %.3f\n",n3_1,n3_2,(n3_1+n3_2));

	float prueba1 = 0.2f;
	float prueba2 = 0.1f;
	float resultado = prueba1+prueba2;
	System.out.println(resultado);

	}
}
