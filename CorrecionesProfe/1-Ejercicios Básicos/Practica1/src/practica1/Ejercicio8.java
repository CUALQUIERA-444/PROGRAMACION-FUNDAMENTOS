package practica1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long segundos,hor,min,seg,segres,minres;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el número de segundos a convertir:");
		segundos=entrada.nextLong();
		min=segundos/60;
		segres=segundos%60;
		hor=min/60;
		minres=min%60;
		System.out.println(hor+" horas "+minres+" minutos "+segres+" segundos ");
		
	}

}
