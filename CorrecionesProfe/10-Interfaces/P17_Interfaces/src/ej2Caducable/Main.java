package ej2Caducable;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Caducable> miscosas=new ArrayList<Caducable>();
		
		miscosas.add(new Medicamento("Amoxicilina",LocalDate.of(2026, 5, 4),500));
		miscosas.add(new Carnet("123123G",LocalDate.of(2025, 2, 20),"Jose Sanz"));
		
		for(Caducable c:miscosas) {
			if (!c.estaCaducado())
				System.out.println(c +":"+ c.diasFaltanParaCaducar());
			else
				System.out.println(c + " está caducado");
		}

	}

}
