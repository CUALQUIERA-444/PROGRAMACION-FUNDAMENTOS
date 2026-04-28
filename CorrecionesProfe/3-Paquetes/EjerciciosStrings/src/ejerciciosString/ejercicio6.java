package ejerciciosString;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra;
		boolean igual=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce palabra:");
		palabra=sc.nextLine();
		
		for(int i=0,j=palabra.length()-1; i<j ;i++,j--)
			if (palabra.charAt(i)!=palabra.charAt(j)) {
				igual=false;
				break;
			}
		
		if (igual)
			System.out.println("Se lee igual del derecho que del revés");
		else
			System.out.println("No se lee igual del derecho que del revés");
				
		
		
	}

}
