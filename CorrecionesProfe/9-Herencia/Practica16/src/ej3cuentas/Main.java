package ej3cuentas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;
		Scanner sc = new Scanner(System.in);
		LinkedList<Cuenta> cuentas = new LinkedList<Cuenta>();

		do {
			System.out.println("\n1.Alta cuenta\n2.Borrar por titular\n5.Mostrar cuentas\n6.Salir");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				int ntit = 0, tipo;
				double saldo;
				do {
					System.out.println("Introduce número de titulares, máximo 3:");
					ntit = sc.nextInt();
				} while (ntit > 3 || ntit < 1);
				sc.nextLine(); // Limpio buffer
				ArrayList<String> titulares = new ArrayList<String>();
				for (int i = 1; i <= ntit; i++) {
					System.out.println("Introduce NIF:");
					String tit = sc.nextLine();
					titulares.add(tit);
				}
				do {
					System.out.println("¿Cuenta (1), o cuentón (2)");
					tipo = sc.nextInt();
				} while (tipo != 1 && tipo != 2);
				if (tipo == 1) {
					System.out.println("Introduce saldo:");
					saldo = sc.nextDouble();
					cuentas.add(new Cuenta(saldo, titulares));
				} else {
					/*
					 * do { System.out.println("Introduce saldo:"); saldo = sc.nextDouble(); } while
					 * (saldo < Cuenton.getLimite());
					 */
					boolean correcto = false;
					do {
						System.out.println("Introduce saldo:");
						saldo = sc.nextDouble();
						try {
							cuentas.add(new Cuenton(saldo, titulares));
							correcto = true;
						} catch (LimiteInsuficienteException e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
						}
					} while (!correcto);
				}
				break;
			case 2:
				System.out.println("Anota nif titular");
				String nif = sc.nextLine();

				for (int i = 0; i < cuentas.size(); i++)
					if (cuentas.get(i).estaTitular(nif)) {
						if (cuentas.get(i) instanceof Cuenton)
							Cuenton.borrar();
						cuentas.remove(i);
						i--; // Para que no de error al borrar elementos contiguos
					}

				break;
			case 3:
				System.out.println("Introduce número de dias:");
				int dias = sc.nextInt();
				for (Cuenta cuenta: cuentas) {
					System.out.println("Cuenta:" + cuenta.getNumero());
					System.out.println("Beneficios:" + cuenta.beneficios(dias));
				}

				break;
			case 4:
				/*
				ArrayList<Cuenton> cuentones = new ArrayList<Cuenton>();
				for (int i = 0; i < cuentas.size(); i++)
					// if (cuentas.get(i).getClass().getSimpleName().equals("Cuenton"))
					if (cuentas.get(i) instanceof Cuenton)
						cuentones.add((Cuenton) (cuentas.get(i)));

				if (cuentones.size() == 0)
					System.out.println("No hay cuentones para el sorteo");
				else {
					Random r = new Random();
					int n = r.nextInt(0, cuentones.size());
					System.out.println("Cuenta agraciada:" + cuentones.get(n).toString());
				}
				*/
				int premio=Cuenton.sorteo();
				if (premio==-1)
					System.out.println("No hay cuentones");
				else
					for(Cuenta cuenta:cuentas)
						if (cuenta instanceof Cuenton)
							if (premio==0) {
								System.out.println("Premiada:"+cuenta);
								break;
							}
							else
								premio--;
				break;
			case 5:
				for (Cuenta c : cuentas) {
					System.out.println(c.toString());
				}
			}

		} while (opc != 6);
	}

}
