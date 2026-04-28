package ejerciciosString;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1,cad2,cad3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce cadena:");
		cad1=sc.nextLine();
		System.out.println("Introduce cadena:");
		cad2=sc.nextLine();
		System.out.println("Introduce cadena:");
		cad3=sc.nextLine();
		
		if (cad1.compareToIgnoreCase(cad2)<=0 && cad1.compareToIgnoreCase(cad3)<=0) {
			if (cad2.compareToIgnoreCase(cad3)<=0)
				System.out.println(cad1+","+cad2+","+cad3);
			else
				System.out.println(cad1+","+cad3+","+cad2);
		}
		if (cad2.compareToIgnoreCase(cad1)<=0 && cad2.compareToIgnoreCase(cad3)<=0) {
			if (cad1.compareToIgnoreCase(cad3)<=0)
				System.out.println(cad2+","+cad1+","+cad3);
			else
				System.out.println(cad2+","+cad3+","+cad1);
		}
		if (cad3.compareToIgnoreCase(cad1)<=0 && cad3.compareToIgnoreCase(cad2)<=0) {
			if (cad1.compareToIgnoreCase(cad2)<=0)
				System.out.println(cad3+","+cad1+","+cad2);
			else
				System.out.println(cad3+","+cad2+","+cad1);
		}
	}

}
