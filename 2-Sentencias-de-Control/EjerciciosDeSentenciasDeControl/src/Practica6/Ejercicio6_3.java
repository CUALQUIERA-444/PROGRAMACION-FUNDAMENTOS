package Practica6;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. En una empresa de fruta se seleccionan fresas en 3 categorías dependiendo de su calibre:
A (de 1 a 3 cm), B (de 3 a 5 cm), C(más de 5). Ir anotando el grosor de cada fresa hasta
anotar 0. Decir cuántas hay de cada categoría y si no ha habido fresas de alguna categoría.
 */
		/*
		 * Notas 
		 * Se puede comparar un double con un int perfectamente
		 */
	/*
	 * Lógica 
	 * Hay 3 categorías de fresas en las cuales cada una se almacena en una categoria u otra en función de su grosor
	 * Básicamente necesitamos ifs para cada categoría dependiendo del grosor de la fresa
	 * Si alguna categoría no tiene fresas hay que mencionarla 
	 * Por mero gusto personal para el bucle usaremos el while
	 */
	/* Variables 
	 * 3 char para usarlos de punto de comparación 
	 * Un double para anotar el grosor de la fresa del usuario
	 * Unos doubles para ponerlos como punto de comparacion al usuario 
	 * un if para saber si alguna de las categorias no ha tenido fresas
	 * 3 contadores para cada categoria
	 * 
	 */
	 Scanner sc = new Scanner (System.in);
	 sc.useLocale(Locale.ENGLISH);
	 final char cat1 = 'A',cat2 = 'B',cat3 = 'C';
	 final int grosor_min = 1, grosor_medio = 3, grosor_maximo = 5;
	 double grosor_usuario = 1;
	 int contador_A = 0;
	 int contador_B = 0;
	 int contador_C = 0;
	 	while (grosor_usuario != 0) {
	 		System.out.println("Introduzca el grosor de su fresa");
	 		grosor_usuario = sc.nextDouble();
	 		if(grosor_usuario !=0) {
	 		if (grosor_usuario >= grosor_min && grosor_usuario < grosor_medio) {
	 			contador_A++;
	 		}
	 		else if (grosor_usuario >= grosor_medio && grosor_usuario <= grosor_maximo) {
	 			contador_B++;
	 		}
	 		else if (grosor_usuario > grosor_maximo) {
	 			contador_C++;
	 		}
	 		else 
	 			System.out.println("Ese grosor no es válido vuelva a intentarlo");
	 		}
	 	}
	 	if(contador_A == 0 ) {
	 		System.out.println("La categoría "+cat1+" no posee ninguna fresa");
	}
	 	if(contador_B == 0 ) {
	 		System.out.println("La categoría "+cat2+" no posee ninguna fresa");
	}
	 	if(contador_C == 0 ) {
	 		System.out.println("La categoría "+cat3+" no posee ninguna fresa");
	}
	 	System.out.println("Categoria "+cat1+" tiene en total "+contador_A+" fresas");
	 	System.out.println("Categoria "+cat2+" tiene en total "+contador_B+" fresas");
	 	System.out.println("Categoria "+cat3+" tiene en total "+contador_C+" fresas");
}
}