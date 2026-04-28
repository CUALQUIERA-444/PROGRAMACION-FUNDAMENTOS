package ej4_futbol;

import java.util.Scanner;

public class Main {

	public static void main(String st[]) {
		// TODO Auto-generated constructor stub
		final int TOTEQ=4;
		String nombre;
		int opc,pos1,pos2,gol1,gol2;
		Equipo equipos[]=new Equipo[TOTEQ];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<TOTEQ;i++) {
			System.out.println("Anota nombre del equipo:");
			nombre=sc.nextLine();
			equipos[i]=new Equipo(nombre);
		}
		
		do {
			System.out.println("1.Anotar partido");
			System.out.println("2.Ordenar");
			System.out.println("3.Mostrar");
			System.out.println("4.Salir");
			
			opc=sc.nextInt();
			
			switch(opc) {
			case 1:
				System.out.println("Introduce nombre equipo 1:");
				String nombre1=sc.nextLine();
				System.out.println("Introduce nombre equipo 1:");
				String nombre2=sc.nextLine();
				
				
				try {
					pos1=buscar(equipos,nombre1);
					pos2=buscar(equipos,nombre2);
					System.out.println("Goles primer equipo:");
					gol1=sc.nextInt();
					System.out.println("Goles segundo equipo:");
					gol2=sc.nextInt();
					//Equipo.anotarPartido(equipos[pos1],equipos[pos2] , gol1, gol2);
					equipos[pos1].anotarPartido(gol1, gol2);
					equipos[pos2].anotarPartido(gol1, gol2);
				} catch (NoEncontradoException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());;
				}
				break;
				
			}
			
		}while(opc!=4);
		
	 }
	
	
	public static int buscar(Equipo equipos[],String nombre) throws NoEncontradoException{
		for(int i=0;i<equipos.length;i++) {
			if (equipos[i].getNombre().equalsIgnoreCase(nombre))
				return i;
		}
		throw new NoEncontradoException("No existe ese equipo");
	}

}
