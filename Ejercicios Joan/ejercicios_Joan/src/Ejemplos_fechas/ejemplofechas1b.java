package Ejemplos_fechas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class ejemplofechas1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia, mes, año;
		boolean correcto=false;
		LocalDate fecha=null, fecha2;
		Scanner sc=new Scanner(System.in);
		do {
			
			System.out.println("anota el dia");
			dia=sc.nextInt();
			System.out.println("anota el mes");
			mes=sc.nextInt();
			System.out.println("anota el año");
			año=sc.nextInt();
			try {
				fecha=LocalDate.of(año, mes, dia);
				correcto=true;
			}catch(DateTimeException e) {
				System.out.println("fecha introducida incorrecta");
			}
		}while(correcto==false);
		System.out.println("fecha introducida correcta");
		fecha2=fecha.plusDays(5);
		System.out.println("cinco dias despues" +fecha2);
		fecha2=fecha.minusWeeks(2);
		System.out.println("dos semanas antes" +fecha2);
	}

}
