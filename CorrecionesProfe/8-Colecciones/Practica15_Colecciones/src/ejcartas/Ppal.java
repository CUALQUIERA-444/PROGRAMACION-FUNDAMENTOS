package ejcartas;

import java.util.*;

public class Ppal {

	public static void main(String[] args) {
		LinkedList<Carta> cartasOrdenadas = new LinkedList<>();

		ArrayList<Carta> cartasExcluidas = new ArrayList<>();
		HashMap<String, ArrayList<Carta>> cartasPorDestino = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("\n1. Agregar carta\n2. Clasificar cartas\n3. Mostrar todas las colecciones\n4. Salir");
			System.out.print("Seleccione una opci�n: ");
			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
				agregarCarta(scanner, cartasOrdenadas, cartasExcluidas);
				break;
			case 2:
				clasificarCartas(cartasOrdenadas, cartasPorDestino);
				break;
			case 3:
				System.out.println("\nCartas Ordenadas:");
				System.out.println(cartasOrdenadas);;

				System.out.println("\nCartas Excluidas:");
				System.out.println(cartasExcluidas);
				

				System.out.println("\nCartas Clasificadas por Destino:");
				for (String ciudad : cartasPorDestino.keySet()) {
					System.out.println(cartasPorDestino.get(ciudad));
				}
				;
				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opci�n no v�lida");
			}
		} while (opcion != 4);
	}

	static void agregarCarta(Scanner scanner, LinkedList<Carta> cartasOrdenadas, ArrayList<Carta> cartasExcluidas) {
		HashSet<String> destinosValidos = new HashSet<>(Arrays.asList("Madrid", "Barcelona", "Sevilla", "Valencia",
				"Zaragoza", "Bilbao", "M�laga", "Granada", "Salamanca", "Alicante"));
		/*
		destinosValidos.add("Madrid");
		...
		destinosValidos.add("Alicante");
		*/
		
		System.out.print("Ingrese el destinatario: ");
		String destinatario = scanner.nextLine();
		System.out.print("Ingrese la ciudad: ");
		String ciudad = scanner.nextLine();
		System.out.print("Ingrese el pa�s: ");
		String pais = scanner.nextLine();

		Carta carta = new Carta(destinatario, ciudad, pais);

		if (destinosValidos.contains(ciudad)) {
			int pos=encontrarPos(cartasOrdenadas,destinatario);
			cartasOrdenadas.add(pos,carta);
			System.out.println("Carta agregada correctamente.");
		} else {			
			cartasExcluidas.add(carta);
			System.out.println("Destino no v�lido. Carta excluida.");
		}
	}

	
	static int encontrarPos(LinkedList<Carta> cartasOrdenadas, String destinatario) {
		for(int i=0;i<cartasOrdenadas.size();i++)
			if (cartasOrdenadas.get(i).getDestinatario().compareToIgnoreCase(destinatario)>0)
				return i;
		return cartasOrdenadas.size();
	}
	static void clasificarCartas(LinkedList<Carta> cartasOrdenadas,
			HashMap<String, ArrayList<Carta>> cartasPorDestino) {
		
		for (Carta carta : cartasOrdenadas) {
			if (!cartasPorDestino.containsKey(carta.getPais())) {
				cartasPorDestino.put(carta.getPais(), new ArrayList<>());
			}
			cartasPorDestino.get(carta.getPais()).add(carta);
		}
		cartasOrdenadas.clear();
		System.out.println("Cartas clasificadas correctamente.");
	}
	
	static void clasificarCartas2(LinkedList<Carta> cartasOrdenadas,
			HashMap<String, ArrayList<Carta>> cartasPorDestino) {
		
		Carta carta;
		
		Iterator<Carta>it=cartasOrdenadas.iterator();
		
		while(it.hasNext()) {
			carta=it.next();
		
			if (!cartasPorDestino.containsKey(carta.getPais())) {
				cartasPorDestino.put(carta.getPais(), new ArrayList<>());
			}
			cartasPorDestino.get(carta.getPais()).add(carta);
			it.remove();
		}
		
		System.out.println("Cartas clasificadas correctamente.");
	}

}
