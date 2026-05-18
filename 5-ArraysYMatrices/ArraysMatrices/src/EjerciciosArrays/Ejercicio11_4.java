package EjerciciosArrays;
import java.util.*;
import java.util.Scanner;

public class Ejercicio11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 4. Programa que lee 5 nombres de personas. Introducirlos en un array y ordenarlos
alfabéticamente (usar método sort de la clase Arrays). Llevad otro array con el
número de ventas de cada uno de ellos, inicialmente cero. Comprobar si otro
nombre introducido después se encuentra entre esos 5.
 */
/* Lógica código necesario y anotaciones
 * Se requiere usar un array para leer los nombres de 5 personas posteriormente se introduce 
 * en un array y se ordena con sorts (Sorts) Permite que se ordene fuera Sorts ordena cualquier cosa
 * Despues en otro array llevamos la cantidad de ventas que maneja cada uno (inicialmente 0) 
 * Posteriormente comprobamos si otro nombre introducido despues se encuentra entre estos 5
 */
	Scanner sc = new Scanner(System.in);
	String nombre[] = new String[5];
	String comerciante_gen;
	//Rellena
	for (int i = 0;i<nombre.length;i++) {
		System.out.println("Introduce nombres de comerciamntes");
		nombre[i] = sc.nextLine();
	}
	Arrays.sort(nombre); //Arrays.sort Object Para string MODIFICA NOMBRE
	//Para mantener la sincronizacion de datos entre un array u otro uno es modificado con sort 
	//Mientras que el otro es modificado con la tecnica Quicksort o burbuja.
	//Ordena solo un array si tienes 
	int ventas[] = new int[nombre.length]; //Esto por defecto vale 0
	//Rellena pero esta vez de ventas
	for (int j = 0; j<ventas.length;j++) {
		System.out.println("Introduce ventas para comerciantes"+" \"Formato númerico\"");
		ventas[j] = sc.nextInt();
	}
	sc.nextLine(); //Limpia el buffer
	System.out.println("Introduce un nombre de comerciante");
	comerciante_gen = sc.nextLine();
	BuscarComerciante(comerciante_gen,nombre,ventas);
	}	
	public static void BuscarComerciante(String comerciante_gen, String n[],int v[]) {
		int contador = 0;
		for (int i = 0; i<n.length;i++) {
			if(comerciante_gen.equalsIgnoreCase(n[i])) {
				System.out.println("El nombre fue encontrado [ NOMBRE "+n[i]+" VENTAS "+v[i]+" ]");
				contador++;
			}
		}
		if (contador == 0) {
			System.out.println("No fue encontrado");
		}
	}
}
