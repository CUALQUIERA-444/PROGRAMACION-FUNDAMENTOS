package Practica8;

import java.util.Scanner;

public class Ejercicio8_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 10. Utiliza el método matches para validar las siguientes cadenas: a. Una
		 * matrícula b. Un nif c. Un código postal que empiece por 28. d. Un número de
		 * teléfono que puede empezar por 6, 7 ó 9. e. Un código de usuario que puede
		 * tener de 5 a 10 caracteres, tiene que empezar por letra y tener después
		 * letras y números.
		 */
		/*
		 * Lógica y código necesario Para hacer este ejercicio es importante entender la
		 * siguiente lógica Cada tipo de dato tiene su algoritmo "extraño" o por lo
		 * menos algo parecido al DNI Esencialmente la idea es hacer un switch-case que
		 * cubra cada caso individualmente y una opción para salir Para cada tipo de
		 * caso se usara un booleano Y cada caso a verificar tendra su función
		 * individual Necesitamos un total de 5 funciones junto a sus respectivos regex
		 * individuales y en cada función puese generalmente vendra conformado de sus
		 * propias validaciones
		 */
		Scanner sc = new Scanner(System.in);
		String matricula;
		String nif;
		String codigo_postal;
		String n_telefono;
		String codigo_usuario;
		boolean validar;
		int opcion;
		do {
			System.out.println(
					"Seleccione la opcion que más desee\n1.Validar Matrícula \n2.Validar NIF \n3.Validar código postal \n4.Validar Numero de telefono \n5.Validar codigo de usuario \n0.Salir");
			opcion = sc.nextInt();
			sc.nextLine(); // Limpiar Buffer
			switch (opcion) {
			case 1:
				System.out.println("Introduce matricula");
				matricula = sc.nextLine();
				validar = ValidarMatricula(matricula);
				if (validar) {
					System.out.println("Su matrícula es válida");
				} else {
					System.out.println("Su matrícula no es válida");
				}
				break;
			case 2:
				System.out.println("Introduzca su NIF");
				nif = sc.nextLine();
				validar = ValidarNIF(nif);
				if (validar) {
					System.out.println("Su NIF es válido");
				} else {
					System.out.println("Su NIF no es válido");
				}
				break;

			case 3:
				System.out.println("Introduzca su código postal");
				codigo_postal = sc.nextLine();
				validar = ValidarCP(codigo_postal);
				if (validar) {
					System.out.println("Su código postal es válido");
				} else {
					System.out.println("Su código postal no es válido");
				}
				break;
			case 4:
				System.out.println("Introduzca su número de teléfono");
				n_telefono = sc.nextLine();
				validar = ValidarPN(n_telefono);
				if (validar) {
					System.out.println("Su número de teléfono es válido");
				} else {
					System.out.println("Su número de teléfono no es válido");
				}
				break;
			case 5:
				System.out.println("Introduzca su código de usuario");
				codigo_usuario = sc.nextLine();
				validar = ValidarCU(codigo_usuario);
				if (validar) {
					System.out.println("Su código de usuario es válido");
				} else {
					System.out.println("Su código de usuario no es válido");
				}
				break;
			case 0:
				break;
			default:
				System.out.println("Opción no valida vuelva a intentarlo");
				break;
			}
		} while (opcion != 0);
		System.out.println("Gracias por ejecutarme");
	}

	public static boolean ValidarMatricula(String mat) {
		String regex = "^[0-9]{4}[-]?[BCDFGHJKLMNPQRSTVWXYZ]{3}$"; // No se incluyen ni vocales ni Ñ NI Q el guion es opcional y permite espacios o nada
		if (!mat.matches(regex)) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean ValidarNIF(String NIF) {
		NIF = NIF.toUpperCase(); // Permite mayusculas
		String regex = "^\\d{8}[A-Z]$";
		String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
		if (!NIF.matches(regex))
			return false;
		else {
			int conversion = Integer.parseInt(NIF.substring(0, 8));
			int indicebuscar = conversion % 23;
			if (tabla.charAt(indicebuscar) != NIF.charAt(NIF.length() - 1))
				return false;
			else
				return true;
		}
	}

	public static boolean ValidarCP(String cp) {
		String regex = "^28[0-9]{3}$";
		if (!cp.matches(regex)) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean ValidarPN(String teléfono) {
		String regex = "^[679][0-9]{8}$";
		if (!teléfono.matches(regex)) {
			return false;
		}
		return true;
	}

	public static boolean ValidarCU(String codigo) {
		String regex = "^[a-zA-Z][a-zA-Z0-9]{4,9}$";
		if (!codigo.matches(regex)) {
			return false;
		}
		return true;
	}
}
