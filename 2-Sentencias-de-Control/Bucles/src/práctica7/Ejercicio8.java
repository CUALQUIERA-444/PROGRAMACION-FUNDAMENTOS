package práctica7;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int dia;
		int mes;
		int año;
		boolean seguir;
		boolean empezar;
		System.out.println("Introduce tu fecha de nacimiento (Empieza por el día)");
		dia = sc.nextInt();
		System.out.println("Sigue por el mes");
		mes = sc.nextInt();
		System.out.println("Finalmente introduce el año");
		año = sc.nextInt();
		empezar = ValidaciónDatos(dia,mes,año);
	}
	public static boolean ValidaciónDatos (int d, int m, int a) {
		int contador_cifras = 0;
		for ( int i =1 ; i < 4; i++ ) {
			contador_cifras = 0;
			a = a / 10;
			contador_cifras++;
		}
			if (contador_cifras < 4)
				return false;
			else 
				if ( d < 1 && d > 31)
					return false;
				else
					switch (m) {
					case 1:
					case 3:
					case 5:
					case 7: 
					case 8:
					case 10:
					case 12:
						
					if ( m > 12 && m == 0)
					return false;
		}
	}
}
