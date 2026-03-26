package Practica3;

import java.util.Scanner;

public class Ejercicio3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 10. Una empresa tiene trabajadores de categorías A, B y C. Todos cobran un
		 * salario base. Los de las categorías A y B cobran además un suplemento de 240
		 * euros. En la categoría C, en la sección 1aº están los contratados por días,
		 * que cobran un suplemento de 0.5 € por día trabajado y se les descuenta 30 €
		 * por baja injustificada. El resto de las secciones de esta categoría cobra
		 * 120€ de suplemento. Programa que lee los datos de un trabajador y nos calcula
		 * su sueldo final. Lo primero es pedir los datos salario categoría.dias de baja
		 * injustificada dias trabajados Y tendremos algunas constantes para ciertas
		 * variables 
		 */
		final double sup_AB = 240, sup_Cdia = 0.5, baja_injustificadaC = 30, sup_Cseccion = 120;
		Scanner sc = new Scanner(System.in);
		int dias;
		int dias_baja;
		int seccion;
		double salario_total;
		int correcto = 0;
		char categoria;
		System.out.println("Introduzca la categoría a la que pertenece");
		categoria = sc.nextLine().charAt(0);
		categoria = Character.toUpperCase(categoria); // Funcion para pasar a mayuscula que se guarda en la variable categoria
		if(categoria == 'A' || categoria == 'B' || categoria == 'C') {
		System.out.println("Introduzca su salario base y nos encargaremos de calcular su salario total");
		salario_total = sc.nextDouble();
		if(salario_total < 0)
			System.out.println("No se haga el gracioso no puede cobrar en numeros negativos");
		else if(categoria == 'C')  {
		System.out.println("Introduzca la cantidad de dias que haya trabajado");
		dias = sc.nextInt();
		System.out.println("Introduzca la cantidad de dias en los que haya tenido bajas injustificadas");
		dias_baja = sc.nextInt();
		System.out.println("Introduzca la cantidad de secciones de su categoria");
		seccion = sc.nextInt();
		if (dias_baja > dias || dias < 0 || dias_baja < 0 || seccion < 0) //Por lo general el elseif suele estar asociado con el ultimo if 
			System.out.println("Eso es imposible vallase de aca");
		else {
			salario_total = salario_total + dias * sup_Cdia - dias_baja * baja_injustificadaC +seccion * sup_Cseccion;	
			correcto = 1;
		}
		}
		else {
			salario_total = salario_total + sup_AB;
			correcto = 1;
		}
		if (correcto == 1)
			System.out.println("Su salario total sera de "+salario_total+" euros");
		}
		else 
			System.out.println("Usted inventa cosas");
	}
}
