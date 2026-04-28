package ej3_cargamentos;

import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NCAR = 10;
		Cargamento cargamentos[] = new Cargamento[NCAR];
		int ultimoCargamento = 0, opc;
		String fruta, procedencia;
		double kilos, precioC, precioV;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1.Alta cargamento");
			System.out.println("2.Información todos los cargamentos");
			System.out.println("3.Rebajar");
			System.out.println("4.Vender");
			System.out.println("5.Mostrar beneficio");
			System.out.println("6.Borrar el primer cargamento vacío");
			System.out.println("7.Borrar todos los cargamentos vacíos");
			System.out.println("8.Salir");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				if (ultimoCargamento == NCAR)
					System.out.println("No es posible introducir más cargamentos");
				else {
					sc.nextLine(); // Limpio buffer
					System.out.println("Anota fruta:");
					fruta = sc.nextLine();
					System.out.println("Anota procedencia:");
					procedencia = sc.nextLine();
					System.out.println("Anota kilos:");
					kilos = sc.nextDouble();
					System.out.println("Anota precio compra:");
					precioC = sc.nextDouble();
					System.out.println("Anota precio venta:");
					precioV = sc.nextDouble();

					cargamentos[ultimoCargamento] = new Cargamento(fruta, procedencia, kilos, precioC, precioV);
					ultimoCargamento++;
				}
				break;
			case 2:
				System.out.println("Cargamentos guardados:");
				for (int i = 0; i < ultimoCargamento; i++)
					System.out.println(cargamentos[i].toString());
				break;
			case 3:
				System.out.println("Anota fruta:");
				fruta=sc.nextLine();
				System.out.println("Anota procedencia");
				procedencia=sc.nextLine();
				
				int pos=buscarCargamento(cargamentos, ultimoCargamento, fruta, procedencia);
				if (pos==-1)
					System.out.println("No se ha podido encontrar ese cargamento");
				else {
					System.out.println("Introduce rebaja a aplicar:");
					double rebaja=sc.nextDouble();
					if (cargamentos[pos].rebajar(rebaja))
						System.out.println("Rebaja realizada con éxito");
					else
						System.out.println("No se ha podido realizar la rebaja");
				}
				break;
				
			case 5:
				System.out.println("Beneficio total:"+Cargamento.getBeneficio());
				break;
				
			case 6: //Borrar el primer cargamento de 0 kilos
				int i;
				for(i=0;i<ultimoCargamento;i++) {
					if (cargamentos[i].getKilos()==0) {
						for(int j=i; j<ultimoCargamento-1;j++)
							cargamentos[j]=cargamentos[j+1];
						ultimoCargamento--;
						cargamentos[ultimoCargamento]=null; // No es imprescindible
						break;
					}
				}
				if (i==ultimoCargamento)
					System.out.println("No hay ningún cargamento vacío");
				break;
			case 7:
				
				for(i=0;i<ultimoCargamento;i++) {
					if (cargamentos[i].getKilos()==0) {
						for(int j=i; j<ultimoCargamento-1;j++)
							cargamentos[j]=cargamentos[j+1];
						ultimoCargamento--;
						cargamentos[ultimoCargamento]=null; // No es imprescindible	
						i--; // Para inspeccionar la celda que acabo de rellenar con la siguiente
					}
				}
				
				
				break;
				

			}

		} while (opc != 8);

	}

	private static int buscarCargamento(Cargamento[] cargamentos, int ultimoCargamento, String fruta, String procedencia) {
		for(int i=0; i < ultimoCargamento;i++) {
			if (cargamentos[i].getFruta().equalsIgnoreCase(fruta) && cargamentos[i].getProcedencia().equalsIgnoreCase(procedencia)) {
				return i;
			}
				
		}
		return -1;
	}

}
