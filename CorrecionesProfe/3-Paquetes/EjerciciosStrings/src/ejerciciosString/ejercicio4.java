package ejerciciosString;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dni;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce dni:");
		dni=sc.nextLine();
		if (validarDni(dni)==false)
			System.out.println("Dni incorrecto");
		else
			System.out.println("Dni correcto");
		
	}
	
	public static boolean validarDni(String dni) {
		char letra;
		String letrasdni="TRWAGMYFPDXBNJZSQVHLCKE";
				
		if (!dni.matches("^\\d{1,8}[A-Z]$"))
			return false;
		
		int numero=Integer.parseInt(dni.substring(0, dni.length()-1));
		int pos=numero%23;
		letra=dni.charAt(dni.length()-1);
		System.out.println(letra);
		if (letrasdni.charAt(pos)!=letra)
			return false;
		
		return true;
	}

}
