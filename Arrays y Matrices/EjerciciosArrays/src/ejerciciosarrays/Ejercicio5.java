package ejerciciosarrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ventas[]=new int[6];
		int pos, vendido;
		String comerciales[]=new String[6];
		String respuesta, comercial;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el nombre de los comerciales");
		
		for(int i=0; i<comerciales.length ;i++) {
			System.out.println("Anota nombre "+i+":");
			comerciales[i]=sc.nextLine();
		}
		
		do {
			System.out.println("Introduce comercial:");
			comercial=sc.nextLine();
			try {
				pos=buscaComercial(comerciales,comercial);
				System.out.println("Anota las ventas realizadas:");
				vendido=sc.nextInt();
				ventas[pos]=ventas[pos]+vendido;
			} catch (NoExisteComercialException e) {
				System.out.println(e.getMessage());
			}  
			catch(InputMismatchException a) {
				System.out.println("Introduce un número");
			}
			sc.nextLine();
			System.out.println("Quiere introducir otra cantidad:S/N");
			respuesta=sc.nextLine();
		}while(respuesta.equalsIgnoreCase("S"));
		
		System.out.println("Ventas totales:");
		for(int i=0;i<comerciales.length;i++) {
			System.out.println(comerciales[i]+":"+ventas[i]);
		}

	}
	
	public static int buscaComercial(String comerciales[],String comercial) throws NoExisteComercialException  {
		for(int i=0;i<comerciales.length;i++)
			if (comerciales[i].equalsIgnoreCase(comercial))
				return i;
		throw new NoExisteComercialException("No existe ese comercial");
	}

}
