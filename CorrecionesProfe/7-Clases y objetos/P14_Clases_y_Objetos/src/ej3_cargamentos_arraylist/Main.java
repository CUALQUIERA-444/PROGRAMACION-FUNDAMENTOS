package ej3_cargamentos_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NCAR = 10;

		ArrayList<Cargamento> cargamentos = new ArrayList<Cargamento>();
		int opc;
		String fruta, procedencia;
		double kilos, precioC, precioV;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1.Alta cargamento");
			System.out.println("2.Información todos los cargamentos");
			System.out.println("3.Rebajar");
			System.out.println("4.Vender");
			System.out.println("5.Mostrar beneficio");
			System.out.println("6.Borrar cargamentos vacíos");
			System.out.println("7.Salir");
			opc = sc.nextInt();
			switch (opc) {
			case 1:

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

				cargamentos.add(new Cargamento(fruta, procedencia, kilos, precioC, precioV));

				break;
			case 2:
				System.out.println("Cargamentos guardados:");
				for (int i = 0; i < cargamentos.size(); i++)
					System.out.println(cargamentos.get(i).toString());
				break;
			case 3:
				System.out.println("Anota fruta:");
				fruta = sc.nextLine();
				System.out.println("Anota procedencia");
				procedencia = sc.nextLine();
				Cargamento buscar = new Cargamento(fruta, procedencia);

				int pos = cargamentos.indexOf(buscar);

				if (pos == -1)
					System.out.println("No se ha podido encontrar ese cargamento");
				else {
					System.out.println("Que rebaja quieres aplicar:");
					double rebaja = sc.nextDouble();
					if (cargamentos.get(pos).rebajar(rebaja))
						System.out.println("Rebaja realizada con éxito");
					else
						System.out.println("No se puede realizar la rebaja");

					break;
				}

				break;

			case 5:
				System.out.println("Beneficio total:" + Cargamento.getBeneficio());
				break;
			case 6:
				// Borro todos los cargamentos con 0 kilos
				for (int i = 0; i < cargamentos.size(); i++) {
					if (cargamentos.get(i).getKilos() == 0) {
						cargamentos.remove(i);
						i--;
						// break;
					}
				}
				break;

			}

		} while (opc != 7);

	}

}
