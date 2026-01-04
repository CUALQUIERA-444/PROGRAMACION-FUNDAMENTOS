package Ejercicios_Strings_YO;

import java.util.Scanner;

public class Strings6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programa que nos dice si una palabra se lee igual del derecho que
		// del reves
		String palabra;
		boolean confirmacion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		palabra = sc.nextLine();
		palabra = palabra.toUpperCase();
		confirmacion = Validar_palabra(palabra);
		if (confirmacion == false)
			System.out.println("No se leen igual");
		else
			System.out.println("Se leen igual");
	}

	public static boolean Validar_palabra(String p) { 
		for (int i = 0, j = p.length() - 1; i < j; i++, j--) {
			if (p.charAt(i) != p.charAt(j))
				return false;
		}
		return true;
	}
}