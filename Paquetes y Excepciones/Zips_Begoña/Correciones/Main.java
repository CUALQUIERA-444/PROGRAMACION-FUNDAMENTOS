package examenRestaurante;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double presupuesto, precioUnidad, totalCompraUsuario=0;
		String codigo;
		int unidades;
		Random r=new Random();
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Anota presupuesto:");
		presupuesto=sc.nextDouble();
		
		System.out.println("Introduce código artículo");
		codigo=sc.nextLine();
		
		while(codigo.equalsIgnoreCase("FIN")==false) {
			
			while (!validarCodigo(codigo)) {
				System.out.println("Introduce código artículo");
				codigo=sc.nextLine();
				// Arreglar que aquí me anoten fin
			}
			
			unidades=r.nextInt(4)+1;
			
			do {
				System.out.println("Anota precio unidad:");
				precioUnidad=sc.nextDouble();
				if (precioUnidad<=0)
					System.out.println("Precio erróneo");
			}while(precioUnidad<=0);
			
			double precioProducto=calculaPrecioTotal(codigo,unidades,precioUnidad);
			if (totalCompraUsuario+precioProducto > presupuesto)
				System.out.println("Presupuesto superado, retira artículo");
			else
				totalCompraUsuario+=precioProducto;
			
			System.out.println("Introduce código artículo");
			codigo=sc.nextLine();
			
		}
		
		// Gestionar pedido
		System.out.println("Quiere hacer pedido a domicilio?");

		boolean pedido=sc.nextBoolean();
		if (pedido) {
			// preguntar si es jubilado y la zona
			// incrementar la compra Total del usuario con lo que vale hacer el envío
		}
	}
	
	// Codificar vosotros
	public static boolean validarCodigo(String codigo) {
		
		return true;
	}
	
	// Codificar vosotros
	public static double calculaPrecioTotal(String codigo, int unidades, double precioUnidad) {
		double importe=0;
		/*
		if (codigo.charAt(1)=='L')
			
		else if (codigo.charAt(1)=='P')
			
		else
		*/
			
		return importe;
	}

}
