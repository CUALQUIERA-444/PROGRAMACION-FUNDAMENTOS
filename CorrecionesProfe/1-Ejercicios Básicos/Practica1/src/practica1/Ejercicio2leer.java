package practica1;

import java.util.Scanner;

public class Ejercicio2leer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tu edad:");
		edad=sc.nextInt();
		
		System.out.println("MI EDAD:"+edad);
		//edad=edad+1;
		//edad++;
		//++edad;
		//edad+=1;
		System.out.println("MI EDAD EL PRÓXIMO AÑO:"+(edad+1));
	}

}
