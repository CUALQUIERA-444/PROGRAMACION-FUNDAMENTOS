package Practica6;

import java.util.Scanner;

public class Ejercicio6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 6. Calcular el precio de la entrada a un parque de atracciones teniendo en cuenta lo siguiente:
Hay dos tarifas, reducida 16 euros (para menores de 7 años y mayores de 65) y normal 25
euros (para el resto). Todos los mayores de 18 años pueden sacar además ticket para ver la
actuación de un grupo de teatro con un coste adicional de 3 euros.
Para realizar el programa mostrar un menú con las opciones
 Comprar entrada: leer la edad de la persona y en el caso de que sea mayor de
edad preguntar si desea ver el teatro
 Cerrar taquilla:se muestra el importe total recaudado y se acaba el programa
 */
		/*
		 * Variables y sentencias de control
		 * Se requiere unas constantes para las edades (int)
		 * Un entero Para seleccionar las opciones (Todavia no usaremos Strings) entre 1 y 2 1 para iniciar la compra 2 para acabar todo(int)
		 * Un entero para la edad del usuario duh
		 * Un double para el total recaudado hasta el momento sumando todo el dinero
		 * Una constante para el precio adicional del teatro
		 * Un char para preguntar al usuario si quiere ver el teatro
		 * Una condicional para calcular el precio 
		 * Otra condicional para preguntar al usuario si quisiera ver el teatro y que hacer en caso de que quiera o no
		 * El bucle que sera un do-while
		 */
	Scanner sc = new Scanner (System.in);
	final int edad_descuentoN = 7 , edad_descuentoV = 65, precio_reducido = 16, precio_normal = 25, suplemento_teatro = 3, edad_teatro = 18;  
	double recaudacion_total = 0;
	int edad_usuario;
	int opciones;
	char teatro;
	do {
	System.out.println("Bienvenido al parque de atracciones por favor acerquese a la taquilla...");
	System.out.println("Presione las opciones que prefiera 1 para comprar y 2 para cerrar la taquilla");
	opciones = sc.nextInt();
	if(opciones == 1) { 
	System.out.println("Introduzca su edad");
	edad_usuario = sc.nextInt();
	if(edad_usuario < edad_descuentoN || edad_usuario > edad_descuentoV) {
		recaudacion_total = recaudacion_total + precio_reducido;
	}
	else {
		recaudacion_total = recaudacion_total + precio_normal;
			}
		if(edad_usuario > edad_teatro) {
			sc.nextLine(); //Limpiar buffer
			System.out.println("Desea ir al teatro \"S|N\" ");
			teatro = sc.nextLine().charAt(0);
			if(teatro == 'S' || teatro == 's') { //Java entiende que son distintas
				recaudacion_total = recaudacion_total + suplemento_teatro;
			}
			else if (teatro == 'N' || teatro == 'n') {
				System.out.println("Ok señor tenga buen día");
			}
		}
	}
	else {
		System.out.println("Se cerro la taquilla ");
	}
	} while (opciones == 1 );
	if (opciones == 1 || opciones == 2) {
		System.out.println("Se recaudo un total de "+recaudacion_total+" euros");
	}
	else 
		System.out.println("El numero que introdujo parece ser incorrecto vuelva a ejecutar el programa");
	}
}
