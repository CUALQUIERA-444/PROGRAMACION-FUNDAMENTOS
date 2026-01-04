package práctica6;

import java.util.Scanner;

public class Ejercicio2_Práctica6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num; 
		int acumulador_suma = 0;
		int contador_ceros = 0;
		Scanner sc= new Scanner (System.in);
		do {
		System.out.println("Introduce numeros consecutivamente hasta que la suma de todos ellos sea mayor que 100");
		num = sc.nextInt();
		//Todo esto se ejecuta mientras la suma no sea mayor que 100
			acumulador_suma = num + acumulador_suma;
			System.out.println(acumulador_suma);
		 if ( num == 0 ) {
			contador_ceros++;
		}
	}
	while (acumulador_suma <= 100);
		if ( contador_ceros > 0) {
			System.out.println("Si ha introducido ceros"+" "+contador_ceros+" "+"para ser más especifícos");
			System.exit(0);
}
		else 
			System.out.println("No se ha introducido ningun cero");
	}
}
