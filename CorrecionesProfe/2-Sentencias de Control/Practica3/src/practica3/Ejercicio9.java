package practica3;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h,m,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce horas:");
		h=sc.nextInt();
		System.out.println("Introduce minutos:");
		m=sc.nextInt();
		System.out.println("Introduce segundos:");
		s=sc.nextInt();
		if (h>=0 && h<=23 && m>=0 && m<=59 && s>=0 && s<=59) {
			if (s!=59)
				s++;
			else
				if (m!=59) {
					m++;
					s=0;
				}
				else
					if (h!=23) {
						h++;
						m=s=0;
					}
					else {
						h=m=s=0;
						}
			System.out.println("La hora un segundo después es:"+h+":"+m+":"+s);
		}
		else {
			System.out.println("No has introducido la hora correctamente");
		}
		
	}

}
