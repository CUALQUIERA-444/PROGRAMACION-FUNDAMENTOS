package ejemplosarrays;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo4_ini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double media = 0,tempMax,tempMin;
		boolean encontrado=false;
		String dia;
		String dias[] = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };
		double temperaturas[] = new double[7];

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);

		for (int i = 0; i < dias.length; i++) {
			System.out.println("Introduce temperatura del " + dias[i]);
			temperaturas[i] = sc.nextDouble();
			media += temperaturas[i];
		}

		System.out.println("La temperatura media es:" + media / 7);
		sc.nextLine(); //Limpio buffer
		System.out.println("Anota día de la semana para saber su temperatura:");
		dia = sc.nextLine();
		int pos=-1;
		for(int i=0;i<dias.length;i++) {
			if (dias[i].equalsIgnoreCase(dia)) {
				pos=i;
				break;
			}
		}
		if (pos==-1)
			System.out.println("Dia no encontrado");
		else
			System.out.println("Ese día había:"+temperaturas[pos]+" grados");
		
		tempMax=tempMin=temperaturas[0];
		
		for(int i=1;i<temperaturas.length;i++) {
			if (tempMax<temperaturas[i])
				tempMax=temperaturas[i];
		    if (tempMin>temperaturas[i])
		    	tempMin=temperaturas[i];
		}
		
		System.out.println("Temperatura máxima:"+tempMax);
		System.out.println("Temperatura mínima:"+tempMin);
	}
}
