package Correcion_Strings;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos;
		String una,dos;
		Scanner sc = new Scanner (System.in);
		System.out.println("Anota primera cadena:");
		una = sc.nextLine();
		System.out.println("Anota segunda cadena:");
		dos = sc.nextLine();
		if (una.length() <dos.length())
			pos = dos.indexOf(una);
		else 
			pos = una.indexOf(dos);
		if (pos == -1)
			System.out.println("La cadena está incluida");
		else 
			System.out.println(+pos);
	}
}
