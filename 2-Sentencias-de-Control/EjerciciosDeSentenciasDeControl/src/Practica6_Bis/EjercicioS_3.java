package Practica6_Bis;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioS_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. Programa que lee el precio de un producto y el dinero recibido del cliente y calcula
el valor de la devolución y la cantidad de monedas y billetes que habría que darle al
cliente.
 */
	/*
	 * Lógica 
	 * Es similar a lo de fecha en lo que se calculan monedas billetes y se va decrementando hasta que la devolucion sea cero 	
	 */
	/*
	 * Variables sentencias y funciones 
	 * Una variable que guarde el precio que cueste el producto (double)
	 * Una variable que guarde el dinero que el cliente introduzca (double)
	 * Variable para guardar la devolucion (double)
	 * Opciones de menos igual o nada de dinero;
	 */
		double precio_producto, importe_usuario, devolucion = 0;
		boolean validar_dinero;
		char validar_importe;
		int monedas;
		int centimos;
		int billetes;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		do {
		System.out.println("Introduce el precio del producto que quiera comprar");
		precio_producto = sc.nextDouble();
	    validar_dinero = ValidarPrecio(precio_producto);
	    if(validar_dinero == false) {
	    	System.out.println("Lo siento no puede costar eso el producto");
		}
		}
	    while(validar_dinero == false);
		do {
			System.out.println("Introduzca el importe que va a pagar");
			importe_usuario = sc.nextDouble();
			validar_importe = ValidarImporte(importe_usuario,precio_producto);
			if(validar_importe == 'I') {
				System.out.println("Saldo insuficiente");
			}
		} while (validar_importe == 'I');
	if(importe_usuario > precio_producto)
		devolucion = importe_usuario - precio_producto;
	System.out.println(devolucion+" euros");
	System.out.printf("%.2f euros \n",devolucion);
	//Debemos pasar esto a centimos ya que cuando se trata de double java almacena los double de forma extraña
	//Lo que hace que se "pierda" la precisión
	//Por lo que ideal para obtener las monedas y billetes es pasarlo todo a centimos
	//Para pasar a centimos hacemos lo siguiente 
	//1 euro son 100 centimos por lo que lo que hacemos es pasar la devolucion multiplicada por 100
	//La diferencia es inigualable
	//0.10000000000000142 euros
	//10.0 centimos
	//0.009999999999999787 euros
	//1.0 centimos
	devolucion = devolucion * 100;
	centimos = (int)Math.round(devolucion); //Asi se pasa a centimos
	//Llamadas "corregidas"
	centimos = CalcularValor(centimos,50000,"Billetes de 500 euros");
	centimos = CalcularValor(centimos,20000,"Billetes de 200 euros");
	centimos = CalcularValor(centimos,10000,"Billetes de 100 euros");
	centimos = CalcularValor(centimos,5000,"Billetes de 50 euros");
	centimos = CalcularValor(centimos,2000,"Billetes de 20 euros");
	centimos = CalcularValor(centimos,1000,"Billetes de 10 euros");
	centimos = CalcularValor(centimos,500,"Billetes de 5 euros");
	centimos = CalcularValor(centimos,200,"Monedas de 2 euros");
	centimos = CalcularValor(centimos,100,"Monedas de 1 euro");
	centimos = CalcularValor(centimos,50,"Monedas de 50 céntimos");
	centimos = CalcularValor(centimos,20,"Monedas de 20 céntimos");
	centimos = CalcularValor(centimos,10,"Monedas de 10 céntimos");
	centimos = CalcularValor(centimos,5,"Monedas de 5 céntimos");
	centimos = CalcularValor(centimos,2,"Monedas de 2 céntimos");
	centimos = CalcularValor(centimos,1,"Monedas de 1 céntimo");
	/*
	if(centimos >= 500) {
		centimos = CalcularBilletes(centimos);
	}
	if(centimos > 0) {
		centimos = CalcularMonedas(centimos);
	}
	* Llamadas previas 
	*/
	}
	public static boolean ValidarPrecio(double pr_producto) {
		if(pr_producto <= 0) {
			return false;
		}
		else {
			return true;
		}
	}
	public static char ValidarImporte(double imp_usuario, double pr_producto ) {
		if (imp_usuario < pr_producto) {
		return 'I';
		}
		return 'O';
	}
	/** Esta función sirve pero es "ineficiente" debido a que se usa la "misma funcion" para cada tipo de billete lo ideal para este tipo 
	 * de casos es "llamar a la función" que no sea muy compleja mientras que se llama a la función multiples veces pero sirve ya que el programa 
	 * tarda menos en llamar (Poner demasiados ifs en una función puede ser bastante ineficiente dependiendo de la función"
	 * 
	 */
	public static int CalcularValor(int cents, int ValorUnitario, String correspondencia) {
		int contador_fisico = 0;
		while (cents >= ValorUnitario) {
			cents = cents - ValorUnitario;
			contador_fisico++;
		}
		if(contador_fisico > 0) { //Necesario por que si no te imprime todo y si es dentro del bucle te diche 1 moneda de 2 euros 2 monedas de 2 euros etc..
		System.out.println(contador_fisico+" "+correspondencia);
		}
		return cents;
	}
	
	/*
	public static int CalcularBilletes(int cents) {
		int contador_billetes = 0;
		while (cents >= 500) {
		if(cents >= 50000) {
			cents = cents - 50000;
			contador_billetes++;
		}
		if(cents >= 20000) {
			cents = cents - 20000;
			contador_billetes++;
		}
		if(cents >= 10000) {
			cents = cents - 10000;
			contador_billetes++;
		}
		if(cents >= 5000) {
			cents = cents - 5000;
			contador_billetes++;
		}
		if(cents >= 2000) {
			cents = cents - 2000;
			contador_billetes++;
		}
		if(cents >= 1000) {
			cents = cents - 1000;
			contador_billetes++;
		}
		if(cents >= 500) {
			cents = cents - 500;
			contador_billetes++;
		}
		}
		System.out.println("La cantidad de billetes a devolver es de "+contador_billetes);
		return cents;
	}
	public static int CalcularMonedas (int cents) {
		int contador_monedas = 0;
		while (cents > 0) {
			if(cents >= 2000) {
				cents = cents - 2000;
				contador_monedas++;
			}
			if(cents >= 1000) {
				cents = cents - 1000;
				contador_monedas++;
			}
			if(cents >= 50) {
				cents = cents - 50;
				contador_monedas++;
			}
			if(cents >= 20) {
				cents = cents - 20;
				contador_monedas++;
			}
			if(cents >= 10) {
				cents = cents - 10;
				contador_monedas++;
			}
			if(cents >= 5) {
				cents = cents - 5;
				contador_monedas++;
			}
			if(cents >= 2) {
				cents = cents - 2;
				contador_monedas++;
			}
			if(cents >= 1) {
				cents = cents - 1;
				contador_monedas++;
			}
		}
		System.out.println("La cantidad de monedas a devolver es de "+contador_monedas);
		return cents;
		}
		*/
}

