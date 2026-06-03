package Ejercicio15_5;
import java.util.*;
public class Clasismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*5. Haz un programa en el que se leen hasta anotar fin las distintas nacionalidades de
		los alumnos de una clase. Mostrad al final las nacionalidades que hay y cuántos
		alumnos hay de cada clase. Usad un HashMap.
	*/
	/*
	 * Lógica y código 
	 * No dice nombres de nadie asi que lo que se hara es lo siguiente 
	 * Con un contador iremos contando los alumnos que tenga una determinada nacionalidad
	 * Dependiendo de esto se ira poniendo get para obtener el contador y sumarle 1 y asi no "perder el valor"
	 */
	//int contador_valor = 1; //Empieza en uno pues automaticamente se añade uno al contador
	//Siempre se queda en uno innecesaria la variable
	String nacionalidad_singular;
	HashMap<String,Integer> nacionalidades = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	do {
	System.out.println("Introduce la nacionalidad a la que perteneces"); 
	nacionalidad_singular = sc.nextLine();
	if(!nacionalidad_singular.equalsIgnoreCase("FIN")) {
	if(!nacionalidades.containsKey(nacionalidad_singular)) {
		nacionalidades.put(nacionalidad_singular, 1);
	}
	else {
		nacionalidades.put(nacionalidad_singular,nacionalidades.get(nacionalidad_singular)+1);
	}
	}
	} while(!nacionalidad_singular.equalsIgnoreCase("FIN"));
	for (String aux: nacionalidades.keySet()) {
		System.out.println(aux+"->"+nacionalidades.get(aux));
	}
	}
}
