package ejexcepciones;

import java.util.*;
public class Excepciones1 {
	
// Programa que lee dos nï¿½meros y calcula su divisiï¿½n.
// Controla mediante excepciones que no se anote un dato no numï¿½rico
// y que no se divida por cero

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1=0,numero2=0,div=0;
		Scanner sc=new Scanner(System.in);
		boolean correcto=false;
		
		while(!correcto) {
		
			try {
				System.out.println("Anota primer numero:");
				numero1=sc.nextInt();
			
				correcto=true;
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("Formato primer número incorrecto");
				
			}
		}
		System.out.println("Número leido:"+numero1);
		
		correcto=false;	
		while(!correcto) {
				
				try {
					System.out.println("Anota segundo número:");
					numero2=sc.nextInt();
				
					correcto=true;
				}catch(InputMismatchException e) {
					sc.nextLine();
					System.out.println("Formato segundo número incorrecto");
					
				}
			
		}
		
		System.out.println("Número leido:"+numero2);
		
		try {
			div=numero1/numero2;
			System.out.println("La división es:"+div);
		}catch(ArithmeticException e) {
			System.out.println("No se puede dividir por cero");
		}
		
		
	}

}

