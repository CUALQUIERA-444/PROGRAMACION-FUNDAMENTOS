package practica3;
import java.util.Scanner;
//Programa que calcula el salario de un empleado a partir de su salario base y su categoría

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce tu categoría: ");
		char categoria=entrada.nextLine().charAt(0);
		System.out.println("Introduce salario base: ");
		double salarioBase=entrada.nextDouble();
		double salario;
		if (categoria=='A' || categoria=='B') {
			salario=salarioBase+240;
		}
		else {
			System.out.println("Introduce tu sección: ");
			int seccion=entrada.nextInt();
			if (seccion==1) {
				System.out.println("Introduce días trabajados: ");
				int dias=entrada.nextInt();
				System.out.println("Cuántas bajas injustificadas? ");
				int bajas=entrada.nextInt();
				salario=salarioBase+0.5*dias-30*bajas;
			}
			else {
				salario=salarioBase+120;
			}		
		}
		System.out.println("Tu salario es: "+salario);
	}

}
