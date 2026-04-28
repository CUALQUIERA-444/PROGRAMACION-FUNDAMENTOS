package practica3;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int n1,n2,n3;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Anota primer número:");
		n1=entrada.nextInt();
		System.out.println("Anota segundo número:");
		n2=entrada.nextInt();
		System.out.println("Anota tercer número:");
		n3=entrada.nextInt();
		if (n1==n2 || n1==n3 || n2==n3)
			System.out.println("Los números tienen que ser distintos");
		else {
			if (n1>n2 && n1>n3)
				System.out.println("El mayor es:"+n1);
			else
				if (n2>n1 && n2>n3)
					System.out.println("El mayor es:"+n2);
				else
					System.out.println("El mayor es:"+n3);
					
		}
	}

}
