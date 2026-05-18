package Ejercicio13_4;

import java.util.Locale;
import java.util.Scanner;

/*
 * 4. Un repartidor está identificado de forma única por un número. Por cada pedido
realizado gana el 20% del importe de dicho pedido más propinas. Codificar un
método: realizar_pedido, otro que nos informe del número total de pedidos
realizados por todos los repartidores y otro que nos muestre las ganancias de un
repartidor hasta el momento.
 */
public class PrincipalRepartidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Repartidor r1 = new Repartidor();
	Repartidor r2 = new Repartidor();
	Repartidor r3 = new Repartidor();
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	r1.realizar_pedido(20.00,3);
	r1.realizar_pedido(204.3,4);
	r1.realizar_pedido(3,0.5);
	r2.realizar_pedido(23.3,5);
	r3.realizar_pedido(24.3,5);
	System.out.println(r1.getGanancias()+"€");
	System.out.println(r2.getGanancias()+"€");
	System.out.println(r3.getGanancias()+"€");
	System.out.println(Repartidor.getNumeroPedidos());
	System.out.println(r1.getNum());
	System.out.println(r2.getNum());
	System.out.println(r3.getNum());
	}
}
