package ejerciciosarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String personas[]=new String[5];
		String persona;
		int ventas[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<personas.length;i++) {
			System.out.println("Introduce nombre persona:");
			personas[i]=sc.nextLine();
		}
		
		Arrays.sort(personas);
		
		for(int i=0;i<personas.length;i++) {
			System.out.println("Introduce ventas de "+personas[i]+":");
			ventas[i]=sc.nextInt();
		}
		sc.nextLine(); //Limpio buffer
		int pos;
		do {
			System.out.println("Anota persona a buscar:");
			persona=sc.nextLine();
			pos=buscar(personas,persona);
			if (pos==-1)
				System.out.println("No existe esa persona");
		}while(pos==-1);
		
		System.out.println("Sus ventas han sido de "+ventas[pos]+" unidades");
		

	}
	
	public static int buscar(String per[],String persona) {
		for(int i=0;i<per.length;i++)
			if (per[i].equalsIgnoreCase(persona))
				return i;
		
		return -1;
	}

}
