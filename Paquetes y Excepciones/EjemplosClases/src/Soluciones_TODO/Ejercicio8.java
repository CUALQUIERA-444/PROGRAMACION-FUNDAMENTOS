package Soluciones_TODO;

import java.time.LocalTime;
import java.util.Random;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numSeises=0,tirada,tiradas=0;
		
		LocalTime horaActual=LocalTime.now();
		LocalTime horaFin=horaActual.plusSeconds(1);
		
		Random r=new Random();
		
		do {
			// Sacar dado
			//tirada=r.nextInt(6)+1;
			//tirada=(int)(Math.random()*6)+1;
			tirada=r.nextInt(6)+1;
			System.out.println("Ha salido:"+tirada);
			if (tirada==6)
				numSeises++;
			tiradas++;
		}while(LocalTime.now().isBefore(horaFin));
		
		System.out.println("Han salido "+numSeises+" seises en "+tiradas+" tiradas");
		
		
	}

}
