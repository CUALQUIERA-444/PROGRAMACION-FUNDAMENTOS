package Ejercicio15_7;
import java.util.*;
public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 7.Lee un conjunto de números, terminando al anotar cero. Lee otro conjunto de
	   números, termina también al anotar cero. Muestra el contenido de los dos
	   conjuntos. Di si un conjunto está incluido en otro. Usa HashSet.
	 */
	//Paso 1 creacion de los HashSet 
	HashSet<Integer> numerosA = new HashSet<>();
	HashSet<Integer> numerosB = new HashSet<> ();
	//Paso 2 Rellenar los HashSet
	int nA;
	int nB;
	Scanner sc = new Scanner (System.in);
	do {
		System.out.println("Introduce numeros para el conjunto A");
		nA = sc.nextInt();
		if(nA != 0) {
			if(numerosA.add(nA)) {
				System.out.println("Numero añadido");
			}
			else {
				System.out.println("El número ya existia");
			}
		}
	} while(nA != 0);
	do {
		System.out.println("Introduce numeros para el conjunto B");
		nB = sc.nextInt();
		if(nB != 0) {
			if(numerosB.add(nB)) {
				System.out.println("Numero añadido");
			}
			else {
				System.out.println("El número ya existia");
			}
		}
	} while(nB != 0);
	//Alternativa 
	boolean validar = true;
	for (Integer aux : numerosA) {
		if(!numerosB.contains(aux))  {
		validar = false;
		break;
		}
	}
	if(validar) {
		System.out.println("A se encuentra en B");
	}
	else {
		System.out.println("A no se encuentra en B");
	}
	validar = true;
	for (Integer aux : numerosB) {
		if(!numerosA.contains(aux)) {
		validar = false;
		break;
		}
	}
	if(validar) {
		System.out.println("B se encuentra en A");
	}
	else {
		System.out.println("B no se encuentra en A");
	}

	for ( Integer aux: numerosB) {
		System.out.print(aux+" ");
	}
	for (Integer aux : numerosA) {
		
		System.out.print(aux+" ");
	}
	//HashMap<HashSet,HashSet> e = new HashMap<>(); Los strings son inmutables al igual 
	//que los objetos cambian de apuntar al valor 
	//Sin embargo las colecciones siempre apuntan a la misma direccion de memoria 
	//Es mas avanzado por lo que no es muy recomendable meterse con esto 
	/*
	if(numerosA.containsAll(numerosB)) { //Devuelve True o false 
			//El contains normal no funciona por que empieza a recorrer la lista preguntando si hay una lista en concreto
			//Funcionaria en los bucles for each con objetos individuales
	System.out.println("B Se encuentra en A");
	}
	else if(numerosB.containsAll(numerosA)) { //Devuelve True o false //FUNCIONA SOLO CON COLECCIONES
			System.out.println("A Se encuentra en B");
		}
	else {
		System.out.println("Ninguno se encuentra entre el otro");
	}
	*/
	}
	}


