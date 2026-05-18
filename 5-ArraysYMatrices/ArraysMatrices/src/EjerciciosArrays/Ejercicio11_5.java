package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio11_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 5. Queremos llevar las ventas de 6 comerciales. Primero anota el nombre de los
comerciales. Después, mientras lo desee el usuario lee el nombre de comercial y
las unidades vendidas por éste y acumúlalas. Al finalizar muestra por cada
comercial el número de ventas realizadas.
 */
/* Logica codigo necesario y anotaciones
 * Tenemos un array de longitud 6 el cual vamos a rellenar posteriormente en un bucle leeremos el nombre del comercial
 * Y usando esto crearemos una función que devuelva la posicion en caso de encontrar el nombre o una excepcion en caso de que no se encuentre
 * Despues pedimos las unidades vendidas y usando otra función nos encargamos de rellenar el otro array 
 * usando la posicion para encontrar las ventas del nombre correspondiente y posteriormente acumularlas 
 * simplemente sumando lo anterior + lo nuevo una vez que el usuario introduzca FIN se realizara una ultima función 
 * Para recorrer el array resultante total.
 */
 Scanner sc = new Scanner(System.in);
 String comerciante[] = new String[6]; //Es obligatorio definirle una longitud
 String comercial_usuario;
 int unidades_usuario;
 int unidades[] = new int[comerciante.length];
 int i;
 int buscar = 0;
 for (i=0;i<comerciante.length;i++) {
	 System.out.println("Introduce nombres para los comerciantes");
	 comerciante[i] = sc.nextLine();
 }
 do {
	System.out.println("Introduce el nombre de comerciante");
	comercial_usuario = sc.nextLine();
	if(!comercial_usuario.equalsIgnoreCase("FIN")) {
	buscar = Encontrado(comerciante,comercial_usuario);
	if(buscar == -1)
		System.out.println("No se encontro el comerciante");
	else {
		System.out.println("Introduce la cantidad de unidades que quiere añadir (Inicialmente cero)");
		unidades_usuario = sc.nextInt();
		sc.nextLine(); //Limpiar buffer
		AnadirUnidades(unidades_usuario,unidades,buscar);
	}
	}
 } while (!comercial_usuario.equalsIgnoreCase("FIN"));
 	MostrarResultado(unidades,comerciante);
	}
	public static int Encontrado(String comerciante[],String c_u) {
	int guardar = -1;
	for (int i = 0; i<comerciante.length;i++) {
		if(comerciante[i].equalsIgnoreCase(c_u)) {
			guardar = i;
			break; //Por lo general para cumplir buenas practicas de programacion tienes que romper otras
			//Devolver en un FOR no hace que se vuelva a ejecutar
		}
	}
	return guardar;
	}
	public static void AnadirUnidades(int unidades_usuario, int unidades[],int indice) {
	for (int i = 0; i<unidades.length;i++) {
		if(i == indice) {
			unidades[i] = unidades[i] + unidades_usuario;
		}
	}
	}
	public static void MostrarResultado(int unidades[],String comerciante[]) {
	for (int i = 0; i<unidades.length;i++) {
		System.out.println("[ COMERCIANTE "+comerciante[i]+" UNIDADES "+unidades[i]+"]");
	}
	}
}
