package ejemplosarrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ejemplo7 {

	public Ejemplo7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numeros[];
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		String cadena = "7.5$32.14$1a.2$5$32.1$21";

		String resultado[] = cadena.split("[$]");

		numeros = new double[resultado.length];

		for (int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
			try {
				numeros[i] = Double.parseDouble(resultado[i]);
			} catch (NumberFormatException e) {
				System.out.println("No he podido convertir " + resultado[i] + " a double");
				numeros[i] = 0;
			}
		}

		Arrays.sort(numeros);
		System.out.println("Array ordenado");
		for (int i = 0; i < resultado.length; i++)
			System.out.println(numeros[i]);
		
		System.out.println("Anota número para buscar en el array:");
		double numBuscar=sc.nextDouble();
		
		int pos=Arrays.binarySearch(numeros, numBuscar);
		if (pos<0)
			System.out.println("No existe ese número");
		else
			System.out.println("El número está en la posición:"+pos);

	}

}
