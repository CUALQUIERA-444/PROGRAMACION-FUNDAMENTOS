package ej8_coches;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String matricula, marca, modelo;
		int año, categoria, opc=0, pos=0;
		boolean correcto = false;
		final int TAM=5;
		HashMap<String,Vehiculo>vehiculos=new HashMap<String,Vehiculo>();

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < TAM; i++) {
			do {
				System.out.println("Anota matricula:");
				matricula = sc.nextLine();
				correcto = Vehiculo.validarMatricula(matricula);
				if (correcto == false)
					System.out.println("Matrícula incorrecta");
			} while (correcto == false);
			System.out.println("Anota marca:");
			marca = sc.nextLine();
			System.out.println("Anota modelo:");
			modelo = sc.nextLine();
			do {
				System.out.println("Anota categoria:");
				categoria = sc.nextInt();
				if (categoria != 1 && categoria != 2)
					System.out.println("Error en la categoria");
			} while (categoria != 1 && categoria != 2);
			do {
				System.out.println("Introduce año:");
				año = sc.nextInt();
				sc.nextLine(); //Limpiar buffer
				correcto = Vehiculo.validarAño(año);
				if (!correcto)
					System.out.println("Año incorrecto");
			} while (!correcto);
			vehiculos.put(matricula,new Vehiculo(matricula,marca,modelo,año,categoria));	

		}
		
		
		do {
			System.out.println("1.Alquilar\n2.Devolver\n3.Información\n4.Salir");
			opc=sc.nextInt();
			sc.nextLine(); //Limpio buffer
			
			switch(opc) {
			case 1: 
				/*
				System.out.println("Anota matrícula:");
				matricula=sc.nextLine();
				if (!vehiculos.containsKey(matricula))
					System.out.println("No existe el vehiculo");
				else {
					
					System.out.println("Cuántos dias?");
					int dias=sc.nextInt();
					double importe=vehiculos.get(matricula).alquilar(dias);
					if (importe==0)
						System.out.println("No se puede alquilar ya está alquilado");
					else
						System.out.println("El alquiler te va a costar:"+importe);
				}
				*/
				System.out.println("Anota matrícula:");
				matricula=sc.nextLine();
				Vehiculo v=vehiculos.get(matricula);
				if (v==null)
					System.out.println("No existe el vehiculo");
				else {
					
					System.out.println("Cuántos dias?");
					int dias=sc.nextInt();
					double importe=v.alquilar(dias);
					if (importe==0)
						System.out.println("No se puede alquilar ya está alquilado");
					else
						System.out.println("El alquiler te va a costar:"+importe);
				}
				break;
				
			case 2:
				System.out.println("Anota matrícula:");
				matricula=sc.nextLine();
				v=vehiculos.get(matricula);
				if (v==null)
					System.out.println("No existe el vehiculo");
				else {
					if (v.devolver())
				
						System.out.println("Vehiculo devuelto con éxito");
					else
						System.out.println("No se puede devolver porque no está alquilado");
				}
				break;
				
			case 3:
				System.out.println("Anota matrícula:");
				matricula=sc.nextLine();
				v=vehiculos.get(matricula);
				if (v==null)
					System.out.println("No existe el vehiculo");
				else {
				
					System.out.println(v);
				}
				break;
				
			}
			
			System.out.println(vehiculos);
			
		}while(opc!=4);

		System.out.println("Total vehiculos alquilados actualmente:"+ Vehiculo.getNumAlquilados());
		System.out.println("Total ganancias:"+ Vehiculo.getGananciasTotales());
		
	}
	
	
}
