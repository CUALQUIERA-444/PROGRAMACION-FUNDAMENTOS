/*
 * 4. Un repartidor está identificado de forma única por un número. Por cada pedido
realizado gana el 20% del importe de dicho pedido más propinas. Codificar un
método: realizar_pedido, otro que nos informe del número total de pedidos
realizados por todos los repartidores y otro que nos muestre las ganancias de un
repartidor hasta el momento.
 */
/* Logica anotaciones y codigo necesario
 * Atributos: Numero y Numero de pedidos (GeneralEstatico)
 * Cada Pedido gana el 20% del importe de dicho pedido mas propinas 
 * Cada vez que realizas un pedido el importe viene determinado por lo que se pasa 
 * Por parametro por lo que de ahi se saca el calculo
 */
package Ejercicio13_4;

public class Repartidor {
	private static int numeroPedidos; //El numero de pedidos no es una accion como tal es algo propio 
	//De todos los repartidores pero "posesible"
	private static int numG = 1;
	private int num; //el ser no estatico implica que cada vez que crees un objeto nuevo se va a quedar con el mismo numero
	private double ganancias; //Es propio de un repartidor
	
	public Repartidor() {
		num = numG;  //Se asigna a una variable estatica para que vaya cambiando 
		numG++;
	}
	public void realizar_pedido(double importe,double propina) {
		ganancias += importe * 20 / 100 + propina; //Acumula todas los pedidos 
		numeroPedidos++; //Puede ver cosas dentro de la clase siendo estatica estatica es dentro de toda la clase y el objeto
		//Puede ver la clase en si
	}
	public static int getNumeroPedidos() {
		return numeroPedidos;
	}
	public double getGanancias() {
	return ganancias;
	}
	public int getNum() {
		return num;
	}
	}


