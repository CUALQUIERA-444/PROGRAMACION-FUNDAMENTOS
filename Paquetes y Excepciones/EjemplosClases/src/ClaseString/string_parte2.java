package ClaseString;

import java.util.Scanner;

public class string_parte2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Ejemplo de expresión regular
		String codigo;
		boolean cualquiera;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un patrón");
		codigo = sc.nextLine();
		String patrón = "^P[A-Z][0-9]{2,3}$";
		if ( codigo.matches (patrón)) {
			 cualquiera = true;
			System.out.println(cualquiera);
		} 
		else  
			 cualquiera =  false;
		System.out.println(cualquiera);
	}
}
