package EjerciciosArrays;
import java.math.*;
import java.util.Scanner;
public class Ejercicio11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Leed 5 números en un array, sólo dejad introducir cada número si es positivo, si no
lo es volved a pedirlo hasta que lo sea. Después recorred el array y mostrad sus
cuadrados.
 */
/* Lógica.código y notas;
 * Se recorre  un Array y se leen números sin embargo si es negativo o cero no se deja introducir 
 * Y se vuelve a pedir hasta que el número sea el adecuado una vez hecho esto se recorre el array y se muestran 
 * los cuadrados
 */
	Scanner sc = new Scanner(System.in);
	int usuario;
	int numeros[] = new int [5];
	int i;
	for (i=0;i<numeros.length;i++) {
		System.out.println("Introduce un número ");
		usuario = sc.nextInt();
		while (usuario <= 0) {
		System.out.println("Lo siento el número tiene que ser positivo o distinto de 0");
		usuario = sc.nextInt();
		}
		numeros[i] = usuario;
	}
	CalcularCuadrados(numeros);
	}
	public static void CalcularCuadrados(int n[]) {
	//Para asignar un array de tipo distinto a otro lo que generalmente se hace es lo siguiente
	double nuevo[] = new double[n.length];
	int j;
	for (j=0;j<nuevo.length;j++) { //El contenido es mutable la longitud no
	nuevo[j] = n[j];
	nuevo[j] = Math.pow(nuevo[j], 2); //Apunta al array nuevo
	System.out.print((int)nuevo[j]+" ");
	}
	}
}
