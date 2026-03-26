package Practica7;

import java.util.Scanner;

public class Ejercicio7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 6. Programa que lee fechas en formato dd( 1 al 31), mm ( 1 a 12) y aa (4 dígitos) y
obtiene el número de orden del día en el total del año.
Ejemplo:
3 de Febrero ............ día 34

Leer tantas fechas como el usuario quiera, utilizar un método que recibe dd ,
mm aa y retorna un entero.
 */
/* Nota Si es bisiesto el año tiene 366 días 
 * Cada mes tiene un numero distinto de dias Enero 31 Febrero 28 Marzo 31 Abril 30 Mayo 31 Junio 30 Julio 31 Agosto 31 Septiembre 30 Octubre 31 Noviembre 30 Diciembre 31
 */
	/*
	 * Lógica 
	 * Es importante que primero se valide que la fecha que introduce el usuario sea válida para así calcular correctamente los días
	 * Dependiendo del mes tendrá un grupo de dias u otro 
	 * Se requiere hallar un "patron" que permita buscar que dependiendo el numero introducido se ofrezca el numero correspondiente a determinada fecha
	 * No se parte de ningun sitio es decir si el usuario pone 31/12/2012 = 365 y luego pone 1/1/2013 se resetea hasta el día 1
	 * 
	 */
	/*
	 * Variables condiciones bucles funciones....
	 * Una que guarde la fecha del usuario y la validaremos usando condiciones y una funcionç
	 * Se le pedira esta fecha mientras el usuario no introduzca fechas validas 
	 */
	Scanner sc = new Scanner (System.in);
	int dia = 0; //Puede ser que ninguno de estos datos entre si el while no se cumple 
	int mes = 0;
	int numero;
	int año = 0;
	int dias_totales;
	int contador = 0; //Para que dependiendo lo que se este pidiendo la función ejecute una cosa u otra
	boolean validar = false;
	boolean bisiesto;
	char continuacion;
	do {
	while (validar == false) {
	System.out.println("Introduce el día de hoy \"Número\" ");
	dia = sc.nextInt();
	validar = ValidarFecha(dia,mes,año,contador);
	if (validar == false) {
		System.out.println("Lo siento ese dia no es valido");
	}
	else {
		contador++;
	}
	}
	validar = false;
	while (validar == false) {
		System.out.println("Introduce el mes actual \"Número\" ");
		mes = sc.nextInt();
		validar = ValidarFecha(dia,mes,año,contador);
		if (validar == false) {
			System.out.println("Lo siento ese mes no es valido o hay datos que no concuerdan entre el dia y el mes");
		}
		else {
			contador++;
		}
	}
	validar = false;
	while (validar == false) {
		System.out.println("Introduce el año actual \"Número\" ");
		año  = sc.nextInt();
		validar = ValidarFecha(dia,mes,año,contador);
		if (validar == false) {
			System.out.println("Lo siento ese año no es bisiesto");	
	}
}
		bisiesto = ((año % 4 == 0 && año % 100 !=0)  || año % 400 == 0); //Sin importar el dia se tiene que evaluar esto
		//Calcular numero en el año 
		/* Partiendo del 1 de enero
		 *  dia 10 del año = 10 de enero = 1 + 9  
		 *  dia 31 del año = 31 de enero = 1 + 30 
		 *  dia 2 de febrero = 33 de febrero = 1 + 32 = 33   
		 *  dia 20 de febrero = 51 de febrero = 50 + 1  = 31 + 20 = 51 
		 */
		numero = DiaAño(dia,mes,bisiesto);
		System.out.println(numero+" "+dia+"/"+mes+"/"+año);	
		sc.nextLine(); //Limpiar buffer
		do {
		System.out.println("Desea continuar? \"S|N\"");
		continuacion = sc.nextLine().charAt(0);
		continuacion = Character.toUpperCase(continuacion);
		if(continuacion !='S' && continuacion != 'N') {
			System.out.println("DEBE INTRODUCIR S O N");
		}
		} while (continuacion != 'S' && continuacion != 'N');
	validar = false; //Vuelve a entrar
	}
	while (continuacion == 'S');
	if (continuacion == 'N') {
		System.out.println("Ok terminamos");
	}
	}
	public static boolean ValidarFecha (int dia, int mes, int año, int cont) { //El código de validación no es perfecto pero cumple su proposito
		int dia_save = dia; //Inicializamos por posibilidad de que no entren Esto es "aceptable"
		int mes_save = mes;
		int año_save = año;
		boolean bisiesto;
		if (cont == 0) {
			if(dia_save < 1 || dia_save > 31) {
				return false; 
			}
		}
		else if (cont == 1) {
			if(mes_save < 1 || mes_save > 12) { //En el año se vera si es bisiesto o no 
				return false;
			} //Si se cumple no se ejecuta nada
			if(dia_save > 29 && mes_save == 2) { 
				return false;
			}
			if (dia_save == 31 && (mes_save == 4 || mes_save == 6 || mes_save == 9 || mes_save == 11) ) {
				return false;
			}
		}
		else {
		 bisiesto = ((año_save % 4 == 0 && año_save % 100 !=0)  || año_save % 400 == 0);
			if (dia_save == 29 && mes_save == 2 && bisiesto == false) { //Ordenadores empezaron a registrar el año en 1980
				return false;
			}
		}
		return true; //No puede retornar true hasta que todo sea correcto 
	}
	public static int DiaAño(int d, int m,boolean bis) {
		//Se requiere de un bucle for que es quien almacenara los días en función del mes 
		int dia_año = 0;
		for (int i = 1; i<m; i++) { //Cuando sea uno nunca entra cuando sea 2 se detiene quedando 31 
			dia_año = DiaMes(i,bis) + dia_año; // Ejemplo marzo 30 + 29 o 28 dependiendo del mes Pasamos i por que es el que va cambiando I = 1 1 = 31 I = 2 I = 31+29 o 31 + 28
		}
		return d+dia_año; //Hallar el dia consiste en sumar los dias que hacen los meses mas el dia correspondiente
		}
	public static int DiaMes(int ma, boolean bi) {
		switch(ma) { //No es necesario romper si se devuelve con un switch-case Priniciplamente por que no llega y por que el return ya hace la funcion del break
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			if(bi == false) {
				return 28;
			}
			else {
				return 29;
			}
		default: //Necesario por que puede ser que el switch case no devuelva algo (Que me deje compilar)
			return 30;
	}
	}
}