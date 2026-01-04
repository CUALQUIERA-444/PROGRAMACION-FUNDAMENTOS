package Soluciones_TODO;

import java.util.Scanner;

/**
 * Lee dos cadenas. Haz una función que devuelva el número de veces que la primera
está incluida en la segunda. Devuelve una excepción propia si cualquiera de las dos
está vacía.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1,cad2;
		int num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Anota primera cadena:");
		cad1=sc.nextLine();
		System.out.println("Anota segunda cadena:");
		cad2=sc.nextLine();
		
		try {
			num=vecesIncluida(cad1,cad2);
			System.out.println("La cadena \""+cad1+"\" contiene "+ num+" veces a la cadena \""+cad2+"\"");
		} catch (CadenaVaciaException e) {
			System.out.println(e.getMessage());
		}

	}
	/**
	 * Función que devuelve las veces que una cadena está incluida en otra
	 * @param c1 Cadena en la que busco
	 * @param c2 Cadena que busco
	 * @return número de veces 
	 * @throws CadenaVaciaException cuando una de las dos cadenas está vacía
	 */
	public static int vecesIncluida(String c1, String c2) throws CadenaVaciaException {
		int veces=0,pos=0;
		if (c1.length()==0 || c2.length()==0) {
			throw new CadenaVaciaException("No puede haber cadenas vacías");
		}
		
		pos=c1.indexOf(c2,pos);
		
		while(pos!=-1) {
			veces++;
			pos=c1.indexOf(c2,pos+c2.length());
		}
		// código para contar el número de veces que la segunda está dentro de la primera
		return veces;
	}
	

}
