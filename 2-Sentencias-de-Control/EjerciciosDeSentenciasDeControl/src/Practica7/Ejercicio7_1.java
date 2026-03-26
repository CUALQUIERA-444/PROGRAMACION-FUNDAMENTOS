package Practica7;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 1. En una empresa se rellena una ficha por cada empleado con los siguientes
datos:
 Número de empleado
 Sueldo
 Horas extras
 Precio hora extra
 Otros ingresos
Algoritmo que escribe aquellos empleados(su número) que reciben más de 600
€ al mes, así como lo que perciben. El proceso termina cuando el número de
empleado es 0. Se utilizarán un método para calcular el salario final
flota calcularSalario(float sueldo, int horas, float precioHora, float otros)
	 */
/*
 * Lógica 
 * Lo que hay que hacer es coger el numero de empleado y su salario base e ir calculando en base a sus a otros ingresos 
 */
/*
 * Variables Sentencias de control "Funciones"
 * Una variable que recoja el numero de empleado (int)
 * Otra el sueldo inicial (double)
 * Otra las horas extra que trabaje (int)
 * Otra que recoja el salario por hora extra (double)
 * Otra los ingresos que pueda tener (double)
 * Un if que si es mayor devuelva 
 */
	Scanner sc = new Scanner (System.in);
	sc.useLocale(Locale.ENGLISH);
	int numero_empleado;
	float salario_inicial;
	int horas_extra;
	float salario_hora = 0;
	float ingresos_extra;
	do {
	salario_hora = 0; //Evita que si al entrar al if de horas_extra este aun sin entrar se quede con el valor de la persona previa
	System.out.println("Introduce tu número de empleado");
	numero_empleado = sc.nextInt();
	if(numero_empleado != 0) { //Evita que cuando se introduzca 0 se siga ejecutando el codigo 
	System.out.println("Introduce tu salario mensual");
	salario_inicial = sc.nextFloat();
	System.out.println("Introduce las horas extra que llege a trabajar");
	horas_extra = sc.nextInt();
	if(horas_extra > 0) {
		System.out.println("Introduce el salario que percibe por hora trabajada");
		salario_hora = sc.nextFloat();
	}
	System.out.println("Introduzca los ingresos extra que llegue a percibir");
	ingresos_extra = sc.nextFloat(); 
	float salario_total = calcularSalario(salario_inicial,horas_extra,salario_hora,ingresos_extra); //En las funciones por lo general lo que se hace es pasar lo necesario además siempre 
	if(salario_total != 0) { //Si pones una funcion es necesario pasar parametros ya que caso contrario no se podria comparar pero la guardaremos en 
		System.out.println("Empleado numero "+numero_empleado+" Salario total "+salario_total+" euros");												//una variable
	}
	}
	} while (numero_empleado != 0);
	}
	public static float calcularSalario (float salario_base, int horas_adicionales, float salario_h , float ingresos) {
		float salario_total = 0;
		float salario_auxiliar;
		salario_auxiliar = salario_base + horas_adicionales * salario_h + ingresos;
		if (salario_auxiliar > 600)  
			salario_total = salario_auxiliar;
		return salario_total; //Necesario inicializar al principio ya que puede creer que nunca se ha inicializado
	}
}
