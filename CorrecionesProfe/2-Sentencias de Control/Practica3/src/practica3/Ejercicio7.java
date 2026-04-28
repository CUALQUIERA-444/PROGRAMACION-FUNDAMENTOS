package practica3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lectura1,lectura2,kwConsumidos;
		double importe;
		final double P1=0.5,P2=0.7,P3=1;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce la lectura del mes anterior:");
		lectura1=entrada.nextInt();
		System.out.println("Introduce la lectura de este mes:");
		lectura2=entrada.nextInt();
		kwConsumidos=lectura2-lectura1;
		
		if (kwConsumidos<=100)
			importe=kwConsumidos*P1;
		else
			if (kwConsumidos<=250)
				importe=100*P1+(kwConsumidos-100)*P2;
			else
				importe=100*P1+150*P2+(kwConsumidos-250)*P3;
		
		importe=importe+2;
		//importe+=2;
		System.out.println("Tienes que pagar:"+importe+" euros");
		

	}

}
