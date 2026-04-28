package tarjetas;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.*;

import bbdd.*;
import modelos.*;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner sLeer=new Scanner(System.in);
		int opc=0;
		
		
		BD_Tarjetas bd=new BD_Tarjetas("mysql-properties.xml");
		
		
		do	
		{
			System.out.println("\n\nGESTI�N TARJETAS");
			System.out.println("***************");
			System.out.println("0.Alta movimiento\n");
					
			System.out.print("\tTeclea opci�n: ");
			try{
			opc=sLeer.nextInt();
			}
			
			catch(InputMismatchException e ){
				System.out.println("Debes introducir n�mero 1-5");
				opc=0;
			}
			
			sLeer.nextLine();
			switch (opc){
			case 0:
				System.out.println("\n\nALTA MOVIMIENTO");
				System.out.println("Anota número de tarjeta:");
				int numTarjeta=sLeer.nextInt();
				System.out.println("Anota importe del movimiento:");
				double importe=sLeer.nextDouble();
				
				Movimiento m=new Movimiento(numTarjeta,importe);
				try {
					int filas=bd.añadir_Movimiento(m);
					if (filas==0)
						System.out.println("No se ha dado de alta el movimiento. Avise a sistemas");
					else
						System.out.println("Moviento dado de alta");
				} catch (ErrorBaseDatos e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage() + " Avise a sistemas");
				}
				
				break;
			
			default:
				System.out.println("Opción incorrecta");
			}
			
		}
		while (opc!=11);
			
	
		}
	
	
	//En el build path tiene que salir el conector  
}
