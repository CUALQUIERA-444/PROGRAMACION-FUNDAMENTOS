package práctica5;
import java.util.Random;
public class Ejercicio11_Práctica5_For_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//En este ejercicio vamos a generar 100 números aleatorios (0-99) y validarlos
		int numero;
		int i ;
		int contador_par = 0;
		int contador_nulo = 0;
		int limite = 100;
		for ( i=0; i <limite ; i++) { //Los incrementos se ejecutan al final de cada iteracción 
									// La función random es un conjunto de operaciones en formato double 
									//(Pero se puede considerar un número)
			numero = (int)(Math.random()*100); // estamos pasando Math.random a numero para guardar el número aleatorio
										// Es necesario el casting ya que queremos el numero en formato entero.
										// Los casting cuentan como operaciones que afectan la jerarquia.
										// Math.random genera números aleatorios entre 0.0 y 1.0
			System.out.println(numero);
			if ( numero != 0) {
				if ( numero % 2 == 0) {
					System.out.println("Par");
					contador_par++;
				}
				else 
					System.out.println("Impar");
			}
			else {
				contador_nulo++;
				System.out.println("Nulo");
			}
		}
		System.out.println("La cantidad de numeros pares es de:"+contador_par);
		System.out.println("La cantidad de numeros impares de:"+(limite - contador_par - contador_nulo)); // hacer esto con 99 no funciona ya que limite vale 99
		System.out.println("La cantidad de números nulos es de:"+contador_nulo);
	}
}
