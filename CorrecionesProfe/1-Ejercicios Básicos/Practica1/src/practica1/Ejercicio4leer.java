package practica1;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4leer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio, longitud;
		final double PI=3.1416;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH); // Sólo si voy a leer decimales, para que acepte el . como separador de decmales
		System.out.println("Introduce el radio (usa . para los decimales):");
		radio=sc.nextDouble();
		
		longitud = 2 * PI * radio;
		
		System.out.println("La longitud de la circunferencia es:"+longitud + " metros");
		
	}

}
