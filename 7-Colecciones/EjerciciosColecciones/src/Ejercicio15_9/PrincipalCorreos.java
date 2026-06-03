package Ejercicio15_9;

import java.util.*;

public class PrincipalCorreos {
	/*
	 * 9. En una oficina de correos se quieren organizar las cartas que llegan. De
	 * cada carta se guarda el apellido y nombre del destinatario, ciudad y país.
	 * Cada vez que llega una carta a la oficina se coloca por orden alfabético en
	 * una colección (elige la más adecuada). Antes de guardar la carta en la LL
	 * anterior se comprueba que el país d de destino es correcto, el país de
	 * destino sólo puede ser uno de 10 destinos predeterminados al inicio del
	 * programa (usa la colección adecuada). Si el destino no es correcto, la carta
	 * se coloca en el montón de excluidas (usa la colección adecuada). Las cartas
	 * se van extrayendo una a una de la colección inicial y se van clasificando
	 * juntas las que tienen el mismo destino. Mostrar en todo momento el contenido
	 * de todos los collection. Hacer un menú que hasta que lo desee el usuario
	 * tenga las siguientes opciones: 1. Guardar carta ordenada. 2. Clasificar
	 * cartas. 3. Mostrar colecciones.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Paso 1 crear las colecciones que se van a emplear añadir datos a aquellas que se pueden desde el principio
//Destinos
		int opcion;
		Scanner sc = new Scanner(System.in);
		HashSet<String> destinos = new HashSet<>();
		destinos.add("España"); // 1
		destinos.add("Argentina"); // 2
		destinos.add("Perú"); // 3
		destinos.add("Estados Unidos"); // 4
		destinos.add("Francia"); // 5
		destinos.add("Italia"); // 6
		destinos.add("Bolivia"); // 7
		destinos.add("Guatemala"); // 8
		destinos.add("Paraguay");// 9
		destinos.add("Brasil"); // 10
		//ArrayList<Carta> clase = new ArrayList<>(); Es necesario crear el ArrayList en el if porque si no esto solo serviria para 1 destino
		ArrayList<Carta> descartados = new ArrayList<>();
		LinkedList<Carta> conjunto_cartas = new LinkedList<>();
		HashMap<String, ArrayList<Carta>> clasificacion_cartas = new HashMap<>();//Se pueden organizar multiples cosas usando colecciones
		Carta ca;
		String apellido;
		String nombre;
		String ciudad;
		String pais;
//Paso 2 Crear el menú y sus opciones 
		do {
			System.out.println("Seleccione la opción que más guste (Si quiere terminar introduzca 4");
			System.out.println("1 Añadir y guardar cartas ordenadas");
			System.out.println("2 Clasificar cartas");
			System.out.println("3 Mostrar colecciones");
			System.out.println("4 Terminar");
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca su apellido");
				apellido = sc.nextLine();
				System.out.println("Introduzca su nombre");
				nombre = sc.nextLine();
				System.out.println("Introduzca la ciudad de destino");
				ciudad = sc.nextLine();
				System.out.println("Introduzca el pais de destino");
				pais = sc.nextLine();
				ca = new Carta(apellido, nombre, ciudad, pais);
				if (!destinos.contains(pais)) {
					System.out.println("Ese país no es válido");
					descartados.add(ca);
				} else {
						for (int i = 0; i < conjunto_cartas.size(); i++) {
							if (ca.getApellido().compareToIgnoreCase(conjunto_cartas.get(i).getApellido()) < 0) {
								conjunto_cartas.add(i,ca); // Compara hasta ver si es menor el apellido ("Empieza primero") y
								break;						// viceversa
					//Solo añade la carta una vez si esta bien ordenado entonces lo añade
							}
						}
						if (!conjunto_cartas.contains(ca)) { // Si todos devuelven positivo simplemente se añade o es cero
							conjunto_cartas.addLast(ca);
						}
					} 
				break;
			case 2:
				if(conjunto_cartas.size() == 0) {
					System.out.println("No puedes clasificar cosas que no existen");
				}
				else {
				// clasificacion_cartas.put(pais, conjunto_cartas); No sirve porque cojeria todo por UN SOLO PAIS 
				while(!conjunto_cartas.isEmpty()) {//No puedes modificar o añadir a la coleccion DEFINIDA EN EL FOR EACH CON EL RESTO SE PUEDE HACER LO QUE SEA
					Carta aux = conjunto_cartas.removeFirst(); //Devuelve el primer elemento de conjunto de cartas
					String destino = aux.getPaís();
					if(!clasificacion_cartas.containsKey(destino)) { //Si no esta se añade el destino junto el nuevo ArrayList en el HashMap
						//clasificacion_cartas.put(destino, new ArrayList<Carta>()); Ciencia rara de Java de reservar espacio "Prefiero usar variables aunque sea para una linea de codigo 
						 //Crea un nuevo ArrayList la primera vez del país
						ArrayList<Carta> clase = new ArrayList<>();
						clasificacion_cartas.put(destino, clase); //Añade los valores ArrayList y su clave 
					}
					//Clase no existe sin entrar al if asi que hay recuperarlo del hashmap
					ArrayList<Carta>recuperacion = clasificacion_cartas.get(destino);
					//Se añade al ArrayList la carta y el HashMap "se actualiza con los cambios hechos en el arrayList que sigue ahi 
					recuperacion.add(aux);
				}
				}
				break;
			case 3:
				System.out.println("HashSet");
				for (String aux : destinos) {
					System.out.print(aux + ",");
				}
				System.out.println("\n");
				System.out.println("LinkedList");
				for (Carta aux : conjunto_cartas) {
					System.out.println(aux.toString());
				}
				System.out.println("\n");
				System.out.println("ArrayList");
				for (Carta aux : descartados) {
					System.out.println(aux.toString());
				}
				System.out.println("\n");
				System.out.println("HashMap");
				for (String aux: clasificacion_cartas.keySet()) {
					System.out.println(aux+" "+clasificacion_cartas.get(aux));
				}
				break;
			case 4:
				break;
			default: 
				System.out.println("Opción inválida vuelve a intentarlo");
			break;
			}
		} while (opcion != 4);
		System.out.println("Gracias por ejecutarme");
	}
}
